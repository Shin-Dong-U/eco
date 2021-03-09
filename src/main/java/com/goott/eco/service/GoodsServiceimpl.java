package com.goott.eco.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.goott.eco.domain.GoodsVO;
import com.goott.eco.mapper.GoodsMapper;

@Transactional
@Service
public class GoodsServiceimpl implements GoodsService{

	@Autowired private GoodsMapper goodsDao; 
	
	@Override
	public void txTest() {
		Map<String, Object> goodMap = new HashMap<String, Object>();
		goodMap.put("no", 1);
		goodMap.put("val", "1");
		Map<String, Object> badMap = new HashMap<String, Object>();
		badMap.put("no", 2);
		badMap.put("val", "555555555555555555555555555555555555555555555151513153111");
		goodsDao.test(goodMap);
		goodsDao.test(badMap);
	}
	
	@Override
	public List<Map<String, Object>> getGoodsList(Map<String, Object> search) {
		return goodsDao.getGoodsList(search);
	}

//	@Override
//	public int insertGoods(Map<String, Object> param) {
//		goodsDao.insertGoods(param);
//		return 0;
//	}
	@Override
	public int insertGoods(GoodsVO vo) {
		goodsDao.insertGoods(vo);
		return 0;
	}

}
