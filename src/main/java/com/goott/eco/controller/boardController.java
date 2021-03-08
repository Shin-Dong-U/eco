package com.goott.eco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.goott.eco.domain.DeliveryVO;
import com.goott.eco.domain.GoodsVO;
import com.goott.eco.domain.GoodsVOtest;
import com.goott.eco.service.BoardService;
import com.goott.eco.service.OrderService;

@RequestMapping("/board/*")

public class boardController {

		private BoardService boardService;
		
		@Autowired
		public boardController(BoardService boardService) {
			this.boardService = boardService;
		}
		
		//검색한 상품목록 리스트
		@GetMapping(value="/search/searchedGoodslist",
				produces= {"application/json; charset=UTF-8"})
		public ResponseEntity<List<GoodsVO>> getsearchedGoodsList(
				@PathVariable("goods_name") String goods_name){
			
			System.out.println("start");
			System.out.println("검색한 상품목록: "+ goods_name);
			return new ResponseEntity<>(boardService.getsearchedGoodsList(goods_name),HttpStatus.OK);
		}
		
		//카테고리 클릭->해당 카테고리 상품목록 페이지
		@GetMapping(value="/click/{cate_seq}",
				produces= {"application/json; charset=UTF-8"})
		public ResponseEntity<List<Integer>> getCateList(
				@PathVariable("cate_seq") int cate_seq){
			
			System.out.println("start");
			System.out.println("카테고리 페이지"+ cate_seq);
			return new ResponseEntity<>(boardService.getCateList(cate_seq),HttpStatus.OK);
		}
		
		
	
	
}
