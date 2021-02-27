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
//	@PostMapping(value="/new",
//			//웹브라우저로부터 받아서 메소드가 사용하는 값의 MIME유형을 지정
//			consumes= {"application/json; charset=UTF-8"},
//			//이 메소드가 웹브라우저로 전달할 데이터의 MIME 타입 유형을 지정
//			produces= {"text/plain; charset=UTF-8"})
//			//produces= {MediaType.TEXT_PLAIN_VALUE})
//	public ResponseEntity<String> createReply(@RequestBody ReplyVO replyVO){
//		
//		log.info("ReplyVO: "+replyVO);
//		
//		int insertCount = replyService.registerReply(replyVO);
//		
//		log.info("Reply INSERT COUNT: "+insertCount);
//		
//		return insertCount==1
////				? new ResponseEntity<>("success",HttpStatus.OK)
//				? new ResponseEntity<>("성공",HttpStatus.OK)
//				: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//				//삼항연산자 처리
//	}
	
	//장바구니상품 주문 신청 requestbody 사용
	@PostMapping(value="/new",			
			consumes= {"application/json; charset=UTF-8"},
			produces= {"application/json; charset=UTF-8"})
	public ResponseEntity<String> getBasketList(
			@RequestBody List<BasketVO> basketList){
		
		log.info("====================================");
		log.info("주문신청 List: "+basketList);
		//log.info("주문신청 List[0]: "+basketList.get(0) );
		//log.info("주문신청 List[0].cust_Id: "+basketList.get(0).getCust_Id());		
				return orderService.addOrder(basketList)>0?
				new ResponseEntity<>("성공",HttpStatus.OK):
				new ResponseEntity<>("실패",HttpStatus.INTERNAL_SERVER_ERROR);	
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
	public ResponseEntity<String> delGoodsAtBasket(
			@PathVariable("custId") String custId,
			@PathVariable("goodsSeq") Long goodsSeq){
		
		log.info("장바구니 소유id: "+custId);
		log.info("장바구니 제거상품 번호"+goodsSeq);
		
		return orderService.deleteGoodsAtBasket(custId,goodsSeq)>0? //insert,update,delete는 행의 갯수를 반환
				new ResponseEntity<>("성공",HttpStatus.OK):
				new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	//장바구니에서 구매한 상품빼기
	@GetMapping(value="/basket/pur/{custId}/{goodsSeq}",
			produces= {"text/plain;charset=UTF-8"})
	public ResponseEntity<String> purGoodsAtBasket(
			@PathVariable("custId") String custId,
			@PathVariable("goodsSeq") Long goodsSeq) {
		
		log.info("장바구니 소유id: "+custId);
		log.info("장바구니 구매된 상품 번호"+goodsSeq);
		
		return orderService.purGoodsAtBasket(custId,goodsSeq)>0?
				new ResponseEntity<>("성공",HttpStatus.OK):
				new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	//장바구니 수량 변경
	@GetMapping(value="/basket/{custId}/{goodsSeq}/{qty}",
			produces= {"text/plain; charset=UTF-8"})
	public ResponseEntity<String> changeQtyAtBasket(
			@PathVariable("custId") String custId,
			@PathVariable("goodsSeq") Long goodsSeq,
			@PathVariable("qty") Long qty){
		log.info("장바구니 수량변경  소유 id: "+custId+"변경 아이템: "+goodsSeq+"변경 수량: "+qty);
		
		return orderService.changeQtyAtBasket(custId,goodsSeq,qty)>0?
				new ResponseEntity<>("성공",HttpStatus.OK):
				new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	//선택상품 장바구니에 넣기
	@GetMapping(value="/basket/new/{custId}/{goodsSeq}/{qty}",
			produces= {"text/plain;charset=UTF-8"})
	public ResponseEntity<String> addGoodsAtBasket(
			@PathVariable("custId") String custId,
			@PathVariable("goodsSeq") Long goodsSeq,
			@PathVariable("qty") Long qty){
		log.info("장바구니 추가 소유 id: "+ custId);
		log.info("장바구니 추가 상품번호: "+goodsSeq);
		log.info("장바구니 추가 상품번호: "+qty);
		
		return orderService.addGoodsAtBasket(custId,goodsSeq,qty)>0?
				new ResponseEntity<>("성공",HttpStatus.OK):
				new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
