package com.goott.eco.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
	@GetMapping(value="/getCust/{cust}",produces={"application/json; charset=UTF-8"})
	public ResponseEntity<List<HashMap<String,Object>>> getCustList(){
		/* TEST형식 */
		List<HashMap<String, Object>> custList = adminService.getCustList();
		System.out.println("controller: "+ custList);

		
		return new ResponseEntity<>(custList, HttpStatus.OK);
		
	}
	
	/* 모든 관리자 정보 가져오기 */
	@GetMapping(value="/getAdmin/{cust}",produces={"application/json; charset=UTF-8"})
	public ResponseEntity<List<HashMap<String, Object>>> getAdminList(){
		/* TEST형식 */
		List<HashMap<String, Object>> adminList = new ArrayList<>();
		adminList=adminService.getAdminList();
		System.out.println("test: "+adminList);
		
		
		return new ResponseEntity<>(adminService.getAdminList(), HttpStatus.OK);
	}
	
	/* 모든 업체 회원 정보 가져오기  */
	@GetMapping(value="/getCompany/{cust}",produces={"application/json; charset=UTF-8"})
	public ResponseEntity<List<HashMap<String, Object>>> getCompanyList(){
		/* TEST형식 */
		List<HashMap<String, Object>> companyList = new ArrayList<>();
		companyList=adminService.getCompanyList();
		System.out.println("test: "+companyList);
		
		
		return new ResponseEntity<>(companyList, HttpStatus.OK);
		
	}
}
