package com.goott.eco.domain;

import java.sql.Timestamp;

public class GoodsComment {
	
	private long goods_seq;
	private String cust_id;
	private int star;
	private Timestamp regdate;
	private long goods_comment_seq;
	private String memo;
	private String goods_comment_img_url;
	
	
	public long getGoods_seq() {
		return goods_seq;
	}
	public void setGoods_seq(long goods_seq) {
		this.goods_seq = goods_seq;
	}
	public String getCust_id() {
		return cust_id;
	}
	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}
	public int getStar() {
		return star;
	}
	public void setStar(int star) {
		this.star = star;
	}
	public Timestamp getRegdate() {
		return regdate;
	}
	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
	public long getGoods_comment_seq() {
		return goods_comment_seq;
	}
	public void setGoods_comment_seq(long goods_comment_seq) {
		this.goods_comment_seq = goods_comment_seq;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getGoods_comment_img_url() {
		return goods_comment_img_url;
	}
	public void setGoods_comment_img_url(String goods_comment_img_url) {
		this.goods_comment_img_url = goods_comment_img_url;
	}
	
	

}
