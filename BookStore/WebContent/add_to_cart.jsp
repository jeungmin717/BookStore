
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
add to cart

<% 
try{
String ISBN = (String)session.getAttribute("ISBN"); 
String quantity= request.getParameter("quantity");
	out.println("phase 1 ");
	out.println(ISBN);
Connection conn = null;
PreparedStatement pstmt = null;
ResultSet rs = null;


Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/bookstore";
conn=DriverManager.getConnection(url,"root","0000");

String sql = "update book set stock=stock-? where ISBN=?;";
pstmt=conn.prepareStatement(sql);
pstmt.setString(1, quantity);
pstmt.setString(2, ISBN);
pstmt.executeUpdate();
out.println("query ended");
//close한다.
conn.close();
pstmt.close();
}catch(Exception e){
	%>
	exception ......
		<script>
	location.replace("checkout.jsp");
	</script>
	<% 
}
finally{
	
	out.print("finally");
	%>
	<script>
	location.replace("checkout.jsp");
</script>
<% 
}
%>


</body>
</html>