<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>분류 관리</title>
</head>
<body>
	<div>
		<div>
			<h3>대분류</h3>
			<select id="TopClass" size =10>
				<option>[100] </option>

			</select>
			<form>
				<input type="text" name="TopClassID"> 
				<input type="text" name="TopClassName">
			</form>

		</div>

		<div>
			<h3>중분류</h3>
			<select id="MidClass" size =10>

			</select>
			<form>
				<input type="text" name="MidClassID"> 
				<input type="text" name="TopClassID"> 
				<input type="text" name="MidClassName">
			</form>
		</div>

		<div>
			<h3>소분류</h3>
			<select id="BotClass">

			</select>
			<form>
				<input type="text" name="BotClassID"> 
				<input type="text" name="MidClassID"> 
				<input type="text" name="BotClassName">
			</form>
		</div>
	</div>
</body>
</html>