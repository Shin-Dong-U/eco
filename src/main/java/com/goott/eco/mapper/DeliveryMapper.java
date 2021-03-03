package com.goott.eco.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.goott.eco.domain.DeliveryVO;
import com.goott.eco.domain.OrderVO;

public interface DeliveryMapper {
	

	public List<DeliveryVO> getDeliveryList(Long invoice_no);
	
	public List<DeliveryVO> getDeliveryList( );
	

}
