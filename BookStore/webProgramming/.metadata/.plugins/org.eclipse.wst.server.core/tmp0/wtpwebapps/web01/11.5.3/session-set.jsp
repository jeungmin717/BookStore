<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<% 
String id = request.getParameter("id");
String pw = request.getParameter("pw");
%>

ID: <%= id %><br>
Password: <%= pw%><br>

<% session.setAttribute("SSid",id);
session.setAttribute("SSpw", pw);
%>

<a href = "session-get.jsp">
Move to session-get PAge 

</a>
</body>
</html>