package com.goott.eco.service;

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
	public int addOrder(List<BasketDetailVO> basketList,String cust_id) {		
		int addOrderMain = orderMapper.addOrderMain(cust_id);
		log.info("addOrderMain: "+addOrderMain);
		
		Long order_seq = orderMapper.getOrderSeq(cust_id);
		log.info("order_seq: "+order_seq);
		BasketDetailVO basket = null;
		for(int i=0; i<basketList.size(); i++) {
			basket = basketList.get(i);
			log.info("basket: "+basket);
			log.info("getBasket_seq: "+ basket.getBasket_seq());
			Long basket_seq = basket.getBasket_seq();
			Long goods_seq = basket.getGoods_seq();
			int addOrderDetail = orderMapper.addOrderDetail(cust_id,order_seq,basket_seq,goods_seq);
			log.info("addOrderDetail: "+ addOrderDetail);
		}
		int upOrderStatus = orderMapper.upOrderStatus(order_seq);
		log.info("upOrderStatus: "+upOrderStatus);
		
	
		return 0;
	}
	
	@Override
	public List<GoodsVOtest> getOrderList(String cust_Id) {
		List<GoodsVOtest> result = orderMapper.getOrderList(cust_Id);
		log.info(result);
		return result;
	}


	@Override
	public int paidUpdate(String cust_id,Long order_seq) {
		
		return orderMapper.paidUpdate(cust_id,order_seq);
	}	


}
