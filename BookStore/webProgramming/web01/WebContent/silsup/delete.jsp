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
session.removeAttribute("SSid");
out.println("세션 id 삭제하였습니다");
%>
<br>
<a href="session-get.jsp">
get session info.
</a>
</body>
</html>