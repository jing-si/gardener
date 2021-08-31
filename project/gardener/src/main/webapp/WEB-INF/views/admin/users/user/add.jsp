<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>유저 등록</title>
</head>
<body>
	<div>
		<h3>유저정보 추가</h3>
		<form method="post">
			<div>
				<label>유저이메일: </label>
				<input type="text" name="userId" value="${item.userId}">
			</div>
			<div>
				<label>닉네임: </label>
				<input type="text" name="userNick" value="${item.userNick}">
			</div>
			<div>
				<label>비밀번호: </label>
				<input type="text" name="userPass" value="${item.userPass}">
			</div>
			<div>
				<label>생년월일: </label>
				<input type="date" name="userBirth" value="${item.userBirth}">
			</div>
			<div>
				<label>성별: </label>
				<input type="text" name="userGender" value="${item.userGender}">
			</div>
			<div>
				<input type="submit" value="추가">
			</div>
		</form>
		<div>
			<a href="list">목록</a>
		</div>
	</div>
</body>
</html>