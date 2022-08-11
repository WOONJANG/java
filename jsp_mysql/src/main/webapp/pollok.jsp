<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalDateTime"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>설문조사 참여자 저장파일</title>
</head>
<body>
<%@ include file="./dbconnect.jsp" %>
<%
	request.setCharacterEncoding("UTF-8");
	
	ArrayList<String> poll_data = new ArrayList<String>();
	
	//replace / replaceAll 차이
	//trim 공백제거 (앞,뒤)
	
	String NAME = request.getParameter("user_name").replaceAll(" ","");
	String ID = request.getParameter("user_id").replaceAll(" ","");
	String TEL = request.getParameter("user_tel").replaceAll(" ","");
	String SUB = request.getParameter("rd"); 
	LocalDateTime TIME = LocalDateTime.now();
	DateTimeFormatter DTF = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss");
	String NOW = TIME.format(DTF);
	
	poll_data.add(NAME);
	poll_data.add(ID);
	poll_data.add(TEL);
	poll_data.add(SUB);
	poll_data.add(NOW);
	
	String SQL = "insert into poll values ('0',?,?,?,?,?);";
	
	try{
		
		PreparedStatement PS = CON.prepareStatement(SQL);
		
		PS.setString(1, poll_data.get(0));
		PS.setString(2, poll_data.get(1));
		PS.setString(3, poll_data.get(2));
		PS.setString(4, poll_data.get(3));
		PS.setString(5, poll_data.get(4));
		
		int n = 0;
		n = PS.executeUpdate();
		if(n > 0) {
			out.print("<script>alert('설문참여 감사합니다.')</script>");
			out.print("<script>location.href='./select2.jsp'</script>");
		}
		else {
			throw new Exception("ERROR");
		}
		
	}catch(Exception e){
		out.print("DB CONNECT FAIL OR TABLE ERROR");
		out.print("<script>alert('중복된 데이터가 있습니다.')</script>");
		out.print("<script>history.go(-1);</script>");
	}finally{	
		if(CON != null){
			CON.close();
		}
	}

%>
</body>
</html>


	
