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
		});
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
		if(result.goodsList){
			for(var i = 0; i < result.goodsList.length; i++){
				const imgUrl = result.goodsList[i].IMG_URL ? result.goodsList[i].IMG_URL : '';//예외처리
				
				htmlStr += '<div class="col-md-3">';
				htmlStr += '<div class="product-item">';
				htmlStr += '<div class="product-title" style="height:100px;">';
				htmlStr += '<a href="' + linkUrl + result.goodsList[i].GOODS_SEQ + '">' + result.goodsList[i].GOODS_NAME + '</a>';
				
				htmlStr += makeStarIconHtml(result.goodsList[i].STAR);
				
				htmlStr += '</div>';
				htmlStr += '<div class="product-image">';
				htmlStr += '<a href="' + linkUrl + result.goodsList[i].GOODS_SEQ + '">';
				htmlStr += '<img src="' + imgUrl + '" alt="상품 이미지" onerror="this.src=' + "'/resources/upload/img/default/no_img.jpg'" + '"/>';
				htmlStr += '</a>';
				
				htmlStr += '<div class="product-action">';
				htmlStr += '<a href="' + linkUrl + result.goodsList[i].GOODS_SEQ + '"><i class="fa fa-search"></i></a>';
				htmlStr += '</div>';
				htmlStr += '</div>';
				
				htmlStr += '<div class="product-price">';
				htmlStr += '<h3>' + formattingComma(result.goodsList[i].PRICE) + ' &#8361;</h3>';
				htmlStr += '<a class="btn" href="' + linkUrl + result.goodsList[i].GOODS_SEQ + '"><i class="fa fa-shopping-cart"></i>사러가기</a>';
				htmlStr += '</div>';
				htmlStr += '</div>';
				htmlStr += '</div>';
			}
			
			var goodsDiv = $('#goods_list');
			goodsDiv.empty();
			goodsDiv.html(htmlStr);
			
//			$('#goods_list').html(htmlStr);
		}
	});
}

//숫자 3자리마다 콤마 찍기
function formattingComma(num){
    var len, point, str; 
       
    num = num + ""; 
    point = num.length % 3 ;
    len = num.length; 
   
    str = num.substring(0, point); 
    while (point < len) { 
        if (str) str += ","; 
        str += num.substring(point, point + 3); 
        point += 3; 
    } 
     
    return str;
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