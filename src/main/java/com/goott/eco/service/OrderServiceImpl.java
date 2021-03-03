//package com.goott.eco.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.goott.eco.domain.BasketVO;
//import com.goott.eco.domain.GoodsVOtest;
//import com.goott.eco.mapper.OrderMapper;
//
//import lombok.extern.log4j.Log4j;
//
//
//@Service
//@Log4j
//public class OrderServiceImpl implements OrderService {
//	
//	
//	private OrderMapper orderMapper;	
//	
//	@Autowired
//	public OrderServiceImpl(OrderMapper orderMapper) {	
//		this.orderMapper = orderMapper;
//	}
//
//
//	@Override
//	public int addOrder(List<BasketVO> basketList) {
//		Long orderMainNum = orderMapper.addOrderMain(basketList[0].cust);
//		int result = orderMapper.addOrderDetail(custId,basketNum);
//		return result;
//	}
//	
//	@Override
//	public List<BasketVO> getBasketList(String custId) {
//		System.out.println("service custID: "+custId);
//		return orderMapper.getBasketList(custId);
//	}
//
//	@Override
//	public GoodsVOtest getGoodsInfo(Long goodsSeq) {
//		
//		return orderMapper.getGoodsInfo(goodsSeq);
//	}
//
//	@Override
//	public int deleteGoodsAtBasket(String custId, Long goodsSeq) {
//		log.info("장바구니 삭제: "+custId+" / "+goodsSeq);
//		return orderMapper.delGoodsAtBasket(custId,goodsSeq);
//	}
//
//	@Override
//	public int purGoodsAtBasket(String custId, Long goodsSeq) {
//		log.info("장바구니 구매된: "+custId+" / "+goodsSeq);
//		
//		return orderMapper.purGoodsAtBasket(custId,goodsSeq);
//	}
//
//	@Override
//	public int addGoodsAtBasket(String custId, Long goodsSeq, Long qty) {
//		
//		
//		return orderMapper.addGoodsAtBasket(custId,goodsSeq,qty);
//	}
//
//	@Override
//	public int changeQtyAtBasket(String custId, Long goodsSeq, Long qty) {
//		
//		
//		return orderMapper.changeQtyAtBasket(custId,goodsSeq,qty);
//	}
//
//
//}
