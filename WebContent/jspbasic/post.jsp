<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>Insert title here</title>
</head>
<body>
	<h2>결과화면</h2>
	<hr>
	<%
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		String UserId= request.getParameter("userId");
		String UserName= request.getParameter("userName");
		String passwd= request.getParameter("passwd");
		String gender= request.getParameter("gender");
		String job= request.getParameter("job");
		String[] fac= request.getParameterValues("item");
		String name="";
		for(int i=0;i<fac.length;i++){
			name+=fac[i];
		}
	%>
	<p><%=UserId %></p>
	<p><%=UserName %></p>
	<p><%=passwd %></p>
	<p><%=gender %></p>
	<p><%=job %></p>
	<p><%=name %></p>
	
</body>
</html>