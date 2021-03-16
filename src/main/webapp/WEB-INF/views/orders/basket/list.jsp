<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="../../include/header.jsp" %>
        <!-- Bottom Bar End -->
        
        <!-- Breadcrumb Start -->
        <div class="breadcrumb-wrap">
            <div class="container-fluid">
                <ul class="breadcrumb">
                    <li class="breadcrumb-item"><a href="">홈</a></li>
                    <li class="breadcrumb-item"><a href="">상품목록</a></li>
                    <li class="breadcrumb-item active">장바구니</li>
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
                                            <th>상품명</th>
                                            <th>가격</th>
                                            <th>수량</th>
                                            <th>상품별 합계</th>
                                            <th>제거</th>
                                        </tr>
                                    </thead>
                                    <tbody class="align-middle basketList">
                                                                         
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
                                            <h1>장바구니 구매금액</h1>
                                            <p>상품 주문 금액<span class="subTotalPrice">0</span></p>
                                            <p>배송비<span class="shippingCost">100</span></p>
                                            <h2>총 결제금액<span class="grandTotalPrice">0</span></h2>
                                        </div>
                                        <div class="cart-btn">
                                            <button class="cartUpBtn">Update Cart</button>
                                            <button class="checkoutBtn" disabled>Checkout</button>
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
        <script src="${contextPath}/resources/template/js/main.js?var=7"></script>
        <script src="${contextPath}/resources/basket/basket.js?ver=9"></script>
		<script src="${contextPath}/resources/basket/transferTime.js"></script>
		<script src="${contextPath}/resources/order/checkout.js?ver=3"></script>
    </body>
    
    <script>
    
    var cust_id = "${memberId}";
	cartCnt(cust_id);
	console.log(cust_id);
    $(document).ready(function(){
    	showList();
    	//var cust_id $(".sessionId").val();
    });
    /* CSRF 데이터 변수 저장 */
    var csrfHeaderName="${_csrf.headerName}";
    var csrfTokenValue="${_csrf.token}";
    
    
    
    $('.cartUpBtn').on('click', function () {
    	$(".checkoutBtn").attr("disabled", false)
    })
 
  
    
    
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
		basketService.purGoodsAtBasket(function(result){
			
		})
	}
	
	//장바구니에서 상품 삭제
	function delBasketGoods(cust_id,goods_seq){
		csrf={"csrfHeaderName":csrfHeaderName,
   				"csrfTokenValue":csrfTokenValue};
		$(".checkoutBtn").attr("disabled", true);
		basketService.delBasketGoods(cust_id,goods_seq,csrf,function(result){
			showList();
		})
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
				firstGrandTotal = Number(firstTotal)+Number($(".shippingCost").text());
				$(".grandTotalPrice").text(firstGrandTotal);
			})
		}
   
    </script>
</html>