package com.goott.eco.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.goott.eco.common.Criteria;
import com.goott.eco.service.GoodsService;

@RequestMapping("/goods")
@Controller
public class GoodsController {
	
	@Autowired private GoodsService goodsService;
	
	@GetMapping("")
	public ModelAndView goodsList(HttpServletRequest request, HttpServletResponse response, @ModelAttribute Criteria cri) {
		ModelAndView mav = new ModelAndView("/goods/goods_list");
		mav.addAllObjects(goodsService.goodsList(cri));
		
		return mav;
	}
	
	@GetMapping("{goodsSeq}")
	public ModelAndView goodsDetail(HttpServletRequest request, HttpServletResponse response, @PathVariable int goodsSeq) {
		ModelAndView mav = new ModelAndView("/goods/goods_detail");
		mav.addAllObjects(goodsService.goodsDetail(goodsSeq));
		
		return mav;
	}
	
}
