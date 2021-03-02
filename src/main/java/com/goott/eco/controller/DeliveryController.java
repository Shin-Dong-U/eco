package com.goott.eco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goott.eco.domain.DeliveryVO;
import com.goott.eco.domain.OrderVO;
import com.goott.eco.service.DeliveryService;

import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping("/delivery/*")
public class DeliveryController {
	
	private DeliveryService deliveryService;
	
	@Autowired
	public DeliveryController(DeliveryService deliveryService) {
		this.deliveryService = deliveryService;
	}
	
	//배송 리스트 조회 
	@GetMapping(value="/list/{invoice_no}",
			produces= {"application/json; charset=UTF-8"})
	public ResponseEntity<List<DeliveryVO>> getDeliveryList(
			@PathVariable("invoice_no")String invoice_no){

		System.out.println("송장번호: "+ invoice_no);
		return new ResponseEntity<>(deliveryService.getDeliveryList(invoice_no),HttpStatus.OK);
	}
	
	
	
//	//주문한 배송정보 조회
//	@GetMapping(value="/{order_seq}",
//			produces= {"application/json; charset=UTF-8"})
//	public ResponseEntity<List<DeliveryVO>> getOrderList(
//			@PathVariable("order_seq")String order_seq){
//
//		System.out.println("주문번호: "+ order_seq);
//		return new ResponseEntity<>(deliveryService.getOrderList(order_seq),HttpStatus.OK);
//
//	}

}
	




