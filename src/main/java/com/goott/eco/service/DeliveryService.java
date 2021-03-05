package com.goott.eco.service;

import java.util.List;

import com.goott.eco.domain.DeliveryVO;

public interface DeliveryService {
	
	public List<DeliveryVO> getDeliveryList(String delivery_seq);

}
