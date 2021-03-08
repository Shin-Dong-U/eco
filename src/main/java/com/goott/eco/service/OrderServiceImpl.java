package com.goott.eco.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goott.eco.domain.BasketDetailVO;
import com.goott.eco.domain.GoodsVOtest;
import com.goott.eco.mapper.OrderMapper;

import lombok.extern.log4j.Log4j;


@Service
@Log4j
public class OrderServiceImpl implements OrderService {
	
	
	private OrderMapper orderMapper;	
	
	@Autowired
	public OrderServiceImpl(OrderMapper orderMapper) {	
		this.orderMapper = orderMapper;
	}
	
	@Override
	public int addOrder(String cust_id, Long total_price) {		
		//주문번호 생성
		int addOrderMain = orderMapper.addOrderMain(cust_id,total_price);
		log.info("addOrderMain: "+addOrderMain);
		
		//주문 번호 얻기
		Long order_seq = orderMapper.getOrderSeq(cust_id);
		log.info("order_seq: "+order_seq);
		
		//장바구니 주문 입력
		orderMapper.addOrderDetailBasket(cust_id,order_seq);
		
		//주문상태 변경 1
		int upOrderStatus = orderMapper.upOrderStatus(order_seq);
		log.info("upOrderStatus: "+upOrderStatus);
		
	
		return 0;
	}

//	@Override
//	public int addOrder(List<BasketDetailVO> basketList,String cust_id) {		
//		int addOrderMain = orderMapper.addOrderMain(cust_id);
//		log.info("addOrderMain: "+addOrderMain);
//		
//		Long order_seq = orderMapper.getOrderSeq(cust_id);
//		log.info("order_seq: "+order_seq);
//		BasketDetailVO basket = null;
//		for(int i=0; i<basketList.size(); i++) {
//			basket = basketList.get(i);
//			log.info("basket: "+basket);
//			log.info("getBasket_seq: "+ basket.getBasket_seq());
//			Long basket_seq = basket.getBasket_seq();
//			Long goods_seq = basket.getGoods_seq();
//			int addOrderDetail = orderMapper.addOrderDetail(cust_id,order_seq,basket_seq,goods_seq);
//			log.info("addOrderDetail: "+ addOrderDetail);
//		}
//		int upOrderStatus = orderMapper.upOrderStatus(order_seq);
//		log.info("upOrderStatus: "+upOrderStatus);
//		
//	
//		return 0;
//	}
	
	
	@Override
	public List<GoodsVOtest> getOrderList(String cust_Id) {
		List<GoodsVOtest> result = orderMapper.getOrderList(cust_Id);
		log.info(result);
		return result;
	}


	@Override
	public int paidUpdate(String cust_id,Long order_seq) {
		log.info("paidUpdate"+ cust_id+" / "+order_seq);
		
		return orderMapper.paidUpdate(cust_id,order_seq);
	}

	@Override
	public HashMap<String, Object> getCheckoutInfo(String cust_Id) {
		
		return orderMapper.getCheckoutInfo(cust_Id);
	}

	@Override
	public Long getTotalPrice(String cust_id, Long order_seq) {
		// TODO Auto-generated method stub
		return orderMapper.getTotalPrice(cust_id,order_seq);
	}

	@Override
	public List<HashMap<String, Object>> getPaidList(String cust_id) {
		// TODO Auto-generated method stub
		return orderMapper.getPaidList(cust_id);
	}

	@Override
	public int orderCancel(Long order_seq) {

		return orderMapper.orderCancel(order_seq);
	}	


}
