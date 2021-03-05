package com.goott.eco.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.goott.eco.domain.CustVO;
import com.goott.eco.service.CustService;

@RequestMapping("/cust/*")
@Controller
public class CustController {

	@Autowired
	private CustService custService;
	
	@GetMapping("/list")
	public ModelAndView custList() {
		List<Map<String, Object>> custList = custService.getCustList(null);
		
		System.out.println(custList.size());
		ModelAndView mav = new ModelAndView("/cust/custlist");
		mav.addObject("custlist",custList);
		
		return mav;
	}
	
	
	@GetMapping("/game/list")
	public void list(Model model) {
		System.out.println("list페이지 이동");
	}
	
//	@GetMapping("/game/item")
//	public void item(Model model) {
//		System.out.println("item페이지이동");
//	}
	
	
	
	
	
	
	
	//null값으로 , 그냥 gameInfo에 화면만 출력하게해준것
	//http://localhost/cust/gameInfo?id=basic
	@GetMapping("/gameInfo")
	public ModelAndView custId(String id) {
		CustVO custVO = new CustVO();
		custVO.setMemberId(id);
		
		CustVO custId = custService.getCustId(custVO);
		
		System.out.println("custId:" + custId);
		
		ModelAndView mav = new ModelAndView("/cust/gameInfo");
		
		return mav;
	}
	
	//만약 회원의 게임 나무레벨이 A라면, GAME_IMAGE에 있는 값을 불러와라! 
	
	
	
	
//CustVO custId = service.getCustId(custVO);

				
	
//	//사용자가 읽기만하는 값을 뷰단에 구현하면되므로, post가 아닌 get을 사용해서 그냥 화면에 뿌려주면된다.
//	//이후에 업데이트는 따로 로직 구현하기
//	@GetMapping("/gameInfo")
//	//public ModelAndView custId(String id) {
//	public void custId(@ModelAttribute("custId")  CustVO custVO, Model model) {
//		
//		System.out.println("/....get custId");
//		model.addAttribute("custId", service.getCustId(custVO));
//		//CustVO custVO = new CustVO();
//		//custVO.setMemberId(id);
//		
//		//System.out.println("custId:" + custId.getMemberId());
//		//System.out.println("custId:" + custId.getMytree());
//		//System.out.println("custId:" + custId.getMymil());
//		
//		//ModelAndView mav = new ModelAndView("/cust/gameInfo");
//		
//	}

	




}
