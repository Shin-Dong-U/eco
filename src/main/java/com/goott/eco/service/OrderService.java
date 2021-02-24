package com.goott.eco.service;

import java.util.List;

import com.goott.eco.domain.BasketVO;

public interface OrderService {
	
	public List<BasketVO> getBasketList(String custId);
}
