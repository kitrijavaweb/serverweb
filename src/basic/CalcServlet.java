package basic;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalcServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,java.io.IOException{
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html;charset=euc-kr");
		String value=req.getParameter("num1");
		String value2=req.getParameter("num2");
		String opr=req.getParameter("method");
		int num1 = Integer.parseInt(value);
		int num2 = Integer.parseInt(value2);
		Calc dd =new Calc();
		int result=dd.calc(num1, num2, opr);
		PrintWriter out =res.getWriter();
		out.println("<head>");
		out.println("<body>");
		out.println("<h1>������ ("+opr+"��������)</h1><hr/>");
		out.println("<p>num1�� "+num1+"�� num2��"+num2+"��</p>");
		out.println("<p>������ �����"+result+"�Դϴ�.</p>");
		out.println("</body>");
		out.println("</head>");
		
		
	}

}
