<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Delivery List Page</h1>

	<!-- 배송 리스트 -->
	<table class="table board">
		<thead>
		    <tr>
		      <th scope="col">송장번호</th>
		      <th scope="col">주문번호</th>
		      <th scope="col">배송상태</th>
		      <th scope="col">배송업체</th>
		      <th scope="col">등록일</th>
		      <th scope="col">등록자</th>
		      <th scope="col">수정일</th>
		      <th scope="col">수정자</th>
		      <th scope="col">발송자</th>
		      <th scope="col">발송자전화</th>
		      <th scope="col">발송자우편번호</th>
		      <th scope="col">발송자주소</th>
		      <th scope="col">발송자상세주소</th>
		      <th scope="col">수신인</th>
		      <th scope="col">수신번호</th>
		      <th scope="col">수신자우편번호</th>
		      <th scope="col">수신자주소</th>
		      <th scope="col">수신자상세주소</th>
		    </tr>
		  </thead>
		
			  <tbody class="deliveryList">
			  		    
			  </tbody>
	
		</table>
	<!-- 배송 리스트 끝 -->

</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<!-- <script src="/resources/delivery/delivery.js?ver=1"></script> -->

<script>
$(document).ready(function() {
	showList();
	
	
	//배송 리스트 보기
	function showList(){		
		deliveryService.getdeliveryList(123123123,function(deliveryList){
			var deliveryListTable=$(".deliveryList");
			var str="";
			for(var i=0,len=deliveryList.length||0;i<len;i++){
				console.log(deliveryList);
				str+="<tr>"
					+"	<th scope='row'>"+deliveryList[i].invoice_no+"</th>"
					+"	<td><ul>"+deliveryList[i].order_seq+"</ul></td>"
					+"	<td>"+deliveryList[i].delivery_status+"</td>"
					+"	<td>"+deliveryList[i].delivery_company+"</td>"
					+"	<td>"+deliveryService.displayTime(deliveryList[i].regDate)+"</td>"
					+"	<td>"+deliveryList[i].regUser+"</td>"
					+"	<td>"+deliveryList[i].editDate+"</td>"
					+"	<td>"+deliveryList[i].editUser+"</td>"
					+"	<td>"+deliveryList[i].sender_name+"</td>"
					+"	<td>"+deliveryList[i].sender_phone+"</td>"
					+"	<td>"+deliveryList[i].sender_addr_post+"</td>"
					+"	<td>"+deliveryList[i].sender_addr_city+"</td>"
					+"	<td>"+deliveryList[i].sender_addr_detail+"</td>"
					+"	<td>"+deliveryList[i].cust_name+"</td>"
					+"	<td>"+deliveryList[i].cust_phone+"</td>"
					+"	<td>"+deliveryList[i].cust_addr_post+"</td>"
					+"	<td>"+deliveryList[i].cust_addr_city+"</td>"
					+"	<td>"+deliveryList[i].cust_addr_detail+"</td>"
					+"</tr>"

					
			}
			deliveryListTable.html(str);
		})
	

	
	
}
});

var deliveryService=(function(){
	
	//배송 리스트 조회 
	function getdeliveryList(invoice_no,callback, error){
			console.log("delivery List................");
			
		$.ajax({ //자바스크립트 객체 시작
			type:'get',					
			url:'/delivery/list/'+invoice_no,	
			//JSON.stringify()자바스크립트 객체를 JSON형식의 문자열로 변환해주는 웹브라우저 내부 메소드
			data:JSON.stringify(invoice_no),			
			contentType: "application/json; charset=utf-8", 
			//success:(deliveryList)=>{console.log("배송 리스트",deliveryList),
			//callback(deliveryList)},
	
			
			success:function(delivertList) {
				if(callback) {
					callback(delivertList);
					console.log("배송 리스트", deliveryList);
				}
			},
		
			error:(log)=>{console.log("실패 "+log)}
		})
	}
	
		
	
		function displayTime(timeValue){
		var today = new Date();
		
		var gap = today.getTime() - timeValue;
		
		var dateObj = new Date(timeValue);
		var str="";
		
		if(gap<(1000*60*60*24)) {
			
			var yy= dateObj.getFullYear();
			var mm= dateObj.getMonth()+1; //getMonth() is zero-based
			var dd= dateObj.getDate();
			
			return[yy, '/', (mm>9 ? '':'0')+mm, '/',
					(dd>9 ? '':'0')+dd].join('');				
		}		
	};
	
	return {
	
		getdeliveryList:getdeliveryList,

		displayTime:displayTime
	};
	
})();
</script>
</html>