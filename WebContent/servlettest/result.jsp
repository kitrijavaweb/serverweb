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
	<h1>��û���������� ���û�Ǿ� ����Ǵ� jsp���� - ������ �������� ������ ������ ���</h1>
	<hr/>
	<%
		//������ �������� �����͸� ������ ����ϱ�
		String data= (String)request.getAttribute("mydata");
	%>
	<h3>���ȭ��:<%=data%></h3>
</body>
</html>