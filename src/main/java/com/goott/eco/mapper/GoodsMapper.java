package com.goott.eco.mapper;

import java.util.List;
import java.util.Map;

import com.goott.eco.domain.GoodsThumbNailVO;
import com.goott.eco.domain.GoodsVO;

public interface GoodsMapper {
	public List<Map<String, Object>> getGoodsList(Map<String, Object> search);
	public void test(Map<String, Object> param);
	public void insertGoods(GoodsVO goodsVO);
	public int realDeleteGoods(int goodsSeq);
	public int insertGoodsThumbNail(GoodsThumbNailVO thumbVO);
}
