package com.goott.eco.service;

import java.util.List;

import com.goott.eco.domain.AdminVO;
import com.goott.eco.domain.MemberVO;

public interface AdminService {
	public int getSampleData() throws Exception ;
	
	/* 모든 관리자 정보 가져오기 */
	public List<MemberVO> getAdminList(); //(PageDTO page);
		
	/* 모든 업체 정보 가져오기 */
	public List<MemberVO> getCompanyList(); //(PageDTO page);
	
	/* 모든 일반사용자 정보 가져오기 */
	public List<MemberVO> getCustList(); //(PageDTO page);
	
	
	/* 업체 권한 및 승인 */
	public int confirmCompany(String memberId, String loginId);
	

	/* 관리자 권한 및 등업 */
	public int regAdmin(AdminVO adminVO, String loginId);
	

	
}
