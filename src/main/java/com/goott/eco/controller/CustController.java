package com.goott.eco.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.goott.eco.domain.CustVO;
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
	
	//null값으로 , 그냥 gameInfo에 화면만 출력하게해준것
	//http://localhost/cust/gameInfo?id=basic
	@GetMapping("/gameInfo")
	public ModelAndView custId(String id) {
		CustVO custVO = new CustVO();
		custVO.setMemberId(id);
		
		
		CustVO custId = service.getCustId(custVO);
		
		System.out.println("custId:" + custId);
		
		ModelAndView mav = new ModelAndView("/cust/gameInfo");
		
		return mav;
	}
	
	
	
//	@GetMapping("/gameInfo")
//	public ModelAndView custId(String id) {
//		CustVO custVO = new CustVO();
//		custVO.setMemberId(id);
//		
//		//CustVO custId = service.getCustId(custVO);
//		//System.out.println("custId:" + custId.getMemberId());
//		//System.out.println("custId:" + custId.getMytree());
//		//System.out.println("custId:" + custId.getMymil());
//		
//		ModelAndView mav = new ModelAndView("/cust/gameInfo");
//		
//		return mav;
//	}
	
}
