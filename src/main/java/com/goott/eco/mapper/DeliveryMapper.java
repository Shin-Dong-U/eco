package com.goott.eco.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.goott.eco.domain.DeliveryVO;
import com.goott.eco.domain.OrderVO;

public interface DeliveryMapper {
	
	//@Select("select * from delivery")
	public List<DeliveryVO> getDeliveryList(String delivery_seq);
	
	public void insert(DeliveryVO delivery);
	
	public DeliveryVO read(Long delivery_seq); 
	
	
	//public List<DeliveryVO> getOrderList(String order_seq);
}
