<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../include/header.jsp" %>
        <!-- Bottom Bar End --> 
        
        <!-- Breadcrumb Start -->
        <div class="breadcrumb-wrap">
            <div class="container-fluid">
                <ul class="breadcrumb">
                    <li class="breadcrumb-item"><a href="http://localhost/home/index">Home</a></li>
                    <li class="breadcrumb-item active">Login & Register</li>
                </ul>
            </div>
        </div>
        <!-- Breadcrumb End -->
        
        <!-- Login Start -->
        <form id="loginForm" method="post" action="/home/login">
        <div class="login">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-6">
                        <div class="login-form">
                            <div class="row">
                                <div class="col-md-6">
									<label>ID</label> 
									<input class="form-control" type="text" id="memberId" name="username" placeholder="id">
								</div>
								<div class="col-md-6">
									<label>Password</label> 
									<input class="form-control"	type="password" id="password" name="password" placeholder="Password">
								</div>
								<div class="col-md-12">
									<div class="custom-control custom-checkbox">
										<input type="checkbox" name="remember-me" >자동로그인
									</div>
								</div>
								<div class="col-md-12">
									<input type="submit" id="btn_submit" class="btn" value="Login">
								</div>
								<div class="hidden-value">
									<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
								</div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        	</form>
		<!-- Login End -->
        
        
<script src="https://developers.kakao.com/sdk/js/kakao.js"></script>
<script>
var msg="${msg}"
if(msg != ""){alert(msg);}

/*
window.Kakao.init("4b05fd2d74e9a888964b8cb8e9cfcbb6");

function kakaoLogin(){
	window.Kakao.Auth.login({
		scope:'profile, account_email, gender, birthday',
		success:function(authObj){
			console.log(authObj);
			window.Kakao.API.request({
				url:'/v2/user/me',
				success:res=>{
					const kakao_account=res.kakao_account;
					console.log(kakao_account);
				}
			});
		}
});
}
*/
</script>   
        
	<%@include file="../include/footer.jsp" %>
    </body>
</html>
