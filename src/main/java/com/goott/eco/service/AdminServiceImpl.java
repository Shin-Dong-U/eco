package com.goott.eco.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.goott.eco.domain.AdminVO;
import com.goott.eco.domain.GoodsVO;
import com.goott.eco.domain.MemberVO;
import com.goott.eco.mapper.GoodsMapper;
import com.goott.eco.util.GoodsSampleDataMaker;

import java.util.List;

import com.goott.eco.mapper.AdminMapper;
import com.goott.eco.mapper.CustMapper;

@Service
public class AdminServiceImpl implements AdminService{
	@Autowired 
	private AdminMapper adminDao;
	
	@Autowired 
	private CustMapper custDao;
	
	@Autowired 
	private GoodsMapper goodsDao;
	
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
	
	/* 모든 관리자 정보 가져오기 */
	@Override
	public List<MemberVO> getAdminList() {
		return adminDao.getAdminList();
	}
	
	/* 모든 업체 정보 가져오기 */
	@Override
	public List<MemberVO> getCompanyList() {
		return adminDao.getCompanyList();
	}

	/* 모든 일반사용자 정보 가져오기 */
	@Override
	public List<MemberVO> getCustList() {
		return adminDao.getCustList();
	}
	
	
	/* 업체 관한 및 승인 */
	@Override
	public int confirmCompany(String memberId, String loginId) {	
		if(adminDao.confirmCompany(memberId,loginId)==1 
			&& adminDao.joinCompanyAuth(memberId)==1)return 1;
		else{
			return 0;
		}
	}
	
	/* 관리자 권한 및 등업 */
	@Override
	public int regAdmin(AdminVO adminVO, String loginId) {
		adminVO.setName(custDao.getCustName(adminVO.getCust_id()));
		int v1 = adminDao.regAdmin(adminVO, loginId);
		int v2 = adminDao.joinAdminAuth(adminVO.getCust_id());
		int v3 = adminDao.confirmCustAdmin(adminVO.getCust_id(), loginId);
		System.out.println(v1+"|"+v2+"|"+v3);
		if(v1==1 && v2==1 && v3==1) {
			return 1;
		}else {
			return 0;
		}
		//if(adminDao.regAdmin(adminVO, loginId)==1 
		//		&& adminDao.joinAdminAuth(adminVO.getCust_id())==1
		//			&& adminDao.confirmCustAdmin(loginId)==1) return 1;
		//else{
		//	return 0;
		//}
	}



}
