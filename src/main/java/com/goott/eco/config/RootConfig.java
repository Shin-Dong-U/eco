package com.goott.eco.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;


@Configuration
@EnableAspectJAutoProxy
@EnableTransactionManagement
@ComponentScan(basePackages = {"com.goott.eco"})
@MapperScan(basePackages= {"com.goott.eco.mapper"})
public class RootConfig {
	
	@Value("${db.driver}") private String jdbcDriver;
	@Value("${db.url}") private String jdbcUrl;
	@Value("${db.username}") private String jdbcUserName;
	@Value("${db.password}") private String jdbcPassword;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
		configurer.setLocation(new ClassPathResource("db.properties"));
		return configurer;
	}
	
	/*Connection pool*/
	@Bean 
	public DataSource dataSource() {
		HikariConfig hikariConfig = new HikariConfig();
		hikariConfig.setDriverClassName(jdbcDriver);
		hikariConfig.setJdbcUrl(jdbcUrl);
		hikariConfig.setUsername(jdbcUserName);
		hikariConfig.setPassword(jdbcPassword);
		hikariConfig.setMaximumPoolSize(3); //자원줄이기

		return new HikariDataSource(hikariConfig);
	}
	
	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
		sqlSessionFactory.setDataSource(dataSource());
		
		Resource resource = new ClassPathResource("com/goott/eco/mapper/MybatisConfig.xml");
		sqlSessionFactory.setConfigLocation(resource);
		
		return (SqlSessionFactory)sqlSessionFactory.getObject();
	}
	
	@Bean
	public DataSourceTransactionManager transactionManager() {
		return new DataSourceTransactionManager(dataSource());
	}
	
	
}
