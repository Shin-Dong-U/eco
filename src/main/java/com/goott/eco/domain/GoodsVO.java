package com.goott.eco.domain;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

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
	
	private GoodsThumbNailVO goodsThumbNailVO;
	private GoodsReqOption goodsReqOption;
	private GoodsCommentVO goodsCommentVO;
	private GoodsDetailImgVO goodsDetailImgVO;
	
	//썸네일이미지
	@Data
	public static class GoodsThumbNailVO{
		private int goods_seq;
		private int goods_thumb_nail_seq;
		private String img_url;
		private String main_yn;
		private Timestamp regdate;
		private String reguser;
		private Timestamp editdate;
		private String edituser;
	}
	
	//필수옵션
	@Data
	public static class GoodsReqOption{
		private int goods_seq;
		private int goods_req_option_seq;
		private int price;
		private Timestamp regdate;
		private String reguser;
		private Timestamp editdate;
		private String edituser;
	}
	
	//댓글
	@Data
	public static class GoodsCommentVO{
		private int goods_seq;
		private String cust_id;
		private String star;
		private Timestamp regdate;
		private int goods_comment_seq;
		private String memo;
		private String goods_comment_img_url;
	}
	
	//상세 이미지 
	@Data
	public static class GoodsDetailImgVO{
		private int goods_seq;
		private int img_order;
		private String img_url;
		private Timestamp regdate;
		private String reguser;
		private Timestamp editdate;
		private String edituser;
		private String goods_detail_img_key;
		
		//goods_seq + 현재시간(밀리세컨)을 리턴.
		public void makeKey(int goods_seq) {
			this.goods_seq = goods_seq;
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmssSSS");
			long time = System.currentTimeMillis();
			this.goods_detail_img_key = goods_seq + sdf.format(time);
		}
	}
	
}