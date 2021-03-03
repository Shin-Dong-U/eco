<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>




<script type="text/javascript">
//sonsole.log(gameService);
//alert(gameService);

gameService.add(
		{bno: "JS Test", replyer:"tester", bno:"tester"}
		,
		function(result){
			alert("RESULT:"+result); 
		}
		)




</script>


</body>
</html>