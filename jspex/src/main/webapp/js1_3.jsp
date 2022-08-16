<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>js1 - session 삭제</title>
</head>
<% 
			
	/*	특정 session을 삭제할 때	*/
// 	session.removeAttribute("mid");
	session.removeAttribute("mail");
// 	session.removeAttribute("lv");
	out.print("<script>location.href='./js1.jsp'</script>");
	
	/*	모든 session을 삭제할 때	*/
// 	session.invalidate();
%>
<body>

	

</body>
</html>