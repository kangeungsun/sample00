package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class HelloServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("HelloServlet");
		
		//html 생성 작업
		response.setContentType("text/html;charset=UTF-8");//브라우저에게 전송할 데이터 종류 알려주는 역할
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("<h1>Hello,안녕하세요</h1>");
		out.print("</body></html>");
		
		
	}

}
