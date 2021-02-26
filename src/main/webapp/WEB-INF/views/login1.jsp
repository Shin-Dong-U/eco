<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인page</title>
<style>
	.d1{
		border:2px solid gray;  
		margin:auto;
		text-align:center;
		width:80%;
	}
	/* The Modal (background) */
	.modal{
		display: none; /* Hidden by default */
		position: fixed; /* Stay in place */
		z-index: 1; /* Sit on top */
		left: 0;
		top: 0;
		width: 100%; /* Full width */
		height: 100%; /* Full height */
		overflow: auto; /* Enable scroll if needed */
		background-color: rgb(0,0,0); /* Fallback color */
		background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
	}
	/* Modal Content Box Title */
	.modal-content {
		background-color: #fefefe;
		margin: 15% auto; /* 15% from the top and centered */
		padding: 20px;
		border: 1px solid #888;
		width: 50%; /* Could be more or less, depending on screen size */                          
	}
	/* The Close Button */
	.close {
		color: #aaa;
		float: right;
		font-size: 28px;
		font-weight: bold;
	}
	.close:hover, .close:focus {
		color: black;
		text-decoration: none;
		cursor: pointer;
	}

</style>


</head>
<body>
<!-- 로그인 form 시작 -->
<div class="d1">
	<h1>로그인</h1><hr/>
	<form id="form_loging">
		<input type="text" id="memberId" name="memberId" placeholder="id" /><p/>
		<input type="password" id="password" name="password" placeholder="Password" /><p/>
		<button  id="btn_submit" class="btn btn-default">Login</button><p/>
		<div class="loginChat"></div>
	</form>
</div><br/>
<!-- 로그인 form  끝-->

<!-- <form id="reg_member" method="post" action="/regMember">
	<input type="button" id="btn_regMember" value="회원가입하기" />
</form> -->

<!-- modal 시작 -->
<!-- 
<div class="d1">
	<h1>회원가입</h1><hr/><input type="button" id="btn_regMember" value="회원가입하기" />
	<div id="modal" class="modal">
		<div id="modal-content" class="modal-content">
			<span id="close-modal" class="close">&times;</span> 
			<form id="frm_joinUser" action="/regUser">
				<h1>회원가입</h1><hr/>
				<input type="text" 		data-type="memberId" 	id="memberId" 		name="memberId" 		placeholder="id">		<br/>
				<input type="password"	data-type="password" 	id="password" 		name="password" 		placeholder="password">	<br/>
				<input type="text" 		data-type="name" 		id="name" 			name="name" 			placeholder="name" />	<br/>
				<input type="text" 		data-type="phone" 		id="phone" 			name="phone" 			placeholder="phone" />	<br/>
				<input type="text" 		data-type="email" 		id="email" 			name="email" 			placeholder="email" />	<br/>
				<input type="text" 		data-type="addr_post" 	id="addr_post" 		name="addr_post" 		placeholder="post" />	<br/>
				<input type="text" 		data-type="addr_city" 	id="addr_city" 		name="addr_city" 		placeholder="city" />	<br/>
				<input type="text" 		data-type="addr_detail" id="addr_detail"	name="addr_detail" 		placeholder="detail" />	<br/>
				<input type="date" 		data-type="birth" 		id="birth"			name='userBirthday' 	value='1999-03-30'/>	<br/>
				<input type="radio"		data-type="sex"			id="sex_m" 			name="sex" 				value="1" checked>male	
				<input type="radio"		data-type="sex"			id="sex_f" 			name="sex" 				value="2" >female		<br/>
				<input type="radio"		data-type="company_yn"	id="company_n" name="company_yn" value="N" checked >USER 
				<input type="radio"		data-type="company_yn"	id="company_y" name="company_yn" value="Y" >COMPANY					<br/>
			
				<input type="button" id="btn_regSubmit" value="회원 가입">
				<input type="reset" value="리셋">
			</form>

		</div>
	</div>
</div>
 -->
<!-- modal 끝 -->



<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>	
<script type="text/javascript" src="/resources/vender/ajax/custLogin.js?v=<%=System.currentTimeMillis() %>"></script>
<script>
var form_loing=$("#form_loging");


/* 로그인 클릭시 일어나는 이벤트 */
$("#btn_submit").on("click",function(e){
	e.preventDefault();
	
	var memberId = $("#memberId").val();
	var password = $("#password").val();
	
	alert("memberId: "+memberId+" password: "+password);
	
	checkLogin(memberId,password);
});

/* 로그인 아작스  */
function checkLogin(memberId,password){
	custLogin.getCust(
	{
		memberId:memberId,
		password:password
	},
	function(custVO){
		var str="";
		if(custVO != null){
			$(".loginChat").html("<p>"+custVO.memberId+"님이 로그인하셨습니다.</p>");
		}
	});
}

/* 회원가입 클릭시 일어나는 이벤트  */
var modal = $(".modal");
$("#btn_regMember").on("click",function(){
	checkModal();
});

/* 모달 생성 */
function checkModal(){
	document.getElementById("modal").style.display="block";
}
/* 모달 닫기 */
$("#close-modal").on("click",function(){
	document.getElementById("modal").style.display="none";
});

/* 가입 버튼  */
$("#btn_regSubmit").on("click",function(e){
	e.preventDefault();
	regUser();
});

/* 로그인 아작스  */
function regUser(){
	var memberId = $("#memberId").val();
	var password = $("#password").val();
	var phone = $("#phone").val();
	var email = $("#email").val();
	var addr_post = $("#addr_post").val();
	var addr_city = $("#addr_city").val();
	var addr_detail = $("#addr_detail").val();
	var birth = $("#birth").val();
	var sex = $("#sex").val();
	var company_yn = $("#company_yn").val();
	var member_yn = $("#member_yn").val();
	
	/*
	{
		 "memberId":"orange",
		 "password":"1234",
		 "name":"orange",
		 "phone":"01012345678",
		 "email":"goott1@google.com",
		 "addr_post":"123456",
		 "addr_city":"익산",
		 "addr_detail":"동산동",
		 "birth":"990101",
		 "sex":1
	}
	*/
} 


</script>	

</body>
</html>