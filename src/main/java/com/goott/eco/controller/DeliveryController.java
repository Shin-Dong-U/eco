package com.goott.eco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.goott.eco.domain.DeliveryVO;
import com.goott.eco.domain.GoodsVO;
import com.goott.eco.service.DeliveryService;

@RestController
@RequestMapping("/delivery/*")

public class DeliveryController {
	
	private DeliveryService deliveryService;
	
	@Autowired
	public DeliveryController(DeliveryService deliveryService) {
		this.deliveryService = deliveryService;
	}

	
	//전체 배송리스트
	@GetMapping(value="/list3/allDeliveryList",
			produces= {"application/json; charset=UTF-8"})
	public ResponseEntity<List<DeliveryVO>> getallDeliveryList(){
		System.out.println("start");
			List<DeliveryVO> result = deliveryService.getallDeliveryList();
		
		System.out.println("회원 배송조회: " + result);
		return new ResponseEntity<>(deliveryService.getallDeliveryList(),HttpStatus.OK);
		
	}
	


	@GetMapping(value="/list1/{invoice_no}",
			produces= {"application/json; charset=UTF-8"})
	public ResponseEntity<List<DeliveryVO>> getDeliveryList(
			@PathVariable("invoice_no")Long invoice_no){

		System.out.println("송장번호: "+ invoice_no);
		return new ResponseEntity<>(deliveryService.getDeliveryList(invoice_no),HttpStatus.OK);
	}

	
    //결제된(3) 주문 리스트 (업체)
	@GetMapping(value="/list4/paid",
			produces= {"application/json; charset=UTF-8"})
	public ResponseEntity<List<GoodsVO>> getPaidGoodsList(){
		System.out.println("start");
			List<GoodsVO> result = deliveryService.getPaidGoodsList();
			
		System.out.println("결제된 상품 리스트" + result);
		return new ResponseEntity<>(deliveryService.getPaidGoodsList(),HttpStatus.OK);
		
	}
			
	//배송조회(회원)
	@GetMapping(value="/list2/{cust_id}",
			produces= {"application/json; charset=UTF-8"})
	public ResponseEntity<List<DeliveryVO>> getmyDeliveryList(
			@PathVariable("cust_id")String cust_id){
		System.out.println("start");
			List<DeliveryVO> result = deliveryService.getmyDeliveryList(cust_id);
			
		System.out.println("회원 배송조회: " + result);
		return new ResponseEntity<>(result,HttpStatus.OK);
		
	}
	
	
	
	
	
	
	
	
	


}




