package co.kr.board.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.kr.board.service.BoardService;
import co.kr.board.vo.BoardVO;

@Controller
public class BoardController {
	@Resource(name="boardService")
	private BoardService service;
	
	/*list*/
	@RequestMapping(value="/main.do")
	public String main(Model model){
		List<BoardVO> boardList = service.getList();
		model.addAttribute("data", boardList);
		return "main";
	}	
	/*detail*/
	@RequestMapping(value="/detail.do")
	public String detail(Model model,int boardNO){
		model.addAttribute("data", service.boardDetail(boardNO));
		return "detail";
	}
	/*delete*/
	@RequestMapping(value="/delete.do") 
	public String delete(int boardNO){
		service.boardDelete(boardNO);
		return "redirect:/main.do";
	}
	/*insert*/
	@RequestMapping(value="/insertPage.do")
	public String insertPage(){
		return "insert";
	}
	
	@RequestMapping(value="/insert.do" , method=RequestMethod.POST)
	public String insert(BoardVO vo){
		service.boardInsert(vo);
		return "redirect:main.do";
	}
	/*update*/
	@RequestMapping(value="/updatePage.do")
	public String updatePage(Model model, int boardNO){
		model.addAttribute("data", service.boardDetail(boardNO));
		return "update";
	}
	
	@RequestMapping(value="/update.do" , method=RequestMethod.POST)
	public String update(BoardVO vo , int boardNO){
		service.boardUpdate(vo);
		return "redirect:/main.do";
	}
}
