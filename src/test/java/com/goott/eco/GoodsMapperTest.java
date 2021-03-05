package com.goott.eco;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.goott.eco.common.Criteria;
import com.goott.eco.config.RootConfig;
import com.goott.eco.domain.GoodsVO;
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
	public void totalCountGoodsListTest() {
		Criteria cri = new Criteria();
		int cnt = dao.totalCountGoodsList(cri);
		System.out.println(cnt);
	}
	
	@Test
	public void getGoodsListTest() {
		Criteria cri = new Criteria();
		List<Map<String, Object>> goodsList = dao.goodsList(cri);
		assertThat(goodsList.size(), is (20));
		
		cri.setCategory("6");
		goodsList = dao.goodsList(cri);
		assertThat(goodsList.size(), is(0));
		
		cri.setCategory("홞");
		cri.validCategory();
		goodsList = dao.goodsList(cri);
		assertThat(goodsList.size(), is(20));
	}
	
	@Test
	public void insertGoodsTest() {
		GoodsVO vo = new GoodsVO();
		vo.setComp_seq(1);
		vo.setGoods_name("꿀딸기");
		vo.setGoods_detail("달다달어 엄청 맛있음!");
		vo.setPrice(10000);
		vo.setQty(100);
		vo.setMaterial("근데 농약 침");
		vo.setCategory(1);
		vo.setEco_score(5);
		vo.setReguser("second");
		vo.setReq_option("N");
		
//		dao.insertGoods(vo);
		int goodsSeq = vo.getGoods_seq();
//		dao.realDeleteGoods(goodsSeq);
	}
	
	@Test
	public void insertGoodsThumbNailTest() {
		GoodsVO vo = new GoodsVO();
		vo.setGoods_seq(2);
		//dao.insertGoodsThumbNail(vo);
	}
	
}
