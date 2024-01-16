package co.kr.board.vo;

import java.sql.Date;

public class BoardVO {
	private Integer boardNo;
	private Integer hitnum;
	private String title;
	private String writer;
	private String content;
	private Date regdate;
	
	public Integer getBoard_no() {
		return boardNo;
	}
	public void setBoard_no(Integer boardNo) {
		this.boardNo = boardNo;
	}
	public Integer getHitnum() {
		return hitnum;
	}
	public void setHitnum(Integer hitnum) {
		this.hitnum = hitnum;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "VovoVO [board_no=" + boardNo + ", hitnum=" + hitnum + ", title=" + title + ", writer=" + writer
				+ ", content=" + content + "]";
	}
	
	
	
}