package com.goott.eco.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.goott.eco.service.GoodsService;

@RequestMapping("/goods")
@Controller
public class GoodsController {
	
	@Autowired private GoodsService goodsService;
	
	@GetMapping("/list")
	public ModelAndView goodsList(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("/goods/goodslist");
		int size = goodsService.getGoodsList(null).size();
		System.out.println(size);
		return mav;
	}
	
	@GetMapping("/list2")
	public String goodsList2(HttpServletRequest request, HttpServletResponse response) {
		
		return "/goods/goodslist";
	}
}
