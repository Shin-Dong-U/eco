package com.goott.eco.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goott.eco.domain.CustVO;
import com.goott.eco.domain.MemberVO;
import com.goott.eco.service.CustService;

@RestController
@RequestMapping("/cust/rest/*")
public class RestCustController {
		@Autowired
		private CustService custService;
		
		/* 특정 회원 정보 가져오기 */
		@PostMapping(value="/get/{memberId}", produces="application/json; charset=UTF-8")
		public ResponseEntity<Map<String,MemberVO>> getMember(@PathVariable("memberId") String memberId){
			Map<String,MemberVO> memberMap = new HashMap<String,MemberVO>();
			MemberVO memberVO = new MemberVO();
			//memberVO = custService.getCust(memberId);
			memberMap.put("memberVO", memberVO);
			return new ResponseEntity<>(memberMap, HttpStatus.OK);
		}
		
		
		/* 로그인 */
		@PostMapping(value="/login", produces = "application/json; charset=UTF-8")	
		public ResponseEntity<Map<String,CustVO>> loginCust(@RequestBody CustVO custVO) {
			
			Map<String,CustVO> custMap = new HashMap<String,CustVO>();
			custMap.put("custVO", custService.getCustLogin(custVO));
			
			return new ResponseEntity<>(custMap,HttpStatus.OK);
		}
		
		/* 회원가입  - cust와 company */
		@PutMapping(value="/join", produces="application/json; charset=UTF-8")
		public ResponseEntity<String> joinCust(@RequestBody MemberVO memberVO) {
			System.out.println("memberVO: "+memberVO);
			return custService.joinCust(memberVO) == 1
					?new ResponseEntity<>("success",HttpStatus.OK)
					:new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		/* 회원 수정 - cust와 company */
		@PutMapping(value="/modify", produces="application/json; charset=UTF-8")
		public ResponseEntity<String> modifyCust(@RequestBody MemberVO memberVO){
			System.out.println("memberVO: "+memberVO);
					
			return custService.modifyCust(memberVO) == 1
					?new ResponseEntity<>("success",HttpStatus.OK)
					:new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		/* 회원 탈퇴 */
		@PutMapping(value="/delete/{memberId}", produces="application/json; charset=UTF-8")
		public ResponseEntity<String> deleteCust(@PathVariable("memberId") String memberId ){
			System.out.println("memberId: "+memberId);
			
			return custService.deleteCust(memberId) == 1
					?new ResponseEntity<>("success",HttpStatus.OK)
					:new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
}
