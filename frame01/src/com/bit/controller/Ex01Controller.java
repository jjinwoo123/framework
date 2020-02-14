package com.bit.controller;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ex01.bit")
public class Ex01Controller extends HttpServlet{
	//system.out 보다 logger가 시스템 영향을 최소화한다.
	//무조건 출력하지 않고 출력 명령을 내려놓고 여유가 생기면 출력해준다.
	//프로그램에 메세지출력이란 우선순위가 낮음 프로그램의 성능이 중요하므로 system.out 보다 log를 사용하여야함
	//나중엔 프레임워크를 사용할 것임, 파일에 적재해서 남겨놓는 방식
	//메소드를 통해서 호출 사용한다. (클래스정보)
	Logger log=Logger.getLogger("com.bit.controller.Ex01controller");
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher("ex01.jsp").forward(req, resp);
		
		
//		//출력레벨 - 눈에 보이는 레벨
//		log.severe("심각메세지로 출력");
//		log.info("ex01 page 출력");//
//		log.warning("경고메세지로 출력");
//		//출력레벨 - 눈에 보이지 않는 레벨
//		log.config("config");
//		log.fine("fine");
//		log.finer("finer");
//		log.finest("finest");
//		
//		System.out.println("controller servlet run...");
//		HttpSession session = req.getSession();
//		session.removeAttribute("msg");
//		System.out.println(session.getId());
//		session.invalidate();
//		System.out.println("세션갱신");
//		System.out.println(session.getId());
	}
}
