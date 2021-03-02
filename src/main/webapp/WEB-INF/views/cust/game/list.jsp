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
	<table class="table board">
		  <thead>
		    <tr>
		      <th scope="col">아이디</th>
		      <th scope="col">나무상태</th>
		      <th scope="col">보유 마일리지 잔액 </th>
		      <!-- <th scope="col"><input type="checkbox">선택</th> -->
		    </tr>
		  </thead>
		
			  <tbody class="custStatus">
			  		    
			  </tbody>
	
		</table>
		<!--고객상태 목록  끝-->
</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="/resources/js/game.js?var=5"></script>


<script>
$(document).ready(function(){
	showStatus();

	var custStatus1=$(".custStatus");
	//고객상태 보기
	function showStatus(){	
		
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
					+"</tr>"
//					+"  <td><input type='checkbox'  checked></td>"
					
			}
			
			custStatus1.html(str);
		})
	}

});


</script>
</html>