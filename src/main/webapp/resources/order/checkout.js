console.log("checkout Module.........");

var checkoutService=(function(){
	
	
	//장바구니 상품 주문하기
	function addOrderBasket(cust_id,total_price,callback){
			console.log("................addOrderBasket");
		$.ajax({ //자바스크립트 객체 시작
			type:'get',						//전송유형
			url:'/checkout/content/'+cust_id+'/'+total_price,		//컨트롤러 메소드 호출 URL
			data:JSON.stringify(),			//data키에 설정되는 값은 컨트롤러 메소드의 consumes속성 설정 값의 데이터 유형과 일치
			contentType: "application/json; charset=utf-8", //서버에게 보내는 데이터 유형(MIME타입)
			success:(result)=>{console.log("체크아웃 장바구니",result),
				callback(result)
				,location.href = "/orders/order/checkout?order_seq="+result.order_seq;
					},	
			error:(log)=>{console.log("실패 "+log)}
		})
	}
	
	//상품 바로 주문하기
	function orderNow(orderinfo){
			console.log("................ordernow");
		$.ajax({ 
			type:'post',						
			url:'/checkout/ordernow/',		
			data:JSON.stringify(orderinfo),			
			contentType: "application/json; charset=utf-8", 
			success:(result)=>{console.log("체크아웃 장바구니",result)
				,location.href = "/orders/order/checkout?order_seq="+result.order_seq;
					},	
			error:(log)=>{console.log("실패 "+log)}
		})
	}
	
	
	//배송정보 가져오기
	function getShipInfo(cust_id,order_seq,callback){
		console.log("................getShipInfo");
		
	$.ajax({
		type:'get',					
		url:'/checkout/address/'+cust_id+'/'+order_seq,				
		data:JSON.stringify(),			
		contentType: "application/json; charset=utf-8", 
		success:(addressInfo)=>{console.log("회원주소",addressInfo),
			callback(addressInfo)},	
		error:(log)=>{console.log("실패 "+log)}
		})
	}
	
	//주문정보리스트 가져오기
	function getOrderList(cust_id,callback){
		console.log("basket List................");
		
	$.ajax({ 
		type:'get',						
		url:'/checkout/orderedlist/'+cust_id,
		data:JSON.stringify(),			
		contentType: "application/json; charset=utf-8", 
		success:(orderList)=>{console.log("주문리스트",orderList),
			callback(orderList)},	
		error:(log)=>{console.log("실패 "+log)}
		})
	}	
	
	//주문상세정보리스트 가져오기
	function getOrderedDetail(cust_id,callback){
		console.log("basket List................");
		
	$.ajax({ 
		type:'get',						
		url:'/checkout/paidlist/'+cust_id,
		data:JSON.stringify(),			
		contentType: "application/json; charset=utf-8", 
		success:(orderList)=>{console.log("주문리스트",orderList),
			callback(orderList)},	
		error:(log)=>{console.log("실패 "+log)}
		})
	}	
	
	//배송정보 입력
	function insertShipInfo(addressInfo){
		console.log("................insertShipInfo");
		
	$.ajax({ //자바스크립트 객체 시작
		type:'post',	
		url:'/ship/new/',
		data:JSON.stringify(addressInfo),
		contentType: "application/json; charset=utf-8",
		success:(result)=>{console.log("배송정보 입력",result)},	
		error:(log)=>{console.log("실패 "+log)}
		})
	}
	
	//배송정보 확인
	function getShipStatus(order_seq,callback){
		console.log("................getShipList");
		
	$.ajax({ 
		type:'get',	
		url:'/ship/user/'+order_seq,
		data:JSON.stringify(),
		contentType: "application/json; charset=utf-8",
		success:(shipStatus)=>{console.log("배송정보 회원조회",shipStatus),
			callback(shipStatus)},	
		error:(log)=>{console.log("실패 "+log)}
		})
	}
	
	//주문 취소
	function orderCancel(order_seq){
		console.log("................orderCancel");
		
	$.ajax({ 
		type:'post',	
		url:'/checkout/cancel/'+order_seq,
		data:JSON.stringify(),
		contentType: "application/json; charset=utf-8",
		success:(result)=>{console.log("주문취소",result),
			alert("주문취소: "+result),
			location.href = "/home/index"},	
		error:(log)=>{console.log("실패 "+log)}
		})
	}
	
	//주문 확정 마일리지 적립
	function orderCommit(order_seq,point,cust_id){
		console.log("................orderCommit");

		$.ajax({ 
			type:'PATCH',	
			url:'/checkout/commit/'+order_seq+'/'+point+'/'+cust_id,
			data:JSON.stringify(),
			contentType: "application/json; charset=utf-8",
			success:(result)=>{alert("주문확정 결과: "+result),
				location.href = "/home/index"},	
			error:(log)=>{console.log("실패 "+log)}
			})
	}
		
	//송장번호 입력 
	function insertShipInfoCom(shipInfo){
		console.log("................insertShipInfoCom");

		$.ajax({ 
			type:'PATCH',	
			url:'/ship/company/info',
			data:JSON.stringify(shipInfo),
			contentType: "application/json; charset=utf-8",
			success:(result)=>{alert("송장번호 입력: "+result),
				location.href = "/home/index"},	
			error:(log)=>{console.log("실패 "+log)}
			})		
			
	}

	
	return {
		addOrderBasket:addOrderBasket,
		getOrderList:getOrderList,
		getOrderedDetail:getOrderedDetail,
		getShipInfo:getShipInfo,
		insertShipInfo:insertShipInfo,
		getShipStatus:getShipStatus,
		orderCancel:orderCancel,
		orderCommit:orderCommit,
		insertShipInfoCom:insertShipInfoCom,
		orderNow:orderNow
	};
	
})()


