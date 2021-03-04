package com.goott.eco.service;

import java.util.List;
import java.util.Map;

public interface AdminService {
	
	/* 회원 정보 가져오기-페이징처리&검색처리 */
	public Map<String, Object> getAdminList(); //(PageDTO page);
	
	/* 모든 업체 정보 가져오기 */
	public Map<String, Object> getCompanyList(); //(PageDTO page);
	
	/* 모든 일반사용자 정보 가져오기 */
	public Map<String, Object> getCustList(); //(PageDTO page);
	
	
}
