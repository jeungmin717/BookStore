<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
Values passed from get.html <br><br>
<%

String name =request.getParameter("name");
String id = request.getParameter("id");
String dept = request.getParameter("dept");
out.println("Name : " + name + "<br>");
out.println("ID : " + id + "<br>");
out.println("Department : " + dept + "<br>");

%><br><br>
</center>
</body>
</html>