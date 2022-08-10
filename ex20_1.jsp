<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 3일차 - ex20.jsp 값전달받음</title>
</head>
<body>
<!--  view 역할 -->
<% request.setCharacterEncoding("UTF-8"); %>
<% String mid = request.getParameter("mid"); %>
<% String mname = request.getParameter("mnm");%>	
<br>
아이디 : <%=mid %>
<br>
이름 : <%=mname %>

</body>
</html>