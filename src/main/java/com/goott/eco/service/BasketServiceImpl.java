package com.goott.eco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goott.eco.domain.BasketVO;
import com.goott.eco.domain.GoodsVOtest;
import com.goott.eco.mapper.BasketMapper;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class BasketServiceImpl implements BasketService {
	
	private BasketMapper basketMapper;	
	
	@Autowired
	public BasketServiceImpl(BasketMapper basketMapper) {	
		this.basketMapper = basketMapper;
	}

	@Override
	public List<BasketVO> getBasketList(String custId) {
		
		return basketMapper.getBasketList(custId);
	}

	@Override
	public GoodsVOtest getGoodsInfo(Long goodsSeq) {
		
		return basketMapper.getGoodsInfo(goodsSeq);
	}

	@Override
	public int deleteGoodsAtBasket(String custId, Long goodsSeq) {
		log.info("장바구니 삭제: "+custId+" / "+goodsSeq);
		return basketMapper.delGoodsAtBasket(custId,goodsSeq);
	}

	@Override
	public int purGoodsAtBasket(String custId, Long goodsSeq) {
		log.info("장바구니 구매된: "+custId+" / "+goodsSeq);
		
		return basketMapper.purGoodsAtBasket(custId,goodsSeq);
	}

	@Override
	public int addGoodsAtBasket(String custId, Long goodsSeq, Long qty) {
		
		
		return basketMapper.addGoodsAtBasket(custId,goodsSeq,qty);
	}

	@Override
	public int changeQtyAtBasket(String custId, Long goodsSeq, Long qty) {
		
		
		return basketMapper.changeQtyAtBasket(custId,goodsSeq,qty);
	}

}
