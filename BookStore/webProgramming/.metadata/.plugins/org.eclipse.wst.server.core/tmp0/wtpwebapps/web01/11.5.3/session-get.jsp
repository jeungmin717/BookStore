<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<h2> GET SESSION INFO</h2>
<br>

The session infomaiton<br>
ID:<%= session.getAttribute("SSid") %>
PASSWORD : <%=session.getAttribute("SSpw") %>
<br>
</body>
</html>