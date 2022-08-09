<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="application/json; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%	
	// ajax 통신시 HTML 코드는 별도로 사용하지 않음
// 	JSONObject js = new JSONObject();	// JSP에서 JSON 파일 처럼 배열로 인식 되도록 하는 클래스
	String aa = request.getParameter("mid").intern();
	String bb;
// 	if(aa == "hong"){
// 		bb = "no";
// 	}
// 	else{
// 		bb = "ok";
// 	}
// 	js.put("sign",bb);	// put 이용하여 배열로 생성 ("배열키", 배열값)
// 	out.print(js);
JSONObject js = new JSONObject();
JSONArray ar = new JSONArray();

	String a = "hong";
	String b = "홍길동";
	js.put("mid",a);
	js.put("mname",b);
	out.print(js);
	
%>