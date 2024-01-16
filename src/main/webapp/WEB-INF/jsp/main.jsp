<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>집 가고 싶어용</title>
</head>
<body>
<h2>메인 페이지</h2>
	<table border="1">
		<tr>
			<th>순번</th>
			<th>제목</th>
			<th>작성자</th>
			<th>조회수</th>
			<th>날짜</th>
		</tr>
		<c:forEach var="item" items="${data}">
		<tr>
			<td><a href="/detail.do?boardNO=${item.board_no}">${item.board_no}</a></td>
			<td>${item.title}</td>
			<td>${item.writer}</td>
			<td>${item.regdate}</td>
			<td>${item.hitnum}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>