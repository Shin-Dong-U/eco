package com.goott.eco.controller;

import java.util.List;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.goott.eco.domain.CustVO;
import com.goott.eco.domain.GameItemVO;
import com.goott.eco.service.GameService;


@RequestMapping("/replies/*")
@RestController
//@AllArgsConstructor
public class GameRestController {
	
	
	private GameService gameService;
	
	@Autowired

	public GameRestController(GameService gameService) {
		this.gameService = gameService;
	}
	//Cust 레벨받아오기
	//http://localhost/controller/replies/lvl?lvl=3
//	@GetMapping(value="/{lvl}",
//			consumes = "application/json; charset=UTF-8",
//			produces = "text/plain; charset=UTF-8 " )
											//처리결과반환해주는거-내가 웹브라우저로 전달해주는거 and consumes -> 내가 웹 브라우저로부터받는거 
//	public ResponseEntity<String> get(@RequestBody CustVO custVO,
//									  @PathVariable("myTree") String myTree){	
											//public ModelAndView custId(String lvl) {
		
		
//		custVO.setMyTree(myTree);
//		System.out.println("get:" + myTree);
											//return new ResponseEntity<>(gameService.get(lvl),HttpStatus.OK);
//		return new ResponseEntity<>(gameService.getCustTreeLvl(myTree);
//	}
	
	
	
	
	//http://localhost/cust/game/list
	//get : custVO에서 사용자 아이디에따른 전부의 정보를 가져온후,->  myTree상태조회 하는 로직 
	//장바구니 리스트 조회
	@GetMapping(value="/list/{memberId}",			
			    produces= {"application/json; charset=UTF-8"})
	public ResponseEntity<List<CustVO>> getCustStatus(
			@PathVariable("memberId") String memberId){
		
			System.out.println("custId: "+memberId);
			List<CustVO> result = gameService.getCustStatus(memberId);
			System.out.println("gameService: "+result);
			return new ResponseEntity<>(result,HttpStatus.OK);
		
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

	
	
	//Cust의 Tree레벨에 따른 GameImage불러오기위해 1_lvl일경우 1_sesources를 불러온다. 
	
		//next ->
		//Cust테이블에 cust->mytree를 참조해서,
		//Game_IMAGE테이블에 이미지를 불러올 수 있게끔해주는 로직을 짜주면된다.
		//그러면 콘솔에 띄워주기-->이후 , js or java에서 비교해서 회원이 'A'일경우 -> 이미지'1'을 출력해주는것이다. 
		
}
