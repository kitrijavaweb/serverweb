<%@page import="java.util.Enumeration"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>Insert title here</title>
</head>
<body>
	<form method="post" action="/serverweb/cart.do">
		�׸���<br/>
		<select name="item">
			<option value="�����">�����
			<option value="��Ź��">��Ź��
			<option value="TV">TV
			<option value="��ġ�����">��ġ�����
			<option value="���ڷ�����">���ڷ�����
		</select>
		<input type="submit" value="��ٱ���"/>
	</form>
	<hr/>
	<% 
	Enumeration<String> attrNames = session.getAttributeNames();
	while(attrNames.hasMoreElements()){
		String attrName = attrNames.nextElement();
		int attrVal =(Integer)session.getAttribute(attrName); 
	%>
		<%= attrName+":"+attrVal%><br/>
	<%} %>
</body>
</html>