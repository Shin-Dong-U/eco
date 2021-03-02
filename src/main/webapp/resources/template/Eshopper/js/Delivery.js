console.log("Reply Module.........");

var deliveryService=(function(){
	
	//배송 리스트 조회 
	function getdeliveryList(invoice_no,callback){
			console.log("delivery List................");
			
		$.ajax({ //자바스크립트 객체 시작
			type:'get',					
			url:'/delivery/list/'+invocie_no,	
			//JSON.stringify()자바스크립트 객체를 JSON형식의 문자열로 변환해주는 웹브라우저 내부 메소드
			data:JSON.stringify(),			
			contentType: "application/json; charset=utf-8", 
			success:(deliveryList)=>{console.log("배송 리스트",deliveryList),
				callback(deliveryList)},
			error:(log)=>{console.log("실패 "+log)}
		})
	}
	
	//주문한 배송정보 조회
	function getOrderList(){		
			console.log("selected order delivery................");
			
		$.ajax({ 
			type:'get',						
			url:'/order/list',					
			data:JSON.stringify(),			
			contentType: "application/json; charset=utf-8", 
			success:(orderList)=>{console.log("주문한 배송리스트",orderList)},
			error:(log)=>{console.log("실패 "+log)}
		})
	}
	
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
	
		getDeliveryList:getDeliveryList,
		getOrderList:getOrderList,
		displayTime:displayTime
	};
	
})();
