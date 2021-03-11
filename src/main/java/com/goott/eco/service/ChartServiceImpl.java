package com.goott.eco.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goott.eco.mapper.ChartMapper;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class ChartServiceImpl implements ChartService {
	
	private ChartMapper chartMapper;

	@Autowired
	public ChartServiceImpl(ChartMapper chartMapper) {
		this.chartMapper = chartMapper;
	}

	@Override
	public List<HashMap<String, Object>> getMonthSale() {
		List<HashMap<String, Object>> sales = new ArrayList<HashMap<String, Object>>(12);
		for(int i=1 ; i<=12 ;i++) {
			String dateRange1= null;
			String dateRange2= null;
			if(i<9) {
				dateRange1= "20210"+i+"01";
				dateRange2= "20210"+(i+1)+"01";
			}else if(i<10) {
				dateRange1= "20210"+i+"01";
				dateRange2= "2021"+(i+1)+"01";
			}else if(i<12) {
				dateRange1= "2021"+i+"01";
				dateRange2= "2021"+(i+1)+"01";
			}else {
				dateRange1= "2021"+i+"01";
				dateRange2= "2021"+i+"31";
			}
			
			HashMap<String, Object> salesResult = chartMapper.getMonthSale(dateRange1,dateRange2);
			sales.add(salesResult);
		}
		log.info(sales);
		
		return sales;
	}

}
