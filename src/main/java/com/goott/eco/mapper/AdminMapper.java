package com.goott.eco.mapper;

import java.util.List;
import java.util.Map;

import com.goott.eco.common.PageDTO;


public interface AdminMapper {
	
	/* 모든 관리자 정보 가져오기 */
	public Map<String, Object> getAdminList(); //(PageDTO page);
	
	/* 모든 업체 정보 가져오기 */
	public Map<String, Object> getCompanyList(); //(PageDTO page);
	
	/* 모든 일반사용자 정보 가져오기 */
	public Map<String, Object> getCustList(); //(PageDTO page);
	
	
}
