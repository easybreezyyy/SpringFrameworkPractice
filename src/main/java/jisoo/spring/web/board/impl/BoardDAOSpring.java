package jisoo.spring.web.board.impl;
/*
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jisoo.spring.web.board.BoardVO;


@Repository
public class BoardDAOSpring {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	private final String BOARD_INSERT = "insert into myboard(seq, title, writer, content) " 
	+ "values((select nvl(max(seq), 0)+1 from myboard), ?, ?, ?)";
	private final String BOARD_UPDATE = "update myboard set title=?, " + "content=? where seq=?";
	private final String BOARD_DELETE = "delete myboard where seq=?";
	private final String BOARD_GET = "select * from myboard where seq=?";
	//private final String BOARD_LIST = "select * from myboard order by seq desc";
	private final String BOARD_LIST_T = "select * from myboard where title like '%'||?||'%' order by seq desc";
	private final String BOARD_LIST_C = "select * from myboard where content like '%'||?||'%' order by seq desc";

	public void insertBoard(BoardVO vo) {
		System.out.println("BoardDAOSpring - insertBoard() 실행");
		jdbcTemplate.update(BOARD_INSERT, vo.getTitle(), vo.getWriter(), vo.getContent());
	}

	public void updateBoard(BoardVO vo) {
		System.out.println("Spring JDBC updateBoard() 실행");
		jdbcTemplate.update(BOARD_UPDATE, vo.getTitle(), vo.getContent(), vo.getSeq());
	}

	public void deleteBoard(BoardVO vo) {
		System.out.println("Spring JDBC deleteBoard() 실행");
		jdbcTemplate.update(BOARD_DELETE, vo.getSeq());
	}

	public BoardVO getBoard(BoardVO vo) {
		System.out.println("Spring JDBC getBoard() 실행");
		return jdbcTemplate.queryForObject(BOARD_GET, new BoardRowMapper(), vo.getSeq());
	}
	
	public List<BoardVO> getBoardList(BoardVO vo){
		System.out.println("Spring JDBC getBoardList() 실행");
		//return jdbcTemplate.query(BOARD_LIST, new BoardRowMapper());
		if(vo.getSearchCondition().equals("TITLE")) {
			return jdbcTemplate.query(BOARD_LIST_T, new BoardRowMapper(), vo.getSearchKeyword());
		}else if(vo.getSearchCondition().equals("CONTENT")) {
			return jdbcTemplate.query(BOARD_LIST_C, new BoardRowMapper(), vo.getSearchKeyword());			
		}
		return null;
	}
}
*/