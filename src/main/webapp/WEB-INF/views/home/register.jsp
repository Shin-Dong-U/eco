<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>E Store - eCommerce HTML Template</title>
<meta content="width=device-width, initial-scale=1.0" name="viewport">
<meta content="eCommerce HTML Template Free Download" name="keywords">
<meta content="eCommerce HTML Template Free Download" name="description">

    <!-- Favicon -->
<link href="/resources/template/img/favicon.ico" rel="icon">

<!-- Google Fonts -->
<link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400|Source+Code+Pro:700,900&display=swap" rel="stylesheet">

<!-- CSS Libraries -->
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet">
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
<link href="/resources/template/lib/slick/slick.css" rel="stylesheet">
<link href="/resources/template/lib/slick/slick-theme.css" rel="stylesheet">

<!-- JavaScript Libraries -->
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
<script src="/resources/template/lib/easing/easing.min.js"></script>
<script src="/resources/template/lib/slick/slick.min.js"></script>

<!-- Template Javascript -->
<script src="/resources/template/js/main.js"></script>
        
<!-- Template Stylesheet -->
<link href="/resources/template/css/style.css" rel="stylesheet">
<style>
	.loginOver{
		/* flex 부모태그에 설정 */
		display: flex; 
		/* 주축변경 */
		flex-direction: column;
		/* 주축에 대한 center */
		align-items: center;
	}
	
</style>
</head>

<body>
    <!-- Top bar Start -->
<div class="top-bar">
    <div class="container-fluid">
        <div class="row">
            <div class="col-sm-6">
                <i class="fa fa-envelope"></i>
                support@email.com
            </div>
            <div class="col-sm-6">
                <i class="fa fa-phone-alt"></i>
                +012-345-6789
            </div>
        </div>
    </div>
</div>
<!-- Top bar End -->

<!-- Nav Bar Start -->
<div class="nav">
    <div class="container-fluid">
        <nav class="navbar navbar-expand-md bg-dark navbar-dark">
            <a href="" class="navbar-brand">MENU</a>
            <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse justify-content-between" id="navbarCollapse">
                <div class="navbar-nav mr-auto">
                    <a href="index.html" class="nav-item nav-link">Home</a>
                    <a href="product-list.html" class="nav-item nav-link">Products</a>
                    <a href="product-detail.html" class="nav-item nav-link">Product Detail</a>
                    <a href="cart.html" class="nav-item nav-link">Cart</a>
                    <a href="checkout.html" class="nav-item nav-link">Checkout</a>
                    <a href="my-account.html" class="nav-item nav-link">My Account</a>
                    <div class="nav-item dropdown">
                        <a href="" class="nav-link dropdown-toggle active" data-toggle="dropdown">More Pages</a>
                        <div class="dropdown-menu">
                            <a href="wishlist.html" class="dropdown-item">Wishlist</a>
                            <a href="login.html" class="dropdown-item active">Login & Register</a>
                            <a href="contact.html" class="dropdown-item">Contact Us</a>
                        </div>
                    </div>
                </div>
                <div class="navbar-nav ml-auto">
                    <div class="nav-item dropdown">
                        <a href="" class="nav-link dropdown-toggle" data-toggle="dropdown">User Account</a>
                        <div class="dropdown-menu">
                            <a href="" class="dropdown-item">Login</a>
                            <a href="" class="dropdown-item">Register</a>
                        </div>
                    </div>
                </div>
            </div>
        </nav>
    </div>
</div>
<!-- Nav Bar End -->      

<!-- Bottom Bar Start -->
<div class="bottom-bar">
    <div class="container-fluid">
        <div class="row align-items-center">
            <div class="col-md-3">
                <div class="logo">
                    <a href="index.html">
                        <img src="/resources/template/img/logo.png" alt="Logo">
                    </a>
                </div>
            </div>
            <div class="col-md-6">
                <div class="search">
                    <input type="text" placeholder="Search">
                    <button><i class="fa fa-search"></i></button>
                </div>
            </div>
            <div class="col-md-3">
                <div class="user">
                    <a href="wishlist.html" class="btn wishlist">
                        <i class="fa fa-heart"></i>
                        <span>(0)</span>
                    </a>
                    <a href="cart.html" class="btn cart">
                        <i class="fa fa-shopping-cart"></i>
                        <span>(0)</span>
                    </a>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Bottom Bar End --> 


<!-- Breadcrumb Start -->
<div class="breadcrumb-wrap">
    <div class="container-fluid">
        <ul class="breadcrumb">
            <li class="breadcrumb-item"><a href="">Home</a></li>
            <li class="breadcrumb-item"><a href="">Products</a></li>
            <li class="breadcrumb-item active">Login & Register</li>
        </ul>
    </div>
</div>
<!-- Breadcrumb End -->
      
<!-- Login Start -->
<form id="registerForm" method="post">
	<div class="login">
		<div class="container-fluid">
			<div class="row">
				<div class="col-lg-12">    
					<div class="register-form"><!-- 회원가입 완료 사용 -->
						<div class="row">
							<!-- Company_yn radiobutton으로 체크하기 -->
							<div class="col-md-12">
								<label>Company Check</label>
								<div class="col-md-6">
									<table style="width:100%; text-align:center;">
										<tr>
											<td><label>CUSTOMER</label></td>
											<td><label>COMPANY</label></td>
										</tr>
										<tr>
											<td><input class="form-control companyCheck" id="customer" type="radio" name="company_yn" value="N" checked/></td>
											<td><input class="form-control companyCheck" id="company" type="radio" name="company_yn" value="Y"/> </td>
										</tr>
									</table>
								</div>
								<div class="col-md-6">
									<label>ID</label>
									<input class="form-control" type="text" id="memberId" name="memberId" placeholder="ID">
								</div>
								<div class="col-md-6">
									<label>Password</label>
									<input class="form-control" type="password" id="password" name="password" placeholder="password">
								</div>
								<div class="col-md-6">
									<label>Name</label>
									<input class="form-control" type="text" id="name" name="name" placeholder="Name">
								</div>
								<div class="col-md-6">
									<label>Email</label>
									<input class="form-control" type="text" id="email" name="email" placeholder="E-mail">
								</div>
								<div class="col-md-6">
									<label>Mobile No</label>
									<input class="form-control" type="text" id="phone" name="phone" placeholder="Mobile No">
								</div>
	                              
								<div class="col-md-6">
									<label>ADDR</label>
									<input class="form-control" type="text" id="addr_post" 		name="addr_post" 	placeholder="Addr Post Number">	
									<input class="btn btn-link" type="button" onclick="popUP()" value="우편번호 찾기">
									<input class="form-control" type="text" id="addr_city_new" 	name="addr_city" 	placeholder="New address system">
									<input class="form-control" type="text" id="addr_city_old" 	name="addr_city_O" 	placeholder="Parcel address system">
									<input class="form-control" type="text" id="addr_detail" 	name="addr_detail" 	placeholder="detail address system">
									<span id="guide" style="color:#999;display:none"></span>
								</div>		
	                              
								<div class="col-md-6">
									<label>Birth</label>
									<input class="form-control" type="date" id="birth" name="birth" placeholder="birth">	<!-- value="날짜" 초기값 설정 -->
								</div>
	            									 
								<div class="col-md-6">
									<label>Sex</label>
									<table style="width:100%; text-align:center;">
										<tr>
											<td><label>MALE</label></td>
											<td><label>FEMALE</label></td>
										</tr>
										<tr>
											<td><input class="form-control companyCheck" type="radio"	id="male"  	name="sex" value=1 checked /></td>
											<td><input class="form-control companyCheck" type="radio"	id="female" name="sex" value=2 /> </td>
										</tr>  
									</table>                             
	   							</div>													
								<!-- Company_yn 이  y일경우 -->
								<div id="company_addDiv" style="display:none;">
									<div class="col-md-6">
										<label>Company Name</label> 
										<input class="form-control" type="text" id="comp_name" name="comp_name"  placeholder="Company name" >
									</div>
									<div class="col-md-6">
										<label>Company Num</label> 
										<input class="form-control" type="text" id="corp_num" name="corp_num"  placeholder="Corporate number">
									</div>
								</div>
								<div class="col-md-12">
									<button class="btn" id="btn_register" >Submit</button>
								</div>
							</div><!-- ./col-md-12 -->
                       </div><!-- ./row -->
                   </div><!-- ./register-form -->
               </div><!-- ./col-lg-12 -->
           </div><!-- ./row -->
       </div><!-- ./container-fluid -->
	</div><!-- ./login -->
</form>		
 
<!-- Ajax 실행 Javascript -->

<script src="/resources/home/customer.js?v=<%=System.currentTimeMillis() %>"></script>
<script>
/* CSRF 데이터 변수 저장 */
var csrfHeaderName="${_csrf.headerName}";
var csrfTokenValue="${_csrf.token}";

/* company일 경우만 company의 항목을 보여준다. */
$("input[type='radio'][name='company_yn']").on("click", function(){
	var company_yn=$("input[type='radio'][name='company_yn']:checked").val();
	
	if(company_yn=="N"){
		$("#company_addDiv").css('display','none');
	}else{
		$("#company_addDiv").css('display','block');
	}
	
});

/* 회원가입 Ajax */
$("#btn_register").on("click", function(e){
	e.preventDefault();
	
	var company_yn=$("input[type='radio'][name='company_yn']:checked").val();
	var sex=$("input[type='radio'][name='sex']:checked").val();
	var birth=$('#birth').val();
	/* 생일 = 문자열 -> 숫자 */
	var birth_int= parseInt(birth.replace("-",""));

	var custVO={
		"company_yn":company_yn,
		"memberId":$("#memberId").val(),
		"password":$("#password").val(),
		"name":$("#name").val(),
		"email":$("#email").val(),
		"phone":$("#phone").val(),
		"birth":birth_int,
		"addr_post":$("#addr_post").val(),
		"addr_city":$("#addr_city_new").val(),
		"addr_detail":$("#addr_detail").val(),
		"sex":sex,
	};
	if(company_yn=="Y"){
		var compVO={
			"comp_name":$("#comp_name").val(),
			"corp_num":$("#corp_num").val(),
			"addr_post":$("#addr_post").val(),
			"addr_city":$("#addr_city_new").val(),
			"addr_detail":$("#addr_detail").val(),
		}
	}
	console.log("custVO: "+JSON.stringify(custVO));
	console.log("compVO: "+JSON.stringify(compVO));
	
	customer.joinMember(
		memberVO={custVO:custVO, compVO:compVO,},
		csrf={"csrfHeaderName":csrfHeaderName,
			"csrfTokenValue":csrfTokenValue},
		function(data){
			alert("joinMember"+data);
		}
	);
    
});






</script>


<!-- 도로주소 api -->
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script>
//본 예제에서는 도로명 주소 표기 방식에 대한 법령에 따라, 내려오는 데이터를 조합하여 올바른 주소를 구성하는 방법을 설명합니다.
function popUP() {
    new daum.Postcode({
        oncomplete: function(data) {
            // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

            // 도로명 주소의 노출 규칙에 따라 주소를 표시한다.
            // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
            var roadAddr = data.roadAddress; // 도로명 주소 변수
            var extraRoadAddr = ''; // 참고 항목 변수

            // 법정동명이 있을 경우 추가한다. (법정리는 제외)
            // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
            if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                extraRoadAddr += data.bname;
            }
            // 건물명이 있고, 공동주택일 경우 추가한다.
            if(data.buildingName !== '' && data.apartment === 'Y'){
               extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
            }
            // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
            if(extraRoadAddr !== ''){
                extraRoadAddr = ' (' + extraRoadAddr + ')';
            }

            // 우편번호와 주소 정보를 해당 필드에 넣는다.
            document.getElementById('addr_post').value = data.zonecode;
            document.getElementById("addr_city_new").value = roadAddr;
            document.getElementById("addr_city_old").value = data.jibunAddress;
            
            var guideTextBox = document.getElementById("guide");
            // 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.
            if(data.autoRoadAddress) {
                var expRoadAddr = data.autoRoadAddress + extraRoadAddr;
                guideTextBox.innerHTML = '(예상 도로명 주소 : ' + expRoadAddr + ')';
                guideTextBox.style.display = 'block';

            } else if(data.autoJibunAddress) {
                var expJibunAddr = data.autoJibunAddress;
                guideTextBox.innerHTML = '(예상 지번 주소 : ' + expJibunAddr + ')';
                guideTextBox.style.display = 'block';
            } else {
                guideTextBox.innerHTML = '';
                guideTextBox.style.display = 'none';
            }
        }
    }).open();
}
</script>

<%@include file="../include/footer.jsp" %>			
