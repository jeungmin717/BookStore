
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
logging in....


<%
try{
Connection conn = null;
PreparedStatement pstmt = null;
ResultSet rs = null;

String ID= request.getParameter("ID");
String password = request.getParameter("password");

out.println(ID);
out.println(password);
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/bookstore";
conn=DriverManager.getConnection(url,"root","0000");

String sql = "select * from customer where ID=? AND pw =?";
pstmt=conn.prepareStatement(sql);
pstmt.setString(1, ID);
pstmt.setString(2, password);
rs = pstmt.executeQuery();
out.println("phase 1");

if(rs.next()){
	
	
	session.setAttribute("SSid",ID);
	session.setAttribute("SSpw", password);
	
	HttpSession session2=request.getSession(true);
	out.println("phase 2");
	if(!session2.getAttribute("SSid").equals(null)){
		out.println("새로운 세션이 생성되었습니다 <br>");
		out.println("세션 ID " + session.getId());
	
		if(session2.getAttribute("SSid").equals("admin")){
			//close한다.
			conn.close();
			pstmt.close();
			rs.close();
			out.println("관리자입니다");
			%>
			<script>
			location.replace("admin.jsp") 
			</script>
			
			
		<% } 
		
		
		
		//close한다.
			conn.close();
			pstmt.close();
			rs.close();
			%>
		
	<!-- 게스트일때 -->
	<script>
	location.replace("user.jsp");
	</script>
	
<%}
	
}
//close한다.
conn.close();
pstmt.close();
rs.close();
}catch(Exception e){
	out.println("failed " );
	%>
	
		<script>
		location.assign("register.jsp");
	</script>
	<% 
}
finally{
	
	out.print("finally");
	%>
	
	<script>
	location.assign("register.jsp");
</script>
<% 
	
	
}


%>


</body>
</html>