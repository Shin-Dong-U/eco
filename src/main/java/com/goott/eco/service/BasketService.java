package com.goott.eco.service;

import java.util.List;

import com.goott.eco.domain.BasketDetailVO;
import com.goott.eco.domain.GoodsVOtest;

public interface BasketService {
	
	public List<BasketDetailVO> getBasketList(String cust_id);
	
	public GoodsVOtest getGoodsInfo(Long goods_seq);
	
	public int deleteGoodsAtBasket(String cust_id,Long goods_seq);
	
	public int purGoodsAtBasket(String cust_id, Long goods_seq);
	
	public int addGoodsAtBasket(String cust_id, Long goods_seq, Long qty);
	
	public int changeQtyAtBasket(String cust_id, Long goods_seq, Long qty);

}
