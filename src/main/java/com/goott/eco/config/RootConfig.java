package com.goott.eco.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

/*
 * 테스트중인 클래스입니다.
 */
//@Configuration
//@ComponentScan(basePackages = {"com.goott.eco"})
//@MapperScan(basePackages= {"com.goott.eco.mapper"})
public class RootConfig {
	
	//todo. db.properties로 주입 
//	private String jdbcDriver = "oracle.jdbc.OracleDriver";
//	private String jdbcUrl = "jdbc:oracle:thin:@172.16.5.1:1521:orcl";
//	private String jdbcUserName = "eco";
//	private String jdbcPassword = "eco1234";
//	
//	@Value("#{db.driver}")
//	private String jdbcDriver;
//	@Value("#{db.url}")
//	private String jdbcUrl;
//	@Value("#{db.username}")
//	private String jdbcUserName;
//	@Value("#db.password}")
//	private String jdbcPassword;
//	@Bean
//	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
//		PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
//		configurer.setLocation(new ClassPathResource("properties/db.properties"));
//		
//		return configurer;
//	}
//	
//	
//	@Bean
//	public DataSource dataSource() {
//		HikariConfig hikariConfig = new HikariConfig();
//		hikariConfig.setDriverClassName(jdbcDriver);
//		hikariConfig.setJdbcUrl(jdbcUrl);
//		hikariConfig.setUsername(jdbcUserName);
//		hikariConfig.setPassword(jdbcPassword);
//		
//		return new HikariDataSource(hikariConfig);
//	}
//	
//	@Bean
//	public SqlSessionFactory sqlSessionFactory() throws Exception {
//		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
//		sqlSessionFactory.setDataSource(dataSource());
//		return (SqlSessionFactory)sqlSessionFactory.getObject();
//	}
}
