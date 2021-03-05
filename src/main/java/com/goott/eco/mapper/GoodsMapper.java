package com.goott.eco.mapper;

import java.util.List;
import java.util.Map;

import com.goott.eco.common.Criteria;
import com.goott.eco.domain.GoodsVO;

public interface GoodsMapper {
	public int totalCountGoodsList(Criteria cri);
	public List<Map<String, Object>> goodsList(Criteria cri);
	public void test(Map<String, Object> param);
	public void insertGoods(GoodsVO goodsVO);
	public int realDeleteGoods(int goodsSeq);
	public int insertGoodsThumbNail(GoodsVO goodsVO);
}
