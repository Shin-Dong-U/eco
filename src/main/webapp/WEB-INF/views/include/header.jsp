<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>

<html lang="kr">
    <head>
        <meta charset="utf-8">
        <title>ECO FRIENDS</title>
        <meta content="width=device-width, initial-scale=1.0" name="viewport">
        <meta content="eCommerce HTML Template Free Download" name="keywords">
        <meta content="eCommerce HTML Template Free Download" name="description">

        <!-- Favicon -->
        <link href="/resources/template/img/favicon.ico" rel="icon">
        
        <!--  -->
		<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script> 
		
        <!-- Google Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400|Source+Code+Pro:700,900&display=swap" rel="stylesheet">

        <!-- CSS Libraries -->
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet">
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
        <link href="/resources/template/lib/slick/slick.css" rel="stylesheet">
        <link href="/resources/template/lib/slick/slick-theme.css" rel="stylesheet">

        <!-- Template Stylesheet -->
        <link href="/resources/template/css/style.css" rel="stylesheet">
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
			/* Admin - The Modal (background) */
			.modal {
				display: none; /* Hidden by default */
				position: fixed; /* Stay in place */
				z-index: 1; /* Sit on top */
				left: 0;
				top: 0;
				width: 100%; /* Full width */
				height: 100%; /* Full height */
				overflow: auto; /* Enable scroll if needed */
				background-color: rgb(0, 0, 0); /* Fallback color */
				background-color: rgba(0, 0, 0, 0.4); /* Black w/ opacity */
			}
			/* Admin - Modal Content Box Title */
			.modal-content {
				background-color: #fefefe;
				margin: 15% auto; /* 15% from the top and centered */
				padding: 20px;
				border: 1px solid #888;
				width: 50%; /* Could be more or less, depending on screen size */
			}
			/* Admin - The Close Button */
			.close {
				color: #aaa;
				float: right;
				font-size: 28px;
				font-weight: bold;
			}
			/* Admin -  Modal*/
			.close:hover, .close:focus {
				color: black;
				text-decoration: none;
				cursor: pointer;
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
                        eco_friends@gmail.com
                    </div>
                    <div class="col-sm-6">
                        <i class="fa fa-phone-alt"></i>
                        02-456-7890
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
        <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
         <script src="${contextPath}/resources/basket/basket.js?ver=9"></script>
        <script>
      //카트 상품 갯수 표시
     	 var cust_id = "${memberId}";
     	 console.log("cust_id"+cust_id);

		cartCnt(cust_id);
    	function cartCnt(cust_id) {
    		var cartCount = 0;
    		basketService.countBasketGoods(cust_id,function(result){
    			cartCount="("+result+")";
    			$(".cartCntBtn").text(cartCount);
    		})
    		
    	}
        </script>