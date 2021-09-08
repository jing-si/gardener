<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자 숲</title>
<link rel="stylesheet" href="/resources/css/005-01.css">
<link
	href="https://fonts.googleapis.com/css2?family=Nanum+Gothic:wght@400;700;800&family=Noto+Sans+KR:wght@400;700;900&display=swap"
	rel="stylesheet">
<script type="text/javascript" src="/resources/js/005-01.js"></script>
<script src="/resources/jq/jquery.js"></script>
<script>
	let arr = new Array();
	$().ready(()=>{
	$.ajax({
		url:"../userforest/init",
		success:function(data){
			arr = data;
			console.log(data);
			arr.forEach((value,index)=>{
				let div = $("<div class="test">");
				//img.data("index",index);

				div.css("width",value.plantWidth);
				div.css("height",value.plantHeight);
				div.attr("src",value.plantImage);
				div.attr("id",value.PlantId);
				div.css("z-index",value.locationOrder);
				div.css("left",value.locationX);
				div.css("top",value.locationY);
				
				//let item = arr[div.data("index")];
				//item.locationX = currentlocation;

				$("#image-container").append(div);
				
				
			})

		}
	})
});
</script>

<style>
img{
	position: absolute;
}
#image-container{
	position: relative;
}
/* 유저가 저장한 나무 이미지 CSS 생성공간 */
</style>

</head>
<body>

	<div id="image-container">
		<div>
			아야어여오요
		</div>
		<!-- 유저가 저장한 나무 이미지 생성공간 -->
	</div>

	<div class="main_container">
		<a href="/"><button type="button" id="button_close">
				<img src="/resources/images/btn_close.png" width="50" height="50">
			</button></a> <a href="/login/userforest/setforest/"><button type="button"
				id="button_setting">
				<img src="/resources/images/button_setting_2.png" width="50"
					height="50">
			</button></a>
		<button type="button" id="button_item">
			<img src="/resources/images/button_item.png" width="50" height="50">
		</button>
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
						<button type="button" id="popup_close">
							<img src="/resources/images/icon_close.png" width="18"
								height="18">
						</button>
						<div class="item_all">
							<img src="/resources/images/item_all.png" width="45" height="30">
						</div>
						<div class="item_tree">
							<img src="/resources/images/item_tree_disable.png" width="45"
								height="30">
						</div>
						<div class="item_flower">
							<img src="/resources/images/item_flower_disable.png" width="45"
								height="30">
						</div>
					</div>
					<!-- 하단 빈공간 -->

					<!-- 아이템 인벤토리 영역 -->
					<div class="popup_body">
						<div class="scroll_container">
							<div class="scroll_wrap">

								<c:forEach var="list" items="${plantList}">
									<c:if test="${list.treeCount.size()<1}">
										<div class="item_card" id="plant_01">
											<img class="item_bg"
												src="/resources/images/${list.plantBg}.png">
											<p class="text_left">보관중인 나무 :</p>
											<p class="text_right">그루</p>
											<p class="text_amount">${plantCount}</p>
											<a href="../userforest/setforest/">
												<p class="planting_btn"></p>
												<p class="planting_btn_text">나무 심기</p>
											</a>
										</div>
									</c:if>
									<div class="item_card" id="plant_01">
										<img class="item_bg"
											src="../resources/images/${list.plantImg}.png">
										<p class="text_left">보관중인 나무 :</p>
										<p class="text_right">그루</p>
										<p class="text_amount">${plantCount}</p>
										<a href="/userforest/setforest/">
											<p class="planting_btn"></p>
											<p class="planting_btn_text">나무 심기</p>
										</a>
									</div>
								</c:forEach>


								<div class="item_card" id="plant_02">
									<img class="item_bg" src="/resources/images/tree01_bg.png">
									<p class="text_left">보관중인 나무 :</p>
									<p class="text_right">그루</p>
									<p class="text_amount">1</p>
									<a href="../userforest/setforest/">
										<p class="planting_btn"></p>
										<p class="planting_btn_text">나무 심기</p>
									</a>
								</div>

								<!--  
                                <div class="item_card" id="plant_03">
                                    <img class="item_bg" src="images/tree02_bg.png">
                                    <p class="text_left">보관중인 나무 :</p>
                                    <p class="text_right">그루</p>
                                    <p class="text_amount">${plantCount}</p>
                                    <p class="planting_btn"></p>
                                    <p class="planting_btn_text">나무 심기</p>
                                </div>
                                <div class="item_card" id="plant_04">
                                    <img class="item_bg" src="images/tree02_bg.png">
                                    <p class="text_left">보관중인 나무 :</p>
                                    <p class="text_right">그루</p>
                                    <p class="text_amount">${plantCount}</p>
                                    <p class="planting_btn"></p>
                                    <p class="planting_btn_text">나무 심기</p>
                                </div>
                                <div class="item_card" id="plant_05">
                                    <img class="item_bg" src="images/tree03_bg.png">
                                    <p class="text_left">보관중인 나무 :</p>
                                    <p class="text_right">그루</p>
                                    <p class="text_amount">${plantCount}</p>
                                    <p class="planting_btn"></p>
                                    <p class="planting_btn_text">나무 심기</p>
                                </div>
                                <div class="item_card" id="plant_06">
                                    <img class="item_bg" src="images/tree03_bg.png">
                                    <p class="text_left">보관중인 나무 :</p>
                                    <p class="text_right">그루</p>
                                    <p class="text_amount">${plantCount}</p>
                                    <p class="planting_btn"></p>
                                    <p class="planting_btn_text">나무 심기</p>
                                </div>
                                <div class="item_card" id="plant_07">
                                    <img class="item_bg" src="images/tree04_bg.png">
                                    <p class="text_left">보관중인 나무 :</p>
                                    <p class="text_right">그루</p>
                                    <p class="text_amount">${plantCount}</p>
                                    <p class="planting_btn"></p>
                                    <p class="planting_btn_text">나무 심기</p>
                                </div>
                                <div class="item_card" id="plant_08">
                                    <img class="item_bg" src="images/tree04_bg.png">
                                    <p class="text_left">보관중인 나무 :</p>
                                    <p class="text_right">그루</p>
                                    <p class="text_amount">${plantCount}</p>
                                    <p class="planting_btn"></p>
                                    <p class="planting_btn_text">나무 심기</p>
                                </div>
                                <div class="item_card" id="plant_09">
                                    <img class="item_bg" src="images/tree05_bg.png">
                                    <p class="text_left">보관중인 나무 :</p>
                                    <p class="text_right">그루</p>
                                    <p class="text_amount">${plantCount}</p>
                                    <p class="planting_btn"></p>
                                    <p class="planting_btn_text">나무 심기</p>
                                </div>
                                <div class="item_card" id="plant_10">
                                    <img class="item_bg" src="images/tree05_bg.png">
                                    <p class="text_left">보관중인 나무 :</p>
                                    <p class="text_right">그루</p>
                                    <p class="text_amount">${plantCount}</p>
                                    <p class="planting_btn"></p>
                                    <p class="planting_btn_text">나무 심기</p>
                                </div>
                                -->
							</div>
						</div>
					</div>
					<div class="popup_footer"></div>
				</div>
			</div>
		</div>
	</div>


	<script type="text/javascript">
		// 모달창 클릭 이벤트
		document.getElementById("button_item").onclick = function() {
			document.getElementById("popup").style.display="block";
		}

		document.getElementById("popup_close").onclick = function() {
			document.getElementById("popup").style.display="none";
		}
		
		// 유저 숲 저장 데이터 가져오기
		 



</script>
</body>
</html>