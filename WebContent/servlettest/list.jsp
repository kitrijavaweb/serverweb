<%@page import="java.util.ArrayList"%>
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
	<jsp:include page="/jspbasic2/search.jsp"/>
	<h2>ȸ�����</h2>
	<hr>
	<%empDTO emp = new empDTO(); %>
	<% ArrayList<empDTO> emplist=(ArrayList<empDTO>)request.getAttribute("mydata"); 
		empDTO loginUser=(empDTO)request.getAttribute("loginUser");
	%>
	<%if(loginUser==null){
		response.sendRedirect("/serverweb/emp/login.jsp");	
	}else{%>
	<h3><%=loginUser.getId() %>�� ȯ���մϴ�.</h3>
	<table border="1">
	<tr bgcolor="skyblue">
		<th>���̵�</th>
		<th>��й�ȣ</th>
		<th>�̸�</th>
		<th>�ּ�</th>
		<th>�Ի���</th>
		<th>���</th>
		<th>����Ʈ</th>
		<th>�μ���ȣ</th>
		<th>����</th>
	</tr>
	<% for(int i=0;i<emplist.size();i++){%>
	<% emp=emplist.get(i);%>
	<tr>
	<th><a href="/serverweb/read.do?id=<%=emp.getId() %>&action=read"><%=emp.getId() %></a></th>
	<th><%=emp.getPass() %></th>
	<th><%=emp.getName() %></th>
	<th><%=emp.getAddr() %></th>
	<th><%=emp.getHiredate() %></th>
	<th><%=emp.getGrade() %></th>
	<th><%=emp.getPoint() %></th>
	<th><%=emp.getDeptno() %></th>
	<th><a href="/serverweb/delete.do?id=<%=emp.getDeptno()%>">����</a></th>
	</tr>
	<% }%>
	</table>
	<%}%>
</body>
</html>