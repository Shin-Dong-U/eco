<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
                            <a href="index.html" class="nav-item nav-link active">Home</a>
                            <a href="product-list.html" class="nav-item nav-link">Products</a>
                            <a href="product-detail.html" class="nav-item nav-link">Product Detail</a>
                            <a href="cart.html" class="nav-item nav-link">Cart</a>
                            <a href="checkout.html" class="nav-item nav-link">Checkout</a>
                            <a href="my-account.html" class="nav-item nav-link">My Account</a>
                            <div class="nav-item dropdown">
                                <a href="" class="nav-link dropdown-toggle" data-toggle="dropdown">More Pages</a>
                                <div class="dropdown-menu">
                                    <a href="wishlist.html" class="dropdown-item">Wishlist</a>
                                    <a href="login.html" id="loginclass" class="dropdown-item">Login & Register</a>
                                    <a href="contact.html" class="dropdown-item">Contact Us</a>
                                </div>
                            </div>
                        </div>
                        <div class="navbar-nav ml-auto">
                            <div class="nav-item dropdown">
                                <a href="" class="nav-link dropdown-toggle" data-toggle="dropdown">User Account</a>
                                <div class="dropdown-menu">
                                    <p id="1" class="dropdown-item">Login</p>
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
                                <span>(0)</span>
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Bottom Bar End -->       
        
        <!-- Main Slider Start -->
        <div class="header">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-3">
                        <nav class="navbar bg-light">
                            <ul class="navbar-nav">
                                <li class="nav-item">
                                    <a class="nav-link" href="/home/index/"><i class="fa fa-home"></i>홈</a>
                                </li>
                                   </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="/board/catelist?category=3"><i class="fa fa-tshirt"></i>의류 및 잡화</a>
                                         
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="/board/catelist?category=21"><i class="fa fa-shopping-bag"></i>뷰티</a>
                                </li>
                                
                                <li class="nav-item">
                                    <a class="nav-link" href="/board/catelist?category=22"><i class="fas fa-heartbeat"></i>헬스/건강식품</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="/board/catelist?category=1"><i class="fas fa-apple-alt"></i>식품</a>
                             
                                 <li class="nav-item">
                                    <a class="nav-link" href="/board/catelist?category=2"><i class="fas fa-couch"></i>가구</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="/board/catelist?category=4"><i class="fa fa-mobile-alt"></i>생활용품</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="/board/catelist?category=23"><i class="fab fa-palfed"></i>주방용품</a>
                                </li>
                            </ul>
                        </nav>
                    </div>
                    <div class="col-md-6"><meta name="viewport" content="width=device-width">
                        <div class="header-slider normal-slider">
                        
                            <div class="header-slider-item">
                                <img src="/resources/template/img/slider11.jpg" alt="Slider Image" />
                                <div class="header-slider-caption">
                                    <p>에코 프렌들리 텀블러</p>
                                    <a class="btn" href=""><i class="fa fa-shopping-cart"></i>Shop Now</a>
                                </div>
                            </div>
                            <div class="header-slider-item">
                                <img src="/resources/template/img/slider2.jpg" alt="Slider Image" />
                                <div class="header-slider-caption">
                                    <p>비건 코코넛 워터</p>
                                    <a class="btn" href=""><i class="fa fa-shopping-cart"></i>Shop Now</a>
                                </div>
                            </div>
                            <div class="header-slider-item">
                                <img src="/resources/template/img/slider3.jpg" alt="Slider Image" />
                                <div class="header-slider-caption">
                                    <p>친환경 베스용품</p>
                                    <a class="btn" href=""><i class="fa fa-shopping-cart"></i>Shop Now</a>
                                </div>
                            </div>
                            <div class="header-slider-item">
                                <img src="/resources/template/img/slider4.jpg" alt="Slider Image" />
                                <div class="header-slider-caption">
                                    <p>유기농 대나무잎으로 만든 세미정장</p>
                                    <a class="btn" href=""><i class="fa fa-shopping-cart"></i>Shop Now</a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3">
                        <div class="header-img">
                            <div class="img-item">
                                <img src="/resources/template/img/slider5.jpg" />
                                <a class="img-text" href="">
                                    <p>코코넛 원목 베스세트</p>
                                </a>
                            </div>
                            <div class="img-item">
                                <img src="/resources/template/img/slider6.jpg" />
                                <a class="img-text" href="">
                                    <p>비건 파스타재료 </p>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Main Slider End -->      
        
        <!-- Brand Start -->
        <div class="brand">
            <div class="container-fluid">
                <div class="brand-slider">     
                	
                    <div class="brand-item">
                  	<p><a href="https://ecoatlas.co.za/" target="_blank">
                    <img src="/resources/template/img/cummunity8.jpg"></a></div></p>
                                        
                    <div class="brand-item">
                    <p><a href="https://www.greenpeace.org/korea/" target="_blank">
                    <img src="/resources/template/img/cummunity5.jpg" alt=""></a></div></p>
                    
                    <div class="brand-item">
                    <p><a href="https://greenstandardsltd.com/" target="_blank">
                    <img src="/resources/template/img/cummunity7.jpg" alt=""></a></div></p>
                    
                    
                    <div class="brand-item">
                    <p><a href="https://www.korganicboard.org/" target="_blank">
                    <img src="/resources/template/img/cummunity1.jpg" alt=""></a></div></p>
                    
                        
                    <div class="brand-item">
                    <p><a href="http://www.greenus-eco.com/" target="_blank">
                    <img src="/resources/template/img/cummunity6.jpg" alt=""></a></div></p>
                    
                </div>
            </div>
        </div>
        <!-- Brand End -->      
        
        <!-- Feature Start-->
        <div class="feature">
            <div class="container-fluid">
                <div class="row align-items-center">
                        <div class="col-lg-3 col-md-6 feature-col">
                        <div class="feature-content">
                            <i class="fas fa-leaf"></i>
                            <h2>친환경 제품</h2>
                            <p>
                                                 친환경 제품들만 판매합니다
                            </p>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6 feature-col">
                        <div class="feature-content">
                            <i class="fab fa-cc-mastercard"></i>
                            <h2>신용카드</h2>
                            <p>
                                VISA / MASTER
                            </p>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6 feature-col">
                        <div class="feature-content">
                            <i class="fa fa-truck"></i>
                            <h2>롸켓 배송</h2>
                            <p>
                                                   빠른배송
                            </p>
                        </div>
                    </div>
               
                    <div class="col-lg-3 col-md-6 feature-col">
                        <div class="feature-content">
                            <i class="fa fa-comments"></i>
                            <h2>24/7 Support</h2>
                            <p>
                                Lorem ipsum dolor sit amet consectetur elit
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Feature End-->      
        
       
        
        <!-- Footer Start -->
        <div class="footer">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-3 col-md-6">
                        <div class="footer-widget">
                            <h2>고객센터</h2>
                            <div class="contact-info">
                                <p><i class="fa fa-map-marker"></i>Eco Friends, 서울특별시 구로구 시흥대로 163길 33, 대한민국</p>
                                <p><i class="fa fa-envelope"></i>eco_friends@gmail.com</p>
                                <p><i class="fa fa-phone"></i>02-456-7890</p>
                            </div>
                        </div>
                    </div>
                    
                    <div class="col-lg-3 col-md-6">
                        <div class="footer-widget">
                            <h2>Follow Us</h2>
                            <div class="contact-info">
                                <div class="social">
                                    <a href="https://twitter.com/greenstandards" target="_blank"><i class="fab fa-twitter"></i></a>
                                    <a href="https://www.facebook.com/greenstandards/" target="_blank"><i class="fab fa-facebook-f"></i></a>
                                    <a href="https://www.linkedin.com/company/green-standards-ltd" target="_blank"><i class="fab fa-linkedin-in"></i></a>
                                    <a href="https://www.instagram.com/greenstandards/" target="_blank"><i class="fab fa-instagram"></i></a>
                                    <a href="https://www.youtube.com/channel/UClPHbrXdlb3h7mQ8MoGPeVA" target="_blank"><i class="fab fa-youtube"></i></a>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="col-lg-3 col-md-6">
                        <div class="footer-widget">
                            <h2>Eco Friends</h2>
                            <ul>
                              <p><i class="fas fa-address-card"></i>친환경 온라인 쇼핑몰</p>
                            </ul>
                        </div>
                    </div>

                  
        </div>
        <!-- Footer End -->
        
       
        
        <!-- Back to Top -->
        <a href="" class="back-to-top"><i class="fa fa-chevron-up"></i></a>
        
        <!-- JavaScript Libraries -->
        <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
        <script src="/resources/template/lib/easing/easing.min.js"></script>
        <script src="/resources/template/lib/slick/slick.min.js"></script>
        
        <!-- Template Javascript -->
        
        <script src="/resources/template/js/main.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script type="text/javascript">
			$("#1").on("click", function() {
				location.href = "/cust/login1";
			});
		</script>
    </body>
</html>