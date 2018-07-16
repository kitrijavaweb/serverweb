package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, java.io.IOException {
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html;charset=euc-kr");
		
		String name = req.getParameter("name");
		String addr = req.getParameter("addr");
		String[] lang = req.getParameterValues("language");
		String save = req.getParameter("save");
		
		PrintWriter out = res.getWriter();
		
		out.println("<head>");
		out.println("<body>");
		out.println("<center><h1>client form data ó��</h1><center>");
		//�̸�
		out.println("<p>�̸� : ");
		if (name == "") {
			out.println("<�̸��� �Է��ϼ���></p>");
		} else {
			out.println(name + "</p>");
		}
		//�ּ�
		out.println("<p>�ּ� : ");
		if (addr == "") {
			out.println("<�ּҸ� �Է��ϼ���></p>");
		} else {
			out.println(addr + "</p>");
		}
		//���
		out.println("<p>��밡���� Language ����.<br/>");
		if (lang == null) {
			out.println("<p>��밡���� language �� �����ϴ�.</p>");
		} else {
			for (int i = 0; i < lang.length; i++) {
				out.println(lang[i] + "<br/>");
			}
			out.println("</p>");
		}
		//���� ����
		if (save == null) {
			out.println("<p>�Է� ���� ���� ������ ������ �ֽʽÿ�.</p>");
		} else {
			out.println("<p>�Է� ���� ���� ���� :" + save + "</p>");
		}
		out.println("</body>");
		out.println("</head>");

	}
}
