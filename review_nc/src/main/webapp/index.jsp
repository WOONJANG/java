<%@page import="configure.dataload"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">
		<meta name="viewport" content="width=divice-width,initial-scale=1.0">
		<title> 리뷰 등록 완료 페이지</title>
	</head>
	<body>
<%
	ArrayList<dataload> list = (ArrayList<dataload>)request.getAttribute("list");
	for(dataload aa : list){
%>
고유값 : {<%=aa.getidx() %>}
고객명 : <%=aa.getname() %>
상품명 : <%=aa.getproduct() %>
평점 : <%=aa.getvalues() %>
내용 : <%=aa.gettext() %>
시간 : <%=aa.getdate() %>
이미지 : <%=aa.getimg() %>

<%
	}
%>
	</body>
</html>