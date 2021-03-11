package com.goott.eco.mapper;

import java.util.HashMap;

import org.apache.ibatis.annotations.Param;

public interface ChartMapper {
	
	public HashMap<String,Object> getMonthSale(@Param("dateRange1")String dateRange1, 
			@Param("dateRange2")String dateRange2);

}
