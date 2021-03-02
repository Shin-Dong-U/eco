<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">

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
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>
<script src="/resources/delivery/delivery.js?ver=4"></script>
<script src="/resources/basket/transferTime.js"></script>

<script>
$(document).ready(function() {
	showList();
	selectOrderList();
	
	//주문한 배송 리스트 보기
	function selectOrderList() {
		deliveryService.getOrderList(function(){})
	}
	
	//배송 리스트 보기
	function showList(){		
		deliveryService.getdeliveryList("invoice_no",function(deliveryList){
			var deliveryListTable=$(".deliveryList");
			var str="";
			for(var i=0,len=deliveryList.length||0;i<len;i++){
				console.log(deliveryList);
				str+="<tr>"
					+"	<th scope='row'>"+deliveryList[i].invoice_no+"</th>"
					+"	<td><ul>"+deliveryList[i].order_seq+"</ul></td>"
					+"	<td>"+deliveryList[i].delivery_status+"</td>"
					+"	<td>"+deliveryList[i].delivery_company+"</td>"
					+"	<td>"+trnasferTime.displayTime(deliveryList[i].regDate)+"</td>"
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
//					+"  <td><input type='checkbox'  checked></td>"
					
			}
			deliveryListTable.html(str);
		})
	

	
	
}
});

</script>
</html>