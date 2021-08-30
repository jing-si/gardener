<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>유저 관리</title>
</head>
<body>
	<div>
		<h3>유저 목록</h3>
		<div>
			<table>
				<thead>
					<tr>
						<th>이메일</th>
						<th>닉네임</th>
						<th>생년월일</th>
						<th>성별</th>
						<th>관리</th>
					</tr>
				</thead>
				<tbody>
					<c:if test="${list.size() < 1}">
						<tr>
							<td colspan="5">등록된 유저가 없습니다.</td>
						</tr>
					</c:if>
					<c:forEach var="item" items="${list}">
						<tr>
							<td>${item.userId}</td>
							<td>${item.userNick}</td>
							<td>${item.userBirth}</td>
							<td>${item.userGender}</td>
							<td><a href="delete?userId=${item.userId}">삭제</a><a href="update?userId=${item.userId}">삭제</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<div>
			<a href="add">등록</a>
		</div>
		<div>
			<a href="..">관리자 페이지로</a>
		</div>
	</div>
</body>
</html>