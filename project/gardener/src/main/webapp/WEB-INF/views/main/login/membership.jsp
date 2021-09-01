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
    <script src="/resources/js/test.js"></script>
    
    <link rel="stylesheet" href="/resources/css/membership.css">
    
</head>
<body>
    <a href="/login/"><div id="header"><svg xmlns="http://www.w3.org/2000/svg" height="24px" viewBox="0 0 24 24" width="24px" fill="#000000"><path d="M0 0h24v24H0V0z" fill="none"/><path d="M19 6.41L17.59 5 12 10.59 6.41 5 5 6.41 10.59 12 5 17.59 6.41 19 12 13.41 17.59 19 19 17.59 13.41 12 19 6.41z"/></svg></a>
        <p>회원가입</p></div>
<div id="align">
    <div id="email" class="info">
        <p class="title">이메일</p>
        <div><p>example@gmail.com</p></div>
        <p id="certification">계정이 인증되었습니다.</p>
    </div>
    <div id="nickName" class="info">
        <p class="title">닉네임</p>
        <input placeholder="example@gmail.com" type="text">
            <!-- <p>example@gmail.com</p> -->
        </input>
    </div>
    <div id="birth" class="info">
        <p class="title">생년월일</p>
        <input placeholder="생년월일(8자리)" type="date" maxlength="8">
            <!-- <p id="explain">생년월일(8자리)</p> -->
        </input>
    </div>
    <!-- <div id="gender" class="info">
        <p class="title">성별</p>
        <div id="female"><p>여성</p>
        </div><div id="male"><p>남성</p></div>
    </div> -->
    <div id="gender" class="info" class="tab_menu">
        <p class="title">성별</p>
        <ul class="list">
            <li class="is_on">
                <div id="female" class="btn"><p>여성</p></div>
            </li><li><div id="male" class="btn"><p>남성</p></div></li>
        </ul>
    </div>
    <div id="agreement" class="info">
        <p class="title">약관동의</p>
        <div id="agreeBox">
            <div><p class="terms" id="terms_1">이용약관 동의(필수)<a href=""><p class="fullText" id="fullText_1">전문보기</p></a></div>
            <div><p class="terms" id="terms_2">개인정보 수집 및 이용 동의(필수)<a href=""><p class="fullText" id="fullText_2">전문보기</p></a></div>
        </div>
    </div>
</div>
    <a href="/"><div id="submit">
        <p>동의하고 완료</p>
    </div></a>
</body>
</html>