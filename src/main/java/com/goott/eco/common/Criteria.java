package com.goott.eco.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Criteria {
	private int pageNum;	//현재 페이지 번호
	private int amount;		//페이지당 출력할 레코드 수
	
	private String CustType;	//검색범위 (관리자:[A]-admin 일반사용자:[C]-cust 회사:[P]-company)
	private String CustSearchType;      //검색[]:CustName
	private String CustSearchKeyword;      //검색 단어
	
/*	public Criteria() {
		this(1,20);	//게시물 번호를 입력
	}

	public Criteria(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
	}
	
	//
	public String[] getTypeArr() {
		return CustType == null ? new String[] {} : CustType.split("");
	}
*/
}

