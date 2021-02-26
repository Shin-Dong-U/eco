package com.goott.eco.mapper;

import com.goott.eco.domain.GameImageVO;
import com.goott.eco.domain.GameItemVO;

public interface GameMapper {
	
	public GameImageVO getCustTreeLvl(GameImageVO gameImageVO);  
	
	public GameItemVO getGameItem(GameItemVO gameItemVO );
	
	
}
