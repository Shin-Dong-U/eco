package com.goott.eco.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.goott.eco.domain.AdminVO;
import com.goott.eco.domain.MemberVO;

public interface AdminMapper {
	
	/* 모든 관리자 정보 가져오기 */
	public List<MemberVO> getAdminList(); //(PageDTO page);
	
	/* 모든 업체 정보 가져오기 */
	public List<MemberVO> getCompanyList(); //(PageDTO page);
	
	/* 모든 일반사용자 정보 가져오기 */
	public List<MemberVO> getCustList(); //(PageDTO page);
	
	/* 업체 승인 */
	public int confirmCompany(@Param("memberId")String memberId, @Param("loginId")String loginId);
	
	/* 업체 권한 승인 */
	public int joinCompanyAuth(String memberId);
	
	/* 관리자 등업 */
	public int regAdmin(@Param("adminVO")AdminVO adminVO, @Param("loginId")String loginId);
	
	/* 관리자 권한 승인 */
	public int joinAdminAuth(String cust_id);
	
	/* 관리자 cust변경 */
	public int confirmCustAdmin(@Param("memberId")String memberId, @Param("loginId")String loginId);
}
