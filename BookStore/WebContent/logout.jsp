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
HttpSession session3 =request.getSession(false);
if(session3!= null){
	session.invalidate();
	
	response.sendRedirect("index2.jsp");
}
%>
<h3>세션이 삭제되었습니다</h3>

<script> 
location.replace("index2.jsp");
</script>
</body>
</html>