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
        <p>ȸ������</p></div>
<div id="align">
    <div id="email" class="info">
        <p class="title">�̸���</p>
        <div><p>example@gmail.com</p></div>
        <p id="certification">������ �����Ǿ����ϴ�.</p>
    </div>
    <div id="nickName" class="info">
        <p class="title">�г���</p>
        <input placeholder="example@gmail.com" type="text">
            <!-- <p>example@gmail.com</p> -->
        </input>
    </div>
    <div id="birth" class="info">
        <p class="title">�������</p>
        <input placeholder="�������(8�ڸ�)" type="date" maxlength="8">
            <!-- <p id="explain">�������(8�ڸ�)</p> -->
        </input>
    </div>
    <!-- <div id="gender" class="info">
        <p class="title">����</p>
        <div id="female"><p>����</p>
        </div><div id="male"><p>����</p></div>
    </div> -->
    <div id="gender" class="info" class="tab_menu">
        <p class="title">����</p>
        <ul class="list">
            <li class="is_on">
                <div id="female" class="btn"><p>����</p></div>
            </li><li><div id="male" class="btn"><p>����</p></div></li>
        </ul>
    </div>
    <div id="agreement" class="info">
        <p class="title">�������</p>
        <div id="agreeBox">
            <div><p class="terms" id="terms_1">�̿��� ����(�ʼ�)<a href=""><p class="fullText" id="fullText_1">��������</p></a></div>
            <div><p class="terms" id="terms_2">�������� ���� �� �̿� ����(�ʼ�)<a href=""><p class="fullText" id="fullText_2">��������</p></a></div>
        </div>
    </div>
</div>
    <a href="/"><div id="submit">
        <p>�����ϰ� �Ϸ�</p>
    </div></a>
</body>
</html>