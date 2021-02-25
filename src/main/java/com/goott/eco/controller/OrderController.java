package com.goott.eco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goott.eco.domain.BasketVO;
import com.goott.eco.domain.GoodsVOtest;
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
	
	
	//장바구니 리스트 조회
	@GetMapping(value="/basket/list/{custId}",			
			produces= {"application/json; charset=UTF-8"})
	public ResponseEntity<List<BasketVO>> getBasketList(
			@PathVariable("custId")String custId){
		
		log.info("custId: "+custId);
		return new ResponseEntity<>(orderService.getBasketList(custId),HttpStatus.OK);
		
	}
	
	//장바구니  특정 상품 조회
	@GetMapping(value="/basket/{goodsSeq}",
			produces= {"application/json; charset=UTF-8"})
	public ResponseEntity<GoodsVOtest> getBasketGoods(
			@PathVariable("goodsSeq") long goodsSeq){
		log.info("선택 상품번호: "+goodsSeq);
		return new ResponseEntity<>(orderService.getGoodsInfo(goodsSeq),HttpStatus.OK);
	}

	//장바구니에서 특정 상품 빼기 
	@GetMapping(value="/basket/{custId}/{goodsSeq}",
		//	consumes= {"application/json; charset=UTF-8"},
			produces= {"text/plain; charset=UTF-8"})
	public ResponseEntity<Integer> delGoodsAtBasket(
			@PathVariable("custId") String custId,
			@PathVariable("goodsSeq") Long goodsSeq){
		
		log.info("장바구니 소유id: "+custId);
		log.info("장바구니 제거상품 번호"+goodsSeq);
		int result = orderService.deleteGoodsAtBasket(custId,goodsSeq);
		log.info("장바구니 삭제 결과: "+result);
		return new ResponseEntity<>(result,HttpStatus.OK);
	}
	
	//장바구니에서 구매한 상품빼기
	@GetMapping(value="/basket/pur/{custId}/{goodsSeq}",
			produces= {"text/plain;charset=UTF-8"})
	public ResponseEntity<Integer> purGoodsAtBasket(
			@PathVariable("custId") String custId,
			@PathVariable("goodsSeq") Long goodsSeq) {
		
		log.info("장바구니 소유id: "+custId);
		log.info("장바구니 구매된 상품 번호"+goodsSeq);
		
		return new ResponseEntity<>(orderService.purGoodsAtBasket(custId,goodsSeq),HttpStatus.OK);
		
	}
	//장바구니 수량 변경
	@GetMapping(value="/basket/{custId}/{goodsSeq}/{qty}",
			produces= {"text/plain; charset=UTF-8"})
	public ResponseEntity<Integer> changeQtyAtBasket(
			@PathVariable("custId") String custId,
			@PathVariable("goodsSeq") Long goodsSeq,
			@PathVariable("qty") Long qty){
		log.info("장바구니 수량변경  소유 id: "+custId+"변경 아이템: "+goodsSeq+"변경 수량: "+qty);
		
		return new ResponseEntity<>(orderService.changeQtyAtBasket(custId,goodsSeq,qty),HttpStatus.OK);
	}
	
	//선택상품 장바구니에 넣기
	@GetMapping(value="/basket/new/{custId}/{goodsSeq}/{qty}",
			produces= {"text/plain;charset=UTF-8"})
	public ResponseEntity<Integer> addGoodsAtBasket(
			@PathVariable("custId") String custId,
			@PathVariable("goodsSeq") Long goodsSeq,
			@PathVariable("qty") Long qty){
		log.info("장바구니 추가 소유 id: "+ custId);
		log.info("장바구니 추가 상품번호: "+goodsSeq);
		log.info("장바구니 추가 상품번호: "+qty);
		
		return new ResponseEntity<>(orderService.addGoodsAtBasket(custId,goodsSeq,qty),HttpStatus.OK);
	}
}
