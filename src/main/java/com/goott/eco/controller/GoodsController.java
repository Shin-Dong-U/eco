package com.goott.eco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/goods")
@Controller
public class GoodsController {
	
//	@Autowired private GoodsService goodsService;
//	
//	@GetMapping("/list")
//	public ModelAndView goodsList(HttpServletRequest request, HttpServletResponse response) {
//		ModelAndView mav = new ModelAndView("/goods/goodslist");
//		//System.out.println(goodsService.getGoodsList(null).size());
//		return mav;
//	}
//	
//	@GetMapping("/list2")
//	public String goodsList2(HttpServletRequest request, HttpServletResponse response) {
//		
//		return "/goods/goodslist";
//	}
}
