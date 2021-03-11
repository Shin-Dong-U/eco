<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>E Store - eCommerce HTML Template</title>
<meta content="width=device-width, initial-scale=1.0" name="viewport">
<meta content="eCommerce HTML Template Free Download" name="keywords">
<meta content="eCommerce HTML Template Free Download" name="description">

<!-- Favicon -->
<link href="/resources/template/img/favicon.ico" rel="icon">

<!-- Google Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=Open+Sans:300,400|Source+Code+Pro:700,900&display=swap"
	rel="stylesheet">

<!-- CSS Libraries -->
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css"
	rel="stylesheet">
<link href="/resources/template/lib/slick/slick.css" rel="stylesheet">
<link href="/resources/template/lib/slick/slick-theme.css"
	rel="stylesheet">

<!-- Template Stylesheet -->
<link href="/resources/template/css/style.css" rel="stylesheet">

<!-- JavaScript Libraries -->
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
<script src="/resources/template/lib/easing/easing.min.js"></script>
<script src="/resources/template/lib/slick/slick.min.js"></script>

<!-- Template Javascript -->
<script src="/resources/template/js/main.js"></script>

</head>

<body>

<!-- Top bar Start -->
<div class="top-bar">
	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-6">
				<i class="fa fa-envelope"></i> support@email.com
			</div>
			<div class="col-sm-6">
				<i class="fa fa-phone-alt"></i> +012-345-6789
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
			<button type="button" class="navbar-toggler" data-toggle="collapse"
				data-target="#navbarCollapse">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse justify-content-between"
				id="navbarCollapse">
				<div class="navbar-nav mr-auto">
					<a href="index.html" class="nav-item nav-link">Home</a> <a
						href="product-list.html" class="nav-item nav-link">Products</a> <a
						href="product-detail.html" class="nav-item nav-link">Product
						Detail</a> <a href="cart.html" class="nav-item nav-link">Cart</a> <a
						href="checkout.html" class="nav-item nav-link">Checkout</a> <a
						href="my-account.html" class="nav-item nav-link active">My
						Account</a>
					<div class="nav-item dropdown">
						<a href="" class="nav-link dropdown-toggle"
							data-toggle="dropdown">More Pages</a>
						<div class="dropdown-menu">
							<a href="wishlist.html" class="dropdown-item">Wishlist</a> <a
								href="login.html" class="dropdown-item">Login & Register</a> <a
								href="contact.html" class="dropdown-item">Contact Us</a>
						</div>
					</div>
				</div>
				<div class="navbar-nav ml-auto">
					<div class="nav-item dropdown">
						<a href="" class="nav-link dropdown-toggle"
							data-toggle="dropdown">User Account</a>
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
						<img src="/resources/template/img/logo.png" alt="Logo">\
					</a>
				</div>
			</div>
			<div class="col-md-6">
				<div class="search">
					<input type="text" placeholder="Search">
					<button> <i class="fa fa-search"></i> </button>
				</div>
			</div>
			<div class="col-md-3">
				<div class="user">
					<a href="wishlist.html" class="btn wishlist"> <i
						class="fa fa-heart"></i> <span>(0)</span>
					</a> <a href="cart.html" class="btn cart"> <i
						class="fa fa-shopping-cart"></i> <span>(0)</span>
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
			<li class="breadcrumb-item active">My Account</li>
		</ul>
	</div>
</div>
<!-- Breadcrumb End -->

<!-- My Account Start -->
<div class="my-account">
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-3">
				<div class="nav flex-column nav-pills" role="tablist"
					aria-orientation="vertical">
					<a class="nav-link active" id="dashboard-nav" data-toggle="pill" href="#dashboard-tab" role="tab">
						<i class="fa fa-tachometer-alt"></i>Dashboard
					</a> 
					<a class="nav-link" id="orders-nav" data-toggle="pill" href="#orders-tab" role="tab">
						<i class="fa fa-shopping-bag"></i>Orders
					</a> 
					<a class="nav-link" id="payment-nav" data-toggle="pill" href="#payment-tab" role="tab">
						<i class="fa fa-credit-card"></i>Payment Method
					</a> 
					<a class="nav-link" id="address-nav" data-toggle="pill" href="#address-tab" role="tab">
						<i class="fa fa-map-marker-alt"></i>address
					</a>
					<a class="nav-link" id="account-nav" data-toggle="pill" href="#account-tab" role="tab"><!-- #account-tab은 id account-tab을 찾아간다. -->
						<i class="fa fa-user"></i>Account Details
					</a>
					<a class="nav-link" href="index.html">
						<i class="fa fa-sign-out-alt"></i>Logout
					</a>
				</div>
			</div>
			<div class="col-md-9">
				<div class="tab-content">
<!-- DashBorad -->
					<div class="tab-pane fade show active" id="dashboard-tab" role="tabpanel" aria-labelledby="dashboard-nav">
					<h4>Dashboard</h4>
						<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
							In condimentum quam ac mi viverra dictum. In efficitur ipsum
							diam, at dignissim lorem tempor in. Vivamus tempor hendrerit
							finibus. Nulla tristique viverra nisl, sit amet bibendum ante
							suscipit non. Praesent in faucibus tellus, sed gravida lacus.
							Vivamus eu diam eros. Aliquam et sapien eget arcu rhoncus
							scelerisque.</p>
					</div>
<!-- Order -->
					<div class="tab-pane fade" id="orders-tab" role="tabpanel" aria-labelledby="orders-nav">
						<div class="table-responsive">
							<table class="table table-bordered">
								<thead class="thead-dark">
									<tr>
										<th>No</th>
										<th>Product</th>
										<th>Date</th>
										<th>Price</th>
										<th>Status</th>
										<th>Action</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>1</td>
										<td>Product Name</td>
										<td>01 Jan 2020</td>
										<td>$99</td>
										<td>Approved</td>
										<td><button class="btn">View</button></td>
									</tr>
									<tr>
										<td>2</td>
										<td>Product Name</td>
										<td>01 Jan 2020</td>
										<td>$99</td>
										<td>Approved</td>
										<td><button class="btn">View</button></td>
									</tr>
									<tr>
										<td>3</td>
										<td>Product Name</td>
										<td>01 Jan 2020</td>
										<td>$99</td>
										<td>Approved</td>
										<td><button class="btn">View</button></td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
					
<!-- payment Methode -->
					<div class="tab-pane fade" id="payment-tab" role="tabpanel"
						aria-labelledby="payment-nav">
						<h4>Payment Method</h4>
						<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
							In condimentum quam ac mi viverra dictum. In efficitur ipsum
							diam, at dignissim lorem tempor in. Vivamus tempor hendrerit
							finibus. Nulla tristique viverra nisl, sit amet bibendum ante
							suscipit non. Praesent in faucibus tellus, sed gravida lacus.
							Vivamus eu diam eros. Aliquam et sapien eget arcu rhoncus
							scelerisque.</p>
					</div>
					
<!-- Address -->
					<div class="tab-pane fade" id="address-tab" role="tabpanel"
						aria-labelledby="address-nav">
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
					
<!-- Account Detail -->
					<div class="tab-pane fade" id="account-tab" role="tabpanel" aria-labelledby="account-nav">
						<h4> My Account Details</h4>
						<div style="border:1px solid gray;" class="row" id="account_chat">


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
							</div>	
							<div class="col-md-6">	
								<input class="form-control" type="text" id="addr_city_new" 	name="addr_city" 	placeholder="New address system">
								<input class="form-control" type="text" id="addr_city_old" 	name="addr_city_O" 	placeholder="Parcel address system">
								<input class="form-control" type="text" id="addr_detail" 	name="addr_detail" 	placeholder="detail address system">
								<span id="guide" style="color:#999;display:none"></span>
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
							<div class="col-md-6">
								<label>Birth</label>
								<input class="form-control" type="date" id="brith" name="birth" placeholder="Birth">	<!-- value="날짜" 초기값 설정 -->
							</div>
													
							<!-- Company_yn 이  y일경우 -->
							<h3>COMPANY CONTEXT</h3>
							<div id="company_addDiv" style="display:none;">
								<div class="col-md-6">
									<label>Company Name</label> 
									<input class="form-control" type="text" id="comp_name" name="comp_name"  placeholder="Company name" >
								</div>
								<div class="col-md-6">
									<label>Company Corporate Number</label> 
									<input class="form-control" type="text" id="corp_num" name="corp_num"  placeholder="Corporate number">
								</div>
							</div><!-- ./company_addDiv -->
						</div><!-- ./row -->
					</div><!--  -->
				</div><!--  -->
			</div><!--  -->
		</div><!--  -->
	</div><!--  -->
</div><!--  -->


<c:choose>
	<c:when test="${memberVO['custVO'].sex == 1}"><c:out value="남자" /></c:when>
	<c:otherwise><c:out value="여자" /></c:otherwise>
</c:choose>



<!-- My Account End -->
<script src="/resources/home/customer.js?v=<%=System.currentTimeMillis() %>"></script>
<script>
var memId="compF";
$("#account-nav").on("click", function(){
	alert("id는? "+memId);
	
	customer.getCust(
		memId,
		function(memberVO){
			console.log(memberVO['custVO'].memberId);
			if(memberVO["custVO"].sex == 1){var sex="남자"}else{var sex="여자"}
			str="";
			str	+='<div class="col-md-6">'
				+ '	<label>ID</label>'
				+ '	<input class="form-control" type="text" id="memberId" name="memberId" value='+memberVO["custVO"].memberId+'>'
				+ '</div>'
//비밀번호 
//				+ '<div class="col-md-6">'
//				+ '	<label>Password</label>'
//				+ '	<input class="form-control" type="password" id="password" name="password" value='+memberVO["custVO"].password+'>'
//				+ '</div>'
				+ '<div class="col-md-6">'
				+ '	<label>Name</label>'
				+ '	<input class="form-control" type="text" id="name" name="name" value='+memberVO["custVO"].name+'>'
				+ '</div>'
				+ '<div class="col-md-6">'
				+ '	<label>Phone Number</label>'
				+ '	<input class="form-control" type="text" id="name" name="phone" value='+memberVO["custVO"].phone+'>'
				+ '</div>'
				+ '<div class="col-md-6">'
				+ '	<label>Email</label>'
				+ '	<input class="form-control" type="text" id="email" name="email" value='+memberVO["custVO"].email+'>'
				+ '</div>'
				+ '<div class="col-md-6">'
				+ '	<label>Address</label>'
				+ '	<input class="form-control" type="text" id="addr_post" name="addr_post" value='+memberVO["custVO"].addr_post+'>'
				//버튼 생성
				+ '	<input class="form-control" type="text" id="addr_city" name="addr_city" value='+memberVO["custVO"].addr_city+'>'
				+ '	<input class="form-control" type="text" id="addr_detail" name="addr_detail" value='+memberVO["custVO"].addr_detail+'>'
				+ '	<span id="guide" style="color:#999display:none"></span>'
				+ '</div>'
				+ '<div class="col-md-6">'
				+ '	<label>Birth</label>'
				+ '	<input class="form-control" type="text" id="birth" name="birth" value='+memberVO["custVO"].birth+'>'
				+ '</div>'	
				+ '<div class="col-md-6">'
				+ '	<label>Sex</label>'
				+ '	<input class="form-control" type="text" id="sex" name="sex" value='+sex+'>'
				+ '</div>';

			if(memberVO["custVO"].company_yn == "Y"){
				str +='<div class="row">'
					+ '	<div class="col-md-12"><h4>COMPANY CONTEXT</h4></div>'
					+ '		<div class="col-md-6">'
					+ '			<label>Company Name</label> '
					+ '			<input class="form-control" type="text" id="comp_name" name="comp_name"  placeholder="Company name" >'
					+ '		</div>'
					+ '		<div class="col-md-6">'
					+ '			<label>Company Corporate Number</label> '
					+ '			<input class="form-control" type="text" id="corp_num" name="corp_num"  placeholder="Corporate number">'
					+ '		</div>'
					+ '	<div class="col-md-6">'
					+ '		<label>Address</label>'
					+ '		<input class="form-control" type="text" id="addr_post" name="addr_post" value='+memberVO["custVO"].addr_post+'>'
					//버튼 생성
					+ '		<input class="form-control" type="text" id="addr_city" name="addr_city" value='+memberVO["custVO"].addr_city+'>'
					+ '		<input class="form-control" type="text" id="addr_detail" name="addr_detail" value='+memberVO["custVO"].addr_detail+'>'
					+ '		<span id="guide" style="color:#999display:none"></span>'
					+ '	</div>'
					+ '</div>'
			}	

			$("#account_chat").html("");
			$("#account_chat").html(str);
		}
		
	);
});

</script>

<%@include file="../include/footer.jsp" %>