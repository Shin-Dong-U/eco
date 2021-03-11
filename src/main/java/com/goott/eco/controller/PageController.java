package com.goott.eco.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;


import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@CrossOrigin(origins ="http://localhost:3000")
//@RequestMapping("/orders/*")
public class PageController {
	

	
	
	@GetMapping("/deli/delilist")
	public String list3(Model model) {
		log.info("alldelivery페이지 이동");
		return "deli/delilist";
	}
	
	@GetMapping("/paidGoods/list")
	public String list4(Model model) {
		log.info("paidGoods페이지 이동");
		return "paidGoods/list";
	}
//	@GetMapping("/page/searchedGoodslist")
//	public String search(Model model) {
//		log.info("searchedGoodsList페이지 이동");
//		return  "board/searchedGoodslist";
//	}

	@GetMapping("/game/tree")
	public void game() {
		log.info("game페이지 이동");
		//return "orders/basket/list";
	}

	@GetMapping("/orders/basket/list")
	public String list(Model model) {
		log.info("list페이지 이동");
		return "orders/basket/list";
	}
	@GetMapping("/orders/order/checkout")
	public void checkout(Model model) {
		log.info("checkout페이지 이동");
		//return "orders/order/checkout";
	}
	
	@GetMapping("/orders/order/orderCheck")
	public void orderCheck(Model model) {
		log.info("orderCheck페이지 이동");
	}
	
	@GetMapping("/delivery/deliveryCheck")
	public void deliveryCheck(Model model) {
		log.info("deliveryCheck페이지 이동");
	}
	
	
	@GetMapping("/orders/order/pay")
	public String pay(Model model) {
		log.info("pay페이지 이동");
		return "orders/order/pay";
	}

//	
//	@GetMapping("/home/contact")
//	public void contact(Model model) {
//		log.info("contact페이지 이동");
//		
//	}
//	
	@PreAuthorize("permitAll")
	@GetMapping("/home/index")
	public String index(Model model) {
		log.info("index페이지 이동");
        return "home/index";
	}
	
	@GetMapping("/home/my-account")
	public void myAccount(Model model) {
		log.info("my-account페이지 이동");
		
	}
	
	@GetMapping("/home/my-account-order")
	public void myAccountorder(Model model) {
		log.info("my-account페이지 이동");
		
	}
//	@GetMapping("/board/catelist")
//	public void CateList(Model model) {
//		log.info("CateList페이지 이동");
//		
//	}
	
//	@GetMapping("/products/product-detail")
//	public void productDetail(Model model) {
//		log.info("product-detail페이지 이동");
//		
//	}
//	@GetMapping("/products/product-list")
//	public void productList(Model model) {
//		log.info("product-list페이지 이동");
//		
//	}
//	@GetMapping("/orders/wishlist")
//	public void wishlist(Model model) {
//		log.info("wishlist페이지 이동");
//		
//	}

	/* 로그인 페이지 이동 */
	@GetMapping("/home/login")
	public void login(HttpServletRequest request) {
		String referrer = request.getHeader("Referer");
		if(referrer!=null) {
			System.out.println("이전페이지url: "+referrer);
		    request.getSession().setAttribute("prevPage", referrer);
		}
		log.info("login페이지 이동");
	}
	
	/* 회원가입 이동 */
	@GetMapping("/home/register")
	public void register() {
		log.info("register페이지 이동");
	}
	/* 카카오 로그인 이동*/
	@GetMapping("/home/kakao")
	public String kakaoLogin(HttpServletRequest request) {

		return "/home/kakao_login";
	}

	/* 관리자 페이지 이동 */
	@GetMapping("/admin/admin")
	public void admin() {
		
	}
	/* list 페이지 이동 */
	@GetMapping("/cust/list")
	public void custList() {

	}

	@GetMapping("/game/item")
	public void item(Model model) {
		System.out.println("item페이지이동");
	}


	
	

	/*
	 * @GetMapping("/goods/detail") public void goodsDetail(Model model) {
	 * log.info("상품상세페이지이동"); }
	 * 
	 * @GetMapping("/goods/list") public void goodsList(Model model) {
	 * log.info("상품리스트페이지이동"); }
	 */
}
