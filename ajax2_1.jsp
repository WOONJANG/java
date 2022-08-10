<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="application/json; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String key = request.getParameter("apikey").intern(); 
	if(key == "uchyu"){
		String [][] weather = {
				{"a1","85"},
				{"a2","12"},
				{"a3","120"},
				{"a4","132"},
				{"a5","165"},
				{"a6","182"}
		};
		// DB or 배열을 파싱하는 작업
		JSONArray ja = new JSONArray();
		int w = 0;
		while(w < weather.length){
			JSONObject jo = new JSONObject();
			jo.put("area", weather[w][0]);	
			jo.put("rain", weather[w][1]);
			ja.add(jo);
			w++;
		}
		out.print(ja);	// 최종 배열값을 보내는 형태
	}
	else{	// 에러 발생
		JSONObject jo2 = new JSONObject();
		jo2.put("data","error");
		out.print(jo2);	// 에러 출력 
	}

%>