package com.goott.eco.mapper;

import java.util.List;

import com.goott.eco.domain.CustVO;
import com.goott.eco.domain.GameImageVO;
import com.goott.eco.domain.GameItemVO;

public interface GameMapper {
	
	//1. Show CustStatus
	public List<CustVO> getCustStatus(String memberId);
	//2. ShowItem
	public List<GameItemVO> getItem(Long item_seq);

	
	//3-1 insert_WaterItem
	public int insertWater(String memberid);
	//3-2 update_custStatus(bar_status, mytree,mymil)
	public int updateWater(String memberid);
	
	
	
	
	
	
	
	public GameImageVO getCustTreeLvl(GameImageVO gameImageVO);  
	

//selectItemImage
	public GameItemVO selectImage(int gameImageVO);
}
