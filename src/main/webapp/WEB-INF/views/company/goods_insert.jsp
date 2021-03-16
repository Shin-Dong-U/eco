<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="_csrf" th:content="${_csrf.token}">
<meta name="_csrf_header" th:content="${_csrf.headerName}">
<title>상품등록페이지</title>
<script type="text/javascript" src="/resources/vender/smarteditor2/js/HuskyEZCreator.js" charset="utf-8"></script>
</head>
<body>
	<form:form role="form" action="/goods/form/upload/images" method="post" id="smartEditorForm">
		상품명   : <input type="text" id="goods_name" name="goods_name"><br/>
		가격     : <input type="text" id="price" name="price"><br/>
		재고수량 : <input type="number" id="qty" name="qty"><br/>
		성분     : <input type="text" id="material" name="material"><br/>
		카테고리 : <select id="category" name="category"><option></option></select><br/>
		필수 옵션: <label>없음<input type="radio" name="req_option" value="N"></label><label>있음<input type="radio" name="req_option" id="req_option_y" value="Y"></label><br/>
		<div id="req_option_div"></div>
		<textarea name="goods_detail" id="goods_detail" rows="10" cols="100"></textarea>
	</form:form>
	
	<button id="testBtn" onclick="submitContents(this);">naver editor</button>
	
	
<script type="text/javascript">
	var oEditors = [];
	nhn.husky.EZCreator.createInIFrame({
		oAppRef: oEditors,
		elPlaceHolder: "goods_detail",
		sSkinURI: "/resources/vender/smarteditor2/SmartEditor2Skin.html",
		fCreator: "createSEditor2"
	});
	
	var images = new Array();
	
	function submitContents(elClickedObj) {
		 // 에디터의 내용이 textarea에 적용된다.
		 oEditors.getById["goods_detail"].exec("UPDATE_CONTENTS_FIELD", []);

		 // 에디터의 내용에 대한 값 검증은 이곳에서
		 // document.getElementById("ir1").value를 이용해서 처리한다.

		 try {
			 console.log(document.getElementById("ir1").value);
			 console.log(elClickedObj);
		     //elClickedObj.form.submit();
		 } catch(e) {}
	}
	
	//스마트 에디터 리턴 값 -> 파일 경로 + 파일명만 추출
	function getFilePath(queryStr){
		return queryStr.substring(t.indexOf("sFileURL=") + 9);
	}
	
	
	function checkExtension(fileName, fileSize){
		var regex = new RegExp("(.*?)\.(jpg|png|bmp|rle|dib|gif|tif|tiff)");
		var maxSize = 5242880;
		
		if(fileSize >= maxSize){
			alert('파일 사이즈 초과');
			return false;
		}
		
		if(!regex.test(fileName)){
			alert('이미지 파일만 업로드 가능합니다. \n jpg, png, bmp, rle, dib, gif, tif, tiff');
			return false;
		}
		
		return true;
	}
	
</script>
</body>
</html>