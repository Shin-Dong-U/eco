package com.goott.eco.service;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.goott.eco.domain.GoodsVO;
import com.goott.eco.mapper.GoodsMapper;
import com.goott.eco.util.GoodsSampleDataMaker;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired private GoodsMapper goodsDao;

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
	}

}
