package com.goott.eco.service;

import java.util.*;

import com.goott.eco.domain.GoodsVO;

public interface GoodsService {
	public List<Map<String, Object>> getGoodsList(Map<String, Object> search);
	public void txTest();
	public int insertGoods(GoodsVO vo);
}
