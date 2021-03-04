<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form id="admin_form">
	<h1> 일반 사용자 회원정보</h1>
	<input type="button" id="btn_custTest" value="출력" /><hr/>
	<h1> 업체 회원정보</h1>
	<input type="button" id="btn_companyTest" value="출력" /><hr/>
	<h1> 관리자 회원정보</h1>
	<input type="button" id="btn_AdminTest" value="출력" /><hr/>
</form>
<div class="chat">

</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>	
<script type="text/javascript" src="/resources/admin/adminRest.js?v=<%=System.currentTimeMillis() %>"></script>
<script>
$("#btn_custTest").on("click", function(e){
	e.preventDefault();
	
});
$("#btn_companyTest").on("click", function(e){
	e.preventDefault();
	
});
$("#btn_AdminTest").on("click", function(e){
	e.preventDefault();
	
});

</script>

</body>
</html>