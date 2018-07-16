package cookie;

import java.io.IOException;
import java.net.URLDecoder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//��Ű �����ϱ�
@WebServlet(name = "getCookie", urlPatterns = { "/getCookie" })
public class GetCookieServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		System.out.println("GetCookies");
		//request��ü���� ��Ű�� ������.
		Cookie[] cookies =request.getCookies();
		
		//��Ű�� ����� value�� ������ ����
		String bookTitle="";
		String bookPage="";
		
		//��Ű�� ����� value ������
		for (int i = 0; i < cookies.length; i++) {
			if(cookies[i].getName().equals("bookTitle")){
				bookTitle=URLDecoder.decode(cookies[i].getValue(), "euc-kr");
			}else if(cookies[i].getName().equals("bookPage")){
				bookPage=cookies[i].getValue();
			}
		}
		//���� ��Ű�� ����
		request.setAttribute("bookTitle", bookTitle);
		request.setAttribute("bookPage", bookPage);
		
		//��û������
		//response.sendRedirect("/serverweb/servlettest/cookieResult.jsp");
		RequestDispatcher rd= request.getRequestDispatcher("/servlettest/cookieResult.jsp");
		rd.forward(request, response);
		
	}

}
