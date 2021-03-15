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
	
	public Map<String, Object> goodsDetail(int goodsSeq);
	public List<Map<String, Object>> goodsDetailThumbImg(int goodsSeq);
	public List<Map<String, Object>> goodsDetailImg(int goodsSeq);
	public List<Map<String, Object>> goodsReqOption(int goodsSeq);	
	public List<Map<String, Object>> goodsCategoryList();
	
	/**
	 * 상품평
	 * 필수 파라미터 int goods_seq, int start (key 변수명)    
	 */
	public List<Map<String, Object>> goodsComment(Map<String, Object> param);
}
