<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 3일차 - action 태그 활용</title>
</head>
<body>
<!-- 
	jsp 태그 사용 형태 : server + client 쪽에 명령을 적용할 수 있음
<%-- 	<%@ include%> 로 사용했을때는 페이지를 불러오기만 함 --%>
foward : 다른페이지로 이동과 같은 페이지 흐름을 제어함 -->
<!--  <jsp:/> jsp 액션 태그 -->
<%-- <jsp:forward page="ex17_1.jsp">	 --%>
<!-- jsp tag를 열었으면 닫아야 함(/)
forward : ex17_1.jsp의 값을 가져옴  -->
<jsp:include page="ex17_1.jsp" flush="false"></jsp:include>
<!-- include : 외부 페이지의 내용을 포함하거나 페이지를 모듈화 함 -->
<p> 테스트입니다 </p>
</body>
</html>