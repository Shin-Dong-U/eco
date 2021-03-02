package com.goott.eco.service;

import java.util.List;

import com.goott.eco.domain.CustVO;
import com.goott.eco.domain.GameImageVO;
import com.goott.eco.domain.GameItemVO;

public interface GameService {

	//Show CustStatus
	public List<CustVO> getCustStatus(String memberId);
	//ShowItem
	public List<GameItemVO> getItem(Long item_seq);

	//getItem_마일리지number 차감 / 나무number 체크,변화 / 상태바number 체크, 변화 
	//public 
	
	
	public GameImageVO getCustTreeLvl(GameImageVO gameImageVO);
	
	
	
	
}
