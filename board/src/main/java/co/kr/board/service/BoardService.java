package co.kr.board.service;

import java.util.List;

import co.kr.board.vo.BoardVO;

public interface BoardService {

	List<BoardVO> getList();
	Object boardDetail(int boardNO);
	void boardDelete(int boardNO);
	void boardInsert(BoardVO vo);
	void boardUpdate(BoardVO vo);
}
