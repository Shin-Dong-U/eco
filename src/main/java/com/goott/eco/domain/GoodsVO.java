package com.goott.eco.domain;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class GoodsVO {
	private int goods_seq;
	private int comp_seq;
	private String goods_name;
	private long price;
	private int qty;
	private String material;
	private int category;
	private int eco_score;
	private Timestamp regdate;
	private String reguser;
	private String edituser;
	private Timestamp editdate;
	private String danger_yn;
	private String sale_yn;
	private String req_option;
	private String goods_detail;
	
	//GoodsThumbNail
	private int goods_thum_nail_seq;
	private String img_url;
	private String main_yn;
}