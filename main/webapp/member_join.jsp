<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String name = request.getParameter("name");
	String mobile_no = request.getParameter("mobile_no");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
</head>
<body>
		<form>
			<table border="1">
				<tr>
					<td>아이디</td>
					<td><input type="text" name="userid"></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input type="text" name="username" value="<%=name%>" readonly="readonly"></td>
				</tr>
				<tr>
					<td>전화번호</td>
					<td><input type="text" name="usertel" value="<%=mobile_no%>"  readonly="readonly"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="button" value="회원가입"></td>
				</tr>
			</table>
		</form>
</body>
</html>