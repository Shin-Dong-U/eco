package com.goott.eco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.goott.eco.domain.GameImageVO;
import com.goott.eco.service.GameService;

@RequestMapping("/game")
@Controller
public class GameController {

	@Autowired
	private GameService gameService;
	
	
	//null값으로 , 그냥 gameInfo에 화면만 출력하게해준것 -- sql문은 콘솔확인하기
	//http://localhost/game/lvl?lvl=3
	//custTreeLvl :GameImageVO(mil_level=1, img_src=1, strd_memo=null)
	//custTreeLvl :GameImageVO(mil_level=3, img_src=3, strd_memo=null)
	
	@GetMapping("/lvl")
	public ModelAndView custId(String lvl) {
		
		GameImageVO gameImageVO = new GameImageVO();
		gameImageVO.setMil_level(lvl);
		
		
		GameImageVO custTreeLvl = gameService.getCustTreeLvl(gameImageVO);
		
		System.out.println("custTreeLvl :" + custTreeLvl);
		
		ModelAndView mav = new ModelAndView("/game/custLvl");
		
		return mav;
	}




}
