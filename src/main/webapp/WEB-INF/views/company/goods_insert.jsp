<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="_csrf" th:content="${_csrf.token}">
<meta name="_csrf_header" th:content="${_csrf.headerName}">

<title>상품등록페이지</title>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="../resources/vender/smarteditor2/js/HuskyEZCreator.js" charset="utf-8"></script>

</head>
<body>
	<textarea name="ir1" id="ir1" rows="10" cols="100">
		에디터에 기본으로 삽입할 글(수정 모드)이 없다면 이 value 값을 지정하지 않으시면 됩니다.
	</textarea>
	
	<button id="testBtn" onclick="submitContents(this);">naver editor</button>
	
	<div class="uploadDiv">
		<input type="file" name="uploadFile" multiple>
	</div>
	<button id="uploadBtn">기본</button>

	<img src="/upload/img/lion.jpg" />

	
<script type="text/javascript">
	var oEditors = [];
	nhn.husky.EZCreator.createInIFrame({
		oAppRef: oEditors,
		elPlaceHolder: "ir1",
		sSkinURI: "/resources/vender/smarteditor2/SmartEditor2Skin.html",
		fCreator: "createSEditor2"
	});
	
	function submitContents(elClickedObj) {
		 // 에디터의 내용이 textarea에 적용된다.
		 oEditors.getById["ir1"].exec("UPDATE_CONTENTS_FIELD", []);

		 // 에디터의 내용에 대한 값 검증은 이곳에서
		 // document.getElementById("ir1").value를 이용해서 처리한다.

		 try {
			 console.log(document.getElementById("ir1").value);
			 console.log(elClickedObj);
		     //elClickedObj.form.submit();
		 } catch(e) {}
	}
	
	var cloneObj = $('.uploadDiv').clone();
	
	$(document).ready(function(){
		$('#uploadBtn').on("click", function(e){
			var token = $("meta[name='_csrf']").attr("th:content");
			var header = $("meta[name='_csrf_header']").attr("th:content");
			
			//console.log('header : ' + header + ' token : ' + token);
			
			var formData = new FormData();
			var inputFile = $("input[name='uploadFile']");
			var files = inputFile[0].files;
			console.log(files);
			
			for(var i = 0; i < files.length; i++){
				if(!checkExtension(files[i].name, files[i].size)){ return false; }
				
				formData.append("uploadFile", files[i]);
			}
			
			$.ajax({
				url : '/goods/rest/form/upload/images',
				processData : false,
				contentType : false,
				data : formData,
				type : 'POST',
				dataType:"json",
				beforeSend : function(xhr){   
                	xhr.setRequestHeader(header, token);
                },
				success : function(result){
					console.log(result);
					
					$('.uploadDiv').html(cloneObj.html());
				},
				fail : function(e){
					alert("실패");
					console.log(e);
				}
			});
		});
	});
	
	
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