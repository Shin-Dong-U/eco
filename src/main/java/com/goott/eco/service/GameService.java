package com.goott.eco.service;

import java.util.List;

import com.goott.eco.domain.CustVO;
import com.goott.eco.domain.GameImageVO;
import com.goott.eco.domain.GameItemVO;

public interface GameService {

	//1. Show CustStatus
	public List<CustVO> getCustStatus(String memberId);
	//2. ShowItem
	public List<GameItemVO> getItem(Long item_seq);

	
	
	
	
	
	
	
	
	//3-1  물-> 마일리지 출금정보 입력정보 insert
	public int insertWater(String memberid);
	//3-2  물-> update_custStatus(bar_status, mytree,mymil) 
	public int updateWater(String memberid);
	
	//4-1 비료-> 마일리지 출금정보 입력정보 insert
//	public int insertCompost(String memberid);
	//4-2 비료-> update_custStatus(bar_status, mytree,mymil)
	public int updateCompost(String memberid);
	
	//5-1 씨앗-> 마일리지 출금정보 입력정보 insert
	public int insertSeed(String memberid);
	//5-2 씨앗-> update_custStatus(bar_status, mytree,mymil) 
	public int updateSeed(String memberid);
	
	
	
	
	
	
	
	
	
	//5. Cust의 (1)Tree레벨 /(2)Status_Bar 에 따른 GameImage불러오기
	public List<GameImageVO> getLvlImage(String mil_level);
	
	
	
	
	public GameItemVO selectImage(int gameImageVO);
	
	
}
