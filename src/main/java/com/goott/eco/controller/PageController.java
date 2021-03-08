package com.goott.eco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@CrossOrigin(origins ="http://localhost:3000")
//@RequestMapping("/orders/*")
public class PageController {
	
	@GetMapping("/board/catelist")
	public String click(Model model) {
		log.info("catelist페이지 이동");
		return "board/catelist";
	}
	
	
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
	@GetMapping("/page/searchedGoodslist")
	public String search(Model model) {
		log.info("searchedGoodsList페이지 이동");
		return  "board/searchedGoodslist";
	}

	@GetMapping("/orders/basket/list")
	public void list(Model model) {
		log.info("list페이지 이동");
		
	}
	@GetMapping("/orders/order/checkout")
	public void checkout(Model model) {
		log.info("checkout페이지 이동");
		
	}
	
	@GetMapping("/orders/order/pay")
	public void pay(Model model) {
		log.info("pay페이지 이동");
		
	}
	
	@GetMapping("/home/contact")
	public void contact(Model model) {
		log.info("contact페이지 이동");
		
	}
	
	@GetMapping("/home/index")
	public void index(Model model) {
		log.info("index페이지 이동");
		
	}
	
	@GetMapping("/home/login")
	public void login(Model model) {
		log.info("login페이지 이동");
		
	}
	
	@GetMapping("/home/my-account")
	public void myAccount(Model model) {
		log.info("my-account페이지 이동");
		
	}
	@GetMapping("/products/product-detail")
	public void productDetail(Model model) {
		log.info("product-detail페이지 이동");
		
	}
	@GetMapping("/products/product-list")
	public void productList(Model model) {
		log.info("product-list페이지 이동");
		
	}
	@GetMapping("/orders/wishlist")
	public void wishlist(Model model) {
		log.info("wishlist페이지 이동");
		
	}
	/*
	 * @GetMapping("/goods/detail") public void goodsDetail(Model model) {
	 * log.info("상품상세페이지이동"); }
	 * 
	 * @GetMapping("/goods/list") public void goodsList(Model model) {
	 * log.info("상품리스트페이지이동"); }
	 */
}
