console.log("Reply Module.........");

var basketService=(function(){
	
	
	function getBasketList(callback, error){
		//basket: 처리할 값
		//callback: 성공시 처리되는 함수
		//error: 실패시 처리되는 함수
			console.log("basket List................");
			
			$.ajax({ //자바스크립트 객체 시작
			type:'get',						//전송유형
			url:'/orders/basket/list/a',		//컨트롤러 메소드 호출 URL
			//JSON.stringify()자바스크립트 객체를 JSON형식의 문자열로 변환해주는 웹브라우저 내부 메소드
			data:JSON.stringify(),			//data키에 설정되는 값은 컨트롤러 메소드의 consumes속성 설정 값의 데이터 유형과 일치
			contentType: "application/json; charset=utf-8", //서버에게 보내는 데이터 유형(MIME타입)
			success:function(basketList,status,xhr){  //XHR (XML Http Request)
				//처리 성공시 수행
				if(callback){ //자바스크립트에서 if문은 값이 있으면 참!!!
					callback(basketList);
					console.log("장바구니 리스트",basketList);
				}
			},
			error:function(xhr, status, er){
				if(error){
					erroer(er);
				}
			}
				
			})
			}
	
	function getBasketGoods(callback, error){		
			console.log("basket select one goods................");
			
			$.ajax({ 
			type:'get',						
			url:'/orders/basket/11',					
			data:JSON.stringify(),			
			contentType: "application/json; charset=utf-8", 
			success:function(basketGoods,status,xhr){  				
				if(callback){ 
					callback(basketGoods);
					console.log("장바구니 상품",basketGoods);
				}
			},
			error:function(xhr, status, er){
				if(error){
					erroer(er);
				}
			}
				
			})
			}
	
	function delBasketGoods(callback, error){		
		console.log("basket delete one goods................");
		
		$.ajax({ 
		type:'get',						
		url:'/orders/basket/sample_id/11',					
		data:JSON.stringify(),			
		contentType: "application/json; charset=utf-8", 
		success:function(basketGoods,status,xhr){  				
			if(callback){ 
				callback(delBasketGoods);
				console.log("장바구니에서 삭제한 상품");
			}
		},
		error:function(xhr, status, er){
			if(error){
				erroer(er);
			}
		}
			
		})
		}
	
	// 댓글등록: 사용자가 입력한 댓글을 서버의 컨트롤러로 전송
	/*function add(reply, callback, error){
					//reply: 처리할 값
					//callback: 성공시 처리되는 함수
					//error: 실패시 처리되는 함수
		console.log("reply................");
		
		$.ajax({ //자바스크립트 객체 시작
			type:'post',						//전송유형: post방식
			url:'/replies/new',					//컨트롤러 메소드 호출 URL
			//JSON.stringify()자바스크립트 객체를 JSON형식의 문자열로 변환해주는 웹브라우저 내부 메소드
			data:JSON.stringify(reply),			//data키에 설정되는 값은 컨트롤러 메소드의 consumes속성 설정 값의 데이터 유형과 일치
			contentType: "application/json; charset=utf-8", //서버에게 보내는 데이터 유형(MIME타입)
			success:function(result,status,xhr){  //XHR (XML Http Request)
				//처리 성공시 수행
				if(callback){ //자바스크립트에서 if문은 값이 있으면 참!!!
					callback(result);
				}
			},
			error:function(xhr, status, er){
				if(error){
					erroer(er);
				}
			}
				
		})
	}*/
	
	
//날짜시간 표시형식 설정: 날짜시간 형식 지정(서버와 상관 없음)
//오늘 지금시간을 기준으로 하루를 넘어가면, 날짜가 표시, 하루가 지나지 않았으면, 시간으로 표시됩니다.
	function displayTime(timeValue){
		var today = new Date();
		
		var gap = today.getTime() - timeValue;
		
		var dateObj = new Date(timeValue);
		var str="";
		
		if(gap<(1000*60*60*24)) {
			
			var hh = dateObj.getHours();
			var mi = dateObj.getMinutes();
			var ss = dateObj.getSeconds();
			
			return [(hh>9 ?'':'0')+hh, ':', (mi>9 ? '':'0')+mi,
					':',(ss>9 ?'':'0')+ss ].join('');			
		}else{
			var yy= dateObj.getFullYear();
			var mm= dateObj.getMonth()+1; //getMonth() is zero-based
			var dd= dateObj.getDate();
			
			return[yy, '/', (mm>9 ? '':'0')+mm, '/',
					(dd>9 ? '':'0')+dd].join('');				
		}		
	};
	
	
	return {
		getBasketList:getBasketList,
		getBasketGoods:getBasketGoods,
		delBasketGoods:delBasketGoods,
		displayTime:displayTime
	};
	
})();


