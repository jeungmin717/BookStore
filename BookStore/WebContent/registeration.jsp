
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
<title>REGISTER GUEST</title>
</head>
<body>

registering..
/*전역변수 주기 */
<%!
int basket_count=100;
public int basket_count(){
	int basket_count =100;
	return basket_count;
}

%>


<% 
Connection conn = null;
PreparedStatement pstmt = null;
ResultSet rs = null;
/*  내가 추가한 코드 들  */

String ID=request.getParameter("ID");
String pw = request.getParameter("password");
String name =request.getParameter("name");
String phone=request.getParameter("phone");
String address = request.getParameter("address");
/*  내가 추가한 코드 들  */
%>

<% 

Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/bookstore";
conn=DriverManager.getConnection(url,"root","0000");

String sql="INSERT INTO `bookstore`.`customer` (`ID`, `pw`, `name`, `phone`, `address`, `authorization`, `basket_basketID`) VALUES(?,?,?,?,?,0,?)";
pstmt=conn.prepareStatement(sql);

pstmt.setString(1, ID);
pstmt.setString(2, pw);
pstmt.setString(3, name);
pstmt.setString(4, phone);
pstmt.setString(5, address);
pstmt.setInt(6, basket_count);
pstmt.executeUpdate();
basket_count++;

%>
<script>
location.replace("register.html");
</script>

</body>
</html>