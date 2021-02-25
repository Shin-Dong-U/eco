package com.goott.eco.mapper;

import java.util.List;
import java.util.Map;

import com.goott.eco.domain.CustVO;

public interface CustMapper {
	public List<Map<String, Object>> getCustList(Map<String, Object> searchInfo);
	
	/* 로그인  */
	public CustVO getCustLogin(CustVO custVO);
	
	/*회원가입*/
	public int joinCust(CustVO custVO);
	
}
