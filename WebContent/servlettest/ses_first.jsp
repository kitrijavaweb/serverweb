<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%//JSP�������� ������ ����ϴ� ��� - jsp�� �⺻���� ���ǰ�ü�� �����Ѵ�. - ���尴ü 
		String mydata = (String) session.getAttribute("mydata");
	%>
	<h2>���� ������ : <%=mydata %></h2>
	<hr/>
	<h3><a href="/serverweb/servlettest/ses_second.jsp">�����Ͱ� �����ɱ��?</a></h3>
</body>
</html>