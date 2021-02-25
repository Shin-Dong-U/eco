package com.goott.eco.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goott.eco.domain.CustVO;
import com.goott.eco.service.CustService;

@RestController
@RequestMapping("/cust/rest/*")
public class RestCustController {
		@Autowired
		private CustService Custservice;

		/* 로그인 */
		@PostMapping(value="/login", produces = "application/json; charset=UTF-8")	
		public ResponseEntity<Map<String,CustVO>> loginCust(@RequestBody CustVO custVO) {
			
			Map<String,CustVO> custMap = new HashMap<String,CustVO>();
			custMap.put("custVO", Custservice.getCustLogin(custVO));
			
			return new ResponseEntity<>(custMap,HttpStatus.OK);
		}
		
		/* 회원가입 */
		@PutMapping(value="/join", produces="application/json; charset=UTF-8")
		public ResponseEntity<String> joinCust(@RequestBody CustVO cust) {
			System.out.println("cust: "+cust.toString());
			
			return Custservice.joinCust(cust) == 1
					?new ResponseEntity<>("success",HttpStatus.OK)
					:new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		

}
