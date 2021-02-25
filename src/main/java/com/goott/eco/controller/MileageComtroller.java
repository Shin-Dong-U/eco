package com.goott.eco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.goott.eco.service.MileageService;

@RequestMapping("/mileage")
//@RestController
@Controller
public class MileageComtroller {

	private MileageService mileageService;
	
	//db에서 가져온게아니야.그냥페이지이동만했을때 
	//http://localhost/mileage/getId?id=sample_id
	
	//아이디
	//@GetMapping(value="/getId", produces = "text/plain; charset=UTF-8")
	//@GetMapping(value="/getId")
	@GetMapping(value="/getId")
	public String getId(String id, Model model) {
	//public String getId() {
	//String id = "sample_id";
		
		model.addAttribute("id", mileageService.getId(id));
		
		System.out.println("Controller id_2: " + id);
		
		return "/test";
	}
	
	
	
	
	//마일리지
}
