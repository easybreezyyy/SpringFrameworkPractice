package jisoo.spring.web.controller;

import java.util.HashMap;
import java.util.Map;

import jisoo.spring.web.board.DeleteBoardController;
import jisoo.spring.web.board.GetBoardController;
import jisoo.spring.web.board.GetBoardListController;
import jisoo.spring.web.board.InsertBoardController;
import jisoo.spring.web.board.UpdateBoardController;
import jisoo.spring.web.user.LoginController;
import jisoo.spring.web.user.LogoutController;

/**
 * 모든 컨트롤러 객체를 저장하고 있다가 클라이언트 요청이 들어오면 요청을 처리할 특정 Controller를 검색하는 기능 제공
 * DispatcherServlet이 사용하는 객체.
 */
public class HandlerMapping {
	private Map<String, Controller> mappings;

	public HandlerMapping() {
		mappings = new HashMap<String, Controller>();
		mappings.put("/login.do", new LoginController());
		mappings.put("/getBoardList.do", new GetBoardListController());
		mappings.put("/getBoard.do", new GetBoardController());
		mappings.put("/insertBoard.do", new InsertBoardController());
		mappings.put("/updateBoard.do", new UpdateBoardController());
		mappings.put("/deleteBoard.do", new DeleteBoardController());
		mappings.put("/logout.do", new LogoutController());
	}
	
	public Controller getController(String path) {
		return mappings.get(path);
	}
}
