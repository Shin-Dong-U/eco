<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="../include/header.jsp" %>
<!-- Bottom Bar End --> 

<!-- Breadcrumb Start -->
<div class="breadcrumb-wrap">
    <div class="container-fluid">
        <ul class="breadcrumb">
            <li class="breadcrumb-item"><a href="">홈</a></li>
            <li class="breadcrumb-item"><a href="">상품목록</a></li>
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
                <div class="nav flex-column nav-pills" role="tablist" aria-orientation="vertical">
                    <a class="nav-link active" id="dashboard-nav" data-toggle="pill" href="#dashboard-tab" role="tab"><i class="fa fa-tachometer-alt"></i>Dashboard</a>
        <!--주문목록조회  -->
                    <a class="nav-link" id="orders-nav" data-toggle="pill" href="#orders-tab" role="tab"><i class="fa fa-shopping-bag"></i>주문정보</a>                             
                    <a class="nav-link" id="payment-nav" data-toggle="pill" href="#payment-tab" role="tab"><i class="fa fa-credit-card"></i>배송정보입력(업체)</a>
                    <a class="nav-link" id="address-nav" data-toggle="pill" href="#address-tab" role="tab"><i class="fa fa-map-marker-alt"></i>address</a>
                    <a class="nav-link" id="account-nav" data-toggle="pill" href="#account-tab" role="tab"><i class="fa fa-user"></i>Account Details</a>
                    <a class="nav-link" href="index.html"><i class="fa fa-sign-out-alt"></i>Logout</a>
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
                    <div class="tab-pane fade" id="account-tab" role="tabpanel" aria-labelledby="account-nav">
                        <h4>Account Details</h4>
                        <div class="row">
                            <div class="col-md-6">
                                <input class="form-control" type="text" placeholder="First Name">
                            </div>
                            <div class="col-md-6">
                                <input class="form-control" type="text" placeholder="Last Name">
                            </div>
                            <div class="col-md-6">
                                <input class="form-control" type="text" placeholder="Mobile">
                            </div>
                            <div class="col-md-6">
                                <input class="form-control" type="text" placeholder="Email">
                            </div>
                            <div class="col-md-12">
                                <input class="form-control" type="text" placeholder="Address">
                            </div>
                            <div class="col-md-12">
                                <button class="btn">Update Account</button>
                                <br><br>
                            </div>
                        </div>
                        <h4>Password change</h4>
                        <div class="row">
                            <div class="col-md-12">
                                <input class="form-control" type="password" placeholder="Current Password">
                            </div>
                            <div class="col-md-6">
                                <input class="form-control" type="text" placeholder="New Password">
                            </div>
                            <div class="col-md-6">
                                <input class="form-control" type="text" placeholder="Confirm Password">
                            </div>
                            <div class="col-md-12">
                                <button class="btn">Save Changes</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- My Account End -->
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
        
        <script type="text/javascript">
        $(document).ready(function(){
        	showOrderedInfo();
        	showShipListInfo();
        });
       
        
        
        var cust_id="${memberId}";
        console.log("session id: "+cust_id);
      //주문 리스트 보기
		function showOrderedInfo(){		
			checkoutService.getOrderList(cust_id,function(orderedInfoList){
				var showOrderedInfoTable=$(".showOrderedInfo");
				var str="";
				console.log(orderedInfoList);
				for(var i=0,len=orderedInfoList.length||0;i<len;i++){
					var delivery_status= '배송정보';
					console.log(typeof(orderedInfoList[i].DELIVERY_STATUS));
					console.log(typeof(Number(orderedInfoList[i].DELIVERY_STATUS)));
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
		function showShipListInfo(){		
			checkoutService.getOrderList(cust_id,function(orderedInfoList){
				var shipOrderedInfoTable=$(".shipOrderedInfo");
				var str="";
				console.log(orderedInfoList);
				for(var i=0,len=orderedInfoList.length||0;i<len;i++){
					var delivery_status= '배송정보';
					console.log("업체 배송: "+orderedInfoList);
					console.log(typeof(orderedInfoList[i].DELIVERY_STATUS));
					console.log(typeof(Number(orderedInfoList[i].DELIVERY_STATUS)));
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
    </body>
</html>