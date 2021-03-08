package com.goott.eco.controller;

import java.util.List;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goott.eco.domain.CustVO;
import com.goott.eco.domain.GameImageVO;
import com.goott.eco.domain.GameItemVO;
import com.goott.eco.service.GameService;

@RequestMapping("/game/*")
@RestController
//@AllArgsConstructor
public class GameRestController {
	
	
	private GameService gameService;
	
	@Autowired
	public GameRestController(GameService gameService) {
		this.gameService = gameService;
	}
	
	
	//고객게임상태 정보불러오기
	//CustController_ @GetMapping("/game/list")
	//http://localhost/cust/game/list
	//get : custVO에서 사용자 아이디에따른 전부의 정보를 가져온후,->  myTree상태조회 하는 로직 
	//1. get_CustStatus
	@GetMapping(value="/list/{memberId}",			
			    produces= {"application/json; charset=UTF-8"}) //처리결과반환해주는거-내가 웹브라우저로 전달해주는거 and consumes -> 내가 웹 브라우저로부터받는거
	public ResponseEntity<List<CustVO>> getCustStatus(
			@PathVariable("memberId") String memberId){
		
			System.out.println("memberId: "+memberId);
			List<CustVO> result = gameService.getCustStatus(memberId);
			System.out.println("gameService: "+result);
			return new ResponseEntity<>(result,HttpStatus.OK);
	}
	
	//<재활용>아이템 ex.물,비료,씨앗에 대한 아이템 불러오기
	//CustController_ @GetMapping("/game/list")
	//post로 변경하기 -- 버튼으로 만들어서 3개아이템 가져오기해보기
	//2. url주소 -> http://localhost/cust/game/item
	@GetMapping(value="/{item_seq}",			
				produces= {"application/json; charset=UTF-8"})
	public ResponseEntity<List<GameItemVO>> getItem(
			@PathVariable("item_seq") Long item_seq){
		
		System.out.println("item_seq :" + item_seq);
		
		List<GameItemVO> result =  gameService.getItem(item_seq);
		
		System.out.println("gameService:" + result);
		
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
/*	
	//아이템선택버튼 클릭 -> 마일리지 히스토리에 저장이된다.
	//3. insert는 post이다 
	@PostMapping(value="/{memberid}",
			produces= {"application/json; charset=UTF-8"})
	//컨트롤러에는 꼭 ResponseEntity <반환타입 명시해줘야한다.>
	public ResponseEntity<Integer> updateWater(@PathVariable("memberid") String memberid){
		System.out.println("memberId: "+memberid);
		int result = gameService.insertWater(memberid);
		System.out.println("result: "+result);
		return result==1? //insert
				new ResponseEntity<>(1, HttpStatus.OK):
				new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}	
*/	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//3-1 물-> 아이템선택버튼 클릭 -> 마일리지 히스토리에 저장이된다.(insert는 post이다 )
	//3-2 물-> update_custStatus(bar_status, mytree,mymil)
	@PostMapping(value="/{memberid}",
			produces= {"application/json; charset=UTF-8"})
	//컨트롤러에는 꼭 ResponseEntity <반환타입 명시해줘야한다.>
	public ResponseEntity<Integer> updateWater(@PathVariable("memberid") String memberid){
		System.out.println("memberId: "+memberid);
		
		int result = gameService.updateWater(memberid);
		System.out.println("result: "+result);
		
		return result==1? //insert,update
				new ResponseEntity<>(1, HttpStatus.OK):
				new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}	
	
	//4-1 비료-> 아이템선택버튼 클릭 -> 마일리지 히스토리에 저장이된다.(insert는 post이다 )
	//4-2 비료-> update_custStatus(bar_status, mytree,mymil)
	@PostMapping(value="/compost/{memberid}",
			produces= {"application/json; charset=UTF-8"})
	public ResponseEntity<Integer> updateCompost(@PathVariable("memberid") String memberid){
		System.out.println("memberId: "+memberid);
		
		int result = gameService.updateCompost(memberid);
		System.out.println("result: "+result);
		
		return result==1? //insert,update
				new ResponseEntity<>(1, HttpStatus.OK):
				new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}	
	
	//5-1 씨앗-> 아이템선택버튼 클릭 -> 마일리지 히스토리에 저장이된다.(insert는 post이다 )
	//5-2 씨앗-> update_custStatus(bar_status, mytree,mymil)
	@PostMapping(value="/seed/{memberid}",
			produces= {"application/json; charset=UTF-8"})
	public ResponseEntity<Integer> updateSeed(@PathVariable("memberid") String memberid){
		System.out.println("memberId: "+memberid);
		
		int result = gameService.updateSeed(memberid);
		System.out.println("result: "+result);
		
		return result==1? //insert,update
				new ResponseEntity<>(1, HttpStatus.OK):
				new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}	
	
	
	
	//6. Cust의 (1)Tree레벨 /(2)Status_Bar 에 따른 GameImage불러오기
	@GetMapping(value="/lvl/{mil_level}",
			produces= {"application/json; charset=UTF-8"})
	public ResponseEntity<List<GameImageVO>> getLvlImage(
			@PathVariable("mil_level") String mil_level){
		System.out.println("mil_level" + mil_level);
		
		List<GameImageVO> result = gameService.getLvlImage(mil_level);
		System.out.println(result);
		
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	

	
	//Cust의 Tree레벨에 따른 GameImage불러오기위해 1_lvl일경우 1_sesources를 불러온다. 
	
		//next ->
		//Cust테이블에 cust->mytree를 참조해서,
		//Game_IMAGE테이블에 이미지를 불러올 수 있게끔해주는 로직을 짜주면된다.
		//그러면 콘솔에 띄워주기-->이후 , js or java에서 비교해서 회원이 'A'일경우 -> 이미지'1'을 출력해주는것이다. 
		
}
