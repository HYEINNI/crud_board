<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/insert.do" method="post">
	<h3>제목 : <input type="text" id="title" name="title"></h3>
	<h3>작성자 : <input type="text" id="writer" name="writer"></h3>
	<h3>내용 : <input type="text" id="content" name="content"></h3>
	<button type="submit">글쓰기</button>
	</form>
</body>
</html>