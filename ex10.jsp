<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ isScriptingEnabled ="true"%> 
<!--     isScriptingEnabled : 디렉티브 태그를 사용 유/무 -->
    <!-- errorPage : 코드 또는 Servlet등 다양한 오류 발생시 해당페이지로 이동
    web.xml에 오류코드를 입력하여 페이지가 로드되도록한다.
      <error-page>
  	<error-code>500</error-code>
  	<error-code>404</error-code>
  	<location>/error.jsp</location>
  </error-page>
     -->
    <%@page errorPage = "./error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 2일차 4 - page 디렉티브2</title>
</head>
<body>

	<%--
	
	<%=(Stirng)request.getParameter("test")%>
	
	 --%>
	 <!-- 강제로 에러 만듦 -->

</body>
</html>