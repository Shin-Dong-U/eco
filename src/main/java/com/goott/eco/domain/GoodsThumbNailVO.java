package com.goott.eco.domain;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class GoodsThumbNailVO {
	private int goods_seq;
	private int goods_thum_nail_seq;
	private String img_url;
	private String main_yn;
	private Timestamp regdate;
	private String reguser;
	private Timestamp editdate;
	private String edituser;
}