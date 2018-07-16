package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.dto.empDTO;

@WebServlet(name = "redirect", urlPatterns = { "/redirect.do" })
public class SendRedirectTest extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out = response.getWriter();
		System.out.println("sendRedirect���� - Redirect ���� ������");
		out.println("<h1>��û ������ ���� - SendRedirect</h1>");
		//1. ������ ���� - db���� ������ ����� �����Ͻ����� ���� ���
		empDTO dto =new empDTO("111", "jang", "", "", "", 100, "11");
		//��û �����ȿ��� "mydata"��� �̸����� dto�� ������ �� �ֵ��� ���� �۾�
		request.setAttribute("mydata", dto);
		
		//2. ��û ������ - sendRedirect
		response.sendRedirect("/serverweb/servlettest/result.jsp");
	}

}
