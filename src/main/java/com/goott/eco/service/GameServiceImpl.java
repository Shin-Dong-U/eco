package com.goott.eco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goott.eco.domain.CustVO;
import com.goott.eco.domain.GameImageVO;
import com.goott.eco.domain.GameItemVO;
import com.goott.eco.mapper.GameMapper;

@Service
public class GameServiceImpl implements GameService{

	
	@Autowired
	private GameMapper gameMapper;
	
	//Show CustStatus
	@Override
	public List<CustVO> getCustStatus(String memberId) {
		
		System.out.println("get........"+memberId);
		
		return gameMapper.getCustStatus(memberId);
	}
	
	//ShowItem
	@Override
	public List<GameItemVO> getItem(Long item_seq) {
		
		System.out.println("get........"+ item_seq);
		
		return gameMapper.getItem(item_seq);
	}

	
	
	
	
	@Override
	public GameImageVO getCustTreeLvl(GameImageVO lvl) {
	
		return gameMapper.getCustTreeLvl(lvl);
	}




	
	
}
