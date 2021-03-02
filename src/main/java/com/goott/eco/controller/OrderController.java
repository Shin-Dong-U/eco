package com.goott.eco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goott.eco.domain.BasketDetailVO;
import com.goott.eco.domain.GoodsVOtest;
import com.goott.eco.domain.PaymentVO;
import com.goott.eco.service.OrderService;

import lombok.extern.log4j.Log4j;

@RequestMapping("/orders/*")
@RestController
@Log4j
public class OrderController {

	
	private OrderService orderService;
	
	@Autowired
	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}
	
	//장바구니상품 주문 신청 requestbody 사용
	@PostMapping(value="/new/{cust_id}",			
			consumes= {"application/json; charset=UTF-8"},
			produces= {"application/json; charset=UTF-8"})
	public ResponseEntity<String> getBasketList(
			@PathVariable("cust_id") String cust_id
			,@RequestBody List<BasketDetailVO> basketList){
		
		log.info("====================================");
		log.info("주문신청 List/cust_Id: "+basketList+"/"+cust_id);
		//log.info("주문신청 List[0]: "+basketList.get(0) );
		//log.info("주문신청 List[0].cust_Id: "+basketList.get(0).getCust_Id());		
				return orderService.addOrder(basketList,cust_id)>0?
				new ResponseEntity<>("성공",HttpStatus.OK):
				new ResponseEntity<>("실패",HttpStatus.INTERNAL_SERVER_ERROR);	
	}
	
	//주문 상품 조회
	//남은과제: 주문상태별 보기(그룹화)
	@GetMapping(value="/list/{cust_Id}",
			produces= {"application/json; charset=UTF-8"})
	public ResponseEntity<List<GoodsVOtest>> getOrdersList(
			@PathVariable("cust_Id") String cust_Id){
		log.info("주문 리스트 cust_Id: "+cust_Id);
		return new ResponseEntity<>(orderService.getOrderList(cust_Id),HttpStatus.OK);
	}

	//결제하기
	//성공시 update 결제여부  Y
	//주문상태 결제여부 update 구매여수 Y	
	//업체에 주문정보 보내기
	
	@PostMapping(value="/payments/complete",
			consumes= {"application/json; charset=UTF-8"},
			produces= {"application/json; charset=UTF-8"})
	public ResponseEntity<String> payments(@RequestBody PaymentVO payment){
		log.info("결제완료 컨트롤러: "+payment);
		return new ResponseEntity<>("성공",HttpStatus.OK);
	}
	
}
