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
//JavaBeans registerBean =new JavaBeans();  기능을 밑에서해준것
%>
<jsp:useBean id="registerBean" class="javabean.JavaBeans">
<jsp:setProperty name ="registerBean" property="*" />
</jsp:useBean>
<%@ page import="java.sql.Timestamp"%>
<%
registerBean.setReg_date(new Timestamp(System.currentTimeMillis()));
out.println(new  Timestamp(System.currentTimeMillis()));
%>

<input type="hidden" name="reg_date" value ="<%System.currentTimeMillis()%>">





</body>
</html>