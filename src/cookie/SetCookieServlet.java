package cookie;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//��Ű �����ϱ�
@WebServlet(name = "setCookie", urlPatterns = { "/setCookie" })
public class SetCookieServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		System.out.println("SetCookies");
		
		//��Ű�� �����ϰ� ���� �����͸� �����ؼ� Cookie��ü�� ����
		Cookie c1 = new Cookie("bookTitle", URLEncoder.encode("���������", "euc-kr"));
		Cookie c2 = new Cookie("bookPage", "128");
		
		//��Ű�� ���� ��ȿ�ð��� ���� - �ʴ���
		c1.setMaxAge(60*60*24);
		c2.setMaxAge(60*60*24);
		
		//responser�� ��Ű�� ����
		response.addCookie(c1);
		response.addCookie(c2);
		
	}

}
