package com.goott.eco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goott.eco.domain.BasketVO;
import com.goott.eco.mapper.OrderMapper;


@Service
public class OrderServiceImpl implements OrderService {
	
	
	private OrderMapper orderMapper;	
	
	@Autowired
	public OrderServiceImpl(OrderMapper orderMapper) {	
		this.orderMapper = orderMapper;
	}

	@Override
	public List<BasketVO> getBasketList(String custId) {
		
		return orderMapper.getBasketList(custId);
	}

}
