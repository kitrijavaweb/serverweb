<%@page import="emp.dto.empDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>요청재지정으로 재요청되어 실행되는 jsp문서 - 서블릿이 공유해준 데이터 꺼내서 출력</h1>
	<hr/>
	<%
		//서블릿이 공유해준 데이터를 꺼내서 사용하기
		String data= (String)request.getAttribute("mydata");
	%>
	<h3>결과화면:<%=data%></h3>
</body>
</html>