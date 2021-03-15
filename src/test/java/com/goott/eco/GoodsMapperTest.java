//package com.goott.eco;
//
//import static org.hamcrest.CoreMatchers.is;
//import static org.junit.Assert.assertThat;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.goott.eco.config.RootConfig;
//import com.goott.eco.domain.GoodsVO;
//import com.goott.eco.mapper.GoodsMapper;
//
//import lombok.extern.log4j.Log4j;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = {RootConfig.class})
//@Log4j
//public class GoodsMapperTest {
//	
//	@Autowired
//	private GoodsMapper dao;
//	
//	@Test
//	public void testGetGoods() {
//		log.info(dao.getClass().getName());
//	}
//	
//	@Test
//	public void getGoodsListTest() {
//		Map<String, Object> param = new HashMap<String, Object>();
//		param.put("goods_seq", null);
//		List<Map<String, Object>> goodsList = dao.getGoodsList(null);
//		assertThat(goodsList.size(), is (0));
//		
//		goodsList = dao.getGoodsList(param);
//		assertThat(goodsList.size(), is (0));
//		
//	}
//	
//	@Test
//	public void insertGoodsTest() {
////		Map<String, Object> param = new HashMap<String, Object>();
////		param.put("compSeq", 1);
////		param.put("goodsName", "엄청 맛있는 딸기");
////		param.put("goodsDetail", "설탕 안쳐도 맛있어요");
////		param.put("price", 10000);
////		param.put("qty", 100);
////		param.put("material", "근데 농약침");
////		param.put("category", 1);
////		param.put("ecoScore", 5);
////		param.put("reguser", "second");
////		param.put("reqOption", "N");
//		GoodsVO vo = new GoodsVO();
//		vo.setComp_seq(1);
//		vo.setGoods_name("꿀딸기");
//		vo.setGoods_detail("달다달어");
//		vo.setPrice(10000);
////		vo.setQty(100);
//		vo.setMaterial("딸기");
//		vo.setCategory(1);
//		vo.setEco_score(5);
//		vo.setReguser("second");
//		vo.setReq_option("N");
//		
//		dao.insertGoods(vo);
////		dao.insertGoods(param);
////		int goodsSeq = (int)param.get("goodsSeq");
//		int goodsSeq = vo.getGoods_seq();
//		System.out.println("@@@@@@" + goodsSeq);
//		dao.realDeleteGoods(goodsSeq);
//	}
//	
//	@Test
//	public void insertGoodsThumbNailTest() {
//		GoodsVO vo = new GoodsVO();
//		vo.setGoods_seq(2);
//		dao.insertGoodsThumbNail(vo);
//	}
//	
//}
