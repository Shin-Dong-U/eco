<%@ include file="../include/header.jsp" %>
	  
	<section id="form">
		<div class="container">
			<div class="row">
				<div class="col-sm-4 ">
					<div class="login-form">
						<h2>Login to your account</h2>
						<form action="/">
							<input type="text" id="memberId" name="memberId"placeholder="id"   />
							<input type="password" id="password" name="password" placeholder="Password" />
							<span>
								<input type="checkbox" class="checkbox">Keep me signed in
							</span>
							<button type="button" id="btn_submit" class="btn btn-default">Login</button>
							<div class="loginChat">
							
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>		
	</section>
	

<script type="text/javascript" src="/resources/vender/ajax/custLogin.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>	
<script>
var memberId = $("#memberId");
var password = $("#password");
var loginChat = $("#loginChat");
var btn_submit = $("btn_submit");
$("#btn_submit").on("click",function(){
	checkLogin();
});

function checkLogin(){
	custLogin.getCust(
	{
		memberId:memberId,
		password:password
	},
	function(loginChat,cust){
		var str="";
		if(cust != null ){
			str+="<p>"+cust.memberId+"님이 로그인하셨습니다.</p>";
		}
		replyChat.html(str);
	});
}
</script>	
	
	
	
<%@ include file="../include/footer.jsp" %>