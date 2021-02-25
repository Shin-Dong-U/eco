<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
</style>
</head>
<body>
	<h1>List Page</h1>
	
	<!--장바구니 목록  -->
	<table class="table board">
		  <thead>
		    <tr>
		      <th scope="col">상품번호</th>
		      <th scope="col">수량</th>
		      <th scope="col">구매유무</th>
		      <th scope="col">삭제유무</th>
		      <th scope="col">등록일</th>
		      <th scope="col">등록자</th>
		      <th scope="col">수정일</th>
		      <th scope="col">수정자</th>
		    </tr>
		  </thead>
		
			  <tbody class="basketList">
			  		    
			  </tbody>
	
		</table>
		<!--장바구니 목록  끝-->
</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>
<script src="/resources/basket/basket.js?ver=1"></script>

<script>
$(document).ready(function(){		
	
	//basketList 실행함수	
	var basketTable =$(".basketList");
	showList(1);
	selectBasketGoods();
	delBasketGoods();
	
	function delBasketGoods(){
		basketService.delBasketGoods(function(delBasketGoods){})
	}
	
	function selectBasketGoods(){
		basketService.getBasketGoods(function(basketGoods){})
	}
	
	function showList(page){
		console.log("show list " + page);	
		basketService.getBasketList(function(basketList){
			
			//var goodsNum = BasketList.basket_seq;
			
			//console.log(goodsNum);
			
			
			/* for(var i = 0, len=basketList.length||0; i<len; i++){
				console.log(list[i]);
				str +="<tr class='oneBasket' data-bno="+basketList[i].bno+" data-writer="+basketList[i].writer+">"
					+ 	"<th scope='row' class='boardBno'>"+basketList[i].bno+"</th>"							
					+ 	"<td><ul class='titleBtn'>"+basketList[i].title+" ["+basketList[i].replyCnt+"]</ul></td>"
					+	"<td>"+basketList[i].content+"</td>"
					+	"<td>"+basketList[i].writer+"</td>"
					+	"<td>"+transferTime.displayTime(basketList[i].regDate)+"</td>"
					+"</tr>"
			}   	   */
			//basketTable.html(str);
			
		});//end function
				
	}//end showList
	//basketList 실행 끝
});
</script>
</html>