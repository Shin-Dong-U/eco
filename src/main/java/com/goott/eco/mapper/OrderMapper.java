package com.goott.eco.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.goott.eco.domain.BasketVO;
import com.goott.eco.domain.GoodsVOtest;

public interface OrderMapper {
	
	public List<BasketVO> getBasketList(String custId);
	
	public GoodsVOtest getGoodsInfo(Long goodsSeq);
	
	public int delGoodsAtBasket(@Param("custId") String custId, @Param("goodsSeq") Long goodsSeq);
	
	public int purGoodsAtBasket(@Param("custId") String custId, @Param("goodsSeq") Long goodsSeq);
	
	public int addGoodsAtBasket(@Param("custId") String custId, @Param("goodsSeq") Long goodsSeq, @Param("qty") Long qty);
	
	public int changeQtyAtBasket(@Param("custId") String custId, @Param("goodsSeq") Long goodsSeq, @Param("qty") Long qty);
	

}
