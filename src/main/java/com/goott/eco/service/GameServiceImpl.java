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
	
	
	
	
	
	
	
	
	
	
	
	
	
//3-1 물-> insertWaterItem	
	@Override
	public int insertWater(String memberid) {
		
		System.out.println("Service단의 insertWater_ memberid" +memberid);
		
		return gameMapper.insertWater(memberid);
	}
//3-2 물-> update_custStatus(bar_status, mytree, mymil)
	@Override
	public int updateWater(String memberid) {
		
		System.out.println("Service단: " + memberid);
		
		gameMapper.insertWater(memberid);
		gameMapper.updateWater(memberid);	

		return gameMapper.updateWater(memberid);
	}
	
	//4-1 비료-> 마일리지 출금정보 입력정보 insert
//	public int insertCompost(String memberid) {
//		
//		System.out.println("Service단의 insertSeed memberid" +memberid);
//		
//		return gameMapper.insertCompost(memberid);
//	}
	//4-2 비료-> update_custStatus(bar_status, mytree,mymil)
	public int updateCompost(String memberid) {
		
		System.out.println("service: " + memberid);
		
		gameMapper.insertCompost(memberid);
		gameMapper.updateCompost(memberid);	
		
		return gameMapper.updateCompost(memberid);
	}
	
	//5-1 씨앗-> 마일리지 출금정보 입력정보 insert
	public int insertSeed(String memberid) {
		
		System.out.println("Service단의 insertSeed memberid" +memberid);
		return gameMapper.insertSeed(memberid);
	}
	//5-2 씨앗-> update_custStatus(bar_status, mytree,mymil)
	public int updateSeed(String memberid) {
		
		System.out.println("Service단의 insert/updateSeed memberid: " + memberid);
		gameMapper.insertSeed(memberid);
		gameMapper.updateSeed(memberid);
		
		
		return gameMapper.updateSeed(memberid);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//5. Cust의 (1)Tree레벨 /(2)Status_Bar 에 따른 GameImage불러오기
	public List<GameImageVO> getLvlImage(String mil_level) {
		
		System.out.println("service: "+ mil_level);
		
		return gameMapper.getLvlImage(mil_level);
	}
	
	
	
	
	
	@Override
	public GameItemVO selectImage(int gameImageVO) {
		// TODO Auto-generated method stub
		return null;
	}




	
	
}
