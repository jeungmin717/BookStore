<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
		<title>광운서점</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta name="description" content="">
		<!--[if ie]><meta content='IE=8' http-equiv='X-UA-Compatible'/><![endif]-->
		<!-- bootstrap -->
		<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">      
		<link href="bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet">		
		<link href="themes/css/bootstrappage.css" rel="stylesheet"/>
		
		<!-- global styles -->
		<link href="themes/css/flexslider.css" rel="stylesheet"/>
		<link href="themes/css/main.css" rel="stylesheet"/>

		<!-- scripts -->
		<script src="themes/js/jquery-1.7.2.min.js"></script>
		<script src="bootstrap/js/bootstrap.min.js"></script>				
		<script src="themes/js/superfish.js"></script>	
		<script src="themes/js/jquery.scrolltotop.js"></script>
		<!--[if lt IE 9]>			
			<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
			<script src="js/respond.min.js"></script>
		<![endif]-->
		
			<script type="text/javascript">
      function MemberCheckField1(f){

         if(checkMemberPass1(f.name)== false) return false;
         if(checkMemberPass2(f.ID)== false) return false;
         if(checkMemberPass3(f.password)== false) return false;
         if(checkMemberPass4(f.phone)== false) return false;
         if(checkMemberPass5(f.address)== false) return false;

      }

      function checkMemberPass1(f) {
         if(!f.value){
            alert("이름를 입력하여 주세요");
            f.value = "";
            f.focus();
            return false;
         }
      }

      function checkMemberPass2(f) {
         if(!f.value){
            alert("ID를 입력하여 주세요");
            f.value = "";
            f.focus();
            return false;
         }
      }

      function checkMemberPass3(f) {
         if(!f.value){
            alert("비밀번호를 입력하여 주세요");
            f.value = "";
            f.focus();
            return false;
         }
      }

      function checkMemberPass4(f) {
         if(!f.value){
            alert("전화번호를 입력하여 주세요");
            f.value = "";
            f.focus();
            return false;
         }
      }

      function checkMemberPass5(f) {
         if(!f.value){
            alert("주소를 입력하여 주세요");
            f.value = "";
            f.focus();
            return false;
         }
      }
   </script>
		
		
		
		
		
</head>
<body>


<%

HttpSession session2 =request.getSession(false);
String s = (String)session2.getAttribute("SSid");
if(s==null){ %>

	<br><br>
	PLEASE REGISTER 설정된 세션이없다
	<%
}else{
	%>
		<br>
	      WELCOME BACK
	<%=session.getAttribute("SSid") %>
	세션ID : <%=session2.getId() %>
	<form action="logout.jsp">
	<input type="submit" value="Logout" />
	</form>
	
<% 
 }
	
%>


	<div id="top-bar" class="container">
			<div class="row">
				<div class="span4">
					<form method="POST" class="search_form">
						<input type="text" class="input-block-level search-query" Placeholder="eg. T-sirt">
					</form>
				</div>
				<div class="span8">
					<div class="account pull-right">
						<ul class="user-menu">				
							<li><a href="cart.jsp">Your Cart</a></li>
							<li><a href="checkout.jsp">Checkout</a></li>					
							<li><a href="register.jsp">Login</a></li>		
						</ul>
					</div>
				</div>
			</div>
		</div>
		<div id="wrapper" class="container">
			<section class="navbar main-menu">
				<div class="navbar-inner main-menu">				
					<a href="index2.jsp" class="logo pull-left"><img src="themes/images//logo.png" class="site_logo" alt=""></a>
					<nav id="menu" class="pull-right">
						<ul>
							<li><a href="./products.jsp">Woman</a>					
								<ul>
									<li><a href="./products.jsp">Lacinia nibh</a></li>									
									<li><a href="./products.jsp">Eget molestie</a></li>
									<li><a href="./products.jsp">Varius purus</a></li>									
								</ul>
							</li>															
							<li><a href="./products.jsp">Man</a></li>			
							<li><a href="./products.jsp">Sport</a>
								<ul>									
									<li><a href="./products.jsp">Gifts and Tech</a></li>
									<li><a href="./products.jsp">Ties and Hats</a></li>
									<li><a href="./products.jsp">Cold Weather</a></li>
								</ul>
							</li>							
							<li><a href="./products.jsp">Hangbag</a></li>
							<li><a href="./products.jsp">Best Seller</a></li>
							<li><a href="./products.jsp">Top Seller</a></li>
						</ul>
					</nav>
				</div>
			</section>			
			<section class="header_text sub">
			<img class="pageBanner" src="themes/images/bookstore.png" alt="New products" >
				<h4><span>Login or Register</span></h4>
			</section>			
			<section class="main-content">				
				<div class="row">
					<div class="span5">					
						<h4 class="title"><span class="text"><strong>Login</strong> Form</span></h4>
						<form action="login.jsp" method="post"><!--  로그인 -->
							<input type="hidden" name="next" value="/">
							<fieldset>
								<div class="control-group">
									<label class="control-label">ID</label>
									<div class="controls"> 
										<input type="text" placeholder="Enter your username" name="ID" class="input-xlarge">
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">Password</label>
									<div class="controls">
										<input type="password" placeholder="Enter your password" name="password" class="input-xlarge">
									</div>
								</div>
								<div class="control-group">
									<input tabindex="3" class="btn btn-inverse large" type="submit" value="로그인">
									<hr>
									<p class="reset">Recover your <a tabindex="4" href="#" title="Recover your username or password">username or password</a></p>
								</div>
							</fieldset>
						</form>				
					</div>
					<div class="span7">					
						<h4 class="title"><span class="text"><strong>Register</strong> Form</span></h4>
						<form OnSubmit="return MemberCheckField1(this);" action="registeration.jsp" method="post" class="form-stacked">
							<fieldset>
								<div class="control-group">
									<label class="control-label">이름</label>
									<div class="controls">
										<input type="text" placeholder="Enter your username" class="input-xlarge" name="name">
										
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">회원 ID:</label>
									<div class="controls">
										<input type="text" placeholder="Enter your email" class="input-xlarge" name="ID">
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">비밀번호:</label>
									<div class="controls">
										<input type="password" placeholder="Enter your password" class="input-xlarge" name="password">
									</div>
								</div>	
								<div class="control-group">
									<label class="control-label">전화번호:</label>
									<div class="controls">
										<input type="text" placeholder="Enter your password" class="input-xlarge" name="phone">
									</div>
								</div>	
								<div class="control-group">
									<label class="control-label">주소:</label>
									<div class="controls">
										<input type="text" placeholder="Enter your password" class="input-xlarge" name="address">
									</div>
								</div>							                            
								<hr>
								<div class="actions"><input tabindex="9" class="btn btn-inverse large" type="submit" value="회원가입"></div>
							</fieldset>
						</form>					
					</div>				
				</div>
			</section>				
			<section id="footer-bar">
				<div class="row">
					<div class="span3">
						<h4>Navigation</h4>
						<ul class="nav">
							<li><a href="./index.jsp">Homepage</a></li>  
							<li><a href="./about.jsp">About Us</a></li>
							<li><a href="./contact.jsp">Contac Us</a></li>
							<li><a href="./cart.jsp">Your Cart</a></li>
							<li><a href="./register.jsp">Login</a></li>							
						</ul>					
					</div>
					<div class="span4">
						<h4>My Account</h4>
						<ul class="nav">
							<li><a href="#">My Account</a></li>
							<li><a href="#">Order History</a></li>
							<li><a href="#">Wish List</a></li>
							<li><a href="#">Newsletter</a></li>
						</ul>
					</div>
					<div class="span5">
						<p class="logo"><img src="themes/images/logo.png" class="site_logo" alt=""></p>
						<p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. the  Lorem Ipsum has been the industry's standard dummy text ever since the you.</p>
						<br/>
						<span class="social_icons">
							<a class="facebook" href="#">Facebook</a>
							<a class="twitter" href="#">Twitter</a>
							<a class="skype" href="#">Skype</a>
							<a class="vimeo" href="#">Vimeo</a>
						</span>
					</div>					
				</div>	
			</section>
			<section id="copyright">
				<span>Copyright 2013 bootstrappage template  All right reserved.</span>
			</section>
		</div>
		<script src="themes/js/common.js"></script>
		<script>
			$(document).ready(function() {
				$('#checkout').click(function (e) {
					document.location.href = "checkout.jsp";
				})
			});
		</script>		
    </body>
</body>
</html>