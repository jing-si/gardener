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
    let arr = new Array();
    let item ;
	$().ready(()=>{
	$.ajax({
		url:"../userforest/setforest/init2",
		success:function(data){
			arr = data;
			console.log(data);
			arr.forEach((value,index)=>{
				let div1 = $("<div class='userPlant'>");				
				let img = $("<img>");
				// img.data("index",index);
				
				div1.attr("id", 'userPlant'+value.plantId);
				div1.data("index",index);
				
				img.attr("id", value.PlantId);
				img.attr("src",value.plantImage);
								
				div1.css("z-index",value.locationOrder);
				img.css("scale",value.locationSize);
				
				
				
				//item.locationX = currentlocation;
  
				$("#image-container").append(div1);
				div1.append(img);
				div1.css("left",value.locationX);
				div1.css("top",value.locationY);				
				
				/* 아래와 같이 넣어주고자 함
				<div id="userPlant01" class="userPlant">
					<img src="/resources/images/tree_01.png"></div>
				</div> 
				*/
				
			})
		}
	})
	
	$("#image-container").on("click", ".userPlant",function(data){
		item = $(this);
		$('.userPlant').removeClass('imgBox');
		$(this).addClass('imgBox');	
		console.log(item);
		
	})
	
	$("#image-container").on("mouseover", ".userPlant",function(data){
		$(this).draggable();
		
	})
	
	
	$('#zoom-in').click(function(){
		let zoomLevel = arr[$(this).data("index")].locationSize;	
		updateZoom(0.1)
		var updateZoom = function(zoom) {
		zoomLevel += zoom;

		if(zoomLevel > 0.5 && zoomLevel < 1.6) { 
			$(item).css({ zoom: zoomLevel, '-moz-transform' : 'scale(' + zoomLevel + ')'}); 
		} 
		
	
	}
	
	$('#zoom-out').click(function(){
		let zoomLevel = arr[$(this).data("index")].locationSize;
		updateZoom(-0.1)
		var updateZoom = function(zoom) {
			zoomLevel += zoom;

			if(zoomLevel > 0.5 && zoomLevel < 1.6) { 
				$(item).css({ zoom: zoomLevel, '-moz-transform' : 'scale(' + zoomLevel + ')'}); 
			} 
			
		}
		
	
});			
	
		$(document).ready(function(){
		$(document).on("click",".userPlantImg",function(data){
		// 동적으로 여러 태그가 생성된 경우라면 이런식으로 클릭된 객체를 this 키워드를 이용해서 잡아올 수 있다

		$('#zoom-in').click(function() { updateZoom(0.1); } );
		$('#zoom-out').click(function() { updateZoom(-0.1);} );

		let zoomLevel = arr[item.data("index")].locationSize;
		var updateZoom = function(zoom) {
		zoomLevel += zoom;

		if(zoomLevel > 0.5 && zoomLevel < 1.6) { 
			$(item).css({ zoom: zoomLevel, '-moz-transform' : 'scale(' + zoomLevel + ')'}); 
		} 
		} 
		}); 
		});
 </script>


<style>

.userPlant:hover {
	border: 1px solid grey;
}

.imgBox {
    border: 2px solid blue;
    padding: 0;
}

#userPlant1 {
	 zoom: 1.5;
	 
}
.userPlant > img{
	width: 150px;
	height: 180px;
}



#image-container{
	width:100%;
	height: 100%;
	position: relative;	
}
.userPlant{
	position: absolute;
}

</style>

</head>
<body>
    <div class="wrapper">
        <div class="header">
            <p class="header_text">숲 꾸미기</p>
            <a href="/login/userforest/"><p class="close_btn"><img src="/resources/images/icon_close.png" width="18" height="18"></p></a>
            <a href="/login/userforest/"><p class="save_btn"><img src="/resources/images/icon_save.png" width="24" height="24"></p></a>
        </div>
        
        <div id="image-container">
    	</div>
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
   <!--  <script>
    $(document).ready(function(){
		    	$(document).on("click",".userPlantImg",function(event){
		    	// 동적으로 여러 태그가 생성된 경우라면 이런식으로 클릭된 객체를 this 키워드를 이용해서 잡아올 수 있다.
		    	
		        	$('#zoom-in').click(function() { updateZoom(0.1); } );
		            $('#zoom-out').click(function() { updateZoom(-0.1);} );
		            
		            zoomLevel = 1;
		            var updateZoom = function(zoom) {
		            zoomLevel += zoom;
		            
		            if(zoomLevel > 0.5 && zoomLevel < 1.6) {
		            	 $(this).css({ zoom: zoomLevel, '-moz-transform': 'scale(' + zoomLevel + ')' });
		            }
		            }
		            
		            
		            var p = $(this).last();
		            var offset = p.offset();
		            console.log("left: " + offset.left + " top: " + offset.top);
		    	});
	});
		 
	</script> -->
    <!-- 이미지 확대 축소 -->
    
    <!-- 이미지 우선순위 -->
    <!-- <script>
    	$('#btn_front').click(function () { 
    		
    	});
    
    
    </script> -->
    <!-- 이미지 우선순위 -->
    
    
    
    
    
</body>
</html>