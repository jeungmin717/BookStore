/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M21
 * Generated at: 2017-06-01 06:58:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.BookStore.themes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<meta charset=\"utf-8\">\r\n");
      out.write("\t\t<title>Bootstrap E-commerce Templates</title>\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\t\t<meta name=\"description\" content=\"\">\r\n");
      out.write("\t\t<!--[if ie]><meta content='IE=8' http-equiv='X-UA-Compatible'/><![endif]-->\r\n");
      out.write("\t\t<!-- bootstrap -->\r\n");
      out.write("\t\t<link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">      \r\n");
      out.write("\t\t<link href=\"bootstrap/css/bootstrap-responsive.min.css\" rel=\"stylesheet\">\t\t\r\n");
      out.write("\t\t<link href=\"themes/css/bootstrappage.css\" rel=\"stylesheet\"/>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- global styles -->\r\n");
      out.write("\t\t<link href=\"themes/css/flexslider.css\" rel=\"stylesheet\"/>\r\n");
      out.write("\t\t<link href=\"themes/css/main.css\" rel=\"stylesheet\"/>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- scripts -->\r\n");
      out.write("\t\t<script src=\"themes/js/jquery-1.7.2.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"bootstrap/js/bootstrap.min.js\"></script>\t\t\t\t\r\n");
      out.write("\t\t<script src=\"themes/js/superfish.js\"></script>\t\r\n");
      out.write("\t\t<script src=\"themes/js/jquery.scrolltotop.js\"></script>\r\n");
      out.write("\t\t<!--[if lt IE 9]>\t\t\t\r\n");
      out.write("\t\t\t<script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"js/respond.min.js\"></script>\r\n");
      out.write("\t\t<![endif]-->\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("      function MemberCheckField1(f){\r\n");
      out.write("\r\n");
      out.write("         if(checkMemberPass1(f.name)== false) return false;\r\n");
      out.write("         if(checkMemberPass2(f.ID)== false) return false;\r\n");
      out.write("         if(checkMemberPass3(f.password)== false) return false;\r\n");
      out.write("         if(checkMemberPass4(f.phone)== false) return false;\r\n");
      out.write("         if(checkMemberPass5(f.address)== false) return false;\r\n");
      out.write("\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      function checkMemberPass1(f) {\r\n");
      out.write("         if(!f.value){\r\n");
      out.write("            alert(\"이름를 입력하여 주세요\");\r\n");
      out.write("            f.value = \"\";\r\n");
      out.write("            f.focus();\r\n");
      out.write("            return false;\r\n");
      out.write("         }\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      function checkMemberPass2(f) {\r\n");
      out.write("         if(!f.value){\r\n");
      out.write("            alert(\"ID를 입력하여 주세요\");\r\n");
      out.write("            f.value = \"\";\r\n");
      out.write("            f.focus();\r\n");
      out.write("            return false;\r\n");
      out.write("         }\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      function checkMemberPass3(f) {\r\n");
      out.write("         if(!f.value){\r\n");
      out.write("            alert(\"비밀번호를 입력하여 주세요\");\r\n");
      out.write("            f.value = \"\";\r\n");
      out.write("            f.focus();\r\n");
      out.write("            return false;\r\n");
      out.write("         }\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      function checkMemberPass4(f) {\r\n");
      out.write("         if(!f.value){\r\n");
      out.write("            alert(\"전화번호를 입력하여 주세요\");\r\n");
      out.write("            f.value = \"\";\r\n");
      out.write("            f.focus();\r\n");
      out.write("            return false;\r\n");
      out.write("         }\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      function checkMemberPass5(f) {\r\n");
      out.write("         if(!f.value){\r\n");
      out.write("            alert(\"주소를 입력하여 주세요\");\r\n");
      out.write("            f.value = \"\";\r\n");
      out.write("            f.focus();\r\n");
      out.write("            return false;\r\n");
      out.write("         }\r\n");
      out.write("      }\r\n");
      out.write("   </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"top-bar\" class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"span4\">\r\n");
      out.write("\t\t\t\t\t<form method=\"POST\" class=\"search_form\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"input-block-level search-query\" Placeholder=\"eg. T-sirt\">\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"span8\">\r\n");
      out.write("\t\t\t\t\t<div class=\"account pull-right\">\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"user-menu\">\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"cart.html\">Your Cart</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"checkout.html\">Checkout</a></li>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"register.html\">Login</a></li>\t\t\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"wrapper\" class=\"container\">\r\n");
      out.write("\t\t\t<section class=\"navbar main-menu\">\r\n");
      out.write("\t\t\t\t<div class=\"navbar-inner main-menu\">\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<a href=\"index.html\" class=\"logo pull-left\"><img src=\"themes/images/logo.png\" class=\"site_logo\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t<nav id=\"menu\" class=\"pull-right\">\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"./products.html\">Woman</a>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"./products.html\">Lacinia nibh</a></li>\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"./products.html\">Eget molestie</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"./products.html\">Varius purus</a></li>\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"./products.html\">Man</a></li>\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"./products.html\">Sport</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"./products.html\">Gifts and Tech</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"./products.html\">Ties and Hats</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"./products.html\">Cold Weather</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"./products.html\">Hangbag</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"./products.html\">Best Seller</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"./products.html\">Top Seller</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\t\t\t<section class=\"header_text sub\">\r\n");
      out.write("\t\t\t<img class=\"pageBanner\" src=\"themes/images/bookstore.png\" alt=\"New products\" >\r\n");
      out.write("\t\t\t</section>\t\t\r\n");
      out.write("\t\t\t<section class=\"main-content\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"span12\">\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"span12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4 class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"pull-left\"><span class=\"text\"><span class=\"line\">Feature <strong>Products</strong></span></span></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"pull-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a class=\"left button\" href=\"#myCarousel\" data-slide=\"prev\"></a><a class=\"right button\" href=\"#myCarousel\" data-slide=\"next\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"myCarousel\" class=\"myCarousel carousel slide\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"carousel-inner\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"active item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"thumbnails\">\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"span3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"product-box\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"sale_tag\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p><a href=\"product_detail.html\"><img src=\"themes/images/ladies/1.jpg\" alt=\"\" /></a></p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"product_detail.html\" class=\"title\">Ut wisi enim ad</a><br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"products.html\" class=\"category\">Commodo consequat</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"price\">$17.25</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"span3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"product-box\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"sale_tag\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p><a href=\"product_detail.html\"><img src=\"themes/images/ladies/2.jpg\" alt=\"\" /></a></p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"product_detail.html\" class=\"title\">Quis nostrud exerci tation</a><br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"products.html\" class=\"category\">Quis nostrud</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"price\">$32.50</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"span3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"product-box\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p><a href=\"product_detail.html\"><img src=\"themes/images/ladies/3.jpg\" alt=\"\" /></a></p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"product_detail.html\" class=\"title\">Know exactly turned</a><br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"products.html\" class=\"category\">Quis nostrud</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"price\">$14.20</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"span3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"product-box\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p><a href=\"product_detail.html\"><img src=\"themes/images/ladies/4.jpg\" alt=\"\" /></a></p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"product_detail.html\" class=\"title\">You think fast</a><br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"products.html\" class=\"category\">World once</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"price\">$31.45</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"thumbnails\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"span3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"product-box\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p><a href=\"product_detail.html\"><img src=\"themes/images/ladies/5.jpg\" alt=\"\" /></a></p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"product_detail.html\" class=\"title\">Know exactly</a><br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"products.html\" class=\"category\">Quis nostrud</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"price\">$22.30</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"span3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"product-box\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p><a href=\"product_detail.html\"><img src=\"themes/images/ladies/6.jpg\" alt=\"\" /></a></p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"product_detail.html\" class=\"title\">Ut wisi enim ad</a><br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"products.html\" class=\"category\">Commodo consequat</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"price\">$40.25</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"span3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"product-box\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p><a href=\"product_detail.html\"><img src=\"themes/images/ladies/7.jpg\" alt=\"\" /></a></p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"product_detail.html\" class=\"title\">You think water</a><br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"products.html\" class=\"category\">World once</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"price\">$10.45</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"span3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"product-box\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p><a href=\"product_detail.html\"><img src=\"themes/images/ladies/8.jpg\" alt=\"\" /></a></p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"product_detail.html\" class=\"title\">Quis nostrud exerci</a><br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"products.html\" class=\"category\">Quis nostrud</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"price\">$35.50</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<br/>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"span12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4 class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"pull-left\"><span class=\"text\"><span class=\"line\">Latest <strong>Products</strong></span></span></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"pull-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a class=\"left button\" href=\"#myCarousel-2\" data-slide=\"prev\"></a><a class=\"right button\" href=\"#myCarousel-2\" data-slide=\"next\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"myCarousel-2\" class=\"myCarousel carousel slide\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"carousel-inner\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"active item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"thumbnails\">\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"span3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"product-box\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"sale_tag\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p><a href=\"product_detail.html\"><img src=\"themes/images/cloth/bootstrap-women-ware2.jpg\" alt=\"\" /></a></p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"product_detail.html\" class=\"title\">Ut wisi enim ad</a><br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"products.html\" class=\"category\">Commodo consequat</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"price\">$25.50</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"span3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"product-box\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p><a href=\"product_detail.html\"><img src=\"themes/images/cloth/bootstrap-women-ware1.jpg\" alt=\"\" /></a></p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"product_detail.html\" class=\"title\">Quis nostrud exerci tation</a><br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"products.html\" class=\"category\">Quis nostrud</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"price\">$17.55</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"span3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"product-box\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p><a href=\"product_detail.html\"><img src=\"themes/images/cloth/bootstrap-women-ware6.jpg\" alt=\"\" /></a></p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"product_detail.html\" class=\"title\">Know exactly turned</a><br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"products.html\" class=\"category\">Quis nostrud</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"price\">$25.30</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"span3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"product-box\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p><a href=\"product_detail.html\"><img src=\"themes/images/cloth/bootstrap-women-ware5.jpg\" alt=\"\" /></a></p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"product_detail.html\" class=\"title\">You think fast</a><br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"products.html\" class=\"category\">World once</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"price\">$25.60</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"thumbnails\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"span3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"product-box\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p><a href=\"product_detail.html\"><img src=\"themes/images/cloth/bootstrap-women-ware4.jpg\" alt=\"\" /></a></p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"product_detail.html\" class=\"title\">Know exactly</a><br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"products.html\" class=\"category\">Quis nostrud</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"price\">$45.50</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"span3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"product-box\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p><a href=\"product_detail.html\"><img src=\"themes/images/cloth/bootstrap-women-ware3.jpg\" alt=\"\" /></a></p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"product_detail.html\" class=\"title\">Ut wisi enim ad</a><br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"products.html\" class=\"category\">Commodo consequat</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"price\">$33.50</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"span3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"product-box\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p><a href=\"product_detail.html\"><img src=\"themes/images/cloth/bootstrap-women-ware2.jpg\" alt=\"\" /></a></p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"product_detail.html\" class=\"title\">You think water</a><br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"products.html\" class=\"category\">World once</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"price\">$45.30</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"span3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"product-box\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p><a href=\"product_detail.html\"><img src=\"themes/images/cloth/bootstrap-women-ware1.jpg\" alt=\"\" /></a></p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"product_detail.html\" class=\"title\">Quis nostrud exerci</a><br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"products.html\" class=\"category\">Quis nostrud</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"price\">$25.20</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row feature_box\">\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"span4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"service\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"responsive\">\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"themes/images/feature_img_2.png\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4>MODERN <strong>DESIGN</strong></h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>Lorem Ipsum is simply dummy text of the printing and printing industry unknown printer.</p>\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"span4\">\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"service\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"customize\">\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"themes/images/feature_img_1.png\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4>FREE <strong>SHIPPING</strong></h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>Lorem Ipsum is simply dummy text of the printing and printing industry unknown printer.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"span4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"service\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"support\">\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"themes/images/feature_img_3.png\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4>24/7 LIVE <strong>SUPPORT</strong></h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>Lorem Ipsum is simply dummy text of the printing and printing industry unknown printer.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t\t</div>\t\t\r\n");
      out.write("\t\t\t\t\t</div>\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<section id=\"footer-bar\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"span3\">\r\n");
      out.write("\t\t\t\t\t\t<h4>Navigation</h4>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"./index.html\">Homepage</a></li>  \r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"./about.html\">About Us</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"./contact.html\">Contac Us</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"./cart.html\">Your Cart</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"./register.html\">Login</a></li>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</ul>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"span4\">\r\n");
      out.write("\t\t\t\t\t\t<h4>My Account</h4>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">My Account</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Order History</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Wish List</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Newsletter</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"span5\">\r\n");
      out.write("\t\t\t\t\t\t<p class=\"logo\"><img src=\"themes/images/logo.png\" class=\"site_logo\" alt=\"\"></p>\r\n");
      out.write("\t\t\t\t\t\t<p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. the  Lorem Ipsum has been the industry's standard dummy text ever since the you.</p>\r\n");
      out.write("\t\t\t\t\t\t<br/>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"social_icons\">\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"facebook\" href=\"#\">Facebook</a>\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"twitter\" href=\"#\">Twitter</a>\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"skype\" href=\"#\">Skype</a>\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"vimeo\" href=\"#\">Vimeo</a>\r\n");
      out.write("\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t</div>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\t\t\t<section id=\"copyright\">\r\n");
      out.write("\t\t\t\t<span>Copyright 2013 bootstrappage template  All right reserved.</span>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<script src=\"themes/js/common.js\"></script>\r\n");
      out.write("\t\t<script src=\"themes/js/jquery.flexslider-min.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t$(function() {\r\n");
      out.write("\t\t\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\t\t\t$('.flexslider').flexslider({\r\n");
      out.write("\t\t\t\t\t\tanimation: \"fade\",\r\n");
      out.write("\t\t\t\t\t\tslideshowSpeed: 4000,\r\n");
      out.write("\t\t\t\t\t\tanimationSpeed: 600,\r\n");
      out.write("\t\t\t\t\t\tcontrolNav: false,\r\n");
      out.write("\t\t\t\t\t\tdirectionNav: true,\r\n");
      out.write("\t\t\t\t\t\tcontrolsContainer: \".flex-container\" // the container that holds the flexslider\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t</script>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
