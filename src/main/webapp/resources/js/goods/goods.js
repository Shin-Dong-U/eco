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
				
				htmlStr += '<div class="col-lg-3">';
				htmlStr += '<div class="product-item">';
				htmlStr += '<div class="product-title" ">';
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
				htmlStr += '<a class="btn" href="' + linkUrl + result.goodsList[i].GOODS_SEQ + '"><i class="fa fa-shopping-cart"></i>구매</a>';
				htmlStr += '</div>';
				htmlStr += '</div>';
				htmlStr += '</div>';
				
			}
			
			const goodsDiv = $('#goods_list');
			goodsDiv.empty();
			goodsDiv.html(htmlStr);
		}//if(result.goodsList){
		
		if(result.page){
			const pageHtml = makePageHtml(result.page);
			
			const pageDiv = $('#pageDiv');
			$('#pageNum').val(result.page.cri.pageNum);
			$('#amount').val(result.page.cri.amount);
			pageDiv.empty();
			pageDiv.html(pageHtml);
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


//----------common 이동 예정----------------------------------------

// 숫자 3자리마다 콤마 찍기
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

// form 직렬화
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

//paging 생성 movePage()는 사용페이지에서 반드시 새로 구현.
function makePageHtml(page){
	var pageHtml = ''
	if(!page || !page.startPage || !page.endPage) { return pageHtml; }
	
	pageHtml += '<nav aria-label="Page navigation example">';
	pageHtml += '<ul class="pagination justify-content-center">';
	
	if(page.prev){
		pageHtml += '<li class="page-item">';
		pageHtml += '<Button class="page-link" name="pageBtn" onclick="movePage(' + (page.startPage - 1) + ');" >이전</Button>';
		pageHtml += '</li>';
	}
	
	for(var i = page.startPage; i <= page.endPage; i++){
		if(page.cri.pageNum == i){
			pageHtml += '<li class="page-item active"><span class="page-link">' + page.cri.pageNum + '</span></li>';
		}else{
			pageHtml += '<li class="page-item"><Button class="page-link" name="pageBtn" onclick="movePage(' + i + ');" >' + i + '</Button></li>';
		}
	}
	
	if(page.next){
		pageHtml += '<li class="page-item">';
		pageHtml += '<Button class="page-link" name="pageBtn" onclick="movePage(' + (page.endPage + 1) + ');" >다음</Button>';
		pageHtml += '</li>';
	}
	
	pageHtml += '</ul> </nav>';
	
	return pageHtml;
}

function movePage(pageNum){
	selectedPage(pageNum);
	callGetGoodsList();
}

function selectedPage(pageNum){
	document.getElementById('pageNum').value = pageNum;
}