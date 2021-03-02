package com.goott.eco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goott.eco.service.DeliService;

import lombok.extern.log4j.Log4j;

@RequestMapping("/delivery/*")
@RestController
@Log4j
public class DeliMain {
	
	private DeliService deliService;

	@Autowired
	public DeliMain(DeliService deliService) {
		this.deliService = deliService;
	}

}
