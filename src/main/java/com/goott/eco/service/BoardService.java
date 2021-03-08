package com.goott.eco.service;

import java.util.List;

import com.goott.eco.domain.GoodsVO;


public interface BoardService {
	
	public List<GoodsVO> getsearchedGoodsList(String goods_name);
	
	public List<Integer> getCateList(int cate_seq);

}
