<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품등록페이지</title>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="../resources/vender/smarteditor2/js/HuskyEZCreator.js" charset="utf-8"></script>
</head>
<body>
	<textarea name="ir1" id="ir1" rows="10" cols="100">
		에디터에 기본으로 삽입할 글(수정 모드)이 없다면 이 value 값을 지정하지 않으시면 됩니다.
	</textarea>
	
	<button id="testBtn" onclick="submitContents(this);">naver editor</button>
	
	<input type="file" name="uploadFile" multiple>
	<button id="uploadBtn">기본</button>

	
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
	
	$(document).ready(function(){
		$('#uploadBtn').on("click", function(e){
			var formData = new FormData();
			var inputFile = $("input[name='uploadFile']");
			var files = inputFile[0].files;
			console.log(files);
			
			for(var i = 0; i < files.length; i++){
				formData.append("uploadFile", files[i]);
			}
			
			$.ajax({
				url : '/goods/rest/form/upload/images',
				processData : false,
				contentType : false,
				data : formData,
				type : 'POST',
				success : function(result){
					alert("업로드 성공")
				},
				fail : function(e){
					alert("실패");
					console.log(e);
				}
			});
		});
	});
</script>
</body>
</html>