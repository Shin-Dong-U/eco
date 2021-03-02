<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>결제 페이지</h1>
</body>
<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js" ></script>
<script type="text/javascript" src="https://cdn.iamport.kr/js/iamport.payment-1.1.5.js"></script>
<script>
	var IMP = window.IMP; // 생략가능
	IMP.init('imp03498848'); // 'iamport' 대신 부여받은 "가맹점 식별코드"를 사용
	
	IMP.request_pay({
	    pg : 'inicis', // version 1.1.0부터 지원.
	    pay_method : 'card',
	    merchant_uid : 'merchant_' + new Date().getTime(),
	    name : '주문명:결제테스트',
	    amount : 1000,
	    buyer_email : 'iamport@siot.do',
	    buyer_name : '이지윤',
	    buyer_tel : '010-1234-5678',
	    buyer_addr : '서울특별시 강남구 삼성동',
	    buyer_postcode : '123-456',
	    m_redirect_url : 'https://www.yourdomain.com/payments/complete'
	}, function(rsp) {
		if(rsp.success){
			//[1] 서버단에서 결제정보 조회를 위해 jQuery ajax로 imp_uid 전달하기
			jQuery.ajax({
				url:"/orders/paments/complete",
				type:'POST',
				dataType:'json',
				data:{
					imp_uid : rsp.imp_uid
				}
			}).done(function(data){
				//[2] 서버에서 REST API로 결제정보확인 및 서비스루틴이 정상적인 경우
				if ( rsp.success ) {
			        var msg = '결제가 완료되었습니다.';
			        msg += '고유ID : ' + rsp.imp_uid;
			        msg += '상점 거래ID : ' + rsp.merchant_uid;
			        msg += '결제 금액 : ' + rsp.paid_amount;
			        msg += '카드 승인번호 : ' + rsp.apply_num;
			        alert(msg);
			    }else{
			    	//[3] 아직 제대로 결제가 되지 않았습니다.
	    			//[4] 결제된 금액이 요청한 금액과 달라 결제를 자동취소처리하였습니다.
			    }
			});
		}else {
	        var msg = '결제에 실패하였습니다.';
	        msg += '에러내용 : ' + rsp.error_msg;
	    }
	    alert(msg);
	});
	
	var Iamport = require('iamport');
	var iamport = new Iamport({
	  impKey: '5985791568123737',
	  impSecret: 'IJFXurO5lDD4DMFfERsYBPJFecE235VMPBJj2xonb1rPO74tYwrzmbfAnTDrZzdOaX7cuvAGx2vm9AP7'
	});
	
	app.get('/payments/status/all',(req,res)=>{
        iamport.payment.getByStatus({
          payment_status: 'paid' 
        }).then(function(result){
            res.render('payments_list',{list:result.list});
        }).catch(function(error){
            console.log(error);
            red.send(error);
        })
});
</script>
</html>