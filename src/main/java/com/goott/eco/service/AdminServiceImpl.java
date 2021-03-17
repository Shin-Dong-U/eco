package com.goott.eco.service;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.goott.eco.domain.GoodsVO;
import com.goott.eco.mapper.GoodsMapper;
import com.goott.eco.util.GoodsSampleDataMaker;

import java.util.HashMap;
import java.util.List;

import com.goott.eco.mapper.AdminMapper;

@Service
public class AdminServiceImpl implements AdminService{
	@Autowired 
	private AdminMapper adminDao;
	
	@Autowired 
	private GoodsMapper goodsDao;
	
	/*
	@Transactional
	@Override
	public int getSampleData() throws Exception {
		GoodsSampleDataMaker sampleMaker = new GoodsSampleDataMaker();
		
		
		ArrayList<String> idList = new ArrayList<String>();
		
		for(int i = 1; i < 10; i++) {
			sampleMaker.setCurrPage(i);
			
			String[] productsId = sampleMaker.getProductIdList();
			
			for(String id : productsId) {idList.add(id);}
		}
		
		String tmpUrl;
		for(String id : idList) {
			GoodsVO goodsVO = new GoodsVO();
			tmpUrl = sampleMaker.getProductDetailUrl(id);
			goodsVO = sampleMaker.getProductInfo(tmpUrl);
			
			goodsDao.insertGoods(goodsVO);
			goodsDao.insertGoodsThumbNail(goodsVO);
		}
		
		
		return 0;
	}*/
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
