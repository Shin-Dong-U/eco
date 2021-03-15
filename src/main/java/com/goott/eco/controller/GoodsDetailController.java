package com.goott.eco.controller;

import java.util.List;
//import java.util.List;
import java.util.Map;

//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;

import com.goott.eco.service.GoodsService;

import lombok.extern.log4j.Log4j;

@RestController
@Log4j
@RequestMapping("/goods/*")
public class GoodsDetailController {
	
	private GoodsService goodsService;
	
	@Autowired
	public GoodsDetailController(GoodsService goodsService) {
		this.goodsService = goodsService;
	}
	
	//상품이름, 상품가격, 상품상세(설명),<====이거먼저하고, 추후설명  기존 댓글정보(페이징처리),댓글 insert
	
	
	//상품 상세 조회  
		@GetMapping(value="/info/{goods_seq}",			
				produces= {"application/json; charset=UTF-8"})
		public ResponseEntity<Map<String,Object>> getGoodsDetailInfo(
				@PathVariable("goods_seq") int goods_seq){
			log.info("상품상세 goods_seq : "+goods_seq);
			Map<String,Object> result = goodsService.goodsDetail(goods_seq);
			log.info("jsp로 넘겨질 데이터: "+result);
			
			return new ResponseEntity<>(result,HttpStatus.OK);
			
		}
		
		
    //1.기존댓글정보가져오기 2. 댓글 insert 3.페이징처리
		@GetMapping(value="/reply/{goods_seq}/{start}",
				produces= {"application/json; charset=UTF-8"})
		public ResponseEntity<List<Map<String,Object>>> replyGoodsComment(
				@PathVariable("goods_seq") int goodsSeq,
				@PathVariable("start") int start){
			
			log.info("댓글상세 goods_seq:"+goodsSeq);
			log.info("댓글페이징시작번호 :"+start);
			
			List<Map<String,Object>> result = goodsService.goodsComment(goodsSeq, start);
			log.info("jsp로 넘겨질 데이터 : "+result);
			
			return new ResponseEntity<>(result,HttpStatus.OK);
		}
		
		
		
		
		
		
		
}
