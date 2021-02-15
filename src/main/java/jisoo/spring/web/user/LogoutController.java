package jisoo.spring.web.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jisoo.spring.web.controller.Controller;

public class LogoutController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("logout");
		// 1.세션 확인
		HttpSession session = request.getSession(false);
		session.invalidate();

		// 2. 화면 네비게이션
		return "login";

	}

}
