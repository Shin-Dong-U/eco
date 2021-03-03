package com.goott.eco.service;

import java.util.List;

import com.goott.eco.domain.DeliveryVO;
import com.goott.eco.domain.OrderVO;

public interface DeliveryService {
	
	public List<DeliveryVO> getDeliveryList(Long invoice_no);
	
	public List<DeliveryVO> getDeliveryList();
	


}
