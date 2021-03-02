package com.goott.eco.mapper;

import java.util.List;

import com.goott.eco.domain.CustVO;
import com.goott.eco.domain.GameImageVO;
import com.goott.eco.domain.GameItemVO;

public interface GameMapper {
	
	//Show CustStatus
	public List<CustVO> getCustStatus(String memberId);
	//ShowItem
	public List<GameItemVO> getItem(Long item_seq);

	public GameImageVO getCustTreeLvl(GameImageVO gameImageVO);  
	

	
	
}
