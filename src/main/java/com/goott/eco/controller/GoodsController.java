package com.goott.eco.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.goott.eco.common.Criteria;
import com.goott.eco.common.PageDTO;
import com.goott.eco.service.CommonService;
import com.goott.eco.service.GoodsService;

@RequestMapping("/goods")
@Controller
public class GoodsController {
	
	@Autowired private GoodsService goodsService;
	@Autowired private CommonService commonService;
	
	@GetMapping("")
	public ModelAndView goodsList(HttpServletRequest request, HttpServletResponse response, Criteria cri) {
		ModelAndView mav = new ModelAndView("/goods/goods_list2");
//		mav.addAllObjects(goodsService.goodsList(cri));
		mav.addObject("cateList", commonService);
		
		return mav;
	}
	
	@GetMapping("/{goodsSeq}")
	public ModelAndView goodsDetail(HttpServletRequest request, HttpServletResponse response, @PathVariable int goodsSeq) {
		ModelAndView mav = new ModelAndView("/goods/goods_detail");
		mav.addAllObjects(goodsService.goodsDetail(goodsSeq));
		
		return mav;
	}
}
