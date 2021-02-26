package com.goott.eco;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.goott.eco.mapper.GoodsMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration (locations = {"file:src/main/webapp/WEB-INF/spring/test-root-context.xml", "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
@PropertySource("file:src/main/webapp/WEB-INF/properties/db.properties")
public class GoodsMapperTest {
	
	@Autowired private GoodsMapper dao;
	
	@Test
	public void getGoodsListTest() {
		List<Map<String, Object>> goodsList = dao.getGoodsList(null);
		
	}
}
