package com.goott.eco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.goott.eco.domain.GameImageVO;
import com.goott.eco.domain.GameItemVO;
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
	
	//Cust의 Tree레벨에 따른 GameImage불러오기위해 1_lvl일경우 1_sesources를 불러온다. 
	
	//next ->
	//Cust테이블에 cust->mytree를 참조해서,
	//Game_IMAGE테이블에 이미지를 불러올 수 있게끔해주는 로직을 짜주면된다.
	//그러면 콘솔에 띄워주기-->이후 , js or java에서 비교해서 회원이 'A'일경우 -> 이미지'1'을 출력해주는것이다. 
	
	@GetMapping("/lvl")
	public ModelAndView custId(String lvl) {
		
		GameImageVO gameImageVO = new GameImageVO();
		gameImageVO.setMil_level(lvl);
		
		
		GameImageVO custTreeLvl = gameService.getCustTreeLvl(gameImageVO);
		
		System.out.println("custTreeLvl :" + custTreeLvl);
		
		ModelAndView mav = new ModelAndView("/game/custLvl");
		
		return mav;
	}
	
	//post로 변경하기 -- 버튼으로 만들어서 3개아이템 가져오기해보기
	//http://localhost/game/game?item=물
	@GetMapping("/itembutton")
	public ModelAndView itemButton(String item) {
		
		GameItemVO gameitemVO = new GameItemVO(); 
		gameitemVO.setItem_name(item);
		
		GameItemVO gameitem = gameService.getGameItem(gameitemVO);
		
		System.out.println("gameitem :" + gameitem);
		
		ModelAndView mav =new ModelAndView("/game/item");
		
		return mav;
	}


}
