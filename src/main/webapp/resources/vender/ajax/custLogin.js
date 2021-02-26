console.log("custLogin.ajax실행");

var custLogin=(function(){
	
	/* 로그인 id와 password 처리 */
	function getCust(customer, callback, error){
		console.log("getCust 실행");
		
		$.ajax({
			type:"post",
			url:"/cust/rest/login",
			data:JSON.stringify(customer),
			contentType:"application/json; charset=UTF-8",

			success:function(data){
				if(data['custVO'] == null){
					console.log("data: "+data.custVO);
					alert("아이디 또는 비밀번호가 일치하지 않습니다.");
				}else{
					if(callback){
						console.log(data["custVO"]);
						callback(data["custVO"]);
						console.log("custLogin.ajax실행중 getCust 완료");
					}
				}
			},
			error:function(xhr,status,err){
				if(error){
					error(err);
					console.log("custLogin.ajax실행중 getCust 오류");
				}
			}
		});	//end ajax
	}//end function getCust
	
	/* 일반 사용자 회원가입 */
	function joinCust(cust, callback, error){
		console.log("joinCust 실행");
		
		$.ajax({
			type:"put",
			url:"/cust/rest/join",
			data:JSON.stringify(cust),
			contentType:"application/json; charset=UTF-8",
			
			success:function(data){
				if(callback){
					callback(data);
					console.log("custLogin.ajax실행중 joinCust 완료");
				}
			},
			error:function(xhr,status,err){
				if(error){
					error(err);
					console.log("custLogin.ajax실행중 joinCust 오류");
				}
			}
		});	//end ajax
	}//end function joinCust
	

	return{
		getCust:getCust,
		joinCust:joinCust
	};
	
})();