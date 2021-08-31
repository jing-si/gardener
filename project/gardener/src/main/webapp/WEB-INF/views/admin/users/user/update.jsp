<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h3>유저정보 변경</h3>
		<form method="post">
			<div>
				<label>유저이메일: </label> ${item.userId}
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
				<input type="date" name="userBirth" value="<fmt:formatDate value="${item.userBirth}" pattern="yyyyMMdd"/>">
			</div>
			<div>
				<label>성별: </label>
				<input type="text" name="userGender" value="${item.userGender}">
			</div>
			<div>
				<input type="submit" value="변경">
			</div>
		</form>
		<div>
			<a href="../">유저 목록으로</a>
		</div>
	</div>
</body>
</html>