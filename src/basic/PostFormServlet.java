package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PostFormServlet extends HttpServlet{
	public void doPost (HttpServletRequest req, HttpServletResponse res) throws ServletException,java.io.IOException
	{
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html;charset=euc-kr");
		
		String id= req.getParameter("userId");
		String pass= req.getParameter("passwd");
		String name= req.getParameter("userName");
		String gender= req.getParameter("gender");
		String job= req.getParameter("job");
		String[] item= req.getParameterValues("item");
		String itemName="";
			for(int i=0;i<item.length;i++){
				itemName+=item[i]+", ";
			}
		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Customer</h1><hr>");
		out.println("<p>���̵�:"+id+"</p>");
		out.println("<p>��й�ȣ:"+pass+"</p>");
		out.println("<p>����:"+name+"</p>");
		out.println("<p>����:"+gender+"</p>");
		out.println("<p>����:"+job+"</p>");
		out.println("<p>���ɺо�:"+itemName+"</p>");
		out.println("</body>");
		out.println("</html>");
	}
}
