package com.goott.eco.service;

import java.util.List;

import com.goott.eco.domain.BasketVO;
import com.goott.eco.domain.GoodsVOtest;

public interface OrderService {
	
	public List<BasketVO> getBasketList(String custId);
	
	public GoodsVOtest getGoodsInfo(Long goodsSeq);
	
	public int deleteGoodsAtBasket(String custId,Long goodsSeq);
	
	public int purGoodsAtBasket(String custId, Long goodsSeq);
	
	public int addGoodsAtBasket(String custId, Long goodsSeq, Long qty);
	
	public int changeQtyAtBasket(String custId, Long goodsSeq, Long qty);
}
