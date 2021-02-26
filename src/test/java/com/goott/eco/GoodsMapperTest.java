package com.goott.eco;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.goott.eco.config.RootConfig;
import com.goott.eco.mapper.GoodsMapper;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
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
		param.put("goods_seq", 2);
		List<Map<String, Object>> goodsList = dao.getGoodsList(param);
		log.info(goodsList.size());
	}
}
