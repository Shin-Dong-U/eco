console.log("adminRest.js 실행");

var adminRest=(function(){

	/* 모든 일반 사용자 정보 가져오기 */
	function getCustList(cust, callback, error){
		console.log("getCustList 실행");
		
		$.ajax({
			type:"get",
			url:"/admin/getCust/"+cust,
			//data:JSON.Stringfy(),
			contentType:"application/json; charset=UTF-8",
			
			success:function(data){
				console.log("data: "+data);
				if(callback){
					callback(data);
					console.log("adminRest.ajax실행중 getCustList 성공");
				}
			},
			error:function(xhr,status,err){
				if(error){
					error(err);
					console.log("adminRest.ajax실행중 getCustList 오류");
				}
			}
		});	//end ajax
	}	//end function getCustLogin


	/* 모든 업체 정보 가져오기 */
	function getCompanyList(company, callback, error){
		console.log("getCustList 실행");
		
		$.ajax({
			type:"get",
			url:"/admin/getCompany/"+company,
			//data:JSON.Stringfy(),
			contentType:"application/json; charset=UTF-8",
			
			success:function(data){
				console.log("data: "+data);
				if(callback){
					callback(data);
					console.log("adminRest.ajax실행중 getCompanyList 성공");
				}
			},
			error:function(xhr,status,err){
				if(error){
					error(err);
					console.log("adminRest.ajax실행중 getCompanyList 오류");
				}
			}
		});	//end ajax
	}	//end function getCustLogin


	/* 일반 모든 관리자 정보 가져오기 */
	function getAdminList(admin, callback, error){
		console.log("getCustList 실행");
		
		$.ajax({
			type:"get",
			url:"/admin/getAdmin/"+admin,
			//data:JSON.Stringfy(),
			contentType:"application/json; charset=UTF-8",
			
			success:function(data){
				//console.log("data: "+data[0]);
				//alert("data: "+data[0]);
				callback(data);
				console.log("adminRest.ajax실행중 getAdminList 성공");
			},
			error:function(xhr,status,err){
				if(error){
					error(err);
					console.log("adminRest.ajax실행중 getAdminList 오류");
				}
			}
		});	//end ajax
	}	//end function getCustLogin

return{
	getCustList:getCustList,
	getCompanyList:getCompanyList,
	getAdminList:getAdminList
};

})();

