package com.goott.eco.service;

import com.goott.eco.domain.GameImageVO;
import com.goott.eco.domain.GameItemVO;

public interface GameService {

	
	//public String getId(String id);
	
	public GameImageVO getCustTreeLvl(GameImageVO gameImageVO);
	
	public GameItemVO getGameItem(GameItemVO gameItemVO);
	
	
}
