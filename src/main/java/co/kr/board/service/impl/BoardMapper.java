package co.kr.board.service.impl;

import java.util.List;

import co.kr.board.vo.BoardVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("boardMapper")
public interface BoardMapper {
	List<BoardVO> getList();
	Object getdetail(int boardNO);
}
