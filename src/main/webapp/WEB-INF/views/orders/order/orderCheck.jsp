<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

        <%@include file="../../include/header.jsp" %>
        <!-- Bottom Bar End -->
        
        <!-- Breadcrumb Start -->
        <div class="breadcrumb-wrap">
            <div class="container-fluid">
                <ul class="breadcrumb">
                    <li class="breadcrumb-item"><a href="">홈</a></li>
                    <li class="breadcrumb-item"><a href="">상품목록</a></li>
                    <li class="breadcrumb-item active">주문내역 확인</li>
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
                                        </tr>
                                    </thead>
                                    <tbody class="align-middle orderList">
                                     
                                                                         
                                    </tbody>
                                    
                                </table>
                                
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4">
                        <div class="cart-page-inner">
                            <div class="row">                               
                                <div class="col-md-12">
                                    <div class="cart-summary ">
                                        <div class="cart-content">
                                            <h1>주문내역</h1>
                                            <p class="sub-total">상품금액<span class="sub-total-price"></span></p>
                                            <p class="ship-cost">배송비<span>100</span></p>
                                            <h2>총 결제 금액<span class="grand-total-price totalPrice">100</span></h2>
                                        </div>
                                        <div class="cart-btn">
                                            <button class="cancelOrderBtn">주문 취소</button>
                                            <button class="orderCommit">주문 확정</button>
                                        </div>
                                        <div class="checkout-btn">
                                   			 <!-- <button class="deliverySearch">배송조회</button> -->
                                   			 <button type="button" class="btn btn-primary deliverySearch" data-toggle="modal" data-target=".bd-example-modal-lg">배송조회</button>
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
        
        <!--modal  -->
        <div class="modal fade bd-example-modal-xl" tabindex="-1" role="dialog" aria-labelledby="myExtraLargeModalLabel" aria-hidden="true">
		  <div class="modal-dialog modal-xl" role="document">
		    <div class="modal-content">
		      <div class="table-responsive">
                                <table class="table table-bordered">
                                    <thead class="thead-dark">
                                        <tr>
                                            <th>송장번호</th>
                                            <th>배송상태</th>
                                            <th>날짜</th>
                                            <th>비고</th>
                                        </tr>
                                    </thead>
                                    <tbody class="align-middle shipInfo">
                                    
                                                                         
                                    </tbody>
                                    
                                </table>
                                
                  </div>
		    </div>
		  </div>
		</div>
        
      
             
        
        <!-- Back to Top -->
        <a href="" class="back-to-top"><i class="fa fa-chevron-up"></i></a>
        
        <!-- JavaScript Libraries -->
        <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
        <script src="${contextPath}/resources/template/lib/easing/easing.min.js"></script>
        <script src="${contextPath}/resources/template/lib/slick/slick.min.js"></script>
        
        <!-- Template Javascript -->
        <script src="${contextPath}/resources/template/js/main.js?var=2"></script>
        <script src="${contextPath}/resources/basket/basket.js?ver=6"></script>
		<script src="${contextPath}/resources/basket/transferTime.js"></script>
		<script src="${contextPath}/resources/order/checkout.js?ver=9"></script>
    </body>
    
    <script>
    $(document).ready(function(){
    	showList();
    });
    /* CSRF 데이터 변수 저장 */
    var csrfHeaderName="${_csrf.headerName}";
    var csrfTokenValue="${_csrf.token}";
    
    var order_seq = ${order_seq};
    var cust_id = "${memberId}";
  	//상품제목 <p>클릭시
  	$('.basketList').on('click', "p",function () {
  		var goods_seq =  $(this).data("goods_seq");
    	
      //현재 버튼클릭시 해당 goods_seq선택가능-->Ajax로 연동
		selectBasketGoods(goods_seq);    
    });
	
  	//주문취소
	$('.cancelOrderBtn').on('click',function(){
		
		if(window.confirm('really?')){
			
			var csrf={"csrfHeaderName":csrfHeaderName,
	   				"csrfTokenValue":csrfTokenValue};
			checkoutService.getShipStatus(order_seq,function(shipStatus){
				if(Number(shipStatus[0].delivery_status)===0){
					
					checkoutService.orderCancel(order_seq,csrf);
				}else{
					alert("현재 배송중인 상품은 취소가 불가능 합니다");
					return;
				}
			});
		}
	});
  	
	//배송조회
	$('.deliverySearch').on('click',function(){
		$(".modal").modal("show");
		checkoutService.getShipStatus(order_seq,function(shipStatus){
			
			var str="";
			var shipInfoTable=$(".shipInfo");
			
			for(var i=0,len=shipStatus.length||0;i<len;i++){
			str+="<tr>"
             	+"	<td>"+shipStatus[i].invoice_no+"</td>"
             	+"	<td>"+shipStatus[i].delivery_status+"</td>"
             	+"	<td>"+shipStatus[i].editDate+"</td>"
             	+"	<td>"+shipStatus[i].delivery_company+"</td>"
         		+"</tr>"
			}
			shipInfoTable.html(str);
		});		
	});
  
	//주문확정
	$('.orderCommit').on('click',function(){
		var totalPrice = $('.totalPrice').text();
		var point = Number(totalPrice)*0.1;
		var point2 = parseInt(totalPrice);
		csrf={"csrfHeaderName":csrfHeaderName,
   				"csrfTokenValue":csrfTokenValue};
		
		if(window.confirm('주문확정시 환불이 불가능 합니다 주문확정을 하시겠습니까?')){
			checkoutService.orderCommit(order_seq,point,cust_id,csrf);
		}
		
		
	});
	
	function showList(){		
		checkoutService.getOrderedDetail(order_seq,function(ordertList){
			var orderListTable=$(".orderList");
			var str="";
			var subTotalPrice = 0;
			
			for(var i=0,len=ordertList.length||0;i<len;i++){
				 //"+ordertList[i].IMG_URL+"
				str+="<tr>"
	                +"   <td>"
	                +"        <div class='img'>"
	                +"            <a href=''><img src='/resources/template/img/product-1.jpg' alt='Image'></a>"		               
	                +"            <p data-goods_seq='"+ordertList[i].GOODS_SEQ+"'>"+ordertList[i].GOODS_NAME+"</p>"
	                +"        </div>"
	                +"    </td>"
	                +"    <td><span>"+ordertList[i].PRICE+"</span></td>"
	                +"    <td>"
	                +"        <div class='qty' data-goods_seq='"+ordertList[i].GOODS_SEQ+"'>"
	                +"            <input type='text' value='"+ordertList[i].QTY+"' readonly=readonly>"
	                +"        </div>"
	                +"    </td>"
	                +"    <td><span class='calPrice"+[i]+"'>"+Number(ordertList[i].PRICE)*Number(ordertList[i].QTY)+"</span></td>"                                           
           		    +"</tr>";
           		subTotalPrice += Number(ordertList[i].PRICE)*Number(ordertList[i].QTY)
					
			}
			orderListTable.html(str);
			
			$(".sub-total-price").text(subTotalPrice);
             var shippingCost = 100;
             $(".grand-total-price").text(subTotalPrice+shippingCost);
		})
	}
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
</html>