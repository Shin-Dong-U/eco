package com.goott.eco.service;

import java.util.List;

import com.goott.eco.domain.BasketDetailVO;
import com.goott.eco.domain.GoodsVOtest;

public interface OrderService {
	
	public int addOrder(List<BasketDetailVO> basketList,String cust_Id);
	
	public List<GoodsVOtest> getOrderList(String custId);
	
	
}
