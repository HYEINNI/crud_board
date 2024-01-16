package co.kr.board.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import co.kr.board.service.BoardService;
import co.kr.board.vo.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	@Resource(name="boardMapper")
	private BoardMapper mapper;

	@Override
	public List<BoardVO> getList() {
		// TODO Auto-generated method stub
		return mapper.getList();
	}

	@Override
	public Object getdetail(int boardNO) {
		// TODO Auto-generated method stub
		return mapper.getdetail(boardNO);
	}
}
