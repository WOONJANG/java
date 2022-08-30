<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- tiles.apache.org : backend가 유일하게 피이지 레이아웃을 구성하는 라이브러리가 있음
    
    tiles 라이브러리를 꼭 pom.xml에 추가 하고 and tiles.xml을 생성하여 적용해 주도록한다
    
    단, class의 경로 시용시 /가 아닌 . 으로 설정해야 함
     -->
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>고객센터</title>
</head>
<body>
	<!-- header -->
	<tiles:insertAttribute name="header"></tiles:insertAttribute>
	<!-- main -->
	<section style="background-color: orange;">
	고객센터 메인
	</section>
	<!-- footer -->
	<tiles:insertAttribute name="footer"></tiles:insertAttribute>
</body>
</html>