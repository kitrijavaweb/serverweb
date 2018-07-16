package basic;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;


import emp.service.empService;
import emp.service.empServiceImpl;

public class EmpDeleteServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, java.io.IOException {
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html;charset=euc-kr");
		empService service = new empServiceImpl();
		String id= req.getParameter("id");
		int result=service.delete(id);
		String msg="";
		//��û ������ - sendRedirect
		if(result<0){
			msg="��������";
		}else{
			msg=result+"���� ���� ����!!";
		}
		res.sendRedirect("/serverweb/list.do");
	}
}
