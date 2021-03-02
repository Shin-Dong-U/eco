package com.goott.eco;

import static org.junit.Assert.fail;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.beans.factory.annotation.Autowired;

import com.goott.eco.config.RootConfig;
import com.goott.eco.mapper.CustMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
@Log4j
public class RootRootConfigTest {
	
	@Setter( onMethod_ = { @Autowired })
	private DataSource dataSource;
	
	@Setter(onMethod_ = { @Autowired })
	private SqlSessionFactory sqlSessionFactory;
	
	//connection pool test
	@Test
	public void testDataSource() {
		try(Connection con = dataSource.getConnection()){
			log.info(con);
		}catch(Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testMyBatis() {
		try(SqlSession session = sqlSessionFactory.openSession();
			Connection con = session.getConnection();	){
			log.info(con);
			log.info(session);
		}catch(Exception e) {
			fail(e.getMessage());
		}
	}

	/*
	@Autowired
	private CustMapper custMapper;
	
	@Test
	public void testMyBatis() {
		try ( SqlSession session = sqlSessionFactory.openSession();
			Connection con = session.getConnection();){
			
		}catch(Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testCustMapper() {
		log.info(custMapper.getClass().getName());
		log.info("custlist size : " + custMapper.getCustList(null).size());
	}
	*/
}
