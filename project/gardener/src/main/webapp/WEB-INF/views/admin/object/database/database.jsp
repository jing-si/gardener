<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Database 관리</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>사업자 번호</th>
				<th>상호명</th>
				<th>전화번호</th>
				<th>주소</th>
				<th>홈페이지</th>
			</tr>
		
		</thead>
		<c:forEach var="item" items="${list}">
			<tr>
				<td>${item.companyId}</td>
				<td>${item.companyName}</td>
				<td>${item.companyTel }</td>
				<td>${item.companyAddress }</td>
				<td>${item.companyHomepage }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>