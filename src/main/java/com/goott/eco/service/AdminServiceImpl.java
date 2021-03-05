package com.goott.eco.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goott.eco.mapper.AdminMapper;

@Service
public class AdminServiceImpl implements AdminService{
	@Autowired 
	private AdminMapper adminDao;

	/* 모든 관리자 정보 가져오기 */
	@Override
	public List<HashMap<String, Object>> getAdminList() {
		return adminDao.getAdminList();
	}
	
	/* 모든 업체 정보 가져오기 */
	@Override
	public List<HashMap<String, Object>> getCompanyList() {
		return adminDao.getCompanyList();
	}

	/* 모든 일반사용자 정보 가져오기 */
	@Override
	public List<HashMap<String, Object>> getCustList() {
		return adminDao.getCustList();
	}


}
