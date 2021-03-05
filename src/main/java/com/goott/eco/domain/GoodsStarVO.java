package com.goott.eco.domain;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class GoodsStarVO {
	private int goods_seq;
	private int cust_id;
	private int star;
	private Timestamp regdate;
}
