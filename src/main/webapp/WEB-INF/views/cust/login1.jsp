<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../include/header.jsp" %>
        
        <!-- Breadcrumb Start -->
        <div class="breadcrumb-wrap">
            <div class="container-fluid">
                <ul class="breadcrumb">
                    <li class="breadcrumb-item active">Login</li>
                </ul>
            </div>
        </div>
        <!-- Breadcrumb End -->
        
        <!-- Login Start -->
        <div class="login" >
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-6">    
                        <div class="login-form">
                            <div class="row">
                                <div class="col-md-6">
                                    <label>Id</label>
                                    <input class="form-control" type="text" id="memberId" name="memberId" placeholder="id">
                                </div>
                                <div class="col-md-6">
                                    <label>Password</label>
                                    <input class="form-control" type="password" id="password" name="password" placeholder="Password">
                                </div>
                                <div class="col-md-12">
                                    <div class="custom-control custom-checkbox">
                                        <input type="checkbox" class="custom-control-input" id="newaccount">
                                        <label class="custom-control-label" for="newaccount">자동로그인</label>
                                    </div>
                                </div>
                                <div class="col-md-12">
                                    <button id="btn_submit" class="btn">Login</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Login End -->
        
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>	
<script type="text/javascript" src="/resources/cust/custRest.js?v=<%=System.currentTimeMillis() %>"></script>
<script>

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
	custRest.getCustLogin(
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



</script>
    
<%@include file="../include/footer.jsp" %>        

