package com.goott.eco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goott.eco.domain.BasketDetailVO;
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
	public List<BasketDetailVO> getBasketList(String cust_id) {
		
		return basketMapper.getBasketList(cust_id);
	}

	@Override
	public GoodsVOtest getGoodsInfo(Long goods_seq) {
		
		return basketMapper.getGoodsInfo(goods_seq);
	}

	@Override
	public int deleteGoodsAtBasket(String cust_id, Long goods_seq) {
		log.info("장바구니 삭제: "+cust_id+" / "+goods_seq);
		return basketMapper.delGoodsAtBasket(cust_id,goods_seq);
	}

	@Override
	public int purGoodsAtBasket(String cust_id, Long goods_seq) {
		log.info("장바구니 구매된: "+cust_id+" / "+goods_seq);
		
		return basketMapper.purGoodsAtBasket(cust_id,goods_seq);
	}

	//상품 장바구니에 추가
	@Override
	public int addGoodsAtBasket(String cust_id, Long goods_seq, Long qty) {
		Long checkExist = basketMapper.checkExistBasket(cust_id);
		log.info("checkExist: "+checkExist);
		if(checkExist==null) {
			int createBasket = basketMapper.createBasket(cust_id);
			log.info("createBasket: "+createBasket);
		}
		
		return basketMapper.addGoodsAtBasket(cust_id,goods_seq,qty);
	}

	@Override
	public int changeQtyAtBasket(String cust_id, Long goods_seq, Long qty) {
		
		
		return basketMapper.changeQtyAtBasket(cust_id,goods_seq,qty);
	}

}