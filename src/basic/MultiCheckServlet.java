package basic;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MultiCheckServlet extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,java.io.IOException{
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html;charset=euc-kr");
		String name=req.getParameter("name");
		String addr=req.getParameter("addr");
		String[] sw=req.getParameterValues("sw");
		PrintWriter out = res.getWriter();
		out.println("<head>");
		out.println("<body>");
		out.println("<h1>��� ���</h1><hr/>");
		out.println("<p>�̸� : "+name+"</p>");
		out.println("<p>�ּ� : "+addr+"</p>");
		out.println("<p>������� ����Ʈ����<br/>");
		for(int i=0;i<sw.length;i++){
			out.println(sw[i]+"<br/>");
		}
		out.println("</p>");
		out.println("</body>");
		out.println("</head>");
		
		
	}

}
