package com.goott.eco.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goott.eco.service.ChartService;

import lombok.extern.log4j.Log4j;

@CrossOrigin(origins ="http://localhost:3000")
@RequestMapping("/chart/*")
@RestController
@Log4j
public class ChartController {

	
	private ChartService chartService;
	
	@Autowired
	public ChartController(ChartService chartService) {
		this.chartService = chartService;
	}
	
	//월별 판매 정보 get
	@GetMapping(value="/month/sale",
			produces= {"application/json; charset=UTF-8"})
	public ResponseEntity<List<HashMap<String, Object>>> getMonthSale(){
		
		List<HashMap<String, Object>> result = chartService.getMonthSale();
		log.info("결과"+result);
		return new ResponseEntity<>(result,HttpStatus.OK);
	}

	
	
	
}
