package com.goott.eco.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goott.eco.mapper.AdminMapper;

@Service
public class AdminServiceImpl implements AdminService{
	@Autowired 
	private AdminMapper adminDao;

	@Override
	public Map<String, Object> getAdminList() {
		// TODO Auto-generated method stub
		return adminDao.getAdminList();
	}
	
	@Override
	public Map<String, Object> getCompanyList() {
		// TODO Auto-generated method stub
		return adminDao.getCompanyList();
	}

	@Override
	public Map<String, Object> getCustList() {
		// TODO Auto-generated method stub
		return adminDao.getCustList();
	}


}
