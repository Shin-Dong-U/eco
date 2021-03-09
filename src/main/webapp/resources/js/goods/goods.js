var goodsService=(function(){
	
	function getGoodsList(url, search, callback){
		console.log("goods List");
			
		$.ajax({ 
			type : 'get',						
			url : url,	
			data : search,
			contentType : "application/json; charset=utf-8",
			
			success : function(result, status, xhr){
				if(callback){
					callback(result);
				}
			}, error : function(e){
				console.log(e);
			}
		})
	}
	
	return {
		getGoodsList:getGoodsList
	};
	
})();

function callGetGoodsList(){
	var data = $('#searchForm').serializeObject();
	var url = '/goods/rest';
	
	goodsService.getGoodsList(url, data, function(result){
		
		var linkUrl = '/goods/';
		
		var htmlStr = '';
		
		for(var i = 0; i < result.goodsList.length; i++){
			htmlStr += '<div class="col-md-3">';
			htmlStr += '<div class="product-item">';
			htmlStr += '<div class="product-title" style="height:100px;">';
			htmlStr += '<a href="' + linkUrl + result.goodsList[i].GOODS_SEQ + '">' + result.goodsList[i].GOODS_NAME + '</a>';
			
			htmlStr += makeStarIconHtml(result.goodsList[i].STAR);
			
			htmlStr += '</div>';
			htmlStr += '<div class="product-image">';
			htmlStr += '<a href="' + linkUrl + result.goodsList[i].GOODS_SEQ + '">';
			htmlStr += '<img src="' + linkUrl + result.goodsList[i].IMG_URL + '" alt="Product Image">';
			htmlStr += '</a>';
			
			htmlStr += '<div class="product-action">';
			htmlStr += '<a href="' + linkUrl + result.goodsList[i].GOODS_SEQ + '"><i class="fa fa-search"></i></a>';
			htmlStr += '</div>';
			htmlStr += '</div>';
			
			htmlStr += '<div class="product-price">';
			htmlStr += '<h3><fmt:formatNumber value="' + result.goodsList[i].PRICE + '" pattern="#,###" /> &#8361;</h3>';
			htmlStr += '<a class="btn" href="' + linkUrl + result.goodsList[i].GOODS_SEQ + '"><i class="fa fa-shopping-cart"></i>사러가기</a>';
			htmlStr += '</div>';
			htmlStr += '</div>';
			htmlStr += '</div>';
			
		}
//		console.log(htmlStr);
		$('#goods_list').empty();
		
		$('#goods_list').html(htmlStr);
		
	});
}

//별점에 따라 아이콘 리턴
function makeStarIconHtml(ratting){
	var htmlText = '';
	
	for(var i = 0; i < 5; i ++){
		if(ratting < 1 && ratting >= 0.5){
			htmlText += '<i class="fa fa-star-half-alt"></i>';
			return htmlText;
		}else if(ratting >= 1){
			htmlText += '<i class="fa fa-star"></i>';
			ratting -= 1;
		}else{
			return htmlText;
		}
	}
	
	return htmlText;
}

//form 직렬화
jQuery.fn.serializeObject = function() { 
	var obj = {};

    var arr = this.serializeArray(); 
    if(arr){ 
    	jQuery.each(arr, function() {
    		//pageNum, amount 가 null 또는 '' 이면 전달 하지 않는다. 
    		if( !(!this.value && (this.name == "pageNum" || this.name == "amount")) ){
    			obj[this.name] = this.value; 
    		}
		}); 
    }
    
    return obj;
}