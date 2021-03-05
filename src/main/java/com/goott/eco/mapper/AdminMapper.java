package com.goott.eco.mapper;

import java.util.HashMap;
import java.util.List;

public interface AdminMapper {
	
	/* 모든 관리자 정보 가져오기 */
	public List<HashMap<String, Object>> getAdminList(); //(PageDTO page);
	
	/* 모든 업체 정보 가져오기 */
	public List<HashMap<String, Object>> getCompanyList(); //(PageDTO page);
	
	/* 모든 일반사용자 정보 가져오기 */
	public List<HashMap<String, Object>> getCustList(); //(PageDTO page);
	
	
}
