package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ParamTestServlet extends HttpServlet {
	//Ŭ���̾�Ʈ�� ����±׿� �Է��� �����͸� ����
		public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
			System.out.println("ParamTestServlet ����");
			//��û ������ �ѱ� ����
			req.setCharacterEncoding("euc-kr");
			//���� ������ ���� Ÿ�԰� ���ڼ��� ����
			res.setContentType("text/html;charset=euc-kr");
			//Ŭ���̾�Ʈ�� �Է��� ��û ������ �����ϱ�
			String id= req.getParameter("id");
			String pass= req.getParameter("pass");
			System.out.println("id : " +id);
			System.out.println("password : " +pass);
			//���������� Ŭ���̾�Ʈ�� ����ϱ����ؼ� ��Ʈ����ü�� ����
			PrintWriter out = res.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<h1>���̵�:"+id+"</h1>");
			out.println("<h1>�н�����:"+pass+"</h1>");
			out.println("</body>");
			out.println("</html>");
		}
}
