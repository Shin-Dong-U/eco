package com.goott.eco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goott.eco.domain.BasketVO;
import com.goott.eco.service.OrderService;

import lombok.extern.log4j.Log4j;

@RequestMapping("/orders")
@RestController
//@Log4j
public class OrderController {

	
	private OrderService orderService;
	
	@Autowired
	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}
	
	@GetMapping(value="/list/{custId}",			
			produces= {"application/json; charset=UTF-8"})
	public ResponseEntity<List<BasketVO>> getBasketList(
			@PathVariable("custId")String custId){
		
		//log.info("custId: "+custId);
		return new ResponseEntity<>(orderService.getBasketList(custId),HttpStatus.OK);
		
	}
	

	
	
}
