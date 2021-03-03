<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>

	<!--고객상태 목록  -->
	<table class="cust_table board">
		  <thead>
		    <tr>
		      <th scope="col">아이디</th>
		      <th scope="col">나무상태</th>
		      <th scope="col">보유 마일리지 잔액 </th>
		      <th scope="col">Bar상태 </th>
		      <!-- <th scope="col"><input type="checkbox">선택</th> -->
		    </tr>
		  </thead>
		
		  <tbody class="custStatus">
		  		    
		  </tbody>
	
		</table>
		<!--고객상태 목록  끝-->
		
		<br><hr>
	<!--item 목록  -->
	<div>
		<table class="item_table board">
		  <thead>
		    <tr>
		      <th scope="col">물</th>
		      <th scope="col">가격</th>
		      <th scope="col">메모</th>
		      <!-- <th><button type="submit" class="btn_">선택</button></th> -->
		      <th><button id="clickItem" class="btn_item">선택</button></th>
		    </tr>
		  </thead>
		
		  <tbody class="showItems">
		  		    
		  </tbody>
		</table>
	</div>
	<!--item 목록  끝-->
	
	
</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="/resources/js/game.js?var=7"></script>

<script>
//클릭했을때  , ajax로가서 로직이 진행이돼_마일리지가 차감 / 나무 체크,변화 / 상태바 체크, 변화 
var clickItem=$("#clickItem");	
clickItem.on("click",function(e){
	
	alert("-200원이 차감되었습니다......마일리지가 차감 / 나무 체크,변화 / 상태바 체크, 변화 ");
	gameService.getItem(function(){})
	
});
</script>

<script>
$(document).ready(function(){
	showStatus();
	showItems();

	//게임관련 아이템 ()
	function showItems(){	
	var showItems1=$(".showItems");	
		gameService.getItem(5,function(gameItems){
			
			console.log("JSP: ",gameItems);
			console.log("JSP11: ",gameItems.length);
			var str="";
			
			for(var i=0,len=gameItems.length||0; i<len;i++){
				console.log("===for")
				console.log("list.jsp의 gameItems상태:"+gameItems);
				
				str +="<tr>"
					+"	<th scope='row'>"+gameItems[i].item_name+"</th>"
					+"	<td>"+gameItems[i].item_price+"</td>"
					+"	<td>"+gameItems[i].item_memo+"</td>"
					+"</tr>"
//					+"  <td><input type='checkbox'  checked></td>"
			}
			showItems1.html(str);
		})
	}

	//고객상태 보기()
	function showStatus(){	
	var custStatus1=$(".custStatus");	
		gameService.getCustStatus("nana",function(custStatus){
			
			console.log("JSP: ",custStatus);
			console.log("JSP11: ",custStatus.length);
			var str="";
			
			for(var i=0,len=custStatus.length||0; i<len;i++){
				console.log("===for")
				console.log("list.jsp의 custStatus상태:"+custStatus);
				
				str +="<tr>"
					+"	<th scope='row'>"+custStatus[i].memberId+"</th>"
					+"	<td>"+custStatus[i].myTree+"</td>"
					+"	<td>"+custStatus[i].myMil+"</td>"
					+"	<td>"+custStatus[i].bar_status+"</td>" //cust에서는 bar상태는 0이고, 
					+"</tr>"
//					+"  <td><input type='checkbox'  checked></td>"
			}
			custStatus1.html(str);
		})
	}

	
	
	
	
	
	
});
</script>
</html>