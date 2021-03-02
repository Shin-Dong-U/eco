package com.goott.eco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goott.eco.domain.BasketDetailVO;
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
	@GetMapping(value="/list/{cust_id}",			
			produces= {"application/json; charset=UTF-8"})
	public ResponseEntity<List<BasketDetailVO>> getBasketList(
			@PathVariable("cust_id")String cust_id){
		
		log.info("custId: "+cust_id);
		List<BasketDetailVO> result = basketService.getBasketList(cust_id);
		log.info("jsp로 넘겨질 데이터: "+result);
		
		return new ResponseEntity<>(result,HttpStatus.OK);
		
	}
	
	//장바구니  특정 상품 조회
	@GetMapping(value="/{goods_seq}",
			produces= {"application/json; charset=UTF-8"})
	public ResponseEntity<GoodsVOtest> getBasketGoods(
			@PathVariable("goods_seq") long goods_seq){
		log.info("선택 상품번호: "+goods_seq);
		return new ResponseEntity<>(basketService.getGoodsInfo(goods_seq),HttpStatus.OK);
	}

	//장바구니에서 특정 상품 빼기 
	@GetMapping(value="/{cust_id}/{goods_seq}",
		//	consumes= {"application/json; charset=UTF-8"},
			produces= {"text/plain; charset=UTF-8"})
	public ResponseEntity<String> delGoodsAtBasket(
			@PathVariable("cust_id") String cust_id,
			@PathVariable("goods_seq") Long goods_seq){
		
		log.info("장바구니 소유id: "+cust_id);
		log.info("장바구니 제거상품 번호"+goods_seq);
		
		return basketService.deleteGoodsAtBasket(cust_id,goods_seq)>0? //insert,update,delete는 행의 갯수를 반환
				new ResponseEntity<>("성공",HttpStatus.OK):
				new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	//장바구니에서 구매한 상품빼기
	@GetMapping(value="/pur/{cust_id}/{goods_seq}",
			produces= {"text/plain;charset=UTF-8"})
	public ResponseEntity<String> purGoodsAtBasket(
			@PathVariable("cust_id") String cust_id,
			@PathVariable("goods_seq") Long goods_seq) {
		
		log.info("장바구니 소유id: "+cust_id);
		log.info("장바구니 구매된 상품 번호"+goods_seq);
		
		return basketService.purGoodsAtBasket(cust_id,goods_seq)>0?
				new ResponseEntity<>("성공",HttpStatus.OK):
				new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	//장바구니 수량 변경
	@GetMapping(value="/{cust_id}/{goods_seq}/{qty}",
			produces= {"text/plain; charset=UTF-8"})
	public ResponseEntity<String> changeQtyAtBasket(
			@PathVariable("cust_id") String cust_id,
			@PathVariable("goods_seq") Long goods_seq,
			@PathVariable("qty") Long qty){
		log.info("장바구니 수량변경  소유 id: "+cust_id+"변경 아이템: "+goods_seq+"변경 수량: "+qty);
		
		return basketService.changeQtyAtBasket(cust_id,goods_seq,qty)>0?
				new ResponseEntity<>("성공",HttpStatus.OK):
				new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	//선택상품 장바구니에 넣기
	@GetMapping(value="/new/{cust_id}/{goods_seq}/{qty}",
			produces= {"text/plain;charset=UTF-8"})
	public ResponseEntity<String> addGoodsAtBasket(
			@PathVariable("cust_id") String cust_id,
			@PathVariable("goods_seq") Long goods_seq,
			@PathVariable("qty") Long qty){
		log.info("장바구니 추가 소유 id: "+ cust_id);
		log.info("장바구니 추가 상품번호: "+goods_seq);
		log.info("장바구니 추가 상품번호: "+qty);
		
		return basketService.addGoodsAtBasket(cust_id,goods_seq,qty)>0?
				new ResponseEntity<>("성공",HttpStatus.OK):
				new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}