<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 3일차 -include 값 받기 </title>
</head>
<body>
<% request.setCharacterEncoding("UTF-8"); %>
<% String mid2 =  request.getParameter("mid");%>
<% String mnm2 =  request.getParameter("mnm");%>
<% String c = request.getParameter("c"); %>
<% String d = "ex21_2에대한값"; %>
<p>ex21.jsp 리턴 콜</p>
아이디 : <%=mid2 %><br>
성명 : <%=mnm2 %><br>
<%=c %>
</body>
</html>