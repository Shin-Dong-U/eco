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
	private CustService Custservice;
	
	@GetMapping("/list")
	public ModelAndView custList() {
		List<Map<String, Object>> custList = Custservice.getCustList(null);
		System.out.println(custList.size());
		ModelAndView mav = new ModelAndView("/cust/custlist");
		return mav;
	}
	
	@GetMapping("/gameInfo")
	public ModelAndView custId(String id) {
		CustVO custVO = new CustVO();
		custVO.setMemberId(id);
		
		
		CustVO custId = Custservice.getCustId(custVO);
		
		System.out.println("custId:" + custId);
		
		ModelAndView mav = new ModelAndView("/cust/gameInfo");
		
		return mav;
	}
	
	/* 로그인 페이지 이동 */
	@GetMapping("/login")
	public void custLogin() {
		
	}
	
	/* 관리자 페이지 이동 */
	@GetMapping("/admin")
	public void admin() {
		
	}


}
