/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M21
 * Generated at: 2017-06-01 07:54:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.BookStore;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.sql.SQLException");
    _jspx_imports_classes.add("java.sql.Connection");
    _jspx_imports_classes.add("java.sql.ResultSet");
    _jspx_imports_classes.add("java.sql.PreparedStatement");
    _jspx_imports_classes.add("java.sql.DriverManager");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html >\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("      <title>광운서점</title>\r\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("      <meta name=\"description\" content=\"\">\r\n");
      out.write("      <!--[if ie]><meta content='IE=8' http-equiv='X-UA-Compatible'/><![endif]-->\r\n");
      out.write("      <!-- bootstrap -->\r\n");
      out.write("      <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">      \r\n");
      out.write("      <link href=\"bootstrap/css/bootstrap-responsive.min.css\" rel=\"stylesheet\">\r\n");
      out.write("      \r\n");
      out.write("      <link href=\"themes/css/bootstrappage.css\" rel=\"stylesheet\"/>\r\n");
      out.write("      \r\n");
      out.write("      <!-- global styles -->\r\n");
      out.write("      <link href=\"themes/css/flexslider.css\" rel=\"stylesheet\"/>\r\n");
      out.write("      <link href=\"themes/css/main.css\" rel=\"stylesheet\"/>\r\n");
      out.write("\r\n");
      out.write("      <!-- scripts -->\r\n");
      out.write("      <script src=\"themes/js/jquery-1.7.2.min.js\"></script>\r\n");
      out.write("      <script src=\"bootstrap/js/bootstrap.min.js\"></script>            \r\n");
      out.write("      <script src=\"themes/js/superfish.js\"></script>   \r\n");
      out.write("      <script src=\"themes/js/jquery.scrolltotop.js\"></script>\r\n");
      out.write("      <!--[if lt IE 9]>         \r\n");
      out.write("         <script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>\r\n");
      out.write("         <script src=\"js/respond.min.js\"></script>\r\n");
      out.write("      <![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   <div id=\"top-bar\" class=\"container\">\r\n");
      out.write("         <div class=\"row\">\r\n");
      out.write("            <div class=\"span4\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"span8\">\r\n");
      out.write("               <div class=\"account pull-right\">\r\n");
      out.write("                  <ul class=\"user-menu\">         \r\n");
      out.write("                     <li><a href=\"#\">Management</a></li>   \r\n");
      out.write("                     <li><a href=\"cart.html\">Your Cart</a></li>\r\n");
      out.write("                     <li><a href=\"checkout.html\">Checkout</a></li>               \r\n");
      out.write("                     <li><img src=\"http://download.seaicons.com/icons/icons8/windows-8/512/Users-Edit-User-icon.png\" width=\"25\" height=\"25\"></li>      \r\n");
      out.write("                  </ul>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div id=\"wrapper\" class=\"container\">\r\n");
      out.write("         <section class=\"navbar main-menu\">\r\n");
      out.write("            <div class=\"navbar-inner main-menu\">            \r\n");
      out.write("               <a href=\"index.html\" class=\"logo pull-left\"><img src=\"themes/images/logo.png\" class=\"site_logo\" alt=\"\"></a>\r\n");
      out.write("            </div>\r\n");
      out.write("         </section>\r\n");
      out.write("         <section class=\"header_text sub\">\r\n");
      out.write("         <img class=\"pageBanner\" src=\"themes/images/bookstore.png\" alt=\"New products\" >\r\n");
      out.write("         </section>      \r\n");
      out.write("         <section class=\"main-content\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("            <div class=\"span4\">\r\n");
      out.write("               <form method=\"get\" action=\"#\">\r\n");
      out.write("                  <input type=\"text\" class=\"input-block-level search-query\" Placeholder=\"도서이름\" name=\"title\">\r\n");
      out.write("                  <center><input class=\"btn btn-inverse large\" type=\"submit\" name=\"submit\" value=\"검색\"></center>\r\n");
      out.write("               </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"span4\" action=\"#\">\r\n");
      out.write("               <form method=\"get\">\r\n");
      out.write("                  <input type=\"text\" class=\"input-block-level search-query\" Placeholder=\"저자\" name=\"author\">\r\n");
      out.write("                  <center><input type=\"submit\" class=\"btn btn-inverse large\" name=\"submit\" value=\"검색\"></center>\r\n");
      out.write("               </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"span4\" action=\"#\">\r\n");
      out.write("               <form method=\"get\">\r\n");
      out.write("                  <input type=\"text\" class=\"input-block-level search-query\" Placeholder=\"출판사\" name=\"publisher\">\r\n");
      out.write("                  <center><input type=\"submit\" class=\"btn btn-inverse large\" name=\"submit\" value=\"검색\"></center>\r\n");
      out.write("               </form>\r\n");
      out.write("            </div>\r\n");
      out.write("               <div class=\"span12\">   \r\n");
      out.write("                                 \r\n");
      out.write("                  <div class=\"row\">\r\n");
      out.write("                     <div class=\"span12\">\r\n");
      out.write("                        <h4 class=\"title\">\r\n");
      out.write("                           <span class=\"pull-left\"><span class=\"text\"><span class=\"line\">Feature <strong>Products</strong></span></span></span>\r\n");
      out.write("                           <span class=\"pull-right\">\r\n");
      out.write("                              <a class=\"left button\" href=\"#myCarousel\" data-slide=\"prev\"></a><a class=\"right button\" href=\"#myCarousel\" data-slide=\"next\"></a>\r\n");
      out.write("                           </span>\r\n");
      out.write("                        </h4>\r\n");
      out.write("                        <div id=\"myCarousel\" class=\"myCarousel carousel slide\">\r\n");
      out.write("                           <div class=\"carousel-inner\">\r\n");
      out.write("                              <div class=\"active item\">\r\n");
      out.write("                                 <ul class=\"thumbnails\">                                    \r\n");
      out.write("                                    <li class=\"span3\">\r\n");
      out.write("                                       <div class=\"product-box\">\r\n");
      out.write("    ");

        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
         
        try{
            String jdbcDriver = "jdbc:mysql://localhost:3306/bookstore?useUnicode=true&characterEncoding=utf8";
            String dbUser = "root";
            String dbPwd = "0000";
             
            conn = DriverManager.getConnection(jdbcDriver, dbUser, dbPwd);
             
            pstmt = conn.prepareStatement("select * from book;");
             
            rs = pstmt.executeQuery();
             
            while(rs.next()){
    
      out.write("\r\n");
      out.write("    \t<span class=\"sale_tag\"></span>\r\n");
      out.write("    \t<p><a href=\"product_detail.html\"><img src=\"themes/images/ladies/1.jpg\" alt=\"\" /></a></p>\r\n");
      out.write("        <a href=\"product_detail.html\" class=\"title\">ISCBN: ");
      out.print( rs.getString("ISBN") );
      out.write("</a><br/>\r\n");
      out.write("        <a href=\"products.html\" class=\"category\">Title: ");
      out.print( rs.getString("title") );
      out.write("</a>\r\n");
      out.write("        <p class=\"price\">Author: ");
      out.print( rs.getString("author") );
      out.write("</p>\r\n");
      out.write("    ");

            }
        }catch(SQLException se){
            se.printStackTrace();
        }finally{
            if(rs != null) rs.close();
            if(pstmt != null) pstmt.close();
            if(conn != null) conn.close();
        }
    
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"span3\">\r\n");
      out.write("                                       <div class=\"product-box\">\r\n");
      out.write("                                          <span class=\"sale_tag\"></span>\r\n");
      out.write("                                          <p><a href=\"product_detail.html\"><img src=\"themes/images/ladies/2.jpg\" alt=\"\" /></a></p>\r\n");
      out.write("                                          <a href=\"product_detail.html\" class=\"title\">Quis nostrud exerci tation</a><br/>\r\n");
      out.write("                                          <a href=\"products.html\" class=\"category\">Quis nostrud</a>\r\n");
      out.write("                                          <p class=\"price\">$32.50</p>\r\n");
      out.write("                                       </div>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"span3\">\r\n");
      out.write("                                       <div class=\"product-box\">\r\n");
      out.write("                                          <p><a href=\"product_detail.html\"><img src=\"themes/images/ladies/3.jpg\" alt=\"\" /></a></p>\r\n");
      out.write("                                          <a href=\"product_detail.html\" class=\"title\">Know exactly turned</a><br/>\r\n");
      out.write("                                          <a href=\"products.html\" class=\"category\">Quis nostrud</a>\r\n");
      out.write("                                          <p class=\"price\">$14.20</p>\r\n");
      out.write("                                       </div>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"span3\">\r\n");
      out.write("                                       <div class=\"product-box\">\r\n");
      out.write("                                          <p><a href=\"product_detail.html\"><img src=\"themes/images/ladies/4.jpg\" alt=\"\" /></a></p>\r\n");
      out.write("                                          <a href=\"product_detail.html\" class=\"title\">You think fast</a><br/>\r\n");
      out.write("                                          <a href=\"products.html\" class=\"category\">World once</a>\r\n");
      out.write("                                          <p class=\"price\">$31.45</p>\r\n");
      out.write("                                       </div>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                 </ul>\r\n");
      out.write("                              </div>\r\n");
      out.write("                              <div class=\"item\">\r\n");
      out.write("                                 <ul class=\"thumbnails\">\r\n");
      out.write("                                    <li class=\"span3\">\r\n");
      out.write("                                       <div class=\"product-box\">\r\n");
      out.write("                                          <p><a href=\"product_detail.html\"><img src=\"themes/images/ladies/5.jpg\" alt=\"\" /></a></p>\r\n");
      out.write("                                          <a href=\"product_detail.html\" class=\"title\">Know exactly</a><br/>\r\n");
      out.write("                                          <a href=\"products.html\" class=\"category\">Quis nostrud</a>\r\n");
      out.write("                                          <p class=\"price\">$22.30</p>\r\n");
      out.write("                                       </div>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"span3\">\r\n");
      out.write("                                       <div class=\"product-box\">\r\n");
      out.write("                                          <p><a href=\"product_detail.html\"><img src=\"themes/images/ladies/6.jpg\" alt=\"\" /></a></p>\r\n");
      out.write("                                          <a href=\"product_detail.html\" class=\"title\">Ut wisi enim ad</a><br/>\r\n");
      out.write("                                          <a href=\"products.html\" class=\"category\">Commodo consequat</a>\r\n");
      out.write("                                          <p class=\"price\">$40.25</p>\r\n");
      out.write("                                       </div>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"span3\">\r\n");
      out.write("                                       <div class=\"product-box\">\r\n");
      out.write("                                          <p><a href=\"product_detail.html\"><img src=\"themes/images/ladies/7.jpg\" alt=\"\" /></a></p>\r\n");
      out.write("                                          <a href=\"product_detail.html\" class=\"title\">You think water</a><br/>\r\n");
      out.write("                                          <a href=\"products.html\" class=\"category\">World once</a>\r\n");
      out.write("                                          <p class=\"price\">$10.45</p>\r\n");
      out.write("                                       </div>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"span3\">\r\n");
      out.write("                                       <div class=\"product-box\">\r\n");
      out.write("                                          <p><a href=\"product_detail.html\"><img src=\"themes/images/ladies/8.jpg\" alt=\"\" /></a></p>\r\n");
      out.write("                                          <a href=\"product_detail.html\" class=\"title\">Quis nostrud exerci</a><br/>\r\n");
      out.write("                                          <a href=\"products.html\" class=\"category\">Quis nostrud</a>\r\n");
      out.write("                                          <p class=\"price\">$35.50</p>\r\n");
      out.write("                                       </div>\r\n");
      out.write("                                    </li>                                                                                                   \r\n");
      out.write("                                 </ul>\r\n");
      out.write("                              </div>\r\n");
      out.write("                           </div>                     \r\n");
      out.write("                        </div>\r\n");
      out.write("                     </div>                  \r\n");
      out.write("                  </div>\r\n");
      out.write("                  <br/>\r\n");
      out.write("                  <div class=\"row\">\r\n");
      out.write("                     <div class=\"span12\">\r\n");
      out.write("                        <h4 class=\"title\">\r\n");
      out.write("                           <span class=\"pull-left\"><span class=\"text\"><span class=\"line\">Latest <strong>Products</strong></span></span></span>\r\n");
      out.write("                           <span class=\"pull-right\">\r\n");
      out.write("                              <a class=\"left button\" href=\"#myCarousel-2\" data-slide=\"prev\"></a><a class=\"right button\" href=\"#myCarousel-2\" data-slide=\"next\"></a>\r\n");
      out.write("                           </span>\r\n");
      out.write("                        </h4>\r\n");
      out.write("                        <div id=\"myCarousel-2\" class=\"myCarousel carousel slide\">\r\n");
      out.write("                           <div class=\"carousel-inner\">\r\n");
      out.write("                              <div class=\"active item\">\r\n");
      out.write("                                 <ul class=\"thumbnails\">                                    \r\n");
      out.write("                                    <li class=\"span3\">\r\n");
      out.write("                                       <div class=\"product-box\">\r\n");
      out.write("                                          <span class=\"sale_tag\"></span>\r\n");
      out.write("                                          <p><a href=\"product_detail.html\"><img src=\"themes/images/cloth/bootstrap-women-ware2.jpg\" alt=\"\" /></a></p>\r\n");
      out.write("                                          <a href=\"product_detail.html\" class=\"title\">Ut wisi enim ad</a><br/>\r\n");
      out.write("                                          <a href=\"products.html\" class=\"category\">Commodo consequat</a>\r\n");
      out.write("                                          <p class=\"price\">$25.50</p>\r\n");
      out.write("                                       </div>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"span3\">\r\n");
      out.write("                                       <div class=\"product-box\">\r\n");
      out.write("                                          <p><a href=\"product_detail.html\"><img src=\"themes/images/cloth/bootstrap-women-ware1.jpg\" alt=\"\" /></a></p>\r\n");
      out.write("                                          <a href=\"product_detail.html\" class=\"title\">Quis nostrud exerci tation</a><br/>\r\n");
      out.write("                                          <a href=\"products.html\" class=\"category\">Quis nostrud</a>\r\n");
      out.write("                                          <p class=\"price\">$17.55</p>\r\n");
      out.write("                                       </div>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"span3\">\r\n");
      out.write("                                       <div class=\"product-box\">\r\n");
      out.write("                                          <p><a href=\"product_detail.html\"><img src=\"themes/images/cloth/bootstrap-women-ware6.jpg\" alt=\"\" /></a></p>\r\n");
      out.write("                                          <a href=\"product_detail.html\" class=\"title\">Know exactly turned</a><br/>\r\n");
      out.write("                                          <a href=\"products.html\" class=\"category\">Quis nostrud</a>\r\n");
      out.write("                                          <p class=\"price\">$25.30</p>\r\n");
      out.write("                                       </div>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"span3\">\r\n");
      out.write("                                       <div class=\"product-box\">\r\n");
      out.write("                                          <p><a href=\"product_detail.html\"><img src=\"themes/images/cloth/bootstrap-women-ware5.jpg\" alt=\"\" /></a></p>\r\n");
      out.write("                                          <a href=\"product_detail.html\" class=\"title\">You think fast</a><br/>\r\n");
      out.write("                                          <a href=\"products.html\" class=\"category\">World once</a>\r\n");
      out.write("                                          <p class=\"price\">$25.60</p>\r\n");
      out.write("                                       </div>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                 </ul>\r\n");
      out.write("                              </div>\r\n");
      out.write("                              <div class=\"item\">\r\n");
      out.write("                                 <ul class=\"thumbnails\">\r\n");
      out.write("                                    <li class=\"span3\">\r\n");
      out.write("                                       <div class=\"product-box\">\r\n");
      out.write("                                          <p><a href=\"product_detail.html\"><img src=\"themes/images/cloth/bootstrap-women-ware4.jpg\" alt=\"\" /></a></p>\r\n");
      out.write("                                          <a href=\"product_detail.html\" class=\"title\">Know exactly</a><br/>\r\n");
      out.write("                                          <a href=\"products.html\" class=\"category\">Quis nostrud</a>\r\n");
      out.write("                                          <p class=\"price\">$45.50</p>\r\n");
      out.write("                                       </div>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"span3\">\r\n");
      out.write("                                       <div class=\"product-box\">\r\n");
      out.write("                                          <p><a href=\"product_detail.html\"><img src=\"themes/images/cloth/bootstrap-women-ware3.jpg\" alt=\"\" /></a></p>\r\n");
      out.write("                                          <a href=\"product_detail.html\" class=\"title\">Ut wisi enim ad</a><br/>\r\n");
      out.write("                                          <a href=\"products.html\" class=\"category\">Commodo consequat</a>\r\n");
      out.write("                                          <p class=\"price\">$33.50</p>\r\n");
      out.write("                                       </div>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"span3\">\r\n");
      out.write("                                       <div class=\"product-box\">\r\n");
      out.write("                                          <p><a href=\"product_detail.html\"><img src=\"themes/images/cloth/bootstrap-women-ware2.jpg\" alt=\"\" /></a></p>\r\n");
      out.write("                                          <a href=\"product_detail.html\" class=\"title\">You think water</a><br/>\r\n");
      out.write("                                          <a href=\"products.html\" class=\"category\">World once</a>\r\n");
      out.write("                                          <p class=\"price\">$45.30</p>\r\n");
      out.write("                                       </div>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"span3\">\r\n");
      out.write("                                       <div class=\"product-box\">\r\n");
      out.write("                                          <p><a href=\"product_detail.html\"><img src=\"themes/images/cloth/bootstrap-women-ware1.jpg\" alt=\"\" /></a></p>\r\n");
      out.write("                                          <a href=\"product_detail.html\" class=\"title\">Quis nostrud exerci</a><br/>\r\n");
      out.write("                                          <a href=\"products.html\" class=\"category\">Quis nostrud</a>\r\n");
      out.write("                                          <p class=\"price\">$25.20</p>\r\n");
      out.write("                                       </div>\r\n");
      out.write("                                    </li>                                                                                                   \r\n");
      out.write("                                 </ul>\r\n");
      out.write("                              </div>\r\n");
      out.write("                           </div>                     \r\n");
      out.write("                        </div>\r\n");
      out.write("                     </div>                  \r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"row feature_box\">                  \r\n");
      out.write("                     <div class=\"span4\">\r\n");
      out.write("                        <div class=\"service\">\r\n");
      out.write("                           <div class=\"responsive\">   \r\n");
      out.write("                              <img src=\"themes/images/feature_img_2.png\" alt=\"\" />\r\n");
      out.write("                              <h4>MODERN <strong>DESIGN</strong></h4>\r\n");
      out.write("                              <p>Lorem Ipsum is simply dummy text of the printing and printing industry unknown printer.</p>                           \r\n");
      out.write("                           </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                     </div>\r\n");
      out.write("                     <div class=\"span4\">   \r\n");
      out.write("                        <div class=\"service\">\r\n");
      out.write("                           <div class=\"customize\">         \r\n");
      out.write("                              <img src=\"themes/images/feature_img_1.png\" alt=\"\" />\r\n");
      out.write("                              <h4>FREE <strong>SHIPPING</strong></h4>\r\n");
      out.write("                              <p>Lorem Ipsum is simply dummy text of the printing and printing industry unknown printer.</p>\r\n");
      out.write("                           </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                     </div>\r\n");
      out.write("                     <div class=\"span4\">\r\n");
      out.write("                        <div class=\"service\">\r\n");
      out.write("                           <div class=\"support\">   \r\n");
      out.write("                              <img src=\"themes/images/feature_img_3.png\" alt=\"\" />\r\n");
      out.write("                              <h4>24/7 LIVE <strong>SUPPORT</strong></h4>\r\n");
      out.write("                              <p>Lorem Ipsum is simply dummy text of the printing and printing industry unknown printer.</p>\r\n");
      out.write("                           </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                     </div>   \r\n");
      out.write("                  </div>      \r\n");
      out.write("               </div>            \r\n");
      out.write("            </div>\r\n");
      out.write("         </section>\r\n");
      out.write("         \r\n");
      out.write("         <section id=\"footer-bar\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("               <div class=\"span3\">\r\n");
      out.write("                  <h4>Navigation</h4>\r\n");
      out.write("                  <ul class=\"nav\">\r\n");
      out.write("                     <li><a href=\"./index.html\">Homepage</a></li>  \r\n");
      out.write("                     <li><a href=\"./about.html\">About Us</a></li>\r\n");
      out.write("                     <li><a href=\"./contact.html\">Contac Us</a></li>\r\n");
      out.write("                     <li><a href=\"./cart.html\">Your Cart</a></li>\r\n");
      out.write("                     <li><a href=\"./register.html\">Login</a></li>                     \r\n");
      out.write("                  </ul>               \r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"span4\">\r\n");
      out.write("                  <h4>My Account</h4>\r\n");
      out.write("                  <ul class=\"nav\">\r\n");
      out.write("                     <li><a href=\"#\">My Account</a></li>\r\n");
      out.write("                     <li><a href=\"#\">Order History</a></li>\r\n");
      out.write("                     <li><a href=\"#\">Wish List</a></li>\r\n");
      out.write("                     <li><a href=\"#\">Newsletter</a></li>\r\n");
      out.write("                  </ul>\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"span5\">\r\n");
      out.write("                  <p class=\"logo\"><img src=\"themes/images/logo.png\" class=\"site_logo\" alt=\"\"></p>\r\n");
      out.write("                  <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. the  Lorem Ipsum has been the industry's standard dummy text ever since the you.</p>\r\n");
      out.write("                  <br/>\r\n");
      out.write("                  <span class=\"social_icons\">\r\n");
      out.write("                     <a class=\"facebook\" href=\"#\">Facebook</a>\r\n");
      out.write("                     <a class=\"twitter\" href=\"#\">Twitter</a>\r\n");
      out.write("                     <a class=\"skype\" href=\"#\">Skype</a>\r\n");
      out.write("                     <a class=\"vimeo\" href=\"#\">Vimeo</a>\r\n");
      out.write("                  </span>\r\n");
      out.write("               </div>               \r\n");
      out.write("            </div>   \r\n");
      out.write("         </section>\r\n");
      out.write("         <section id=\"copyright\">\r\n");
      out.write("            <span>Copyright 2013 bootstrappage template  All right reserved.</span>\r\n");
      out.write("         </section>\r\n");
      out.write("      </div>\r\n");
      out.write("      <script src=\"themes/js/common.js\"></script>\r\n");
      out.write("      <script src=\"themes/js/jquery.flexslider-min.js\"></script>\r\n");
      out.write("      <script type=\"text/javascript\">\r\n");
      out.write("         $(function() {\r\n");
      out.write("            $(document).ready(function() {\r\n");
      out.write("               $('.flexslider').flexslider({\r\n");
      out.write("                  animation: \"fade\",\r\n");
      out.write("                  slideshowSpeed: 4000,\r\n");
      out.write("                  animationSpeed: 600,\r\n");
      out.write("                  controlNav: false,\r\n");
      out.write("                  directionNav: true,\r\n");
      out.write("                  controlsContainer: \".flex-container\" // the container that holds the flexslider\r\n");
      out.write("               });\r\n");
      out.write("            });\r\n");
      out.write("         });\r\n");
      out.write("      </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}