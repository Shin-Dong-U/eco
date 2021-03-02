package com.goott.eco.mapper;

import java.util.List;

import com.goott.eco.domain.CustVO;
import com.goott.eco.domain.GameImageVO;
import com.goott.eco.domain.GameItemVO;

public interface GameMapper {
	
	public List<CustVO> getCustStatus(String memberId);
	
	public GameImageVO getCustTreeLvl(GameImageVO gameImageVO);  
	
	public GameItemVO getGameItem(GameItemVO gameItemVO );

	
	
}
