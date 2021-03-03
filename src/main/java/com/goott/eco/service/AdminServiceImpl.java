package com.goott.eco.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.goott.eco.common.PageDTO;
import com.goott.eco.domain.MemberVO;
import com.goott.eco.mapper.AdminMapper;

public class AdminServiceImpl implements AdminService{
	@Autowired 
	private AdminMapper adminDao;

	@Override
	public MemberVO getChooseCust(PageDTO page) {
		MemberVO memberVO = new MemberVO();
		List<MemberVO> memList = new ArrayList();
		
		
		String membeerId = "compC";

			
		return null;
	}
}
