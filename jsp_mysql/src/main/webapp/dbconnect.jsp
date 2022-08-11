<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta charset="UTF-8">
<%
		Connection CON = null;
	try{
		String DRIVER = "com.mysql.jdbc.Driver";
		String URL = "jdbc:mysql://umj7-009.cafe24.com/jangwoon0518";
		String ID = "jangwoon0518";
		String PW = "boyun981124@";
		Class.forName(DRIVER);
		CON = DriverManager.getConnection(URL,ID,PW);
// 		out.print("<script>alert('DB CONNECTION SUCCESS')</script>");
	}catch(Exception e){
		out.print("<script>alert('DB CONNECTION FAIL')</script>");
	}
%>
