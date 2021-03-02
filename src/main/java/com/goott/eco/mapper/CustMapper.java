package com.goott.eco.mapper;

import java.util.List;
import java.util.Map;

import com.goott.eco.domain.CustVO;


public interface CustMapper {
	
	public List<Map<String, Object>> getCustList(Map<String, Object> searchInfo);
	
	//public String getId(String id);
	public CustVO getCustId(CustVO custVO);  

	/* 특정 회원정보 가져오기 */
	public CustVO getCust(String memberId);
	
	/* 로그인  */
	public CustVO getCustLogin(CustVO custVO);
	
	/* 회원 가입 */
	public int joinCust(CustVO custVO);
	
	/* 회원 수정 */
	public int modifyCust(CustVO custVO);
	
	/* 회원 삭제 */
	public int deleteCust(String memberId);
	
}
