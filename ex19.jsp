<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 3일차 jsp include형태 - ex17_1과 연계 </title>
</head>
<body>
	<p>해당 페이지는 ex19.jsp 입니다</p>
<jsp:include page="./ex17_1.jsp" flush="false"></jsp:include>
<!-- include는 자신의 결과값 또는 html 코드도 출력하며 외부의 파일(jsp)도 같이 출력 됨 -->
<!-- flush="false"/"true"
	true = 외부파일(17_1)로 제어가 이동할 때 지금 까지 출력된 버퍼에 저장된 내용을 웹브라우저에 출력하고 버퍼를 지움
	false = 외부파일에 사용되는 버퍼를 지우지않음 
 -->
<p>응답확인</p>
</body>
</html>