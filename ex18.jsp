<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 3일차 jsp forward형태 - ex17_1과 연계 </title>
</head>
<body>
	<p>해당 페이지는 ex18.jsp 입니다</p>
<jsp:forward page="./ex17_1.jsp"></jsp:forward>
<!-- forward는 자신의 결과값, html코드 등 출력되지 않음 -->
<p>응답확인</p>
</body>
</html>