<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>



 <%
 
 		String title = request.getParameter("title");
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
         
        try{
            String jdbcDriver = "jdbc:mysql://localhost:3306/bookstore?useUnicode=true&characterEncoding=utf8";
            String dbUser = "root";
            String dbPwd = "0000";
             
            conn = DriverManager.getConnection(jdbcDriver, dbUser, dbPwd);
             
            pstmt = conn.prepareStatement("select * from book where title=?;");
            pstmt.setString(1,title);
            rs = pstmt.executeQuery();
             
            while(rs.next()){
    %>
<% String ISBN = rs.getString("ISBN");
/* 여기서 변수에 값을 넣는데 이것을 전달하면되요 */
out.println(ISBN);
session.setAttribute("ISBN", ISBN );


%>

<span class="sale_tag"></span>
    	<p><a href="product_detail.jsp"><img src="themes/images/ladies/1.jpg" alt="" />
    	</a></p>
        <a href="product_detail.jsp?name=<%=ISBN%>" class="title">ISBN: <%= rs.getString("ISBN")%></a><br/>
        <a href="products.jsp" class="category">Title: <%= rs.getString("title") %></a>
        <p class="price">Author: <%= rs.getString("author") %></p>

 <%
            }
        }catch(SQLException se){
            se.printStackTrace();
        }finally{
            if(rs != null) rs.close();
            if(pstmt != null) pstmt.close();
            if(conn != null) conn.close();
        }
    %>
<script>
   </div>
                                    </li>
                                    <li class="span3">
                                       <div class="product-box">
                                          <span class="sale_tag"></span>
                                          <p><a href="product_detail.jsp"><img src="themes/images/ladies/2.jpg" alt="" /></a></p>
                                          <a href="product_detail.jsp" class="title">Quis nostrud exerci tation</a><br/>
                                          <a href="products.jsp" class="category">Quis nostrud</a>
                                          <p class="price">$32.50</p>
                                       </div>
                                    </li>
                                    <li class="span3">
                                       <div class="product-box">
                                          <p><a href="product_detail.jsp"><img src="themes/images/ladies/3.jpg" alt="" /></a></p>
                                          <a href="product_detail.jsp" class="title">Know exactly turned</a><br/>
                                          <a href="products.jsp" class="category">Quis nostrud</a>
                                          <p class="price">$14.20</p>
                                       </div>
                                    </li>
                                    <li class="span3">
                                       <div class="product-box">
                                          <p><a href="product_detail.jsp"><img src="themes/images/ladies/4.jpg" alt="" /></a></p>
                                          <a href="product_detail.jsp" class="title">You think fast</a><br/>
                                          <a href="products.jsp" class="category">World once</a>
                                          <p class="price">$31.45</p>
                                       </div>
                                    </li>
                                 </ul>
                              </div>
                              <div class="item">
                                 <ul class="thumbnails">
                                    <li class="span3">
                                       <div class="product-box">
                                          <p><a href="product_detail.jsp"><img src="themes/images/ladies/5.jpg" alt="" /></a></p>
                                          <a href="product_detail.jsp" class="title">Know exactly</a><br/>
                                          <a href="products.jsp" class="category">Quis nostrud</a>
                                          <p class="price">$22.30</p>
                                       </div>
                                    </li>
                                    <li class="span3">
                                       <div class="product-box">
                                          <p><a href="product_detail.jsp"><img src="themes/images/ladies/6.jpg" alt="" /></a></p>
                                          <a href="product_detail.jsp" class="title">Ut wisi enim ad</a><br/>
                                          <a href="products.jsp" class="category">Commodo consequat</a>
                                          <p class="price">$40.25</p>
                                       </div>
                                    </li>
                                    <li class="span3">
                                       <div class="product-box">
                                          <p><a href="product_detail.jsp"><img src="themes/images/ladies/7.jpg" alt="" /></a></p>
                                          <a href="product_detail.jsp" class="title">You think water</a><br/>
                                          <a href="products.jsp" class="category">World once</a>
                                          <p class="price">$10.45</p>
                                       </div>
                                    </li>
                                    <li class="span3">
                                       <div class="product-box">
                                          <p><a href="product_detail.jsp"><img src="themes/images/ladies/8.jpg" alt="" /></a></p>
                                          <a href="product_detail.jsp" class="title">Quis nostrud exerci</a><br/>
                                          <a href="products.jsp" class="category">Quis nostrud</a>
                                          <p class="price">$35.50</p>
                                       </div>
                                    </li>                                                                                                   
                                 </ul>
                              </div>
                           </div>                     
                        </div>
                     </div>                  
                  </div>
                  <br/>
                  <div class="row">
                     <div class="span12">
                        <h4 class="title">
                           <span class="pull-left"><span class="text"><span class="line">Latest <strong>Products</strong></span></span></span>
                           <span class="pull-right">
                              <a class="left button" href="#myCarousel-2" data-slide="prev"></a><a class="right button" href="#myCarousel-2" data-slide="next"></a>
                           </span>
                        </h4>
                        <div id="myCarousel-2" class="myCarousel carousel slide">
                           <div class="carousel-inner">
                              <div class="active item">
                                 <ul class="thumbnails">                                    
                                    <li class="span3">
                                       <div class="product-box">
                                          <span class="sale_tag"></span>
                                          <p><a href="product_detail.jsp"><img src="themes/images/cloth/bootstrap-women-ware2.jpg" alt="" /></a></p>
                                          <a href="product_detail.jsp" class="title">Ut wisi enim ad</a><br/>
                                          <a href="products.jsp" class="category">Commodo consequat</a>
                                          <p class="price">$25.50</p>
                                       </div>
                                    </li>
                                    <li class="span3">
                                       <div class="product-box">
                                          <p><a href="product_detail.jsp"><img src="themes/images/cloth/bootstrap-women-ware1.jpg" alt="" /></a></p>
                                          <a href="product_detail.jsp" class="title">Quis nostrud exerci tation</a><br/>
                                          <a href="products.jsp" class="category">Quis nostrud</a>
                                          <p class="price">$17.55</p>
                                       </div>
                                    </li>
                                    <li class="span3">
                                       <div class="product-box">
                                          <p><a href="product_detail.jsp"><img src="themes/images/cloth/bootstrap-women-ware6.jpg" alt="" /></a></p>
                                          <a href="product_detail.jsp" class="title">Know exactly turned</a><br/>
                                          <a href="products.jsp" class="category">Quis nostrud</a>
                                          <p class="price">$25.30</p>
                                       </div>
                                    </li>
                                    <li class="span3">
                                       <div class="product-box">
                                          <p><a href="product_detail.jsp"><img src="themes/images/cloth/bootstrap-women-ware5.jpg" alt="" /></a></p>
                                          <a href="product_detail.jsp" class="title">You think fast</a><br/>
                                          <a href="products.jsp" class="category">World once</a>
                                          <p class="price">$25.60</p>
                                       </div>
                                    </li>
                                 </ul>
                              </div>
                              <div class="item">
                                 <ul class="thumbnails">
                                    <li class="span3">
                                       <div class="product-box">
                                          <p><a href="product_detail.jsp"><img src="themes/images/cloth/bootstrap-women-ware4.jpg" alt="" /></a></p>
                                          <a href="product_detail.jsp" class="title">Know exactly</a><br/>
                                          <a href="products.jsp" class="category">Quis nostrud</a>
                                          <p class="price">$45.50</p>
                                       </div>
                                    </li>
                                    <li class="span3">
                                       <div class="product-box">
                                          <p><a href="product_detail.jsp"><img src="themes/images/cloth/bootstrap-women-ware3.jpg" alt="" /></a></p>
                                          <a href="product_detail.jsp" class="title">Ut wisi enim ad</a><br/>
                                          <a href="products.jsp" class="category">Commodo consequat</a>
                                          <p class="price">$33.50</p>
                                       </div>
                                    </li>
                                    <li class="span3">
                                       <div class="product-box">
                                          <p><a href="product_detail.jsp"><img src="themes/images/cloth/bootstrap-women-ware2.jpg" alt="" /></a></p>
                                          <a href="product_detail.jsp" class="title">You think water</a><br/>
                                          <a href="products.jsp" class="category">World once</a>
                                          <p class="price">$45.30</p>
                                       </div>
                                    </li>
                                    <li class="span3">
                                       <div class="product-box">
                                          <p><a href="product_detail.jsp"><img src="themes/images/cloth/bootstrap-women-ware1.jpg" alt="" /></a></p>
                                          <a href="product_detail.jsp" class="title">Quis nostrud exerci</a><br/>
                                          <a href="products.jsp" class="category">Quis nostrud</a>
                                          <p class="price">$25.20</p>
                                       </div>
                                    </li>                                                                                                   
                                 </ul>
                              </div>
                           </div>                     
                        </div>
                     </div>                  
                  </div>
                  <div class="row feature_box">                  
                     <div class="span4">
                        <div class="service">
                           <div class="responsive">   
                              <img src="themes/images/feature_img_2.png" alt="" />
                              <h4>MODERN <strong>DESIGN</strong></h4>
                              <p>Lorem Ipsum is simply dummy text of the printing and printing industry unknown printer.</p>                           
                           </div>
                        </div>
                     </div>
                     <div class="span4">   
                        <div class="service">
                           <div class="customize">         
                              <img src="themes/images/feature_img_1.png" alt="" />
                              <h4>FREE <strong>SHIPPING</strong></h4>
                              <p>Lorem Ipsum is simply dummy text of the printing and printing industry unknown printer.</p>
                           </div>
                        </div>
                     </div>
                     <div class="span4">
                        <div class="service">
                           <div class="support">   
                              <img src="themes/images/feature_img_3.png" alt="" />
                              <h4>24/7 LIVE <strong>SUPPORT</strong></h4>
                              <p>Lorem Ipsum is simply dummy text of the printing and printing industry unknown printer.</p>
                           </div>
                        </div>
                     </div>   
                  </div>      
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
      <script src="themes/js/jquery.flexslider-min.js"></script>
      <script type="text/javascript">
         $(function() {
            $(document).ready(function() {
               $('.flexslider').flexslider({
                  animation: "fade",
                  slideshowSpeed: 4000,
                  animationSpeed: 600,
                  controlNav: false,
                  directionNav: true,
                  controlsContainer: ".flex-container" // the container that holds the flexslider
               });
            });
         });
      </script>


</body>
</html>