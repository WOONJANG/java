<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta charset="UTF-8">

<%
	// select2.jsp 에서 받은 부분을 switch로 확인 
	String CATEGORY = request.getParameter("CATEGORY").intern();
	String MSG = "";
	switch(CATEGORY){
	case "0" :
		MSG = "JAVA";
		break;
	case "1" :
		MSG = "JAVA SERVLET";
		break;
	case "2" :
		MSG = "JAVA SCRIPT";
		break;
	case "3" :
		MSG = "AJAX";
		break;
	case "4" :
		MSG = "JSP";
		break;
	}
	request.setAttribute("MSG", MSG);
%>