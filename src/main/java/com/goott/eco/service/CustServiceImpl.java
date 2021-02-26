package com.goott.eco.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goott.eco.domain.CustVO;
import com.goott.eco.mapper.CustMapper;

@Service
public class CustServiceImpl implements CustService{

	@Autowired
	private CustMapper custDao;
	
	@Override
	public List<Map<String, Object>> getCustList(Map<String, Object> searchInfo) {
		return custDao.getCustList(searchInfo);
	}
	
	/* 로그인 */
	@Override
	public CustVO getCustLogin(CustVO custVO) {
		return custDao.getCustLogin(custVO);
	}

	/* 회원가입 */
	@Override
	public int joinCust(CustVO custVO) {
		return custDao.joinCust(custVO);
	}
	
	

	@Override
	public CustVO getCustId(CustVO custVO) {
		
		return custDao.getCustId(custVO);
	}


}
