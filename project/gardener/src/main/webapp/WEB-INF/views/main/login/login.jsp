<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic:wght@400;700;800&family=Noto+Sans+KR:wght@400;700;900&display=swap" rel="stylesheet">

    <link rel="stylesheet" href="/resources/css/login.css">
</head>
<body>
    <div id="align">
    <div id="logo">
        <img src="/resources/images/login-logo.png">
      </div>
    <input id="email" placeholder="아이디" type="text"></input>
    <input id="passWord" placeholder="비밀번호" type="password"></input>
    <a href="/"><div id="login"><p>로그인</p></div></a>
    <div id="pwRe"><a href="">비밀번호 재설정</a></div>
    <div id="membership"><a href="membership/">회원가입</a></div>
</body>
</html>