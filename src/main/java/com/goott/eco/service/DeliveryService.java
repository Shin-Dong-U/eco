package com.goott.eco.service;

import java.util.List;

import com.goott.eco.domain.DeliveryVO;
import com.goott.eco.domain.GoodsVO;
import com.goott.eco.domain.OrderVO;

public interface DeliveryService {
	
	
	public List<DeliveryVO>  getallDeliveryList();
	
	public List<DeliveryVO> getDeliveryList(Long invoice_no);
	
	public List<GoodsVO> getPaidGoodsList();
	
	public List<DeliveryVO> getmyDeliveryList(String cust_id);
	


}
