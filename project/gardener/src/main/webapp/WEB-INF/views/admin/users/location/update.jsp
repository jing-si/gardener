<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>식물 관리</title>
</head>
<body>
	<div>
		<h3>식물 변경</h3>
		<form method="post">
			<div>
				<label>식물 ID: </label> 
				<input type="number" name="plantId" value="${item.plantId}">
			</div>
			<div>
				<label>식물이름: </label> 
				<input type="text" name="plantName" value="${item.plantName}">
			</div>
			<div>
				<label>구분: </label> 
				<input type="text" name="plantCategory" value="${item.plantCategory}">
			</div>
			<div>
				<label>설명: </label> 
				<input type="text" name="plantInfo" value="${item.plantInfo}">
			</div>
			<div>
				<input type="submit" value="변경">
			</div>
		</form>
		<div>
			<a href="../">식물 목록으로</a>
		</div>
 	</div>
</body>
</html>