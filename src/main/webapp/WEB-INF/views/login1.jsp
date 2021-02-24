<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form id="form_loing">
	<input type="text" id="memberId" name="memberId" placeholder="id" value="sample_id"  />
	<input type="password" id="password" name="password" placeholder="Password" value="1234" />
	<button type="button" id="btn_submit" class="btn btn-default">Login</button>
	<div class="loginChat">
	
	</div>
</form>

<script type="text/javascript" src="/resources/vender/ajax/custLogin.js?v=<%=System.currentTimeMillis() %>"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>	
<script>
var form_loing=$("#form_loing");
var memberId = $("#memberId").val();
var password = $("#password").val();
var loginChat = $(".loginChat");
var btn_submit = $("btn_submit");
$("#btn_submit").on("click",function(e){
	e.preventDefault();
	alert("memberId: "+memberId+"|||||password: "+password);
	checkLogin();
});

function checkLogin(){
	custLogin.getCust(
	{
		memberId:memberId,
		password:password
	},
	function(loginChat,cust){
		alert("cust:"+cust);
		var str="";
		if(cust != null ){
			alert("h");
			str+="<p>"+cust.memberId+"님이 로그인하셨습니다.</p>";
		}
		//loginChat.html(str);
	});
}
</script>	

</body>
</html>