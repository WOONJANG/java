<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="jh" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!-- sql:setDataSource : DB연결 태그  -->
<sql:setDataSource var="dbs" url="jdbc:mysql://umj7-009.cafe24.com/jangwoon0518" driver="com.mysql.jdbc.Driver" user="jangwoon0518" password="boyun981124@"></sql:setDataSource>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 6일차 - SQL연결</title>
</head>
<body>
<!-- 
dataSource = Connect 
sql:query : DB 쿼리문 (select)
sql:udate : db 쿼리문 (insert update delete)
var로 query문을 실행하게 됨
-->

<sql:query var="select" dataSource="${dbs}">
	select * from poll order by pidx desc;
</sql:query>
<!-- 
	columnNames : SQL 필드명을 가져올때 사용
 -->
<jh:forEach var="poll" items="${select.columnNames}">
	<span><jh:out value="${poll}"></jh:out></span> <!-- 컬럼명 -->
</jh:forEach>
<br><br><br><br><br><br><br>
<!-- rows 필드 값 -->
<jh:forEach var="data" items="${select.rows}">
	<span>
		<input type="button" value="삭제" onclick="abc(${data['pidx']})">
	</span>
	<span>
	<!-- ${data['필드명']} -->
		아이디 : <jh:out value="${data['pid'] }"></jh:out>
	</span>
	<span>
		이름 : <jh:out value="${data['pname'] }"></jh:out>
	</span><br>
</jh:forEach><br>
</body>
<script>
	function abc(z) {
		alert(z);
	}
</script>
</html>