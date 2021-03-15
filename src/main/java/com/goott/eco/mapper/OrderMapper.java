package com.goott.eco.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.goott.eco.domain.BasketDetailVO;
import com.goott.eco.domain.GoodsVOtest;

public interface OrderMapper {
	
	public int addOrderMain(String cust_id, Long total_price);
	
	public Long getOrderSeq(String cust_id);
	
//	public int addOrderDetail(
//			@Param("cust_id") String cust_id,
//			@Param("order_seq")Long order_seq,
//			@Param("basket_seq") Long basket_seq
//			,@Param("goods_seq") Long goods_seq);
	
	public int addOrderDetailBasket(
			@Param("cust_id") String cust_id,
			@Param("order_seq")Long order_seq);
	
	public int upOrderStatus(Long order_seq);
	
	public int paidUpdate(@Param("cust_id")String cust_id,@Param("order_seq") Long order_seq);
	
//	public Long getOrderNum();
//	
//	public int addOrder(@Param("custId") String custId,@Param("orderNum") Long orderNum,@Param("basketNum") Long basketNum);
//	
	public List<GoodsVOtest> getOrderList(String cust_id);
	
	public List<GoodsVOtest> getGoodsNumList (String custId);
	
	public HashMap<String, Object> getCheckoutInfo(String cust_Id);
	
	public Long getTotalPrice(@Param("cust_id")String cust_id, @Param("order_seq") Long order_seq);
	
	public List<HashMap<String,Object>> getPaidList(String cust_id);
	
	public int orderCancel(Long order_seq);
	
	public int orderCommit(Long order_seq);
	
	public int addPoint(@Param("order_seq")Long order_seq,@Param("point") Long point, @Param("cust_id")String cust_id);

}
