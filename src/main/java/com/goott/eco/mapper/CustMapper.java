package com.goott.eco.mapper;

import java.util.List;
import java.util.Map;

import com.goott.eco.domain.CustVO;

public interface CustMapper {
	
	public List<Map<String, Object>> getCustList(Map<String, Object> searchInfo);
	
	//public String getId(String id);
	public CustVO getCustId(CustVO custVO);  
	

}
