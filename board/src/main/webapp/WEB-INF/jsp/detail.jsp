<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<tr>
		<td>순번 : ${data.board_no}</td><br>
		<td>제목 : ${data.title}</td><br>
		<td>작성자 : ${data.writer}</td><br>
		<td>날짜 : ${data.regdate}</td><br>
		<td>내용 : ${data.content}</td><br>
		<td>조회수 : ${data.hitnum}</td><br>
	</tr>
	
	<input type="button" value="수정하기"
		onclick="location.href='/updatePage.do?boardNO=${data.board_no}'">
	
	<input type="button" value="삭제하기" id="delete" name="delete"
		onclick="location.href='delete.do?boardNO=${data.board_no}'">
		
	<input type="button" value="뒤로가기"
		onclick="location.href='/main.do'">

</body>
</html>