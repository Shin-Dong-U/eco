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
			//dataType:"text",
			success:function(data){
				if(callback){
					callback(data.custVO);
					alert("custVO: "+data.custVO);
					alert("custLogin.ajax실행중 getCust 완료");
				}
			},
			error:function(xhr,status,err){
				if(error){
					error(err);
					alert("custLogin.ajax실행중 getCust 오류");
				}
			}
		});	//end ajax
	}//end function getCust
	
	return{
		getCust:getCust	
	};
	
})();