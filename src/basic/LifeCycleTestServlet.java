package basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycleTestServlet  extends HttpServlet{
	public LifeCycleTestServlet(){
		
	}
	public void init(){
		System.out.println("init() .. ȣ��");
	}
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
			System.out.println("service()...ȣ��");
			//get������� ��û�� ������ doGet�� ȣ���ϰ� post����̸� do post�� ȣ��
			if(req.getMethod().equals("GET")){
				doGet(req, res);
			}else{
				doPost(req, res);
			}
	}
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,java.io.IOException{
		System.out.println("doGet()...ȣ��");
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,java.io.IOException{
		System.out.println("doPost()...ȣ��");
	}
	public void destroy(){
		//���� ��ü�� �Ҹ�ɶ� ȣ��Ǵ� �޼ҵ�
		// -WAS�� ���ε�, ������ ����Ǿ����� COntext�� ���ε�
		System.out.println("destroy()ȣ�� ....");
	}
}
