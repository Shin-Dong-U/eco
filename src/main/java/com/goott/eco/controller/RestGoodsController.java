package com.goott.eco.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goott.eco.common.Criteria;
import com.goott.eco.service.GoodsService;

@RestController
@RequestMapping("/goods/rest/*")
public class RestGoodsController {
		
	@Autowired private GoodsService goodsService;

	@GetMapping(value="", produces = "application/json; charset=UTF-8")	
	public ResponseEntity<Map<String, Object>> goodsList(Criteria cri) {
		Map<String, Object> goods = goodsService.goodsList(cri);
		
		return new ResponseEntity<>(goods, HttpStatus.OK);
	}
}
