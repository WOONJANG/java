<%@page import="config.ex24"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> JSP3일차 상품검색 응용파트</title>
<script>
	function abc() {
		if(f.search.value == ""){
			alert("검색할 상품명을 입력하세요");
			return false;
		}
		else{
			return;
		}
	}
</script>
<%
	request.setCharacterEncoding("UTF-8");
	// ex24_1.jsp include->param
	String ss = request.getParameter("search");
	if(ss == null || "null".equals(ss)){	// 최초 실행시 값이 없을 경우 처리
		ss="";	//초기값
	}
%>
</head>
<body>
	<p>사용자 입력 페이지</p>
	<form id="f" name="f" method="post" action="ex24_1.jsp">
		<input type="text" name="search" value="<%=ss%>">
		<input type="submit" value="검색" onsubmit="return abc();">
	</form>
<%-- 	<jsp:include page="./ex24.jsp"></jsp:include> --%>
			
</body>
</html>