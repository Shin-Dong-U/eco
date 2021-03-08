console.log("board Module.........");



var boardService=(function(){
	
	
	//검색한 상품목록 리스트
	function getsearchedGoodsList(callback){
		console.log("searchedGoodsList...............");
		
		$.ajax({ 
			type:'get',					
			url:'/board/search/searchedGoodsList',	
			data:JSON.stringify(),			
			contentType: "application/json; charset=utf-8", 
			success:(searchedGoodsList)=>{console.log("검색한 상품목록", searchedGoodsList),
				callback(searchedGoodsList)},
			error:(log)=>{console.log("실패 "+log)}
		})
	}
	
	//카테고리 클릭->해당 카테고리 상품목록 페이지
	function getCateList(callback){
		console.log("CateList...............");
		
		$.ajax({ 
			type:'get',					
			url:'/board/click/{cate_seq}',	
			data:JSON.stringify(),			
			contentType: "application/json; charset=utf-8", 
			success:(CateList)=>{console.log("검색한 상품목록", getCateList),
				callback(CateList)},
			error:(log)=>{console.log("실패 "+log)}
		})
	}
	
	
	
	return{
		getsearchedGoodsList:getsearchedGoodsList,
		getCateList:getCateList
		
	};
		
})();