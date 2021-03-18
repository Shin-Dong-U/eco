<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>

<html lang="kr">
    <head>
        <meta charset="utf-8">
        <title>ECO FRIENDS</title>
        <meta content="width=device-width, initial-scale=1.0" name="viewport">
        <meta content="eCommerce HTML Template Free Download" name="keywords">
        <meta content="eCommerce HTML Template Free Download" name="description">

        <!-- Favicon -->

        <link href="${contextPath}/resources/template/img/favicon.ico" rel="icon">   
        <!--  -->
		<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script> 
		
        <!-- Google Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400|Source+Code+Pro:700,900&display=swap" rel="stylesheet">

        <!-- CSS Libraries -->
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet">
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">

        <link href="${contextPath}/resources/template/lib/slick/slick.css" rel="stylesheet">
        <link href="${contextPath}/resources/template/lib/slick/slick-theme.css" rel="stylesheet">

        <!-- Template Stylesheet -->
        <link href="${contextPath}/resources/template/css/style.css" rel="stylesheet">

        <style>
			/* Account - Detail */
			#confirm_check {
				display: none
			}
			
			#modify_check {
				display: none
			}
			
			/* Admin - none display */
			#modal_confirm_check {
				display: none
			}
			/* Admin - 사용자 업체 관리자  */
			.userBind {
				display: flex;
			}

	</style>
    </head>

    <body>
        <!-- Top bar Start -->
        <!-- <div class="top-bar">
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
        </div> -->
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
                            <!-- <a href="index.html" class="nav-item nav-link">Home</a> -->
                            
                            <div class="nav-item dropdown">
                            <a href="http://localhost/goods" class="nav-link dropdown-toggle " data-toggle="dropdown" aria-expanded="false">상품</a>
                                <div class="dropdown-menu">
                                    <a href="http://localhost/goods?category=1" class="dropdown-item">식품</a>
                                    <a href="http://localhost/goods?category=2" class="dropdown-item">가구</a>
                                    <a href="http://localhost/goods?category=3" class="dropdown-item">의류</a>
                                    <a href="http://localhost/goods?category=4" class="dropdown-item">생활용품</a>
                                    <a href="http://localhost/goods?category=5" class="dropdown-item">잡화</a>
                                    <a href="http://localhost/goods?category=21" class="dropdown-item">뷰티</a>
                                    <a href="http://localhost/goods?category=22" class="dropdown-item">헬스/건강식품</a>
                                    <a href="http://localhost/goods?category=23" class="dropdown-item">주방용품</a>
                                </div>
                            </div>
                      
  <!-- member5 pw5  -> 인증된 사용자일경우, 들어가게 .... -->    
  <!-- admin1 pw1 -->   
  <!--  http://localhost/cust/account-->                   
                            <a href="http://localhost/orders/basket/list" class="nav-item nav-link">장바구니</a>
                            <a href="http://localhost/cust/my-account" class="nav-item nav-link">내정보보기</a>
                            <div class="nav-item dropdown">
                                <a href="" class="nav-link dropdown-toggle" data-toggle="dropdown">More Pages</a>
                                <div class="dropdown-menu">
                                    <a href="wishlist.html" class="dropdown-item">Wishlist</a>
                                    <a href="login.html" class="dropdown-item">Login & Register</a>
                                    <a href="http://localhost/cust/my-account" class="dropdown-item">마이페이지</a>
                                </div>
                            </div>
                        </div>
                        <div class="navbar-nav ml-auto">
                            <div class="nav-item dropdown">
                                <a href="" class="nav-link dropdown-toggle" data-toggle="dropdown">User Account</a>
                                
                                <div class="dropdown-menu">
									<sec:authorize access="isAnonymous()">
										<a href="/home/login" class="dropdown-item">Login</a>
										<a href="/home/register" class="dropdown-item">Register</a>
									</sec:authorize>
									<sec:authorize access="isAuthenticated()">
										<a href="" class="dropdown-item logoutBtn">Logout</a>
									</sec:authorize>
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
                            <a href="http://localhost/home/index">
                                <img src="/resources/template/img/ecoL.png" alt="Logo">
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
                               <span class="cartCntBtn">(0)</span>
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Bottom Bar End -->


<!-- Bottom Bar End --> 

<!-- Breadcrumb Start -->
<div class="breadcrumb-wrap">
    <div class="container-fluid">
        <ul class="breadcrumb">
            <li class="breadcrumb-item"><a href="">홈</a></li>
            <li class="breadcrumb-item"><a href="">상품목록</a></li>
            <li class="breadcrumb-item active">내 정보</li>
        </ul>
    </div>
</div>
<!-- Breadcrumb End -->

<!-- My Account Start -->
<div class="my-account">
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-3">
                <div class="nav flex-column nav-pills" role="tablist" aria-orientation="vertical">
                    <a class="nav-link active" id="dashboard-nav" data-toggle="pill" href="#dashboard-tab" role="tab"><i class="fa fa-tachometer-alt"></i>Dashboard</a>
        <!--주문목록조회  -->
                    <sec:authorize access="hasAuthority('ROLE_COMPANY')">
                   		<a class="nav-link" id="payment-nav" data-toggle="pill" href="#payment-tab" role="tab"><i class="fa fa-credit-card"></i> 배송정보입력(업체)</a>
					</sec:authorize>
                    <a class="nav-link" id="orders-nav" data-toggle="pill" href="#orders-tab" role="tab"><i class="fa fa-shopping-bag"></i> 주문정보</a>
              
                    <a class="nav-link" id="account-nav" data-toggle="pill" href="#account-tab" role="tab"><i class="fa fa-user"></i> 내정보</a>
                    <sec:authorize access="hasAuthority('ROLE_ADMIN')">

	                    <a class="nav-link" href="http://172.16.5.1:3000/" ><i class="fa fa-map-marker-alt"></i> 차트보기</a>

	                    <a class="nav-link" id="member-nav" data-toggle="pill" href="#member-tab" role="tab"><i class="fa fa-user"></i> 사용자 관리 </a>
                    </sec:authorize>
                    <a class="nav-link logoutBtn"><i class="fa fa-sign-out-alt"></i>Logout</a>
                    <form action="/sample/logout", method="post" class="logoutForm">
                    	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
                    </form>
                </div>
            </div>
            <div class="col-md-9">
                <div class="tab-content">
                    <div class="tab-pane fade show active" id="dashboard-tab" role="tabpanel" aria-labelledby="dashboard-nav">
                        <h4>Dashboard</h4>
                        <p>
                            Lorem ipsum dolor sit amet, consectetur adipiscing elit. In condimentum quam ac mi viverra dictum. In efficitur ipsum diam, at dignissim lorem tempor in. Vivamus tempor hendrerit finibus. Nulla tristique viverra nisl, sit amet bibendum ante suscipit non. Praesent in faucibus tellus, sed gravida lacus. Vivamus eu diam eros. Aliquam et sapien eget arcu rhoncus scelerisque.
                        </p> 
                    </div>
                    <div class="tab-pane fade" id="orders-tab" role="tabpanel" aria-labelledby="orders-nav">
                        <div class="table-responsive">
                            <table class="table table-bordered">
                               <thead class="thead-dark">
                                            <tr>
                                                <th>주문번호</th>
                                                <th>주문일자</th>
                                                <th>총 가격</th>
                                                <th>배송상태</th>
                                                <th>상세보기</th>
                                            </tr>
                                        </thead>
                                        <tbody class="showOrderedInfo">
                                           
                                         
                                        </tbody>
                            </table>
                        </div>
                    </div>
                    <div class="tab-pane fade" id="payment-tab" role="tabpanel" aria-labelledby="payment-nav">
                      <div class="table-responsive">
                                    <table class="table table-bordered">
                                        <thead class="thead-dark">
                                            <tr>
                                                <th>주문번호</th>
                                                <th>주문일자</th>
                                                <th>총 가격</th>
                                                <th>배송상태</th>
                                                <th>배송정보 입력하기</th>
                                            </tr>
                                        </thead>
                                        <tbody class="shipOrderedInfo">
                                           
                                         
                                        </tbody>
                                    </table>
                                </div>
                    </div>
                    <div class="tab-pane fade" id="address-tab" role="tabpanel" aria-labelledby="address-nav">
                        <h4>Address</h4>
                        <div class="row">
                            <div class="col-md-6">
                                <h5>Payment Address</h5>
                                <p>123 Payment Street, Los Angeles, CA</p>
                                <p>Mobile: 012-345-6789</p>
                                <button class="btn">Edit Address</button>
                            </div>
                            <div class="col-md-6">
                                <h5>Shipping Address</h5>
                                <p>123 Shipping Street, Los Angeles, CA</p>
                                <p>Mobile: 012-345-6789</p>
                                <button class="btn">Edit Address</button>
                            </div>
                        </div>
                    </div>
<!-- 내정보 시작 --> 
					<div class="tab-pane fade" id="account-tab" role="tabpanel" aria-labelledby="account-nav">
						<form id="modifyForm" action="" method="post">
							<div id="account_custChat"></div>
							<div id="account_compChat"></div>
							
							<div class=row >
								<div id="modify_check">
									<input type="button" class="btn btn-primary" id="btn_modify" value="Modify" />
								</div>
								<div id="confirm_check">
									<input type="button" class="btn btn-primary" id="btn_modSubmit" value="Submit" />
									<input type="button" class="btn btn-primary" id="btn_remSubmit" value="Remove" />
									<input type="button" class="btn btn-primary" id="btn_modCancel" value="Cancel" />
								</div>
							</div>
						</form>
					</div><!-- ./tab-pane fade -->
<!-- 내정보 끝 --> 
<!-- 관리자 Member -->
					<div class="tab-pane fade" id="member-tab" role="tabpanel"	aria-labelledby="member-tab">
						<div class="table-responsive">
							<div class="col-md-4 userBind">
								<div class="col-md-4 customer" id="customer" > <h4 style="text-align:center"> 사용자 </h4> </div>
								<div class="col-md-4 company" id="company"> <h4 style="text-align:center"> 업체  </h4> </div>
								<div class="col-md-4 admin" id="admin"> <h4 style="text-align:center"> 관리자  </h4> </div>
							</div>

							<div class="col-md-12 chatParent" >
								<div class="col-md-12 member_chat" id="member_chat" ></div><p/>
								<div class="col-md-12" id="pageDiv"> </div><!-- 페이지 번호 -->
								<!-- <table class="table table-bordered"> <tr> <th>No</th> </tr> </table>-->									
							</div><!-- ./col-md-12 -->
						</div>
					</div><!-- ./tab-pane fade -->
					<div class="hiddenParam">
						<input type="hidden" name="pageNum" id="pageNum" value="1"/>
						<input type="hidden" name="custSelect" id="custSelect" value="cust"/>
					</div>
<!-- 관리자 Member -->
                </div>
            </div>
        </div>
    </div>
</div>

<!-- modal 시작 -->
<div class="modal" id="memberManager" tabindex="-1" role="dialog" ria-labelledby="myModalLabel">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header ">
				<h5 class="modal-title">회원 상세 정보</h5>
				<button type="button" class="close" data-dismiss="modal" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-body">
				<div id="detail_chat">

				</div>
			</div>
			<div class="modal-footer">
				<div id="modal_modify_check">		
					<input type="button" class="btn" id="modal_btn_modify" value="수정">
				</div>
				<div id="modal_confirm_check">
					<input type="button" class="btn" id="modal_btn_submit" value="확인">
					<input type="button" class="btn" id="modal_btn_cancel" value="취소">
				</div>
			</div>
		</div>
	</div>
</div>



  <!-- Footer Start -->
        <div class="footer">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-3 col-md-6">
                        <div class="footer-widget">
                            <h2>Get in Touch</h2>
                            <div class="contact-info">
                                <p><i class="fa fa-map-marker"></i>123 E Store, Los Angeles, USA</p>
                                <p><i class="fa fa-envelope"></i>email@example.com</p>
                                <p><i class="fa fa-phone"></i>+123-456-7890</p>
                            </div>
                        </div>
                    </div>
                    
                    <div class="col-lg-3 col-md-6">
                        <div class="footer-widget">
                            <h2>Follow Us</h2>
                            <div class="contact-info">
                                <div class="social">
                                    <a href=""><i class="fab fa-twitter"></i></a>
                                    <a href=""><i class="fab fa-facebook-f"></i></a>
                                    <a href=""><i class="fab fa-linkedin-in"></i></a>
                                    <a href=""><i class="fab fa-instagram"></i></a>
                                    <a href=""><i class="fab fa-youtube"></i></a>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="col-lg-3 col-md-6">
                        <div class="footer-widget">
                            <h2>Company Info</h2>
                            <ul>
                                <li><a href="">About Us</a></li>
                                <li><a href="">Privacy Policy</a></li>
                                <li><a href="">Terms & Condition</a></li>
                            </ul>
                        </div>
                    </div>

                    <div class="col-lg-3 col-md-6">
                        <div class="footer-widget">
                            <h2>Purchase Info</h2>
                            <ul>
                                <li><a href="">Pyament Policy</a></li>
                                <li><a href="">Shipping Policy</a></li>
                                <li><a href="">Return Policy</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
                
                <div class="row payment align-items-center">
                    <div class="col-md-6">
                        <div class="payment-method">
                            <h2>We Accept:</h2>
                            <img src="/resources/template/img/payment-method.png" alt="Payment Method" />
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="payment-security">
                            <h2>Secured By:</h2>
                            <img src="/resources/template/img/godaddy.svg" alt="Payment Security" />
                            <img src="/resources/template/img/norton.svg" alt="Payment Security" />
                            <img src="/resources/template/img/ssl.svg" alt="Payment Security" />
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Footer End -->
        
        <!-- Footer Bottom Start -->
        <div class="footer-bottom">
            <div class="container">
                <div class="row">
                    <div class="col-md-6 copyright">
                        <p>Copyright &copy; <a href="https://htmlcodex.com">HTML Codex</a>. All Rights Reserved</p>
                    </div>

                    <div class="col-md-6 template-by">
                        <p>Template By <a href="https://htmlcodex.com">HTML Codex</a></p>
                    </div>
                </div>
            </div>
        </div>
        <!-- Footer Bottom End -->       
        
        <!-- Back to Top -->
        <a href="" class="back-to-top"><i class="fa fa-chevron-up"></i></a>
        
        <!-- JavaScript Libraries -->
        <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
        <script src="${contextPath}/resources/template/lib/easing/easing.min.js"></script>
        <script src="${contextPath}/resources/template/lib/slick/slick.min.js"></script>
        
        <!-- Template Javascript -->
        <script src="${contextPath}/resources/template/js/main.js"></script>
        
        <!--add JavaScript  -->
        <script src="${contextPath}/resources/order/checkout.js?ver=2"></script>
        <script src="${contextPath}/resources/basket/basket.js?ver=9"></script>
        
        <script type="text/javascript">
        $(document).ready(function(){
        	var cust_id="${memberId}";
        	showOrderedInfo(cust_id);
        	showShipListInfo(cust_id);
        });
        
        /* CSRF 데이터 변수 저장 */
        var csrfHeaderName="${_csrf.headerName}";
        var csrfTokenValue="${_csrf.token}";
        
        //로그아웃
                    
         $(".logoutBtn").on("click",function(){

        	$('.logoutForm').submit();
        	
        })  
       
        
        
        var cust_id="${memberId}";

      //주문 리스트 보기
		function showOrderedInfo(cust_id){		
			checkoutService.getOrderList(cust_id,function(orderedInfoList){
				var showOrderedInfoTable=$(".showOrderedInfo");
				var str="";

				
				for(var i=0,len=orderedInfoList.length||0;i<len;i++){
					var delivery_status= '배송정보';

					switch(Number(orderedInfoList[i].DELIVERY_STATUS)){
					
					case 0:
						delivery_status = '배송전';
						break;
					case 1:
						delivery_status = '배송중';
						break;
					case 2:
						delivery_status = '배송완료';
						break;
					case 3:
						delivery_status = '환불신청';
						break;
					case 4:
						delivery_status = '환불배송중';
						break;				
					case 5:
						delivery_status = '환불배송완료';
						break;
					}
					
					str+="<tr>"
						+"	<td>"+orderedInfoList[i].ORDER_SEQ+"</td>"
						+"	<td>"+orderedInfoList[i].REGDATE+"</td>"
                        +"	<td>"+Number(orderedInfoList[i].TOTAL_PRICE)+"</td>"
                        +"	<td>"+delivery_status+"</td>"
                        +"	<td><button class='btn'><a href='/orders/order/orderCheck?order_seq="+orderedInfoList[i].ORDER_SEQ+"'>View</a></button></td>"
                        +"</tr>"
				}
				showOrderedInfoTable.html(str);
			})
		}
      
		 //주문 리스트 보기(업체)
		function showShipListInfo(cust_id){		
			checkoutService.getOrderList(cust_id,function(orderedInfoList){
				var shipOrderedInfoTable=$(".shipOrderedInfo");
				var str="";

				for(var i=0,len=orderedInfoList.length||0;i<len;i++){
					var delivery_status= '배송정보';

					switch(Number(orderedInfoList[i].DELIVERY_STATUS)){
					
					case 0:
						delivery_status = '배송전';
						break;
					case 1:
						delivery_status = '배송중';
						break;
					case 2:
						delivery_status = '배송완료';
						break;
					case 3:
						delivery_status = '환불신청';
						break;
					case 4:
						delivery_status = '환불배송중';
						break;				
					case 5:
						delivery_status = '환불배송완료';
						break;
					}
					
					str+="<tr>"
						+"	<td>"+orderedInfoList[i].ORDER_SEQ+"</td>"
						+"	<td>"+orderedInfoList[i].REGDATE+"</td>"
                        +"	<td>"+Number(orderedInfoList[i].TOTAL_PRICE)+"</td>"
                        +"	<td>"+delivery_status+"</td>"
                        +"	<td><button class='btn'><a href='/orders/ship/writeShipInfo?order_seq="+orderedInfoList[i].ORDER_SEQ+"'>배송정보 입력</a></button></td>"
                        +"</tr>"
				}
				shipOrderedInfoTable.html(str);
			})
		}
        
        </script>
        
<!-- Admin Member -->
<%----%>
<script type="text/javascript" src="/resources/js/common/common.js?v=<%=System.currentTimeMillis() %>"></script>
<script type="text/javascript" src="/resources/basket/transferTime.js?v=<%=System.currentTimeMillis() %>"></script> 
<script type="text/javascript" src="/resources/admin/adminRest.js?v=<%=System.currentTimeMillis() %>"></script>
<script type="text/javascript" src="/resources/admin/adminHtml.js?v=<%=System.currentTimeMillis() %>"></script>
<script>
/* CSRF 데이터 변수 저장 */
var csrfHeaderName="${_csrf.headerName}";
var csrfTokenValue="${_csrf.token}";

/* session에 저장된 로그인된 아이디 */
//var loginId="${memberId}";
var loginId="${memberId}";

/* 스타일 변경 */
function styleUpdate(divBtn){
	if(divBtn==1){
		$(".customer").css("background","#ABF200"); 
		$(".company").css("background",""); 
		$(".admin").css("background",""); 
	}else if(divBtn==2){
		$(".customer").css("background",""); 
		$(".company").css("background","#ABF200"); 
		$(".admin").css("background",""); 
	}else if(divBtn==3){
		$(".customer").css("background",""); 
		$(".company").css("background",""); 
		$(".admin").css("background","#ABF200"); 
	}
	$(".chatParent").css("border","1px solid #90c62b"); 
}

/* 페이징 처리 */
function movePage(pageNum){
	selectedPage(pageNum);	//common.js
	custSelect = $("#custSelect").val();
	custAjax(custSelect, pageNum);
}

/* 관리자 클릭 클릭시 */
$("#member-nav").on("click", function(){
	/* 스타일 변경 */
	styleUpdate(1);
	$("#custSelect").val("cust");
	movePage(1);
	
});

/* 사용자 클릭시 */
$(".customer").on("click", function(){
	/* 스타일 변경 */
	styleUpdate(1);
	$("#custSelect").val("cust");
	movePage(1);
	
});

/* ajax실행  */
function custAjax(custSelect, pageNum){
	var check ="";
	
	if(custSelect=="cust"){
		check=1;
		adminRest.getCustList(
			pageNum,
			function(list){
				showBasic(check,list);
		});//end adminRest
	}else if(custSelect=="comp"){
		check=2;
		adminRest.getCompanyList(
			pageNum,
			function(list){
				showBasic(check,list);
		});//end adminRest
	}else if(custSelect=="admin"){
		check=3;
		adminRest.getAdminList(
			pageNum,
			function(list){
				showBasic(check,list);
		});//end adminRest
	}
}


/* 업체 클릭시 */
$(".company").on("click", function(){
	/* 스타일 변경 */
	styleUpdate(2);
	$("#custSelect").val("comp");
	movePage(1);
});

/* 관리자 클릭시 */
$(".admin").on("click", function(){
	/* 스타일 변경 */
	styleUpdate(3);
	$("#custSelect").val("admin");
	movePage(1);
});


/* 상세보기 */
$(".member_chat").on("click", ".btn_modDetail", function(){
    //var button = $(this).css({"border": "2px solid blue"});
	//var memberId = $(this).parent().parent().find("span").css({"border": "2px solid yellow"});
	var memberId = $(this).parent().parent().find("span").text();
	//alert(memberId);

	checkModal(memberId);
	//display
	document.getElementById("modal_confirm_check").style.display = "none";
	document.getElementById("modal_modify_check").style.display = "block";
	
	//document.getElementById("memberManager").style.display="none";
});

/* 관리자 위임  */
$(".member_chat").on("click",".btn_upAdmin", function(){
	var memberId=$(this).parent().parent().find("span").text();
	var adminVO={
		"cust_id":memberId,
		"acc_level":3
	}
	//alert("성공?"+JSON.stringify(adminVO));
	adminRest.confirmAdmin(
		adminVO, 
		loginId,
		csrf={"csrfHeaderName":csrfHeaderName,
			  "csrfTokenValue":csrfTokenValue},
		function(data){
			var pageNum=$("#pageNum").val();
			movePage(pageNum);	
		}
	);
});

/* 업체 승인 */
$(".member_chat").on("click",".btn_confirmComp", function(){
	var memberId = $(this).parent().parent().find("span").text();
	//alert("memberId: "+memberId);
	//alert("loginId: "+loginId);
	
	adminRest.confirmCompany(
		memberId, loginId,
		csrf={
			"csrfHeaderName":csrfHeaderName,
			"csrfTokenValue":csrfTokenValue
		},
		function(data){
			var pageNum=$("#pageNum").val();
			movePage(pageNum);
		}
	);
});


/* 모달 생성 */
function checkModal(memberId){
	adminRest.getCust(
		memberId,
		function(memberVO){

			showDetail(memberVO);
		}
	);
	
	document.getElementById("memberManager").style.display="block";
}

/* 모달 닫기 */
$(".close").on("click",function(){
	
	//display
	document.getElementById("modal_confirm_check").style.display = "none";
	document.getElementById("modal_modify_check").style.display = "block";
	
	document.getElementById("memberManager").style.display="none";
});

/* 모달 수정 버튼  */
$("#modal_btn_modify").on("click",function(){
    //var button = $(this).css({"border": "2px solid blue"});
	//var memberId = $(this).parent().parent().find("span").css({"border": "2px solid yellow"});
	
	//var memberId1 = $(this).parent().parent().parent().children().next().find("span").css({"border": "2px solid yellow"});
	var memberId = $(this).parent().parent().parent().children().next().find("span").text();
	//alert("id값: "+memberId);

	adminRest.getCust(
		memberId,
		function(memberVO){

			showDetail_modify(memberVO);
		}
	);
	
	//display
	document.getElementById("modal_confirm_check").style.display = "block";
	document.getElementById("modal_modify_check").style.display = "none";
	
});

/* 모달 완료 버튼  */
$("#modal_btn_submit").on("click",function(){

	memberId=$(this).parent().parent().parent().children().children().find("#memberId").val();
	alert(memberId);
	$(this).parent().parent().parent().children().children().find("#memberId").css({"border": "2px solid blue"});
	var $form=$(this).parent().parent().parent().children().children();
	var birth=$form.find("#birth").val();
	birth=birth.replace("-","")
	var birth_int= parseInt(birth.replace("-",""));
	//alert(birth_int);
	

	var acc_level=$form.find('input[name="acc_level_check"]:checked').val();
	var member_yn=$form.find('input[name="member_check"]:checked').val();
	var sex=$form.find('input[name="sex_check"]:checked').val();
	//alert(sex);

	var custVO = {
		"memberId" : memberId,
		"password" : $form.find("#password").val(),
		"email" : $form.find("#email").val(),
		"birth" : birth_int,
		"member_yn":member_yn,
		"sex":sex
	};
	
	var compVO = {
		"cust_id" : memberId,
		"comp_name" : $form.find("#comp_name").val(),
		"corp_num" : $form.find("#corp_num").val(),
	};
	
	var adminVO = {
		"cust_id" : memberId,
		"acc_level" :acc_level,
	};
	
	//alert(memberId);
	//alert(loginId);
	adminRest.modAdmin(
		memberVO={custVO:custVO, compVO:compVO, adminVO:adminVO}, loginId,
		csrf={
			"csrfHeaderName":csrfHeaderName,
			"csrfTokenValue":csrfTokenValue
		},
		function(data){
			var pageNum=$("#pageNum").val();
			movePage(pageNum);
		}
	);
	
	//display
	document.getElementById("modal_confirm_check").style.display = "none";
	document.getElementById("modal_modify_check").style.display = "block";
	
	document.getElementById("memberManager").style.display="none";
});

/* 모달 취소 버튼  */
$("#modal_btn_cancel").on("click",function(){
	memberId=$("#memberId").val();

	adminRest.getCust(
			memberId,
			function(memberVO){

				showDetail(memberVO);
			}
		);
	//display
	document.getElementById("modal_confirm_check").style.display = "none";
	document.getElementById("modal_modify_check").style.display = "block";
});


/* 모달 생성 */
function checkModal(memberId){
	adminRest.getCust(
		memberId,
		function(memberVO){

			showDetail(memberVO);
		}
	);
	
	document.getElementById("memberManager").style.display="block";
}



</script>






<!-- My Account -->
<script src="/resources/cust/customer.js?v=<%=System.currentTimeMillis() %>"></script>
<script src="/resources/cust/custHtml.js?v=<%=System.currentTimeMillis() %>"></script>
<script>
/* CSRF 데이터 변수 저장 */
var csrfHeaderName="${_csrf.headerName}";
var csrfTokenValue="${_csrf.token}";

console.log("csrfHeaderName: "+ csrfHeaderName) ;

var modify_value= $("#modify_value").val;
var memId="${memberId}";

/* 비밀번호 체크 html 생성 */
$("#account-nav").on("click", function(){
	//alert("id는? "+memId);
	$("#account_custChat").html("");
	$("#account_compChat").html("");
 	document.getElementById("confirm_check").style.display="none";
 	document.getElementById("modify_check").style.display="none";
	
	str="";
	str +='<h5>비밀번호 확인</h5>'
		+ '	<div class="row" id="cust_detailChat">'
		+ '		<div class="col-md-6">'
		+ '			<label>Password</label>'
		+ '			<input class="form-control" type="text" id="password" name="password">'
		+ '		</div>'
		+ '		<div class="col-md-6">'
		+ '			<label>　</label>'
		+ '			<input type="button" class="form-control btn btn-primary" id="btn_check" value="submit">'
		+ '		</div>'
		+ '	</div>';

	
	$("#account_custChat").html(str);
});

/* 비밀번호 확인 */
$("#account_custChat").on("click","#btn_check", function(e){
	e.preventDefault();
	var custVO={memberId:memId, password:$("#password").val()} ;
	var csrf={csrfHeaderName:csrfHeaderName, csrfTokenValue:csrfTokenValue};
	customer.passwordCheck(
		custVO,	
		csrf,
		function(data){
			if(data=="success"){
				get_chat();
			 	document.getElementById("modify_check").style.display="block";
			}
		},
		function(){alert("비밀번호가 일치하지 않습니다.");}
	);

});



/* 수정 버튼 선택시 수정  */
$("#btn_modify").on("click", function(){
	//display
 	document.getElementById("confirm_check").style.display="block";
 	document.getElementById("modify_check").style.display="none";
 	
 	modify_chat();
});


/* 취소버튼 클릭시 */
$("#btn_modCancel").on("click", function(){
	//display
 	document.getElementById("confirm_check").style.display="none";
 	document.getElementById("modify_check").style.display="block";
 	
 	get_chat();
});

/* 완료버튼 클릭시 */
$("#btn_modSubmit").on("click", function(){
	
	var company_yn=$("#company_yn").val();
	var password_old=$("#password_new").val();
	$("#password").val(password_old);
	
	//var company_yn1=document.getElementById("company_yn");
	
	//alert("company_yn: "+company_yn);
	//alert("company_yn: "+company_yn1);
	
	var custVO = {
		"company_yn" : company_yn,
//		"memberId" : $("#memberId").val(),
		"memberId" : memId,
		"password" : $("#password").val(),
		"name" : $("#name").val(),
		"phone" : $("#phone").val(),
		"addr_post" : $("#addr_post").val(),
		"addr_city" : $("#addr_city_new1").val(),
		"addr_detail" : $("#addr_detail1").val(),
	};


	customer.modifyMember(
		custVO, 
		csrf = {
			"csrfHeaderName" : csrfHeaderName,
			"csrfTokenValue" : csrfTokenValue
		}, 
		function(data) {
			if(data=="success"){get_chat();}
		}
	);

	//display
	document.getElementById("confirm_check").style.display = "none";
	document.getElementById("modify_check").style.display = "block";

	get_chat();
});



/* 삭제버튼 클릭시 */
$("#btn_remSubmit").on("click", function(){

var confirmflag = confirm("정말로 삭제하시겠습니까?");
	if (confirmflag == true) {
		//alert("완료되었나요?");
		customer.deleteMember(memId, 
		csrf = {
				"csrfHeaderName" : csrfHeaderName,
				"csrfTokenValue" : csrfTokenValue
		}, 
		function(data) {
			if (data == "success") {
				//alert(data);	
			}
		});
		
		//display
		document.getElementById("confirm_check").style.display = "none";
		document.getElementById("modify_check").style.display = "block";
		/* 로그아웃 설정 */
	}
});
</script>


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
            document.getElementById("addr_city_new1").value = roadAddr;
            document.getElementById("addr_city_old1").value = data.jibunAddress;
            
            var guideTextBox = document.getElementById("guide");
            // 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.
            //if(data.autoRoadAddress) {
            //    var expRoadAddr = data.autoRoadAddress + extraRoadAddr;
            //    guideTextBox.innerHTML = '(예상 도로명 주소 : ' + expRoadAddr + ')';
            //    guideTextBox.style.display = 'block';
            //
            //} else if(data.autoJibunAddress) {
            //    var expJibunAddr = data.autoJibunAddress;
            //    guideTextBox.innerHTML = '(예상 지번 주소 : ' + expJibunAddr + ')';
            //    guideTextBox.style.display = 'block';
            //} else {
            //    guideTextBox.innerHTML = '';
            //    guideTextBox.style.display = 'none';
            //}
        }
    }).open();
}
</script>
        
<script>
$(".logoutBtn").on("click",function(e){
	e.preventDefault();
      	console.log("로그아웃");
      	$('.logoutForm').submit();
      	
});
 </script>
        
        <!--Start of Tawk.to Script-->
			<script type="text/javascript">
				var Tawk_API=Tawk_API||{}, Tawk_LoadStart=new Date();
				(function(){
				var s1=document.createElement("script"),s0=document.getElementsByTagName("script")[0];
					s1.async=true;
					s1.src='https://embed.tawk.to/6051161bf7ce18270930c865/1f0ubsnki';
					s1.charset='UTF-8';
					s1.setAttribute('crossorigin','*');
					s0.parentNode.insertBefore(s1,s0);
				})();
			</script>
		<!--End of Tawk.to Script-->
        
        
        
    </body>
</html>