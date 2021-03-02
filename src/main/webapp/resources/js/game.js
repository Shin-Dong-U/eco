console.log("Game Module.........");

var gameService = (function(){
	
	function getCustStatus(memberId,callback){
		console.log("gameCust List.............");
		//alert("받아온객체"+custStatus);
		//cust_id :처리할 값
		//callback:성공시 처리되는 함수
		//error   :실패시 처리되는함수
		
		$.ajax({ //자바스크립트 객체 시작
			type:'get',	//전송유형:post방식
			url:'/replies/list/'+ memberId, //컨트롤러 메소드 호출URL
			data : JSON.stringify(), //JSON.stringify()자바스크립트 객체를 JSON형식의 문자열로 변환해주는 웹브라우저 내부 메소드,//data키에 설정되는 값은 컨트롤러 메소드의 consumes속성 설정 값의 데이터 유형과 일치
			contentType:"application/json; charset=utf-8",//브라우저가 서버에게 보내는 데이터유형(MIME타입)
			//success:(custStatus)=>{console.log("고객상태정보js단",custStatus,
			//		callback(custStatus))}
			success:(custStatus)=>{console.log("고객상태정보js단",custStatus),
					callback(custStatus)}
			,
			error:(log)=>{console.log("실패"+log)}
		})
	}
	
	return {
		getCustStatus:getCustStatus //cust조회 - getCustStatus는 getCustStatus함수를 쓰는 이름이다! 
	}; 
	
})();