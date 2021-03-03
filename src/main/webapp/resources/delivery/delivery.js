console.log("Reply Module.........");

var deliveryService=(function(){
	
	//배송 리스트 조회 
	function getdeliveryList(invoice_no,callback){
			console.log("delivery List................");
			
		$.ajax({ 
			type:'get',					
			url:'/delivery/list/'+invocie_no,	
			data:JSON.stringify(),			
			contentType: "application/json; charset=utf-8", 
			success:(deliveryList)=>{console.log("배송 리스트",deliveryList),
				callback(deliveryList)},
			error:(log)=>{console.log("실패 "+log)}
		})
	}
	
	
	//결제완료된(3) 주문 리스트
	function getorderList(order_status,callback){
			console.log("3 ordered List................");
			
		$.ajax({ 
			type:'get',					
			url:'/delivery/list/',	
			data:JSON.stringify(),			
			contentType: "application/json; charset=utf-8", 
			success:(orderList)=>{console.log("결제완료된 주문리스트",deliveryList),
				callback(deliveryList)},
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
		displayTime:displayTime
	};
	
})();
