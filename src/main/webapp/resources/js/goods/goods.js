var goodsService=(function(){
	var isRun = false;
	
	function getGoodsList(url, search, callback){
		if(isRun === true) { return false; }
		isRun = true;
		
		$.ajax({ 
			type : 'get',						
			url : url,	
			data : search,
			contentType : "application/json;charset=UTF-8",
			
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
	
	function getCommentList(url, search, callback){
		if(isRun === true) { return false; }
		isRun = true;
		
		$.ajax({ 
			type : 'get',						
			url : url,	
			data : search,
			contentType : "application/json;charset=UTF-8",
			
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
	
	function updateComment(url, data, callback){
		if(isRun === true) { return false; }
		isRun = true;
		
		$.ajax({ 
			type : 'post',						
			url : url,	
			data : JSON.stringify(data),
			contentType : "application/json;charset=UTF-8",
			
			success : function(result, status, xhr){
				if(callback){
					callback(result);
				}
				isRun = false;
			}, error : function(e){
				console.log(e);
				isRun = false;
			}, complete : function() {
				commentReset();
    		}


		});
	}
	
	function insertComment(url, data, callback){
		if(isRun === true) { return false; }
		isRun = true;
		
		$.ajax({ 
			type : 'put',						
			url : url,	
			data : JSON.stringify(data),
			contentType : "application/json;charset=UTF-8",
			
			success : function(result, status, xhr){
				if(callback){
					callback(result);
				}
				isRun = false;
			}, error : function(e){
				console.log(e);
				isRun = false;
			}, complete : function() {
				commentInsertFormReset();
				movePage(1);
    		}
		});
	}
	
	return {
		getGoodsList : getGoodsList,
		getCommentList : getCommentList,
		updateComment : updateComment,
		insertComment : insertComment
	};
	
})();

function callGetGoodsList(isNewSearch){
	if(isNewSearch === true){ selectedPage(1); }
	
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
				htmlStr += '<div class="product-title" style="height:100px;">';
				htmlStr += '<a href="' + linkUrl + result.goodsList[i].GOODS_SEQ + '">' + result.goodsList[i].GOODS_NAME + '</a>';
				
				htmlStr += makeStarIconHtml(result.goodsList[i].STAR);
				
				htmlStr += '</div>';
				htmlStr += '<div class="product-image">';
				htmlStr += '<a href="' + linkUrl + result.goodsList[i].GOODS_SEQ + '">';
				htmlStr += '<img src="' + imgUrl + '" alt="상품 이미지" onerror="this.src=' + "'/resources/upload/img/default/no_img.jpg'" + '" style="overflow: hidden;height:250px;"/>';
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

function callGetCommentList(){
	var goodsSeq = document.getElementById('goodsSeq').value;
	var pageNum = document.getElementById('pageNum').value;
	var data = {"goodsSeq" : goodsSeq, "pageNum" : pageNum };
	
	var url = '/goods/rest/' + goodsSeq + '/review';  
	
	goodsService.getGoodsList(url, data, function(result){
		if(result.commentList){
			var memberId = $('#memberId').val();
			var htmlStr = '';
			
			for(var i = 0; i < result.commentList.length; i++){
				htmlStr += '<div class="reviews-submitted" id="commentDiv_' + result.commentList[i].GOODS_COMMENT_SEQ + '">';
				htmlStr += '<div class="reviewer">' + result.commentList[i].NAME + ' - <span>' + result.commentList[i].REGDATE;
				if(result.commentList[i].CUST_ID === memberId) {
					htmlStr += '<span style="float:right"><a href="#this" onClick="modifyComment(' + result.commentList[i].GOODS_COMMENT_SEQ + ');">수정</a></span>';
				}
				htmlStr += '</span></div>';
				
				htmlStr += makeStarIconHtml(result.commentList[i].STAR);
				
				htmlStr += '<input type="hidden" id="commentMemo_' + result.commentList[i].GOODS_COMMENT_SEQ + '" value="' + result.commentList[i].MEMO + '">';
				htmlStr += '<p>' + result.commentList[i].MEMO + '</p>';
				htmlStr += '</div>';
				htmlStr += '<hr/>';
				
			}
			
			const commentDiv = $('#commentDiv');
			commentDiv.empty();
			commentDiv.html(htmlStr);
			
		}
	
		if(result.page){
			const pageHtml = makePageHtml(result.page);
			
			const pageDiv = $('#pageDiv');
			$('#pageNum').val(result.page.cri.pageNum);
			pageDiv.empty();
			pageDiv.html(pageHtml);
		}
	});
}

function callUpdateComment(goods_comment_seq){
	const goodsSeq = $('#goodsSeq').val();
	var url = '/goods/rest/' + goodsSeq + '/review/' + goods_comment_seq;

	var memo = $('#update_memo').val();
	var star = $('#comment_update_star_a').attr('data-selected-star');
	var data = {"goods_comment_seq" : goods_comment_seq, "goods_seq" : goodsSeq, "memo" : memo, "star" : star};
	 
	goodsService.updateComment(url, data, function(result){
		alert('수정 되었습니다.');
	});
}

function callInsertComment(){
	var memo = $('#comment_memo').val();
	var goodsSeq = $('#goodsSeq').val();
	var star = $('#comment_insert_star_a').attr('data-selected-star');

	var data = {"memo" : memo, "goods_seq" : goodsSeq, "star" : star};
	var url = '/goods/rest/' + goodsSeq + '/review';

	goodsService.insertComment(url, data, function(result){
		alert('등록 되었습니다.');
	});
}

//별점에 따라 아이콘 리턴
function makeStarIconHtml(ratting){
	var htmlText = '<div class="ratting">';
	
	for(var i = 0; i < 5; i ++){
		if(ratting < 1 && ratting >= 0.5){
			htmlText += ' <i class="fa fa-star-half-alt"></i>';
			break;
		}else if(ratting >= 1){
			htmlText += ' <i class="fa fa-star"></i>';
			ratting -= 1;
		}else{
			break;
		}
	}
	
	htmlText += '</div>';
	
	return htmlText;
}

function modifyComment(goodsCommentSeq){
	var thisDiv = $('#commentDiv_' + goodsCommentSeq);
	var memo = $('#commentMemo_' + goodsCommentSeq).val();
	
	thisDiv.empty();
	var htmlStr = '<div class="nav-item dropdown">';
	htmlStr += '<a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown" id="comment_update_star_a" data-selected-star="5">';
	htmlStr += '<i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i>';
	htmlStr += '</a>';
	htmlStr += '<div class="dropdown-menu">';                                                 
	htmlStr += '<a class="dropdown-item" onclick="selectedStar(' + "'" + 'update' + "'" + ', 5);"><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i></a><a class="dropdown-item" onclick="selectedStar(' + "'" +  'update' + "'" + ', 4);"><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="far fa-star"></i></a><a class="dropdown-item" onclick="selectedStar(' + "'" + 'update' + "'" + ', 3);"><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="far fa-star"></i><i class="far fa-star"></i></a><a class="dropdown-item" onclick="selectedStar(' + "'" + 'update' + "'" + ', 2);"><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="far fa-star"></i><i class="far fa-star"></i><i class="far fa-star"></i></a><a class="dropdown-item" onclick="selectedStar(' + "'" + 'update' + "'" + ', 1);"><i class="fa fa-star"></i><i class="far fa-star"></i><i class="far fa-star"></i><i class="far fa-star"></i><i class="far fa-star"></i></a>';                              
	htmlStr += '</div></div>';                                     
	htmlStr += '<div class="row form">';
	htmlStr += '<div class="col-sm-12">';
	htmlStr += '<textarea id="update_memo">' + memo + '</textarea>';
	htmlStr += '</div><div class="col-sm-12"><button onclick="commentUpdate(' + goodsCommentSeq + ');">수정</button> <button onclick="commentReset();">취소</button></div></div>';
                                                
	thisDiv.html(htmlStr);
}

function selectedStar(action, star){
	var starHtml = '';
	var starTag = '<i class="fa fa-star"></i>';
	for(var i = 0; i < star; i++){ starHtml += starTag; }
	
	if(action === 'insert'){
		const tmpTarget = $('#comment_insert_star_a'); 
		tmpTarget.attr('data-selected-star', star);
		tmpTarget.empty();
		tmpTarget.html(starHtml);
	}else if(action === 'update'){
		const tmpTarget = $('#comment_update_star_a'); 
		tmpTarget.attr('data-selected-star', star);
		tmpTarget.empty();
		tmpTarget.html(starHtml);
	}
}

//상세 - 리뷰 리스트 초기화
function commentReset(){
	const pageNum = document.getElementById('pageNum').value;
	movePage(pageNum);
};
   	
//상세 - 리뷰 등록 필드 초기화
function commentInsertFormReset(){
	selectedStar('insert', 5);
	$('#comment_memo').val('');
}
   	
//상세 - 리뷰 수정 실행
function commentUpdate(goodsCommentSeq){
	callUpdateComment(goodsCommentSeq);
	commentReset();
}
   	
//상세 - 리뷰 등록 실행
function commentInsert(){
	callInsertComment();
}

