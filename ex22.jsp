<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> JSP 3일차 - JAVA + JSP</title>
<%!
	public class abc{
		String a = "홍길동";
		String b = "이순신";
		String zz = null;
		public String[] getter (){	//getter
			
			return new String[] {a,b};
			 
		}
		public void setter(String z){	// setter에 값을 적용 후 전산/산술처리가 완료되면 this로 값을 보냄
			this.zz = z;
		}
		public String getter2(){	// jsp에 출력 역할
			return this.zz;
		}
	}
%>
<%
	abc aa = new abc();	// controll
	String result[] = aa.getter();
	aa.setter("유관순");
	String name2 = aa.getter2();
	request.setAttribute("result", result);
%>
</head>
<!-- view -->
<body>
	고객명 : <%=result[0]%> <%=result[1]%><br>
	고객명 : ${result[0]} ${result[1]}<br>
	리턴값 이름 : <%=name2 %>
</body>
</html>