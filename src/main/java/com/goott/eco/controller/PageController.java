package com.goott.eco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
//@CrossOrigin(origins ="http://localhost:3000")
@RequestMapping("/deli/*")
public class PageController {

	@GetMapping("/delilist")
	public void list(Model model) {
		
		System.out.print("list페이지");
	}
	
	@GetMapping("/delilist2")
	public String list2(Model model) {
		
		return "deli/delilist";
	}

}
