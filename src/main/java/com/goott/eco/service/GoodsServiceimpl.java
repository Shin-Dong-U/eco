package com.goott.eco.service;

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
		return goodsDao.getGoodsList(search);
	}

}
