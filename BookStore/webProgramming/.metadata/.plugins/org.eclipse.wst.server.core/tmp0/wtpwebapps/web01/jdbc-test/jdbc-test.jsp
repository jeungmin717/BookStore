
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




<table border= "1" align="center" >
<tr>
<td align ="center"> Stduent_ID</td> <td align="center"> Name </td>
<td align ="center"> E-mail</td> <td algin="center"> Address</td>
</tr>

<% 

Connection conn = null;
PreparedStatement pstmt = null;
ResultSet rs = null;

Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/school";
conn=DriverManager.getConnection(url,"root","0000");
String sql="select * from student";
pstmt=conn.prepareStatement(sql);
rs=pstmt.executeQuery(sql);




%>
</table>


</table>
</body>
</html>