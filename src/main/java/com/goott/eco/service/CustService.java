package com.goott.eco.service;

import java.util.List;
import java.util.Map;

import com.goott.eco.vo.CustVO;

public interface CustService {
	public List<Map<String, Object>> getCustList(Map<String, Object> searchInfo);
	
	public CustVO getCustLogin(CustVO custVO);
}
