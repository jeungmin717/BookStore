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
			<script src="themes/js/respond.min.js"></script>
		<![endif]-->
</head>
<body>
	<div id="top-bar" class="container">
			<div class="row">
				<div class="span4">
					
				</div>
				<div class="span8">
					<div class="account pull-right">
						<ul class="user-menu">				
							<li><a href="cart.html">Your Cart</a></li>
							<li><a href="checkout.html">Checkout</a></li>					
							<li><a href="register.html">Login</a></li>			
						</ul>
					</div>
				</div>
			</div>
		</div>
		<div id="wrapper" class="container">
			<section class="navbar main-menu">
				<div class="navbar-inner main-menu">				
					<a href="index.html" class="logo pull-left"><img src="themes/images/logo.png" class="site_logo" alt=""></a>
				</div>
			</section>				
			<section class="header_text sub">
			<img class="pageBanner" src="themes/images/bookstore.png" alt="New products" >
				<h4><span>Shopping Cart</span></h4>
			</section>
			<section class="main-content">				
				<div class="row">
					<div class="span9">					
						<h4 class="title"><span class="text"><strong>Your</strong> Cart</span></h4>
						<table class="table table-striped">
							<thead>
								<tr>
									<th>Remove</th>
									<th>Image</th>
									<th>Product Name</th>
									<th>Quantity</th>
									<th>Unit Price</th>
									<th>Total</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td><input type="checkbox" value="option1"></td>
									<td><a href="product_detail.html"><img alt="" src="themes/images/ladies/9.jpg" width="100", height="100"></a></td>
									<td>Fusce id molestie massa</td>
									<td><input type="text" placeholder="1" class="input-mini"></td>
									<td>$2,350.00</td>
									<td>$2,350.00</td>
								</tr>			  
								<tr>
									<td><input type="checkbox" value="option1"></td>
									<td><a href="product_detail.html"><img alt="" src="themes/images/ladies/1.jpg" width="100", height="100"></a></td>
									<td>Luctus quam ultrices rutrum</td>
									<td><input type="text" placeholder="2" class="input-mini"></td>
									<td>$1,150.00</td>
									<td>$2,450.00</td>
								</tr>
								<tr>
									<td><input type="checkbox" value="option1"></td>
									<td><a href="product_detail.html"><img alt="" src="themes/images/ladies/3.jpg" width="100", height="100"></a></td>
									<td>Wuam ultrices rutrum</td>
									<td><input type="text" placeholder="1" class="input-mini"></td>
									<td>$1,210.00</td>
									<td>$1,123.00</td>
								</tr>
								<tr>
									<td>&nbsp;</td>
									<td>&nbsp;</td>
									<td>&nbsp;</td>
									<td>&nbsp;</td>
									<td>&nbsp;</td>
									<td><strong>$3,600.00</strong></td>
								</tr>		  
							</tbody>
						</table>
						<hr>
						<p class="cart-total right">
							<strong>Sub-Total</strong>:	$100.00<br>
							<strong>Eco Tax (-2.00)</strong>: $2.00<br>
							<strong>VAT (17.5%)</strong>: $17.50<br>
							<strong>Total</strong>: $119.50<br>
						</p>
						<hr/>
						<p class="buttons center">				
							<button class="btn" type="button">Update</button>
							<button class="btn" type="button">Continue</button>
							<button class="btn btn-inverse" type="submit" id="checkout">Checkout</button>
						</p>					
					</div>
								
					
				</div>
			</section>			
			<section id="footer-bar">
				<div class="row">
					<div class="span3">
						<h4>Navigation</h4>
						<ul class="nav">
							<li><a href="./index.html">Homepage</a></li>  
							<li><a href="./about.html">About Us</a></li>
							<li><a href="./contact.html">Contac Us</a></li>
							<li><a href="./cart.html">Your Cart</a></li>
							<li><a href="./register.html">Login</a></li>							
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
					document.location.href = "checkout.html";
				})
			});
		</script>		
    </body>
</body>
</html>