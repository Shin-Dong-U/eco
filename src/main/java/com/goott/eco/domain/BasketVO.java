package com.goott.eco.domain;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BasketVO {
	
	private long basket_seq;
	private long goods_seq;
	private String cust_Id;
	private long qty;
	private String purchase_YN;
	private String delete_YN;
	private Timestamp regDate;
	private String regUser;
	private Timestamp editDate;
	private String editUser;

}
