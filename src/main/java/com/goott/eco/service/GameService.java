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

	//3-1  마일리지 출금정보 입력정보 insert
	public int insertWater(String memberid);
	//3-2 update_custStatus(bar_status, mytree,mymil) 
	public int updateWater(String memberid);
	
	
	
	
	//getItem_마일리지number 차감 / 나무number 체크,변화 / 상태바number 체크, 변화 
	public GameImageVO getCustTreeLvl(GameImageVO gameImageVO);
	
	
	
	
	public GameItemVO selectImage(int gameImageVO);
	
	
}
