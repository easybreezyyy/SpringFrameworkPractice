package jisoo.spring.web.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import jisoo.spring.web.board.impl.BoardDAO;


public class GetBoardListController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("글 목록 검색 처리");
		// 1. 사용자 입력 정보 추출 : 검색 기능 구현해야함
		
		// 2. 디비 처리
		BoardVO vo = new BoardVO();
		BoardDAO boardDAO = new BoardDAO();
		List<BoardVO> boardList = boardDAO.getBoardList(vo);
		
		// 3. 응답 화면 구성
		ModelAndView mav = new ModelAndView();
		mav.addObject("boardList", boardList);	// Model 정보저장
		mav.setViewName("getBoardList");	//View 정보저장
		return mav;
	}

}
