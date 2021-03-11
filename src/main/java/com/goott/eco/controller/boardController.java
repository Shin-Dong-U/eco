package com.goott.eco.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.goott.eco.service.BoardService;

@Controller
@RequestMapping("/board/*")

public class boardController {

		private BoardService boardService;
		
		@Autowired
		public boardController(BoardService boardService) {
			this.boardService = boardService;
		}
		

		//검색
//
//		@GetMapping("/searchedlist")
//			public String searchedlist(@RequestParam("goods_name") String goods_name, Model model) {
//			//int countArticle(String searchOption, String keyword);
//			
//			System.out.println("start");
//			System.out.println("검색: "+ goods_name);
//			
//			model.addAttribute("goods_name", goods_name);
//			return "board/cateGoodslist";	
//		}
//		

		
		//상단 바
//		@GetMapping("/{goods_seq}")
//		public ModelAndView goodsDetail(HttpServletRequest request, HttpServletResponse response, @PathVariable int goods_seq) {
//			ModelAndView mav = new ModelAndView("/goods/goods_detail");
//			mav.addAllObjects(boardService.goodsDetail(goods_seq));
//			
//			return mav;
//		}
		
		
		
		//카테고리 클릭->해당 카테고리 상품목록 페이지
		@GetMapping("/catelist")
			public String cateList(@RequestParam("cate_seq") int cate_seq, Model model) {
			
			System.out.println("start");
			System.out.println("선택 카테고리: "+ cate_seq);
			
			model.addAttribute("cate_seq",cate_seq);
			return "board/cateGoodslist";
		}
		//${cate_seq}
		
		


		


		
		
	
	
}
