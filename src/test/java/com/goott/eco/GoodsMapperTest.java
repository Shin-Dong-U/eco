package com.goott.eco;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.goott.eco.config.RootConfig;
import com.goott.eco.config.ServletConfig;
import com.goott.eco.mapper.GoodsMapper;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = {RootConfig.class, ServletConfig.class})
@Log4j
public class GoodsMapperTest {
	
	@Autowired
	private GoodsMapper dao;
	
	@Test
	public void testGetGoods() {
		log.info(dao.getClass().getName());
	}
	
	@Test
	public void getGoodsListTest() {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("goods_seq", null);
		List<Map<String, Object>> goodsList = dao.getGoodsList(null);
		assertThat(goodsList.size(), is (0));
		
		goodsList = dao.getGoodsList(param);
		assertThat(goodsList.size(), is (0));
		
	}
}
