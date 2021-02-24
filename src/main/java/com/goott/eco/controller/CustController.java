package com.goott.eco.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.goott.eco.service.CustService;
import com.goott.eco.vo.CustVO;


@RequestMapping("/cust")
@Controller
public class CustController {

	@Autowired
	private CustService Custservice;
	
	@GetMapping("/list")
	public ModelAndView custList() {
		List<Map<String, Object>> custList = Custservice.getCustList(null);
		System.out.println(custList.size());
		ModelAndView mav = new ModelAndView("/cust/custlist");
		return mav;
	}
	
	@GetMapping("/login1")
	public String custLogin() {
		return "/login1";
	}
	/*
	@PostMapping(value="/login/",
			consumes = {"application/json; charset=UTF-8"}, 
			produces = {"text/plain; charset=utf-8"})	
	public ResponseEntity<String> custlogin(@RequestBody CustVO cust) {
		CustVO custVO = Custservice.getCustLogin(cust);
		System.out.println("CustVO:"+custVO);
		
		return custVO != null
				? new ResponseEntity<>("success", HttpStatus.OK)
				: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	*/

}
