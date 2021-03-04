package com.goott.eco.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goott.eco.service.AdminService;

@RestController
@RequestMapping("/admin/*")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	
	/* 모든 일반 사용자 회원 정보 가져오기  */
	@GetMapping(value="/getCust")
	public ResponseEntity<Map<String, Object>> getCustList(){
		Map<String, Object> custMap = adminService.getCustList();	
		return new ResponseEntity<>(custMap, HttpStatus.OK);
		
	}
	
	
	/* 모든 관리자  회원 정보 가져오기  */
	@GetMapping(value="/getAdmin")
	public ResponseEntity<List<Map<String, Object>>> getAdminList(){
		List<Map<String, Object>> custMap = new ArrayList<Map<String, Object>>();
		///custMap = adminService.getAdminList();
		return null;
		
	}
	
	/* 모든 업체 회원 정보 가져오기  */
	@GetMapping(value="/getCompany")
	public ResponseEntity<List<Map<String, Object>>> getCompanyList(){
		List<Map<String, Object>> custMap = new ArrayList<Map<String, Object>>();
		//custMap = adminService.getCompanyList();
		
		return null;
		
	}
	

}
