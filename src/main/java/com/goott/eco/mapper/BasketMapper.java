package com.goott.eco.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.goott.eco.domain.GoodsVOtest;

public interface BasketMapper {
	
	public List<HashMap<String,Object>> getBasketList(String cust_id);
	
	public GoodsVOtest getGoodsInfo(Long goods_seq);
	
	public int delGoodsAtBasket(@Param("cust_id") String cust_id, @Param("goods_seq") Long goods_seq);
	
	public int purGoodsAtBasket(@Param("cust_id") String cust_id, @Param("goods_seq") Long goods_seq);
	
	public int addGoodsAtBasket(@Param("cust_id") String cust_id, @Param("goods_seq") Long goods_seq, @Param("qty") Long qty);
	
	public Long checkExistBasket(String cust_id);
	
	public int createBasket(String cust_id);
	
	public int changeQtyAtBasket(@Param("cust_id") String cust_id, @Param("goods_seq") Long goods_seq, @Param("qty") Long qty);

}
