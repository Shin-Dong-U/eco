package com.goott.eco.domain;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class CompanyVO {
	private Long comp_seq;		//
	private String cust_id;		//
	private String comp_name;	//
	private String comp_num;	//
	private String addr_post;	//
	private String addr_city;	//
	private String addr_detail;	//
	private String confirm_yn;	//
	private Timestamp regDate;	//
	private String regUser;		//
	private Timestamp editDate;	//
	private String editUser;	//
	private String memo;		//
}
