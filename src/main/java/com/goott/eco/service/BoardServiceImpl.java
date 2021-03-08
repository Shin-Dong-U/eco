package com.goott.eco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.goott.eco.domain.GoodsVO;
import com.goott.eco.mapper.BoardMapper;
import com.goott.eco.mapper.DeliveryMapper;

public class BoardServiceImpl implements BoardService{
	
private BoardMapper boardMapper;
	
	@Autowired
	public BoardServiceImpl(BoardMapper boardMapper) {
		this.boardMapper = boardMapper;
	}

	@Override
	public List<GoodsVO> getsearchedGoodsList(String goods_name) {
		return boardMapper.getsearchedGoodsList(goods_name);
	}

	@Override
	public List<Integer> getCateList(int cate_seq) {
		return boardMapper.getCateList(cate_seq);
	}

}
