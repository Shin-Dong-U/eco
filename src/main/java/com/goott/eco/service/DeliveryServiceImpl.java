package com.goott.eco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goott.eco.domain.DeliveryVO;
import com.goott.eco.domain.GoodsVO;
import com.goott.eco.mapper.DeliveryMapper;


import lombok.extern.log4j.Log4j;

@Service
@Log4j

public class DeliveryServiceImpl implements DeliveryService{
	
	private DeliveryMapper deliveryMapper;
	
	@Autowired
	public DeliveryServiceImpl(DeliveryMapper deliveryMapper) {
		this.deliveryMapper = deliveryMapper;
	}
	
	//전체 배송리스트
	@Override
	public List<DeliveryVO>  getallDeliveryList() {
		return deliveryMapper.getallDeliveryList();
	}
	
	
	//배송 리스트 조회 
	@Override
	public List<DeliveryVO> getDeliveryList(Long invoice_no) {
		
		return deliveryMapper.getDeliveryList(invoice_no);
	}

	//결제된(3)주문리스트(업체)}

	@Override
	public List<GoodsVO> getPaidGoodsList() {
		
		return deliveryMapper.getPaidGoodsList();
	}
	
	//배송조회(회원)
	@Override
	public List<DeliveryVO> getmyDeliveryList(String cust_id) {

		return deliveryMapper.getmyDeliveryList(cust_id);
	}

	




	


}
