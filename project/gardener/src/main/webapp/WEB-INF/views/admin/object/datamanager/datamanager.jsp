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
	<link href="/resources/css/init.css" rel="stylesheet">
	
	<style type="text/css">
		#tab {
			height: 200px;
			overflow: auto;
		}

		#company_nav ul {}

		#company_nav ul li {
			display: inline-block;
			font-size: 20px;
			text-align: center;
			padding: 0px 10px;
		}

		.nav_icon:hover {
			background-color: #ccc;
			cursor: pointer;
		}

		.api {
			border: 1px solid #ccc;
			height: 400px;
			overflow: auto;
		}

		.company_span {
			height: 3px;
			width: 80%;
			margin: 5px auto;
		}

		.hide {
			display: none;
		}

		.black {
			background-color: black;
		}

		input[type="number"]::-webkit-outer-spin-button,
		input[type="number"]::-webkit-inner-spin-button {
			-webkit-appearance: none;
			margin: 0;
		}

		header h2 {
			display: block;
			padding: 15px 20px;
		}

		#company_but {
			width: 20%;
		}

		label {
			margin: 5px;
		}

		.inlineBlock {
			display: inline-block;
		}

		#product {
			float: right;
		}

		#company {
			float: left;
		}

		.full {
			width: 100%;
		}

		#mid {
			display: inline-block;
			height: 400px;
			
		}
		.center{
			margin-left: auto;
			margin-right: auto;
		}
		.vertical{
			margin-top:auto;
			margin-bottom: auto;
		}
		#arrow{
			display: block;
			margin-top: 80%;
			
		}
	</style>

	<script>
		$().ready(() => {
			let arr = new Array();
			$(".nav_icon").click(function () {
				event.preventDefault
				$(this).parent().children().children().removeClass("black");
				$(this).children().addClass("black");
			})

		})
	</script>
</head>

<body>
	<div class="container">
		<header>
			<h2>Database 관리자</h2>
		</header>
		<!-- 회사-->
		<div id="company" class="col-4">
			<div id="company_nav">
				<ul class="full">
					<li class="col-5"><span class=".bg-info">Company</span>
						<div class="company_span "></div>
					</li>
					<li class="col-3 nav_icon">API
						<div class="company_span "></div>
					</li>
					<li class="col-3 nav_icon">DB
						<div class="company_span "></div>
					</li>

				</ul>
			</div>

			<div>
				<div id="company_api" class="full api"></div>
				<form class="col-10 center" method="get">
					<label class="col-4">조회 시작일<input type="number" name="startday" placeholder="YYYYMMDD"
							class="input-group-text full"></label> 
					<label class="col-4">조회 종료일<input type="number" name="startday" placeholder="YYYYMMDD" 
							class="input-group-text full"></label>
					<button id="company_but" type="button" class="btn btn-info col-2">검색</button>
				</form>

			</div>
		</div>
		<div id="mid" class="col-2">
			<button id="arrow" class="center btn btn-success vertical"><h1>→</h1></button>
		</div>

		<!-- 제품 -->
		<div id="product" class="col-6">
			<div id="company_nav">
				<ul class="full">
					<li class="col-5"><span class=".bg-info">Product</span>
						<div class="company_span "></div>
					</li>
					<li class="col-3 nav_icon">API
						<div class="company_span "></div>
					</li>
					<li class="col-3 nav_icon">DB
						<div class="company_span "></div>
					</li>
				</ul>
			</div>

			
				<div id="product_api" class="full api"></div>
				<form class="col-10 center" method="get">
					<label class="col-4">조회 시작일<input type="number" name="startday" placeholder="YYYYMMDD"
							class="input-group-text full"></label>
					<label class="col-4">조회 종료일<input type="number" name="startday" placeholder="YYYYMMDD"
							class="input-group-text full"></label>
					<button id="company_but" type="button" class="btn btn-info col-2">검색</button>
				</form>

			
		</div>
	</div>
</body>

</html>