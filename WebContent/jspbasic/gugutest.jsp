<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>Insert title here</title>
	<style type="text/css">
	span{
		font-size: large;
		font-weight: bold;
	}
	</style>
</head>
<body>
	<h2>GuGu Test</h2>
	<hr>
	<table border="1">
	<% for(int i=1;i<=9;i++){%>
	<tr>
	<% for(int j=1;j<=9;j++){%>
	<th><%=i%>x<%=j%>=<%=i*j %></th>
		<%} %>
	</tr>
	<%} %>
	</table>
</body>
</html>