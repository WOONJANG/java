<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page buffer="8kb" autoFlush="true"%>
<!-- 1음절당 1byte -->
<%@page isThreadSafe="false" %>
<!-- buffer : 페이지 로드시 읽어 들이는 메모리 사용량 제한-->
<!-- autoFlush : true - 메모리를 비우고 페이지를 리로드 / false - 메모리 데이터를 비우지 않음 -->
<!-- isThreadSafe : true - 멀티쓰레드를 사용함 / false - 멀티쓰레드를 사용하지 않음
		isThreadSafe="true" 권장 - 폼데이터 다중처리시 속도를 높이기 위해서 사용 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 4일차 - Buffer 사용법 + Thread</title>
</head>
<body>

	<%=out.getBufferSize() %>byte
	<%for(int a = 1; a <= 100; a ++){
		out.println(a);
	}
		%>
		
</body>
</html>