<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Searched Goods List Page</h1>

	<!-- 검색한 상품목록 리스트 -->
	<table class="table board">
		<thead>
		    <tr>
		      <th scope="col">상품번호</th>
		      <th scope="col">카테고리</th>
		      <th scope="col">상품명</th>
		      <th scope="col">상품설명</th>
		      <th scope="col">가격</th>
		      <th scope="col">환경지수</th>
		      <th scope="col">유해요소포함여부</th>
		      <th scope="col">판매여부</th>
		    </tr>
		  </thead>
			  <tbody class="searchedGoodsList">
			  </tbody>
	
		</table>
	<!-- 검색한 상품목록 리스트 끝 -->

</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="/resources/board/board.js?ver=2"></script> 

<script>
$(document).ready(function() {
	showList();

	//검색한 상품목록 리스트
	function showList(){		
		boardService.getsearchedGoodsList(function(searchedGoodsList){
			var searchedGoodsListTable=$(".searchedGoodsList");
			var str="";
			for(var i=0,len=searchedGoodsList.length||0;i<len;i++){
				console.log(searchedGoodsList);
				str+="<tr>"
				
					+"	<th scope='row'>"+searchedGoodsList[i].goods_seq+"</th>"
					+"	<td><ul>"+searchedGoodsList[i].category+"</ul></td>"
					+"	<td>"+searchedGoodsList[i].goods_name+"</td>"
					+"	<td>"+searchedGoodsList[i].goods_detail+"</td>"
					+"	<td>"+searchedGoodsList[i].price+"</td>"
					+"	<td>"+searchedGoodsList[i].eco_score+"</td>"
					+"	<td>"+searchedGoodsList[i].danger_YN+"</td>"
					+"	<td>"+searchedGoodsList[i].sale_YN+"</td>"
					+"</tr>"
					
			}
			searchedGoodsListTable.html(str);
		})
}
	
	
	return {
	
		getsearchedGoodsList:getsearchedGoodsList
	};
	
}); 
	
	
</script>
</html>