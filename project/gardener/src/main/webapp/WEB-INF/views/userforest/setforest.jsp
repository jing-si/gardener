<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>숲꾸미기</title>
<link rel="stylesheet" href="/resources/css/005-01-01.css">
<link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic:wght@400;700;800&family=Noto+Sans+KR:wght@400;700;900&display=swap" rel="stylesheet">
<script src="http://code.jquery.com/jquery-3.5.1.min.js"></script>

<link rel="stylesheet" href="http://code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
    <script src="http://code.jquery.com/jquery.min.js"></script>
    <script src="http://code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
    <script>
        $( document ).ready(function() { $('#test').draggable(); });
    </script>
    
</head>
<body>
    <div class="wrapper">
        <div class="header">
            <p class="header_text">숲 꾸미기</p>
            <a href="/userforest/"><p class="close_btn"><img src="/resources/images/icon_close.png" width="18" height="18"></p></a>
            <a href="/userforest/"><p class="save_btn"><img src="/resources/images/icon_save.png" width="24" height="24"></p></a>
        </div>
        
        <div class="main_content">
        	<img id="test" src="/resources/images/tree_01.png" width= "300" height= "382">
        </div>
        
        <c:forEach var="list" items="${plantList}">
        	<img src="/resources/images/${list.plantImg}">
        </c:forEach>
             
        <div class="footer">
            <div class="footer_btn"><img class="btn" id="btn_front" src="/resources/images/btn_front.png" width="45" height="45">
            </div><div class="footer_btn"><img class="btn" id="btn_back" src="/resources/images/btn_back.png" width="45" height="45">
            </div><div class="footer_btn"><img class="btn_delete" id="btn_delete" src="/resources/images/btn_delete.png" width="60" height="60">
            </div><div class="footer_btn"><img class="btn" id="zoom-in" src="/resources/images/btn_plus.png" width="45" height="45">
            </div><div class="footer_btn"><img class="btn" id="zoom-out" src="/resources/images/btn_minus.png" width="45" height="45">
            </div>
        </div>
    </div>
    
    <!-- 이미지 확대 축소 -->
    <script>
        $('#zoom-in').click(function() { updateZoom(0.1); } );
        $('#zoom-out').click(function() { updateZoom(-0.1);} );
        
        zoomLevel = 1;
        var updateZoom = function(zoom) {
        zoomLevel += zoom;
        
        if(zoomLevel > 0.5 && zoomLevel < 1.6) {
        	 $('#test').css({ zoom: zoomLevel, '-moz-transform': 'scale(' + zoomLevel + ')' });
        }
        }
        
        
        var p = $('#test').last();
        var offset = p.offset();
        console.log("left: " + offset.left + " top: " + offset.top);
    </script>
    <!-- 이미지 확대 축소 -->
    
    <!-- 이미지 우선순위 -->
    <script>
    	$('#btn_front').click(function () { 
    		
    	});
    
    
    </script>
    <!-- 이미지 우선순위 -->
    
    
    
    
    
</body>
</html>