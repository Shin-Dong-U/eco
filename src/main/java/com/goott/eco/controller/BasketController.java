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
import com.goott.eco.domain.GoodsVOtest;
import com.goott.eco.service.BasketService;

import lombok.extern.log4j.Log4j;

@RequestMapping("/basket/*")
@RestController
@Log4j
public class BasketController {

	
	private BasketService basketService;
	
	@Autowired
	public BasketController(BasketService basketService) {
		this.basketService = basketService;
	}
	
	
	//장바구니 리스트 조회
	@GetMapping(value="/list/{custId}",			
			produces= {"application/json; charset=UTF-8"})
	public ResponseEntity<List<BasketVO>> getBasketList(
			@PathVariable("custId")String custId){
		
		log.info("custId: "+custId);
		return new ResponseEntity<>(basketService.getBasketList(custId),HttpStatus.OK);
		
	}
	
	//장바구니  특정 상품 조회
	@GetMapping(value="/{goodsSeq}",
			produces= {"application/json; charset=UTF-8"})
	public ResponseEntity<GoodsVOtest> getBasketGoods(
			@PathVariable("goodsSeq") long goodsSeq){
		log.info("선택 상품번호: "+goodsSeq);
		return new ResponseEntity<>(basketService.getGoodsInfo(goodsSeq),HttpStatus.OK);
	}

	//장바구니에서 특정 상품 빼기 
	@GetMapping(value="/{custId}/{goodsSeq}",
		//	consumes= {"application/json; charset=UTF-8"},
			produces= {"text/plain; charset=UTF-8"})
	public ResponseEntity<String> delGoodsAtBasket(
			@PathVariable("custId") String custId,
			@PathVariable("goodsSeq") Long goodsSeq){
		
		log.info("장바구니 소유id: "+custId);
		log.info("장바구니 제거상품 번호"+goodsSeq);
		
		return basketService.deleteGoodsAtBasket(custId,goodsSeq)>0? //insert,update,delete는 행의 갯수를 반환
				new ResponseEntity<>("성공",HttpStatus.OK):
				new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	//장바구니에서 구매한 상품빼기
	@GetMapping(value="/pur/{custId}/{goodsSeq}",
			produces= {"text/plain;charset=UTF-8"})
	public ResponseEntity<String> purGoodsAtBasket(
			@PathVariable("custId") String custId,
			@PathVariable("goodsSeq") Long goodsSeq) {
		
		log.info("장바구니 소유id: "+custId);
		log.info("장바구니 구매된 상품 번호"+goodsSeq);
		
		return basketService.purGoodsAtBasket(custId,goodsSeq)>0?
				new ResponseEntity<>("성공",HttpStatus.OK):
				new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	//장바구니 수량 변경
	@GetMapping(value="/{custId}/{goodsSeq}/{qty}",
			produces= {"text/plain; charset=UTF-8"})
	public ResponseEntity<String> changeQtyAtBasket(
			@PathVariable("custId") String custId,
			@PathVariable("goodsSeq") Long goodsSeq,
			@PathVariable("qty") Long qty){
		log.info("장바구니 수량변경  소유 id: "+custId+"변경 아이템: "+goodsSeq+"변경 수량: "+qty);
		
		return basketService.changeQtyAtBasket(custId,goodsSeq,qty)>0?
				new ResponseEntity<>("성공",HttpStatus.OK):
				new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	//선택상품 장바구니에 넣기
	@GetMapping(value="/new/{custId}/{goodsSeq}/{qty}",
			produces= {"text/plain;charset=UTF-8"})
	public ResponseEntity<String> addGoodsAtBasket(
			@PathVariable("custId") String custId,
			@PathVariable("goodsSeq") Long goodsSeq,
			@PathVariable("qty") Long qty){
		log.info("장바구니 추가 소유 id: "+ custId);
		log.info("장바구니 추가 상품번호: "+goodsSeq);
		log.info("장바구니 추가 상품번호: "+qty);
		
		return basketService.addGoodsAtBasket(custId,goodsSeq,qty)>0?
				new ResponseEntity<>("성공",HttpStatus.OK):
				new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}