<%@page import="emp.service.empServiceImpl"%>
<%@page import="emp.service.empService"%>
<%@page import="emp.dao.empDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>Insert title here</title>
</head>
<body>
	<h1>회원 가입 결과</h1>
	<hr>
	<%
	request.setCharacterEncoding("euc-kr");
	String deptno=request.getParameter("deptno");
	String name=request.getParameter("name");
	String id=request.getParameter("id");
	String pass=request.getParameter("pass");
	String addr=request.getParameter("addr");
	String value=request.getParameter("point");
	int point =Integer.parseInt(value);
	String grade=request.getParameter("grade");
	%>
	<%empService service= new empServiceImpl();%>
	<%int result=service.insert(deptno, name, id, pass, addr, point, grade);%>
	<%if(result==0){ %>
	<h2>가입실패</h2>
	<%}else{ %>
	<h2>가입완료</h2>
	<%}%>
</body>
</html>