package com.goott.eco.domain;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class GoodsReqOptionVO {
	private int goods_seq;
	private int goods_req_option_seq;
	private int price;
	private Timestamp regdate;
	private String reguser;
	private Timestamp editdate;
	private String edituser;
}
