package com.goott.eco.mapper;

import java.util.List;

import com.goott.eco.domain.BasketVO;

public interface OrderMapper {
	
	public List<BasketVO> getBasketList(String custId);
	

}
