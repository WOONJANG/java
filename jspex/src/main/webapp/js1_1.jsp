<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>js1 - session 생성</title>
</head>
<body>

<%

// 	request.setAttribute(name, o);
// 	request.getAttributeNames(name);
	
	String user = "hong";
	String email = "hong@test.com";
	int level = 4;
	
	session.setAttribute("mid", user);
	session.setAttribute("mail", email);
	session.setAttribute("lv", level);
	
	long last = session.getLastAccessedTime();	// 세션 유지 시간
	long create = session.getCreationTime();	// 세션 생성 시간
	long user_time = (last-create) / 60000;	// 세션 경과 시간
	
// 	MaxInactiveInterval : 기본 유지시간 1800초
// 	session.setMaxInactiveInterval(60 * 60); // 유지시간을 3600초으로 변경
// 	session.setMaxInactiveInterval(-1);	// 세션 유지시간 무한
// 	session.setMaxInactiveInterval(0);	// 세션 유지시간 소멸
	int time = session.getMaxInactiveInterval() / 60; // 30초동안 session 사용
// 	out.print(time);
%>	

세션 유지 시간 : <%=last %><br> 
세션 생성 시간 : <%=create %><br>
세션 경과 시간 : <%=user_time %><br>
</body>
</html>