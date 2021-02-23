package com.goott.eco.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.goott.eco.service.CustService;

@RequestMapping("/cust")
@Controller
public class CustController {

	@Autowired
	private CustService service;
	
	@GetMapping("/list")
	public ModelAndView custList() {
		List<Map<String, Object>> custList = service.getCustList(null);
		System.out.println(custList.size());
		ModelAndView mav = new ModelAndView("/cust/custlist");
		return mav;
	}
}
