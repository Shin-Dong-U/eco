package com.goott.eco.mapper.test;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.goott.eco.domain.Delivery_detailVO;

public interface Delivery_detailMapper {
	
	//@Select("select * from delivery_detail")
	public List<Delivery_detailVO> getList();
}
