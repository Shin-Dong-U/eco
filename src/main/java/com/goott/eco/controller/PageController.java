package com.goott.eco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/orders/*")
public class PageController {

	@GetMapping("/basket/list")
	public void list(Model model) {
		log.info("list페이지 이동");
		
	}
}
