package com.goott.eco.mapper.test;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.goott.eco.domain.DeliveryVO;

public interface DeliveryMapper {
	
	//@Select("select * from delivery")
	public List<DeliveryVO> getList();
}
