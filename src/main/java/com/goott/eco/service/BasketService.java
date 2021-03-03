package com.goott.eco.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.goott.eco.domain.CartVO;
import com.goott.eco.domain.GoodsVOtest;

public interface BasketService {
	
	public List<HashMap<String,Object>> getBasketList(String cust_id);
	
	public GoodsVOtest getGoodsInfo(Long goods_seq);
	
	public int deleteGoodsAtBasket(String cust_id,Long goods_seq);
	
	public int purGoodsAtBasket(String cust_id, Long goods_seq);
	
	public int addGoodsAtBasket(String cust_id, Long goods_seq, Long qty);
	
	public int changeQtyAtBasket(String cust_id, Long goods_seq, Long qty);

}
