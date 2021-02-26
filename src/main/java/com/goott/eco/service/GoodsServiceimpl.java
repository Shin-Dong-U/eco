package com.goott.eco.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goott.eco.mapper.GoodsMapper;

@Service
public class GoodsServiceimpl implements GoodsService{

	@Autowired private GoodsMapper goodsDao; 
	
	@Override
	public List<Map<String, Object>> getGoodsList(Map<String, Object> search) {
		search = new HashMap<String, Object>();
		search.put("goods_seq", 2);
		return goodsDao.getGoodsList(search);
	}

}
