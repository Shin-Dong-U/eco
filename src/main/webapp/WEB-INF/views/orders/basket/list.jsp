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
        <link href="${contextPath}/resources/template/lib/slick/slick.css" rel="stylesheet">
        <link href="${contextPath}/resources/template/lib/slick/slick-theme.css" rel="stylesheet">

        <!-- Template Stylesheet -->
        <link href="${contextPath}/resources/template/css/style.css" rel="stylesheet">
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
        <h1>memberID ${memberId}</h1>
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
                            <a href="cart.html" class="nav-item nav-link active">Cart</a>
                            <a href="checkout.html" class="nav-item nav-link">Checkout</a>
                            <a href="http://localhost:3000/" class="nav-item nav-link">Chart</a>
                            <input type="hidden" value="${memberId}" class="sessionId">
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
                            <a href="http://localhost/orders/basket/list"  class="btn cart">
                                <i  class="fa fa-shopping-cart"></i>
                                <span class="cartCntBtn">(0)</span>
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
                    <li class="breadcrumb-item active">Cart</li>
                </ul>
            </div>
        </div>
        <!-- Breadcrumb End -->
        
        <!-- Cart Start -->
        <div class="cart-page">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-8">
                        <div class="cart-page-inner">
                            <div class="table-responsive">
                                <table class="table table-bordered">
                                    <thead class="thead-dark">
                                        <tr>
                                            <th>Product</th>
                                            <th>Price</th>
                                            <th>Quantity</th>
                                            <th>Total</th>
                                            <th>Remove</th>
                                        </tr>
                                    </thead>
                                    <tbody class="align-middle basketList">
                                        <!-- <tr>
                                            <td>
                                                <div class="img">
                                                    <a href=""><img src="/resources/template/img/product-1.jpg" alt="Image"></a>
                                                    <p>Product Name</p>
                                                </div>
                                            </td>
                                            <td><span>99</span></td>
                                            <td>
                                                <div class="qty">
                                                    <button class="btn-minus"><i class="fa fa-minus"></i></button>
                                                    <input type="text" value="1">
                                                    <button class="btn-plus"><i class="fa fa-plus"></i></button>
                                                </div>
                                            </td>
                                            <td><span class="calPrice0">99</span></td>                                           
                                            <td><button><i class="fa fa-trash"></i></button></td>
                                        </tr> -->
                                        
                                      
                                                                         
                                    </tbody>
                                    
                                </table>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4">
                        <div class="cart-page-inner">
                            <div class="row">
                                <div class="col-md-12">
                                   <!--  <div class="coupon">
                                        <input type="text" placeholder="Coupon Code">
                                        <button>Apply Code</button>
                                    </div> -->
                                </div>
                                <div class="col-md-12">
                                    <div class="cart-summary">
                                        <div class="cart-content">
                                            <h1>Cart Summary</h1>
                                            <p>Sub Total<span class="subTotalPrice">0</span></p>
                                            <p>Shipping Cost<span class="shippingCost">100</span></p>
                                            <h2>Grand Total<span class="grandTotalPrice">0</span></h2>
                                        </div>
                                        <div class="cart-btn">
                                            <button class="cartUpBtn">Update Cart</button>
                                            <button class="checkoutBtn">Checkout</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Cart End -->
        
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
        <script src="${contextPath}/resources/template/js/main.js?var=6"></script>
        <script src="${contextPath}/resources/basket/basket.js?ver=9"></script>
		<script src="${contextPath}/resources/basket/transferTime.js"></script>
		<script src="${contextPath}/resources/order/checkout.js?ver=3"></script>
    </body>
    
    <script>
    //var cust_id = ${memberId};
	//cartCnt(cust_id);
	//console.log(cust_id);
    $(document).ready(function(){
    	//showList();
    	var cust_id $(".sessionId").val();
    	console.log("sessionid"+cust_id);
    });
    
   
 
  
    
    
    //check out button 장바구니목록 주문
    $('.checkoutBtn').on('click', function () {
    	console.log("체크아웃 버튼클릭");
    	var total_price = $(".grandTotalPrice").text();
    	console.log(total_price);
    	//addOrder
    	//체크아웃페이지 이동   	
    	 checkoutService.addOrderBasket(cust_id,total_price,function(){
    		alert("checkout 성공"); 
    	}); 
    	
    	
    });
    
    
  	//상품제목 <p>클릭시
  	$('.basketList').on('click', "p",function () {
  		var goods_seq =  $(this).data("goods_seq");
    	console.log("버튼클릭goods_seq: "+goods_seq);
      //현재 버튼클릭시 해당 goods_seq선택가능-->Ajax로 연동
		selectBasketGoods(goods_seq);    
    });
	$('.basketList').on('click',".delbasketBtn",function(){
		//var goods_seq =  $(this).parents("td").children("p").data("goods_seq");
		var goods_seq =  $(this).data("goods_seq");
		console.log("삭제버튼클릭: "+goods_seq);
		delBasketGoods(cust_id,goods_seq);
		showList();
	});
  	
  	
	//선택상품 장바구니에 담기
	function addGoodsAtBasket(){
		basketService.addGoodsAtBasket(function(){})
	}
	
	//장바구니 수량변경
	function changeQtyAtBasket(cust_id,goods_seq,qty){
		basketService.changeQtyAtBasket(cust_id,goods_seq,qty,function(){})
	}
	
	
	//장바구니에 구매된 상품 삭제
	function purGoodsAtBasket(){
		basketService.purGoodsAtBasket(function(result){})
	}
	
	//장바구니에서 상품 삭제
	function delBasketGoods(cust_id,goods_seq){
		basketService.delBasketGoods(cust_id,goods_seq,function(result){})
	}
	
	//장바구니에서 특정상품 선택
	function selectBasketGoods(goods_seq){
		basketService.getBasketGoods(goods_seq,function(){})
	}
   
	//카트 상품 갯수 표시
	function cartCnt(cust_id) {
		var cartCount = 0;
		basketService.countBasketGoods(cust_id,function(result){
			cartCount="("+result+")";
			$(".cartCntBtn").text(cartCount);
		})
		
	}

	
	
  //장바구니 리스트 보기
		function showList(){		
			basketService.getBasketList(cust_id,function(basketList){
				var basketListTable=$(".basketList");
				var str="";
				var firstTotal = 0;
				var firstGrandTotal = 0;
				console.log(basketList);
				console.log("Number(basketList[i].PRICE): "+typeof(Number(basketList[0].PRICE)));
				console.log("Number(basketList[i].QTY): "+typeof(Number(basketList[0].QTY)));
				console.log("Number(basketList[i].PRICE)*Number(basketList[i].QTY): "+Number(basketList[0].PRICE)*Number(basketList[0].QTY));
			
				for(var i=0,len=basketList.length||0;i<len;i++){
					 //"+basketList[i].IMG_URL+"
					str+="<tr>"
		                +"   <td>"
		                +"        <div class='img'>"
		                +"            <a href=''><img src='/resources/template/img/product-1.jpg' alt='Image'></a>"		               
		                +"            <p data-goods_seq='"+basketList[i].GOODS_SEQ+"'>"+basketList[i].GOODS_NAME+"</p>"
		                +"        </div>"
		                +"    </td>"
		                +"    <td><span>"+basketList[i].PRICE+"</span></td>"
		                +"    <td>"
		                +"        <div class='qty' data-goods_seq='"+basketList[i].GOODS_SEQ+"'>"
		                +"            <button class='btn-minus'><i class='fa fa-minus'></i></button>"
		                +"            <input type='text' value='"+basketList[i].QTY+"'>"
		                +"            <button class='btn-plus'><i class='fa fa-plus'></i></button>"
		                +"        </div>"
		                +"    </td>"
		                +"    <td><span class='calPrice"+[i]+"'>"+Number(basketList[i].PRICE)*Number(basketList[i].QTY)+"</span></td>"                                           
		                +"    <td><button class='delbasketBtn' data-goods_seq='"+basketList[i].GOODS_SEQ+"'>"
		                +"		<i class='fa fa-trash'></i></button>"
		                +"	  </td>"
               		    +"</tr>";
               		    
					firstTotal+= Number(basketList[i].PRICE)*Number(basketList[i].QTY);
						
				}
				basketListTable.html(str);
				$(".subTotalPrice").text(firstTotal);
				firstGrandTotal = Number($(".subTotalPrice").text())+Number($(".shippingCost").text());
				$(".grandTotalPrice").text(firstGrandTotal);
			})
		}
   
    </script>
</html>