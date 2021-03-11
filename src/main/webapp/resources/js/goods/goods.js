var goodsService=(function(){
	var isRun = false;
	
	function getGoodsList(url, search, callback){
		if(isRun === true) { return false; }
		isRun = true;
		
		$.ajax({ 
			type : 'get',						
			url : url,	
			data : search,
			contentType : "application/json; charset=utf-8",
			
			success : function(result, status, xhr){
				if(callback){
					callback(result);
				}
				isRun = false;
			}, error : function(e){
				console.log(e);
				isRun = false;
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

function movePage(pageNum){
	selectedPage(pageNum);
	callGetGoodsList();
}
