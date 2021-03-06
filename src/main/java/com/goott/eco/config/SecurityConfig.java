package com.goott.eco.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

import com.goott.eco.security.CustomLoginSuccessHandler;
import com.goott.eco.security.CustomUserDetailsService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Configuration
@EnableWebSecurity
@Log4j
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Setter(onMethod_ = {@Autowired})
	private DataSource dataSource;
	
	/* Login Success Handler */
	@Bean
	public AuthenticationSuccessHandler loginSuccessHandler() {
		return new CustomLoginSuccessHandler("/home/index");
	}
	
	/* password Encoder */
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	/* Access Denied Handler */
	//@Bean
	//public AccessDeniedHandler accessDeniedHandler() {
	//	return new CustomAccessDeniedHandler();	
	//}
	
	/* user Detail Service 실행 */
	@Bean
	public UserDetailsService cusomUserServcie() {
		return new CustomUserDetailsService();
	}
	
	/* remember-me */
	private PersistentTokenRepository persistentTokenRepository() {
		JdbcTokenRepositoryImpl repo = new JdbcTokenRepositoryImpl();
		repo.setDataSource(dataSource);
		return repo;
	}
	
	/* Authentication */
	@Override
	public void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests()
			.antMatchers("/home/login").anonymous()
			.antMatchers("/home/register").anonymous().and().csrf().disable();
			

		http.authorizeRequests()
			.antMatchers("/cust/account").authenticated()
			.antMatchers("/orders/basket/list").authenticated()
			.antMatchers("/orders/order/checkout").authenticated();
//			.antMatchers("/orders/basket/list").authenticated()
//			.antMatchers("/orders/basket/list").authenticated()
//			.antMatchers("/orders/basket/list").authenticated()
//			.antMatchers("/orders/basket/list").authenticated();
		//	.exceptionHandling().accessDeniedHandler(accessDeniedHandler())

		
		//http.authorizeRequests()
		//	.antMatchers("/sample/admin").access("hasRole('ROLE_COMPANY')");
		//	.antMatchers("/sample/member").access("hasRole('ROLE_CUST')");
	
		/* 로그인 */
		http.formLogin()
			.loginPage("/home/login")
			.loginProcessingUrl("/login")
			.successHandler(loginSuccessHandler());
		
		/* 로그아웃 */
		http.logout()
		.logoutUrl("/sample/logout")
		.invalidateHttpSession(true)
		.deleteCookies("remember-me","JSESSION_ID");
		
		/* 자동로그인 */
		http.rememberMe()
			.key("goott")
			.tokenRepository(persistentTokenRepository())
			.tokenValiditySeconds(604800);
		
		/* naver smartEditor cross-origin iframe 이슈 방지용 */
		http.headers().frameOptions().sameOrigin();
		
	}

	/* Authorization */
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		log.info("security Config 실행....");
		auth.userDetailsService(cusomUserServcie()).passwordEncoder(passwordEncoder());	
	}

	
	/* BCrypt하기전 Authorization */
	/*
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		log.info("configure................");

		auth.inMemoryAuthentication().withUser("admin").password("{noop}admin").roles("ADMIN");
		auth.inMemoryAuthentication().withUser("member").password("{noop}member").roles("MEMBER");
	
	}
	 */


}
