package com.goott.eco.service;

import com.goott.eco.common.PageDTO;
import com.goott.eco.domain.MemberVO;

public interface AdminService {
	
	/* 회원 정보 가져오기-페이징처리&검색처리 */
	public MemberVO getChooseCust(PageDTO page) ;
}
