package com.goott.eco.mapper;

import java.util.List;

import com.goott.eco.common.PageDTO;
import com.goott.eco.domain.AdminVO;
import com.goott.eco.domain.CustVO;


public interface AdminMapper {
	
	/* 특정 관리자 정보 가져오기 */
	public AdminVO getAdmin(String memberId);
	
	/* 모든 회원 정보 가져오기-페이징&검색 */

}
