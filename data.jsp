<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.JSONArray"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//CORS : 도메인 및 IP가 다를 경우 외부에서 .json을 가져가지 못함
	response.addHeader("Access-Control-Allow-Origin","*");
	response.addHeader("Access-Control-Allow-Credentials","true");
	// response.addHeader : .bashrc(서버) 입력하게 되어 있음
	// JSP에 코드를 입력해서 Access-Control-Allow 이용해서 허락을 적용
	
	// A서버에서 자신의 서버로 접속시 허락된 파라미터
	String aa = request.getParameter("apikey").intern();
	
	if(aa=="aaaa"){	// 내가 지정한 키 값 : aaaa
		String arr[][] = {
				{"NO1","박"},
				{"JJANG","오"}
		};
		JSONArray ar = new JSONArray();	//JSONArray는 각각의 뱌열로 만들어진 데이터를 그룹화[] 하여 값을 저장하는 클래스
		for(int f=0; f < arr.length; f ++){
			JSONObject js = new JSONObject();
			js.put("mid",arr[f][0]);
			js.put("mname",arr[f][1]);
			ar.add(js);
		}
		out.print(ar); // 배열값을 전송시켜줌
	}
%>