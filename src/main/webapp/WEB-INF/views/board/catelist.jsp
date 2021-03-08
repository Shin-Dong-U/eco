<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Showing selected cate page</h1>

	<!-- 카테고리 클릭->상품목록 페이지 -->
	<table class="table board">
		<thead>
		    <tr>
		      <th scope="col">카테고리명</th>
		    </tr>
		  </thead>
			  <tbody class="CateList">
			  </tbody>
	
		</table>
	<!-- 카테고리 클릭->상품목록 페이지 끝 -->

</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="/resources/board/board.js?ver=2"></script> 

<script>
$(document).ready(function() {
	showList();

	//카테고리 클릭->해당 카테고리 상품목록 페이지
	function showList(){		
		boardService.getCateList(function(CateList){
			var CateListTable=$(".CateList");
			var str="";
			for(var i=0,len=CateList.length||0;i<len;i++){
				console.log(CateList);
				str+="<tr>"
			
					+"	<td>"+CateList[i].cate_seq+"</td>"
	
					+"</tr>"
					
			}
			CateListTable.html(str);
		})
}
	
	
	return {
	
		getCateList:getCateList
	};
	
}); 
	
	
</script>
</html>