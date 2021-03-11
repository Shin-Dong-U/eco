<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품등록페이지</title>
<script type="text/javascript" src="../resources/vender/smarteditor2/js/HuskyEZCreator.js" charset="utf-8"></script>
</head>
<body>
	<textarea name="ir1" id="ir1" rows="10" cols="100">
		에디터에 기본으로 삽입할 글(수정 모드)이 없다면 이 value 값을 지정하지 않으시면 됩니다.
	</textarea>
	
	<button id="testBtn" onclick="submitContents(this);"></button>

	
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
</script>
</body>
</html>