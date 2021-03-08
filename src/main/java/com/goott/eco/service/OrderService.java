package com.goott.eco.service;

import java.util.HashMap;
import java.util.List;

import com.goott.eco.domain.GoodsVOtest;

public interface OrderService {
	
	public int addOrder(String cust_Id, Long total_price);
	
	public List<GoodsVOtest> getOrderList(String custId);
	
	public int paidUpdate(String cust_id, Long order_seq);
	
	public HashMap<String,Object> getCheckoutInfo(String cust_Id);
	
	public Long getTotalPrice(String cust_id, Long order_seq);
	
	public List<HashMap<String,Object>> getPaidList(String cust_id);
	
	public int orderCancel(Long order_seq);
	
	public int orderCommit(Long order_seq, Long point,String cust_id);
}
