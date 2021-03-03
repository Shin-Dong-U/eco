package com.goott.eco.mapper;

import com.goott.eco.domain.CompanyVO;

public interface CompanyMapper {
	
	/* 특정 회원의 com_seq얻기 */
	//public Long getCompany_seq(String memberId);
	
	/* 특정 업체 정보 가져오기  */
	public CompanyVO getCompany(String memberId);
	
	
	/* 회원 가입 */
	public int joinCompany(CompanyVO compVO);
	
	/* 회원 수정 */
	public int modifyCompany(CompanyVO compVO);
	

	
}
