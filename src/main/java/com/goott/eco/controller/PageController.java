package com.goott.eco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@CrossOrigin(origins ="http://localhost:3000")
//@RequestMapping("/orders/*")
public class PageController {
	
	@GetMapping("/game/tree")
	public void game() {
		log.info("game페이지 이동");
		//return "orders/basket/list";
	}
	
	@GetMapping("/orders/basket/list")
	public void list(Model model) {
		log.info("list페이지 이동");
		//return "orders/basket/list";
	}
	@GetMapping("/orders/order/checkout")
	public void checkout(@RequestParam Long order_seq,Model model) {
		log.info("checkout페이지 이동");
		
		model.addAttribute("order_seq",order_seq);
		
		//return "orders/order/checkout";
	}
	
	@GetMapping("/orders/order/orderCheck")
	public void orderCheck(@RequestParam Long order_seq,Model model) {
		model.addAttribute("order_seq",order_seq);
		log.info("orderCheck페이지 이동");
	}
	
	@GetMapping("/orders/ship/writeShipInfo")
	public void writeShipInfo(@RequestParam Long order_seq,Model model) {
		model.addAttribute("order_seq",order_seq);
		log.info("writeShipInfo페이지 이동");
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
	@GetMapping("/home/index")
	public String index(Model model) {
		log.info("index페이지 이동");
        return "home/index";
	}
//	
//	@GetMapping("/home/login")
//	public void login(Model model) {
//		log.info("login페이지 이동");
//		
//	}
//	
	@GetMapping("/home/my-account")
	public void myAccount(Model model) {
		log.info("my-account페이지 이동");
		
	}
	
	@GetMapping("/home/my-account-order")
	public void myAccountorder(Model model) {
		log.info("my-account페이지 이동");
		
	}
	
	@GetMapping("/products/product-detail-order")
	public void productDetail(Model model) {
		log.info("product-detail페이지 이동");
		
	}
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
	@GetMapping("/cust/login")
	public void custLogin() {
		
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
