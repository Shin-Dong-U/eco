package com.goott.eco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goott.eco.domain.GameImageVO;
import com.goott.eco.mapper.GameMapper;

@Service
public class GameServiceImpl implements GameService{

	
	@Autowired
	private GameMapper gameMapper;
	
	@Override
	public GameImageVO getCustTreeLvl(GameImageVO lvl) {
	
		return gameMapper.getCustTreeLvl(lvl);
	}


	
	
}
