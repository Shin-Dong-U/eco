<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	goods detail<br/>

	상품명 : ${goodsDetail.GOODS_NAME }
	가격 : ${goodsDetail.PRICE }
		
	<c:if test="${goodsDetail.REQ_YN eq 'Y'}" >
		<c:forEach var="optionList" items="${optionList}">
			${optionList.OPTION_NAME } <br/>
			${optionList.PRICE } <br/>
		</c:forEach>
	</c:if>	

	<c:forEach var="thumb" items="${thumbList}">
		${thumb.MAIN_YN } <br/>
		<img src="${thumb.IMG_URL }"> <br/>
	</c:forEach>

		
<script>
</script>
</body>
</html>