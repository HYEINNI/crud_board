package co.kr.board.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import co.kr.board.service.BoardService;
import co.kr.board.vo.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService{
	@Resource(name="boardMapper")
	private BoardMapper mapper;

	@Override
	public List<BoardVO> getList() {
		// TODO Auto-generated method stub
		return mapper.getList();
	}

	@Override
	public Object boardDetail(int boardNO) {
		// TODO Auto-generated method stub
		mapper.hitnum(boardNO);
		return mapper.boardDetail(boardNO);
	}

	@Override
	public void boardDelete(int boardNO) {
		// TODO Auto-generated method stub
		mapper.boardDelete(boardNO);
	}

	@Override
	public void boardInsert(BoardVO vo) {
		// TODO Auto-generated method stub
		mapper.boardInsert(vo);
	}

	@Override
	public void boardUpdate(BoardVO vo) {
		// TODO Auto-generated method stub
		mapper.boardUpdate(vo);
	}
}
