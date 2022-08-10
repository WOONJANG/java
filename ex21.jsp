<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 3일차 -include 전송 </title>
</head>
<body>
<!--  include : post형식 -->
<!-- 
1. ex21에서 mid mnm을 보냅니다 ex21_1
2. ex21_1에서 c값을 변경 -> ex21_2
3. ex21_2에서 최종 결과값을 출력 + ex21_1에서 추가로 결과값을 받을 수 있도록 
	d라는 매개 변수를 추가하여 전달
4. ex21에서는  ex21_2에서 추가된 매개변수를 출력하게 된다.
 -->
<p>회원정보 확인</p>
<jsp:include page="./ex21_1.jsp" flush="false">
	<jsp:param value="yi" name="mid"></jsp:param>
	<jsp:param value="이순신" name="mnm"></jsp:param>
	<jsp:param value="test2" name="c"></jsp:param>
</jsp:include>
<br>
<%@ include file="./ex21_2.jsp" %> <!-- 최종 결과 확인을 위해서 로드를 하게 됨 -->
<%
out.print(d);
%>

</body>
</html>