package co.kr.board.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.kr.board.service.BoardService;
import co.kr.board.vo.BoardVO;

@Controller
public class BoardController {
	@Resource(name="boardService")
	private BoardService service;
	
	@RequestMapping(value="/main.do")
	public String main(Model model){
		List<BoardVO> boardList = service.getList();
		model.addAttribute("data", boardList);
		return "main";
	}
	
/*	@RequestMapping(value="/main.do")
	public ModelAndView main(Model model){
		ModelAndView mav = new ModelAndView(); //초기화 
		mav.setViewName("list");
		mav.addObject("list", service.boardList());
		return mav;
	}*/
	
	/*디테일*/
	@RequestMapping(value="/detail.do")
	public String detail(Model model, int boardNO){
		model.addAttribute("data", service.getdetail(boardNO));
		return "detail";
	}
/*	@RequestMapping(value="/detail.do")
	public ModelAndView detail(Model model, int boardNO) {
		ModelAndView mav = new ModelAndView();
		mav.setviewname("detail")
		mav.addobject("detail" , service.boardDetail(boardNO));
		return mav;
	}*/
	
}
