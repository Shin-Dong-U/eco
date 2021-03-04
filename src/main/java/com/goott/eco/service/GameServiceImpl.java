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
	
//1. Show CustStatus
	@Override
	public List<CustVO> getCustStatus(String memberId) {
		
		System.out.println("get........"+memberId);
		
		return gameMapper.getCustStatus(memberId);
	}
	
//2. ShowItem
	@Override
	public List<GameItemVO> getItem(Long item_seq) {
		
		System.out.println("get........"+ item_seq);
		
		return gameMapper.getItem(item_seq);
	}
//3-1 insertWaterItem	
	@Override
	public int insertWater(String memberid) {
		
		System.out.println("Service단의 insertWater_ memberid" +memberid);
		
		return gameMapper.insertWater(memberid);
	}
//3-2 update_custStatus(bar_status, mytree, mymil)
	@Override
	public int updateWater(String memberid) {
		
		System.out.println("service: " + memberid);
		
		gameMapper.insertWater(memberid);
		gameMapper.updateWater(memberid);	
		
//		int checkImage = memberId;
//		int Image;
//		
//		switch(checkImage) {
//		case 1: Image = 1;
//		System.out.println("Image");
//		break;
//		case 2: Image = 2;
//		System.out.println("Image");
//		break;
//		case 3: Image = 3;
//		System.out.println("Image");
//		break;
//		case 4: Image = 4;
//		System.out.println("Image");
//		break;
//		case 5: Image = 5;
//		System.out.println("Image");
//		break;
//		}
		
		//Image를 같이 보내줘야되는데..... ? ㅠ_ㅠ
		return gameMapper.updateWater(memberid);
	}

	
	//보류
	@Override
	public GameImageVO getCustTreeLvl(GameImageVO lvl) {
		return gameMapper.getCustTreeLvl(lvl);
	}

	
	
	
	@Override
	public GameItemVO selectImage(int gameImageVO) {
		// TODO Auto-generated method stub
		return null;
	}




	
	
}
