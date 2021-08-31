<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>Database 관리</title>
	<script src="/resources/jq/jquery.js"></script>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet"
		integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">

	<style type="text/css">
		#tab {
			height: 200px;
			overflow: auto;
		}

		#company_nav ul li {
			display: inline-block;
			font-size: 20px;
			text-align: center;

		}

		#company_nav ul li:hover {
			background-color: #ccc;
			cursor: pointer;
		}

		#company_api {
			border: 1px solid #ccc;
			height: 500px;
		}

		.company_span {
			
			height: 3px;
			width: 80%;
			margin: auto;
		}
		.hide{
			display: none;
		}
		
		.black{
			background-color: black;
		}
	</style>

	<script>
		$().ready(()=>{
			let arr = new Array();
			$(".nav_icon").click(function(){
				event.preventDefault
				$(".company_span").removeClass("black");
				$(this).children().addClass("black");
			})

		})
		
	</script>
</head>

<body>
	<div class="container">
		<div id="company">
			<div id="company_nav">
				<ul>
					<li class="col-1 nav_icon">API<div class="company_span "></div></li>
					<li class="col-1 nav_icon">DB<div class="company_span "></div></li>
				</ul>
			</div>
			<div id="company_api" class="col-5">
				
			</div>
		</div>
	</div>
</body>

</html>