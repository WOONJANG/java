<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isErrorPage ="true" %>
    <!-- isErrorPage : 기본 : false => 일반 페이지 
    	isErrorPage = "true" => 자신의 페이지는 error 발생시 사용되는 페이지로 인식
    -->
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ERROR PAGE</title>
</head>
<body>
	ERROR PAGE
	<% out.print("CODE ERROR"); %>
</body>
</html>