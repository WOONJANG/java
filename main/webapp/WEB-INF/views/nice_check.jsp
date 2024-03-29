<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tg" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	NiceID.Check.CPClient niceCheck = new  NiceID.Check.CPClient();
	
	String sSiteCode = "BY954";				
	String sSitePassword = "pgOksuCEYvfX";
	
	String sRequestNumber = "REQ0000000001";  
	                                              
	sRequestNumber = niceCheck.getRequestNO(sSiteCode);
		session.setAttribute("REQ_SEQ" , sRequestNumber);	
		
		String sAuthType = "M";
	String customize 	= "";
	
	String sReturnUrl = "http://jangwoon0518.cafe24.com/webpage/success.jsp"; 
	String sErrorUrl = "http://jangwoon0518.cafe24.com/webpage/fail.jsp";     
	
	String sPlainData = "7:REQ_SEQ" + sRequestNumber.getBytes().length + ":" + sRequestNumber +
	                    "8:SITECODE" + sSiteCode.getBytes().length + ":" + sSiteCode +
	                    "9:AUTH_TYPE" + sAuthType.getBytes().length + ":" + sAuthType +
	                    "7:RTN_URL" + sReturnUrl.getBytes().length + ":" + sReturnUrl +
	                    "7:ERR_URL" + sErrorUrl.getBytes().length + ":" + sErrorUrl +
	                    "9:CUSTOMIZE" + customize.getBytes().length + ":" + customize;
	
	String sMessage = "";
	String sEncData = "";
	
	int iReturn = niceCheck.fnEncode(sSiteCode, sSitePassword, sPlainData);
	if( iReturn == 0 )
	{
	    sEncData = niceCheck.getCipherData();
	}
	else if( iReturn == -1)
	{
	    sMessage = "복호화 시스템 에러입니다.";
	}    
	else if( iReturn == -4)
	{
	    sMessage = "복호화 처리오류입니다.";
	}    
	else if( iReturn == -5)
	{
	    sMessage = "복호화 해쉬 오류입니다.";
	}    
	else if( iReturn == -6)
	{
	    sMessage = "복호화 데이터 오류입니다.";
	}    
	else if( iReturn == -9)
	{
	    sMessage = "입력 데이터 오류입니다.";
	}     
	else
	{
	    sMessage = "알수 없는 에러 입니다. iReturn : " + iReturn;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>나이스 인증 시스템 적용</title>
</head>
<body>
	<form name="form_chk" method="post">
		<input type="hidden" name="name" value="${username}">
		<input type="hidden" name="mobile_no" value="${usertel}">
		<input type="hidden" name="m" value="checkplusService">			
		<input type="hidden" name="EncodeData" value="<%= sEncData %>">
	</form>
		<table border="1">
			<tr>
				<td>이름</td>
				<td><input type="text" name="username" value="${username}" readonly="readonly"></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><input type="text" name="usertel" value="${usertel}" readonly="readonly"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="button" value="본인인증 정보확인" onclick="fnPopup();"></td>
			</tr>
		</table>
</body>
<script>
	window.name = "Parent_window";
	
	function fnPopup(){
		window.open('', 'popupChk', 'width=500, height=550, top=100, left=100, fullscreen=no, menubar=no, status=no, toolbar=no, titlebar=yes, location=no, scrollbar=no');
		document.form_chk.action = "https://nice.checkplus.co.kr/CheckPlusSafeModel/checkplus.cb";
		document.form_chk.target = "popupChk";
		document.form_chk.submit();
	}
</script>
</html>