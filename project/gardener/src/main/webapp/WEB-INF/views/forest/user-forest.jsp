<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Forest</title>
<link rel="stylesheet" href="/resources/css/005-01.css">
<link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic&family=Noto+Sans+KR&display=swap" rel="stylesheet">
</head>
<body>


	<div class="main_container">
        <button type="button" id="button_close"><a href="/"></a></button><img src="/resources/images/btn_close.png" width="50" height="50"></button>
        <button type="button" id="botton_setting"><a href="forestsetting/"></a><img src="/resources/images/bottom_setting_2.png" width="50"height="50"></button>
        <button type="button" id="botton_item"><a href="inven/"></a><img src="/resources/images/bottom_item.png" width="50" height="50"></button>
    </div>
    
	<!-- 컨테이너 -->
    <div class="container">
        <!-- 모달을 감쌀 박스 -->
        <div class="popup_wrap" id="popup">
            <div class="align">
                <!-- 실질적 모달 팝업 -->
                <div class="popup">
                    <!-- 상단 버튼 영역 -->
                    <div class="popup_head">
                        <div class="popup_close"><img src="images/icon_close.png" width="18" height="18"></div>
                        <div class="item_all"><img src="images/item_all.png" width="45" height="30"></div>
                        <div class="item_tree"><img src="images/item_tree_disable.png" width="45" height="30"></div>
                        <div class="item_flower"><img src="images/item_flower_disable.png" width="45" height="30"></div>
                    </div>
                    <!-- 하단 빈공간 -->
                    
                    <!-- 아이템 인벤토리 영역 -->
                    <div class="popup_body">
                        <div class="scroll_container">
                            <div class="scroll_wrap">
                                <div class="item_card">
                                    <img class="item_bg" src="images/tree01_bg.png">
                                    <p class="text_left">보관중인 나무 :</p>
                                    <p class="text_right">그루</p>
                                    <p class="text_amount">990</p>
                                    <p class="planting_btn" onclick="newPage()"></p>
                                    <p class="planting_btn_text" onclick="newPage()">나무 심기</p>
                                </div>
                                <div class="item_card">
                                    <img class="item_bg" src="images/tree01_bg.png">
                                    <p class="text_left">보관중인 나무 :</p>
                                    <p class="text_right">그루</p>
                                    <p class="text_amount">99</p>
                                    <p class="planting_btn"></p>
                                    <p class="planting_btn_text">나무 심기</p>
                                </div>
                                <div class="item_card">
                                    <img class="item_bg" src="images/tree02_bg.png">
                                    <p class="text_left">보관중인 나무 :</p>
                                    <p class="text_right">그루</p>
                                    <p class="text_amount">99</p>
                                    <p class="planting_btn"></p>
                                    <p class="planting_btn_text">나무 심기</p>
                                </div>
                                <div class="item_card">
                                    <img class="item_bg" src="images/tree02_bg.png">
                                    <p class="text_left">보관중인 나무 :</p>
                                    <p class="text_right">그루</p>
                                    <p class="text_amount">99</p>
                                    <p class="planting_btn"></p>
                                    <p class="planting_btn_text">나무 심기</p>
                                </div>
                                <div class="item_card">
                                    <img class="item_bg" src="images/tree03_bg.png">
                                    <p class="text_left">보관중인 나무 :</p>
                                    <p class="text_right">그루</p>
                                    <p class="text_amount">99</p>
                                    <p class="planting_btn"></p>
                                    <p class="planting_btn_text">나무 심기</p>
                                </div>
                                <div class="item_card">
                                    <img class="item_bg" src="images/tree03_bg.png">
                                    <p class="text_left">보관중인 나무 :</p>
                                    <p class="text_right">그루</p>
                                    <p class="text_amount">99</p>
                                    <p class="planting_btn"></p>
                                    <p class="planting_btn_text">나무 심기</p>
                                </div>
                                <div class="item_card">
                                    <img class="item_bg" src="images/tree04_bg.png">
                                    <p class="text_left">보관중인 나무 :</p>
                                    <p class="text_right">그루</p>
                                    <p class="text_amount">99</p>
                                    <p class="planting_btn"></p>
                                    <p class="planting_btn_text">나무 심기</p>
                                </div>
                                <div class="item_card">
                                    <img class="item_bg" src="images/tree04_bg.png">
                                    <p class="text_left">보관중인 나무 :</p>
                                    <p class="text_right">그루</p>
                                    <p class="text_amount">99</p>
                                    <p class="planting_btn"></p>
                                    <p class="planting_btn_text">나무 심기</p>
                                </div>
                                <div class="item_card">
                                    <img class="item_bg" src="images/tree05_bg.png">
                                    <p class="text_left">보관중인 나무 :</p>
                                    <p class="text_right">그루</p>
                                    <p class="text_amount">99</p>
                                    <p class="planting_btn"></p>
                                    <p class="planting_btn_text">나무 심기</p>
                                </div>
                                <div class="item_card">
                                    <img class="item_bg" src="images/tree05_bg.png">
                                    <p class="text_left">보관중인 나무 :</p>
                                    <p class="text_right">그루</p>
                                    <p class="text_amount">99</p>
                                    <p class="planting_btn"></p>
                                    <p class="planting_btn_text">나무 심기</p>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="popup_footer"></div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>