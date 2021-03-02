package com.goott.eco.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.goott.eco.domain.BasketDetailVO;
import com.goott.eco.domain.GoodsVOtest;

public interface OrderMapper {
	
	public int addOrderMain(String cust_id);
	
	public Long getOrderSeq(String cust_id);
	
	public int addOrderDetail(
			@Param("cust_id") String cust_id,
			@Param("order_seq")Long order_seq,
			@Param("basket_seq") Long basket_seq
			,@Param("goods_seq") Long goods_seq);
	
	public int upOrderStatus(Long order_seq);
	
	public int paidUpdate(@Param("cust_id")String cust_id,@Param("order_seq") Long order_seq);
	
//	public Long getOrderNum();
//	
//	public int addOrder(@Param("custId") String custId,@Param("orderNum") Long orderNum,@Param("basketNum") Long basketNum);
//	
	public List<GoodsVOtest> getOrderList(String cust_id);
	
	public List<GoodsVOtest> getGoodsNumList (String custId);
	
	

}
