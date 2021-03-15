<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400|Source+Code+Pro:700,900&display=swap" rel="stylesheet">

        <!-- CSS Libraries -->
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet">
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
        <link href="/resources/template/lib/slick/slick.css" rel="stylesheet">
        <link href="/resources/template/lib/slick/slick-theme.css" rel="stylesheet">

        <!-- Template Stylesheet -->
        <link href="/resources/template/css/style.css" rel="stylesheet">
        
        <style>
         .bindGoods{
         	width:100%;
         }
         .optionBind{
         	display:flex;
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
                            <a href="product-detail.html" class="nav-item nav-link active">Product Detail</a>
                            <a href="cart.html" class="nav-item nav-link">Cart</a>
                            <a href="checkout.html" class="nav-item nav-link">Checkout</a>
                            <a href="my-account.html" class="nav-item nav-link">My Account</a>
                            <div class="nav-item dropdown">
                                <a href="" class="nav-link dropdown-toggle" data-toggle="dropdown">More Pages</a>
                                <div class="dropdown-menu">
                                    <a href="wishlist.html" class="dropdown-item">Wishlist</a>
                                    <a href="login.html" class="dropdown-item">Login & Register</a>
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
                    <li class="breadcrumb-item active">Product Detail</li>
                </ul>
            </div>
        </div>
        <!-- Breadcrumb End -->
        
           <!-- Product List Start -->
        <div class="product-view">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-12">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="product-view-top">
                                    <div class="row">
                                        <div class="col-md-4">
                                            <div class="product-search">
                                                <input type="email" value="Search">
                                                <button><i class="fa fa-search"></i></button>
                                            </div>
                                        </div>
                                        <div class="col-md-4">
                                            <div class="product-short">
                                                <div class="dropdown">
                                                    <div class="dropdown-toggle" data-toggle="dropdown">Product short by</div>
                                                    <div class="dropdown-menu dropdown-menu-right">
                                                        <a href="#" class="dropdown-item">Newest</a>
                                                        <a href="#" class="dropdown-item">Popular</a>
                                                        <a href="#" class="dropdown-item">Most sale</a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-4">
                                            <div class="product-price-range">
                                                <div class="dropdown">
                                                    <div class="dropdown-toggle" data-toggle="dropdown">Product price range</div>
                                                    <div class="dropdown-menu dropdown-menu-right">
                                                        <a href="#" class="dropdown-item">$0 to $50</a>
                                                        <a href="#" class="dropdown-item">$51 to $100</a>
                                                        <a href="#" class="dropdown-item">$101 to $150</a>
                                                        <a href="#" class="dropdown-item">$151 to $200</a>
                                                        <a href="#" class="dropdown-item">$201 to $250</a>
                                                        <a href="#" class="dropdown-item">$251 to $300</a>
                                                        <a href="#" class="dropdown-item">$301 to $350</a>
                                                        <a href="#" class="dropdown-item">$351 to $400</a>
                                                        <a href="#" class="dropdown-item">$401 to $450</a>
                                                        <a href="#" class="dropdown-item">$451 to $500</a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
         <!-- Product List Start End -->
        
        
        <!-- Product Detail Start -->
        <div class="product-detail">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12 bindGoods" >
                        <div class="product-detail-top">
                            <div class="row align-items-center">
                                <div class="col-md-5">
	                                <div class="product-slider-single normal-slider">
	                                        <img src="/resources/image/5shoes.jpg" alt="Product Image">
	                                        <img src="/resources/image/5_shoes_black.jpg" alt="Product Image">
	                                        <img src="/resources/image/5_shoes_black2.jpg" alt="Product Image">
	                                        <img src="/resources/image/5_shoes_black3.jpg" alt="Product Image">
	                                        <img src="/resources/image/5_shoes_white.jpg" alt="Product Image">
	                                        <img src="/resources/image/5_shoes_white1.jpg" alt="Product Image">
	                                        <img src="/resources/image/5_shoes_white2.jpg" alt="Product Image">
	                                        <img src="/resources/image/5_shoes_white3.jpg" alt="Product Image">
	                                 </div>
	                                  <div class="product-slider-single-nav normal-slider">
                                        <div class="slider-nav-img"><img src="/resources/image/5shoes.jpg" alt="Product Image"></div>
                                        <div class="slider-nav-img"><img src="/resources/image/5_shoes_black.jpg" alt="Product Image"></div>
                                        <div class="slider-nav-img"><img src="/resources/image/5_shoes_black2.jpg" alt="Product Image"></div>
                                        <div class="slider-nav-img"><img src="/resources/image/5_shoes_black3.jpg" alt="Product Image"></div>
                                        <div class="slider-nav-img"><img src="/resources/image/5_shoes_white.jpg" alt="Product Image"></div>
                                        <div class="slider-nav-img"><img src="/resources/image/5_shoes_white1.jpg" alt="Product Image"></div>
                                        <div class="slider-nav-img"><img src="/resources/image/5_shoes_white2.jpg" alt="Product Image"></div>
                                        <div class="slider-nav-img"><img src="/resources/image/5_shoes_white3.jpg" alt="Product Image"></div>
                                    </div>
                                </div>
                             <!--    <div class="container">
								    <div class="row">
								        <div class="col-md-12">
								            <div id="custCarousel" class="carousel slide" data-ride="carousel" align="center">
								                slides
								                <div class="carousel-inner">
								                    <div class="carousel-item active"> <img src="/resources/image/5shoes.jpg" alt="shoes"> </div>
								                    <div class="carousel-item"> <img src="/resources/image/5_shoes_black.jpg" alt="shoes"> </div>
								                    <div class="carousel-item"> <img src="/resources/image/5_shoes_black2.jpg" alt="shoes"> </div>
								                    <div class="carousel-item"> <img src="/resources/image/5_shoes_black3.jpg" alt="shoes"> </div>
								                    <div class="carousel-item"> <img src="/resources/image/5_shoes_white.jpg" alt="shoes"> </div>
								                    <div class="carousel-item"> <img src="/resources/image/5_shoes_white1.jpg" alt="shoes"> </div>
								                    <div class="carousel-item"> <img src="/resources/image/5_shoes_white2.jpg" alt="shoes"> </div>
								                    <div class="carousel-item"> <img src="/resources/image/5_shoes_white3.jpg" alt="shoes"> </div>
								                    
								                </div> 
								                
								                Left right 
								                <a class="carousel-control-prev" href="#custCarousel" data-slide="prev"> 
								                	<span class="carousel-control-prev-icon"></span>
								                </a> 
								                <a class="carousel-control-next" href="#custCarousel" data-slide="next"> 
								                	<span class="carousel-control-next-icon"></span> 
								                </a> 
								                
								                Thumbnails
								                <ol class="carousel-indicators list-inline">
								                    <li class="list-inline-item active"> <a id="carousel-selector-0" class="selected" data-slide-to="0" data-target="#custCarousel"> <img src="/resources/image/5shoes.jpg" class="img-fluid"> </a> </li>
								                    <li class="list-inline-item"> <a id="carousel-selector-1" data-slide-to="1" data-target="#custCarousel"> <img src="/resources/image/5_shoes_black.jpg" class="img-fluid"> </a> </li>
								                    <li class="list-inline-item"> <a id="carousel-selector-2" data-slide-to="2" data-target="#custCarousel"> <img src="/resources/image/5_shoes_black2.jpg" class="img-fluid"> </a> </li>
								                    <li class="list-inline-item"> <a id="carousel-selector-2" data-slide-to="3" data-target="#custCarousel"> <img src="/resources/image/5_shoes_black3.jpg" class="img-fluid"> </a> </li>
								                    <li class="list-inline-item"> <a id="carousel-selector-2" data-slide-to="4" data-target="#custCarousel"> <img src="/resources/image/5_shoes_white.jpg" class="img-fluid"> </a> </li>
								                    <li class="list-inline-item"> <a id="carousel-selector-2" data-slide-to="5" data-target="#custCarousel"> <img src="/resources/image/5_shoes_white1.jpg" class="img-fluid"> </a> </li>
								                    <li class="list-inline-item"> <a id="carousel-selector-2" data-slide-to="6" data-target="#custCarousel"> <img src="/resources/image/5_shoes_white2.jpg" class="img-fluid"> </a> </li>
								                    <li class="list-inline-item"> <a id="carousel-selector-2" data-slide-to="7" data-target="#custCarousel"> <img src="/resources/image/5_shoes_white3.jpg" class="img-fluid"> </a> </li>
								                    
								                </ol>
								            </div>
								        </div>
								    </div>
								</div> -->
                                                                                                                                                                                                
                                  <!--  <div class="product-slider-single normal-slider">
                                        <img src="/resources/template/img/product-1.jpg" alt="Product Image">
                                        <img src="/resources/template/img/product-3.jpg" alt="Product Image">
                                        <img src="/resources/template/img/product-5.jpg" alt="Product Image">
                                        <img src="/resources/template/img/product-7.jpg" alt="Product Image">
                                        <img src="/resources/template/img/product-9.jpg" alt="Product Image">
                                        <img src="/resources/template/img/product-10.jpg" alt="Product Image">
                                    </div>
                                    <div class="product-slider-single-nav normal-slider">
                                        <div class="slider-nav-img"><img src="/resources/template/img/product-1.jpg" alt="Product Image"></div>
                                        <div class="slider-nav-img"><img src="/resources/template/img/product-3.jpg" alt="Product Image"></div>
                                        <div class="slider-nav-img"><img src="/resources/template/img/product-5.jpg" alt="Product Image"></div>
                                        <div class="slider-nav-img"><img src="/resources/template/img/product-7.jpg" alt="Product Image"></div>
                                        <div class="slider-nav-img"><img src="/resources/template/img/product-9.jpg" alt="Product Image"></div>
                                        <div class="slider-nav-img"><img src="/resources/template/img/product-10.jpg" alt="Product Image"></div>
                                    </div> 
                                </div>-->
                                <div class="col-md-7">
                                    <div class="product-content">
                                        <div class="title">
                                        <h2>${goodsInfo.goodsDetail.GOODS_NAME}</h2>
                                        </div>
                                        
                                        <div class="ratting">
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                        </div>
                                        <div class="price">
                                            <h4>가격:</h4>
                                            <p id="p_price">
                                           	</p>
                                           <!-- 		 <span>$149</span> -->
                                            
                                        </div>
                                         <div class="quantity">
                                            <h4>수량:</h4>
                                            <div class="qty">
                                                <button class="btn-minus"><i class="fa fa-minus"></i></button>
                                                <input type="text"  class="orderQty" value="1">
                                                <button class="btn-plus"><i class="fa fa-plus"></i></button>
                                            </div>
                                        </div>
                                        
                                                                   
                                        <div class="p-Option ">
                                        	<div class="optionBind">
	                                            <h4>옵션:</h4>
	                                            <div class="btn-group btn-group-sm">                                                                                     
		                                             <div class="col-md-4">                    
			                                             <div class="pull-right">	                                      
				                                         	<select class="goodsOption orderOption"  name="goodsOption">	                                                 
				                                                  		<%--  <option value= "" >옵션 선택</option>                                                        
				                                                         <option value= " ${goods_req_option.optionList[0].OPTION_NAME}">${goods_req_option.optionList[0].OPTION_NAME}</option>
				                                                         <option value= " ${goods_req_option.optionList[1].OPTION_NAME}">${goods_req_option.optionList[1].OPTION_NAME}</option>	 
				                                                         <option value= " ${goods_req_option.optionList[2].OPTION_NAME}">${goods_req_option.optionList[2].OPTION_NAME}</option>	 
				                                                         <option value= " ${goods_req_option.optionList[3].OPTION_NAME}">${goods_req_option.optionList[3].OPTION_NAME}</option>	 
				                                                         <option value= " ${goods_req_option.optionList[4].OPTION_NAME}">${goods_req_option.optionList[4].OPTION_NAME}</option>	 
				                                                         <option value= " ${goods_req_option.optionList[5].OPTION_NAME}">${goods_req_option.optionList[5].OPTION_NAME}</option>	 
				                                                         <option value= " ${goods_req_option.optionList[6].OPTION_NAME}">${goods_req_option.optionList[6].OPTION_NAME}</option>	 
				                                                         <option value= " ${goods_req_option.optionList[7].OPTION_NAME}">${goods_req_option.optionList[7].OPTION_NAME}</option>	 
				                                                         <option value= " ${goods_req_option.optionList[8].OPTION_NAME}">${goods_req_option.optionList[8].OPTION_NAME}</option>	 
				                                                         <option value= " ${goods_req_option.optionList[9].OPTION_NAME}">${goods_req_option.optionList[9].OPTION_NAME}</option>
				                                                         <option value= " ${goods_req_option.optionList[10].OPTION_NAME}">${goods_req_option.optionList[10].OPTION_NAME}</option>	 
				                                                         <option value= " ${goods_req_option.optionList[11].OPTION_NAME}">${goods_req_option.optionList[11].OPTION_NAME}</option>	 	                                                    --%>      	                                                         	 	                                                    	                                                         	                                                           
				                                            </select>                      	                                                 
			                                        </div>
		                                       </div>
	                                        </div> 
                                        </div>                                 
                  <!--                       <div class="p-color">
                                            <h4>색상:</h4>
                                             <div class="btn-group btn-group-sm">
                                            <div class="btn-group btn-group-toggle" data-toggle="buttons">
												<div class="btn-group btn-group-toggle" data-toggle="buttons">
													  <label class="btn btn-secondary active">
													    <input type="radio" name="options" id="option1" autocomplete="off" checked>흰색
													  </label>
													  <label class="btn btn-secondary">
													    <input type="radio" name="options" id="option2" autocomplete="off">검은색
													  </label>
												
												</div>
                                            
                                                 <button type="radio" class="btn" name="color">흰색</button>
                                                <button type="radio" class="btn" name="color">검은색</button>
                                                <button type="radio" class="btn" name="color">회색</button> 
                                            </div> 
                                        </div> -->
                                        <div class="action">
                                    
                                            <a class="btn"  class="addCartBtn" ><i class="fa fa-shopping-cart"></i>Add to Cart</a>
                                            <button class="addCartBtn" >카트에담기</button>
                                            <a class="btn"  class="buyNowBtn"><i class="fa fa-shopping-bag"></i>Buy Now</a>
                                       		<button class="buyNowBtn" >바로주문</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        
                        <div class="row product-detail-bottom">
                            <div class="col-lg-12">
                                <ul class="nav nav-pills nav-justified">
                                    <li class="nav-item">
                                        <a class="nav-link active" data-toggle="pill" href="" >상품상세</a>
                                    </li>
           
                                    <li class="nav-item">
                                        <a class="nav-link" data-toggle="pill" href="#reviews">상품평</a>
                                    </li>
                                </ul>

                                <div class="tab-content">
                                    <div id="description" class="container tab-pane active">
                                        <h4>상품상세 설명</h4>
                                        <p>
                                            ${goods.goodsDetail.GOODS_DETAIL}
                                        </p>
                                    </div>
                                    <div id="specification" class="container tab-pane fade">
                                        <h4>Product specification</h4>
                                        <ul>
                                            <li>Lorem ipsum dolor sit amet</li>
                                            <li>Lorem ipsum dolor sit amet</li>
                                            <li>Lorem ipsum dolor sit amet</li>
                                            <li>Lorem ipsum dolor sit amet</li>
                                            <li>Lorem ipsum dolor sit amet</li>
                                        </ul>
                                    </div>
                                    
                                    <div id="reviews" class="container tab-pane fade">
                                        <div class="reviews-submitted ">
                                            <div class="reviewer">Phasellus Gravida - <span>01 Jan 2020</span></div>
                                            <div class="ratting">
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                            </div>
                                            <p>
                                                Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam.
                                            </p>
                                        </div>
                                        <div class="reviews-submit">
                                            <h4>Give your Review:</h4>
                                            <div class="ratting">
                                                <i class="far fa-star"></i>
                                                <i class="far fa-star"></i>
                                                <i class="far fa-star"></i>
                                                <i class="far fa-star"></i>
                                                <i class="far fa-star"></i>
                                            </div>
                                            <div class="row form">
                                                <div class="col-sm-6">
                                                    <input type="text" placeholder="Name">
                                                </div>
                                                <div class="col-sm-6">
                                                    <input type="email" placeholder="Email">
                                                </div>
                                                <div class="col-sm-12">
                                                    <textarea placeholder="Review"></textarea>
                                                </div>
                                                <div class="col-sm-12">
                                                    <button>Submit</button>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    
                                </div>
                            </div>
                        </div>
                        
                        <!-- <div class="product">
                            <div class="section-header">
                                <h1>Related Products</h1>
                            </div>

                            <div class="row align-items-center product-slider product-slider-3">
                                <div class="col-lg-3">
                                    <div class="product-item">
                                        <div class="product-title">
                                            <a href="">Product Name</a>
                                            <div class="ratting">
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                            </div>
                                        </div>
                                        <div class="product-image">
                                            <a href="product-detail.html">
                                                <img src="/resources/template/img/product-10.jpg" alt="Product Image">
                                            </a>
                                            <div class="product-action">
                                                <a href=""><i class="fa fa-cart-plus"></i></a>
                                                <a href=""><i class="fa fa-heart"></i></a>
                                                <a href=""><i class="fa fa-search"></i></a>
                                            </div>
                                        </div>
                                        <div class="product-price">
                                            <h3><span>$</span>99</h3>
                                            <a class="btn" href=""><i class="fa fa-shopping-cart"></i>Buy Now</a>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-3">
                                    <div class="product-item">
                                        <div class="product-title">
                                            <a href="">Product Name</a>
                                            <div class="ratting">
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                            </div>
                                        </div>
                                        <div class="product-image">
                                            <a href="product-detail.html">
                                                <img src="/resources/template/img/product-8.jpg" alt="Product Image">
                                            </a>
                                            <div class="product-action">
                                                <a href=""><i class="fa fa-cart-plus"></i></a>
                                                <a href=""><i class="fa fa-heart"></i></a>
                                                <a href=""><i class="fa fa-search"></i></a>
                                            </div>
                                        </div>
                                        <div class="product-price">
                                            <h3><span>$</span>99</h3>
                                            <a class="btn" href=""><i class="fa fa-shopping-cart"></i>Buy Now</a>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-3">
                                    <div class="product-item">
                                        <div class="product-title">
                                            <a href="">Product Name</a>
                                            <div class="ratting">
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                            </div>
                                        </div>
                                        <div class="product-image">
                                            <a href="product-detail.html">
                                                <img src="/resources/template/img/product-6.jpg" alt="Product Image">
                                            </a>
                                            <div class="product-action">
                                                <a href=""><i class="fa fa-cart-plus"></i></a>
                                                <a href=""><i class="fa fa-heart"></i></a>
                                                <a href=""><i class="fa fa-search"></i></a>
                                            </div>
                                        </div>
                                        <div class="product-price">
                                            <h3><span>$</span>99</h3>
                                            <a class="btn" href=""><i class="fa fa-shopping-cart"></i>Buy Now</a>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-3">
                                    <div class="product-item">
                                        <div class="product-title">
                                            <a href="">Product Name</a>
                                            <div class="ratting">
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                            </div>
                                        </div>
                                        <div class="product-image">
                                            <a href="product-detail.html">
                                                <img src="/resources/template/img/product-4.jpg" alt="Product Image">
                                            </a>
                                            <div class="product-action">
                                                <a href=""><i class="fa fa-cart-plus"></i></a>
                                                <a href=""><i class="fa fa-heart"></i></a>
                                                <a href=""><i class="fa fa-search"></i></a>
                                            </div>
                                        </div>
                                        <div class="product-price">
                                            <h3><span>$</span>99</h3>
                                            <a class="btn" href=""><i class="fa fa-shopping-cart"></i>Buy Now</a>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-3">
                                    <div class="product-item">
                                        <div class="product-title">
                                            <a href="">Product Name</a>
                                            <div class="ratting">
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                            </div>
                                        </div>
                                        <div class="product-image">
                                            <a href="product-detail.html">
                                                <img src="/resources/template/img/product-2.jpg" alt="Product Image">
                                            </a>
                                            <div class="product-action">
                                                <a href=""><i class="fa fa-cart-plus"></i></a>
                                                <a href=""><i class="fa fa-heart"></i></a>
                                                <a href=""><i class="fa fa-search"></i></a>
                                            </div>
                                        </div>
                                        <div class="product-price">
                                            <h3><span>$</span>99</h3>
                                            <a class="btn" href=""><i class="fa fa-shopping-cart"></i>Buy Now</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div> -->
                    </div>
                    
                    <!-- Side Bar Start -->
                   
                    <!-- Side Bar End -->
                </div>
            </div>
        </div>
        <!-- Product Detail End -->
        
        <!-- Brand Start -->
        <div class="brand">
            <div class="container-fluid">
                <div class="brand-slider">
                    <div class="brand-item"><img src="/resources/template/img/brand-1.png" alt=""></div>
                    <div class="brand-item"><img src="/resources/template/img/brand-2.png" alt=""></div>
                    <div class="brand-item"><img src="/resources/template/img/brand-3.png" alt=""></div>
                    <div class="brand-item"><img src="/resources/template/img/brand-4.png" alt=""></div>
                    <div class="brand-item"><img src="/resources/template/img/brand-5.png" alt=""></div>
                    <div class="brand-item"><img src="/resources/template/img/brand-6.png" alt=""></div>
                </div>
            </div>
        </div>
        <!-- Brand End -->
        
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
        <script src="/resources/template/lib/easing/easing.min.js"></script>
        <script src="/resources/template/lib/slick/slick.min.js"></script>
        
        <!-- Template Javascript -->
        <script src="/resources/template/js/main.js"></script>
          <script src="${contextPath}/resources/basket/basket.js?ver=8"></script>
		<script src="${contextPath}/resources/basket/transferTime.js"></script>
		<script src="${contextPath}/resources/order/checkout.js?ver=10"></script>
		<script src="${contextPath}/resources/goods/goodsDetail.js?ver=12"></script>
    </body>
    
      <script>
    $(document).ready(function(){
    	var goods_seq= 5; //세션으로 받아서 주입
    	var start= 0;
    	//console.log("goods_seq"+"${goods_req_option.optionList[0].GOODS_SEQ}");
    	//renderGoodsInfo(goods_seq);
    	//putGoodsName(goods_seq);
    	//putGoodsDetail(goods_seq);
    	//putGoodsPrice(goods_seq);
    	replyGoodsComment(goods_seq,start); //선언된 변수와 매개변수가 변수명이 같아야된다. *주의*
    });
     var cust_id = "compF"; 
     
     
	 //1.기존댓글정보가져오기 2. 댓글 insert 3.페이징처리
	 function replyGoodsComment(goodsSeq,start){
		 console.log("in replyGoodsComment");
		 goodsDetailService.replyGoodsComment(goodsSeq,start,function(replyInfo){
			console.log(replyInfo);
			var reviewsSubmitted=$(".reviews-submitted");			
			var submittedReview=""	
			for(var i=0,len=replyInfo.length||0;i<len;i++){
				 var starStr = "";
		         var starCnt =replyInfo[i].STAR;
		       
		          for(var k=0; k<starCnt;k++){
		          starStr+='<i class="fa fa-star"></i>'
		          }
		          for(var j=0; j<(5-starCnt); j++){
		              starStr+='<i class="far fa-star"></i>'
		          }
				
				
				submittedReview+='<div class="reviewer">'+replyInfo[i].CUST_ID+'<span> '+replyInfo[i].REGDATE+'</span></div>'
            	+'<div class="ratting">'	
            	+starStr
            	+'</div>'
           		+'<p>'
            	+    replyInfo[i].MEMO
            	+'</p>'
            	
			}	
            	
			
                reviewsSubmitted.html(submittedReview);
			
		 })
	 }
     
     //상품상세 정보 get
     function renderGoodsInfo(goods_seq){
    	 goodsDetailService.getGoodsDetailInfo(goods_seq,function(goodsInfo){
    		// var goodsInfoRender=$(".goodsInfo");
    	     var goodsOptionList = goodsInfo.optionList;
    		 var goodsOptionRender=$(".orderOption");
			 var goodsOptionStr="";
			 //상품이름, 상품가격, 상품상세(설명),<====이거먼저하고, 추후설명  기존 댓글정보(페이징처리),댓글 insert
			 
			 for(var i=0,len=goodsOptionList.length||0;i<len;i++){
				 goodsOptionStr+=" <option value= '"+goodsOptionList[i].OPTION_NAME+"'>"+goodsOptionList[i].OPTION_NAME+"</option>" 
			}
			 goodsOptionRender.html(goodsOptionStr);
    	 })
     }
     
     //상품제품가격 get_goods_seq
     function putGoodsPrice(goods_seq){
    	 goodsDetailService.getGoodsDetailInfo(5,function(goodsInfo){
    		
    		 var putGoodsPrice = goodsInfo.goodsDetail.PRICE;
    		 var putGoodsRender = $("#p_price");
    		 var putGoodsStr="";
    		 console.log("goods_Price불러오기 : "+putGoodsPrice);
    		 
    		 putGoodsStr += putGoodsPrice+"원";
    		 
    		 putGoodsRender.html(putGoodsStr);
    	 })
     }
     
     //상품제품 이름 get_goods_seq
     function putGoodsName(goods_seq){
    	 goodsDetailService.getGoodsDetailInfo(5,function(goodsInfo){
    		 alert("I'm in");
    		 //var putGoodsName = goodsInfo.optionList.goodsDetail.GOODS_NAME;
    		 var putGoodsName = goodsInfo.goodsDetail.GOODS_NAME;
    		 var putGoodsRender = $(".title");
    		 var putGoodsStr="";
    		 console.log("goods_name불러오기 : "+putGoodsName);
    		 
    		 putGoodsStr += "<h2>"+putGoodsName+"<h2>";
    		 
    		 putGoodsRender.html(putGoodsStr);
    	 })
     }
	
   	//상품상세설명get_goods_seq
      function putGoodsDetail(goods_seq){
    	 goodsDetailService.getGoodsDetailInfo(5,function(goodsInfo){
    		 alert("I'm in");
    		 var putGoodsDetail = goodsInfo.goodsDetail.GOODS_DETAIL;
    		 var putGoodsRender = $("#description");
    		 var putGoodsStr="";
    		 console.log("GoodsDetail불러오기 : "+putGoodsDetail);
    		 
    		 putGoodsStr += "<h2>"+putGoodsDetail+"<h2>";
    		 
    		 putGoodsRender.html(putGoodsStr);
    	 })
     }
     
     
     
     
     
     
	//상품카트에 담기
	$('.addCartBtn').on('click',function(){
		orderinfo={
	    		cust_id:cust_id,
	    		qty:$(".orderQty").val(),
	    		orderOption:$(".orderOption").val(),
	    		goods_seq:"${goods_req_option.optionList[0].GOODS_SEQ}"
	    } 
		
		
		
	    console.log("장바구니cust_id: "+orderinfo.cust_id);
		console.log("장바구니qty: "+orderinfo.qty);
		console.log("장바구니orderOption: "+orderinfo.orderOption);
		console.log("장바구니goods_seq: "+orderinfo.goods_seq);
		basketService.addGoodsAtBasket(orderinfo);
		alert("장바구니에 해당상품이 담겼습니다"+orderinfo);
	
	});
  
	  //바로구매
	$('.buyNowBtn').on('click',function(){

		orderinfo={
	    		cust_id:cust_id,
	    		qty:$(".orderQty").val(),
	    		orderOption:$(".orderOption").val(),
	    		goods_seq:"${goods_req_option.optionList[0].GOODS_SEQ}"
	    } 
		
		
		console.log("바로구매cust_id: "+orderinfo.cust_id);
		console.log("바로구매qty: "+orderinfo.qty);
		console.log("바로구매orderOption: "+orderinfo.orderOption);
		console.log("바로구매goods_seq: "+orderinfo.goods_seq);
		basketService.orderNow(orderinfo);
	});
    
    </script>
</html>
