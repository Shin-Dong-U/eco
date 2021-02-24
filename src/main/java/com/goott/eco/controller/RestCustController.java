package com.goott.eco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goott.eco.service.CustService;
import com.goott.eco.vo.CustVO;

@RestController
@RequestMapping("/cust/rest/*")
public class RestCustController {
		@Autowired
		private CustService Custservice;

		@PostMapping(value="/login",
		consumes = "application/json; charset=UTF-8", 
		produces = "text/html; charset=utf-8")	
		public ResponseEntity<CustVO> custlogin(@RequestBody CustVO cust) {
			
			//CustVO custVO = Custservice.getCustLogin(cust);
			/*		
			return custVO != null
					?new ResponseEntity<>("success",HttpStatus.OK)
					:new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			*/
			return new ResponseEntity<>(Custservice.getCustLogin(cust),HttpStatus.OK);
		}
		

}
