package com.goott.eco.domain;

import java.sql.Timestamp;

import lombok.Data;


@Data
public class CustVO {
	private String memberId;	//
	private String password;	//
	private String name;		//
	private String phone;       //
	private String email;       //
	private String addr_post;   //
	private String addr_city;   //
	private String addr_detail; //
	private String birth;       //
	private int sex;            //
	private String company_yn;  //
	private String member_yn;   //
	private Timestamp regDate;  //
	private String regUser;     //
	private Timestamp editDate; //
	private String editUser;    //
	private String myTree;      //
	private Long myMil;         //

}
