package com.goott.eco.domain;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BasketVO {
	
	private Long basketSeq;
	private Long goodsSeq;
	private String custId;
	private Long qty;
	private String purchaseYn;
	private String deleteYn;
	private Timestamp regDate;
	private String regUser;
	private Timestamp editDate;
	private String editUser;

}
