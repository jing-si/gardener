<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html lang="ko">

<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
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

		#company_nav ul {
			margin: 0px;

		}

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

		.company_but {
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

		.company {
			float: left;
		}

		.full {
			width: 100%;
		}

		#mid {
			display: inline-block;
			height: 400px;

		}

		.center {
			margin-left: auto;
			margin-right: auto;
		}

		.vertical {
			margin-top: auto;
			margin-bottom: auto;
		}

		#arrow {
			display: block;
			margin-top: 80%;

		}

		.textcenter {
			text-align: center;
		}

		.overflow {
			overflow: auto;
		}

		.overflow_hidden {
			overflow: hidden;
		}

		.tabTH {
			border-bottom: 1px solid #ccc;
		}

		.colorbbb {
			background-color: #bbb;
		}

		#function_btn {
			clear: both;
			width: 100%;
			height: 80px;
			border: 1px solid black;
			box-sizing: content-box;
		}

		.detail {
			border: 1px solid #ccc;
			height: 550px;
			display: inline-block;
			margin: auto;
		}

		.detail h2 {
			padding: 10px 20px;
			height: full;
			border-bottom: 1px solid #ccc;
			margin-bottom: 20px;
		}

		#product_ditail {
			float: right;
			position: relative;
		}

		#product_ditail>div:first-of-type {
			background-color: red;
			position: absolute;
			bottom: 0;
			left: 0;
			height: 89%;
		}

		#product_ditail>div:last-child {
			background-color: green;
			position: absolute;
			bottom: 0;
			right: 0;
			height: 89%;
		}
		#product_ditail>div div{
			margin:15px;
			position: relative;		
			width: auto;
		}
		#company_ditail {}

		footer {
			margin-top: 120px;
			height: 100px;
			background-color: rgb(82, 63, 70);
			color: #fff;
			text-align: center;

		}

		#company_ditail div div {
			margin-left: 30px;
		}
	</style>

	<script>
		let companyArr = new Array();
		let productArr = new Array();

		$().ready(() => {
			//api, db 버튼의 행동
			$(".nav_icon").click(function () {
				event.preventDefault
				$(this).parent().children().children().removeClass("black");
				$(this).children().addClass("black");

				$("." + $(this).data("sub") + "Form").addClass("hide");
				$("#" + $(this).data("sub") + $(this).data("kind") + "Form").removeClass("hide");
			})

			//회사 api 날짜 기준 검색
			$("#company_api_but").click(() => {
				const start = $("#company_start_day").val();
				const end = $("#company_end_day").val();
				let url = "/admin/object/datamanager/list";
				url += "/" + start;
				url += "/" + end;
				
				$("#company_api_tbody").empty()
				let tr = $('<tr class="selectRow">');
					let th1 = $('<th scope="row" class="full textcenter overflow">')
						.text("제품 검색을 시작합니다.")
					tr.append(th1);
					$("#company_api_tbody").append(tr)
				$.ajax({
					url: url,
					success: function (data) {
						companyArr = data;
						$("#company_api_tbody").empty()
						companyArr.forEach((value, index) => {
							let tr = $('<tr class="selectRow">').data("index", index);
							let th1 = $(
									'<th scope="row" class="col-1 textcenter overflow">')
								.text(index)
							let td2 = $('<td class="col-4 textcenter overflow">').text(
								value.companyId)
							let td3 = $('<td class="col-5 textcenter overflow">').text(
								value.companyName)
							let td4 = $('<td class="col-2 textcenter overflow">')
							tr.append(th1).append(td2).append(td3).append(td4)
							$("#company_api_tbody").append(tr)

						});
					}
				});

			});

			//product api 날짜 기준 검색
			$("#product_api_but").click(() => {
				const start = $("#product_start_day").val();
				const end = $("#product_end_day").val();
				let url = "/admin/object/datamanager/productlist";
				url += "/" + start;
				url += "/" + end;
				console.log(url);
				$("#product_api_tbody").empty()
				let tr = $('<tr class="selectRow">');
				let th1 = $('<th scope="row" class="full textcenter overflow">')
					.text("제품 검색을 시작합니다.")
				tr.append(th1);
				$("#product_api_tbody").append(tr)
				$.ajax({
					url: url,
					success: function (data) {
						productArr = data;
						makeProductList();

					},
					error: function (data) {
						console.log(data);
						productArr = new Array();
						makeProductList();
					}
				});

			});

			//제품의 행을 뿌려주는 함수
			function makeProductList() {
				$("#product_api_tbody").empty()
				if (productArr.length === 0) {
					let tr = $('<tr class="selectRow">');
					let th1 = $('<th scope="row" class="full textcenter overflow">')
						.text("검색 되는 제품이 하나도 없습니다.")
					tr.append(th1);
					$("#product_api_tbody").append(tr)
				}
				productArr.forEach((value, index) => {
					let tr = $('<tr class="selectRow">').data("index", index);
					let th1 = $('<th scope="row" class="col-1 textcenter overflow">')
						.text(index)
					let td2 = $('<td class="col-3 textcenter overflow">')
						.text(value.productId)
					let td3 = $('<td class="col-4 textcenter overflow">')
						.text(value.productName)
					let td4 = $('<td class="col-3 textcenter overflow">')
						.text(value.certId)
					let td5 = $('<td class="col-1 textcenter overflow">')
					tr.append(th1).append(td2).append(td3).append(td4).append(td5);
					$("#product_api_tbody").append(tr)

				});

			}


			//회사 선택시 행동
			$("#company_api_tbody").on("click", ".selectRow", function () {
				$(".selectRow").removeClass("colorbbb");
				$(this).addClass('colorbbb');
				let company = companyArr[$(this).data("index")]
				$("#companyId").val(company.companyId);
				$("#companyName").val(company.companyName);
				$("#companyHomepage").val(company.companyHomepage);
				$("#companyAddress").val(company.companyAddress);
				$("#companyTel").val(company.companyTel);

			})

			//중간 녹색 화살표
			$("#arrow").click(function () {
				let companyId = $("#companyId").val()
				$.ajax({
					url: "/admin/object/datamanager/productlist/" + companyId,
					success: function (data) {
						productArr = data;
						makeProductList();
					},
					error: function (data) {
						console.log(data);
						productArr = new Array();
						makeProductList();
					}
				})

			})


		});
	</script>
</head>

<body>
	<div class="container">
		<header>
			<h2>Database 관리자</h2>
		</header>
		<!-- 회사-->

		<div id="company" class="col-4 company">
			<div id="company_nav">
				<ul class="full">
					<li class="col-5"><span class=".bg-info">Company</span>
						<div class="company_span "></div>
					</li>
					<li class="col-3 nav_icon" data-sub="company" data-kind="Api">API<div class="company_span black">
						</div>
					</li>
					<li class="col-3 nav_icon" data-sub="company" data-kind="Db">DB<div class="company_span "></div>
					</li>

				</ul>
			</div>
			<!-- 회사 api -->
			<div id="companyApiForm" class="companyForm">
				<div id="company_api" class="full api">
					<table class="table tabTH" border="1">
						<thead>
							<tr>
								<th scope="col" class="col-1 textcenter">#</th>
								<th scope="col" class="col-4 textcenter">사업자 번호</th>
								<th scope="col" class="col-5 textcenter">상호</th>
								<th scope="col" class="col-2 textcenter">상태</th>
							</tr>
						</thead>
					</table>
					<div id="api_data" class="overflow">
						<table class="table" border="1">
							<tbody id="company_api_tbody">

							</tbody>
						</table>
					</div>
				</div>
				<form class="col-10 center" id="company_api_form">
					<label class="col-4">조회 시작일<input type="number" id="company_start_day" placeholder="YYYYMMDD"
							class="input-group-text full"></label>
					<label class="col-4">조회 종료일<input type="number" id="company_end_day" placeholder="YYYYMMDD"
							class="input-group-text full"></label>
					<button id="company_api_but" data-sub="company" type="button"
						class="btn btn-info col-2 company_but">검색</button>
				</form>
			</div>

			<!-- 회사 db -->
			<div id="companyDbForm" class="companyForm hide">
				<div id="company_db" class="full api"></div>
				<form class="col-10 center" method="get">

				</form>
			</div>
		</div>



		<!-- 중앙 화살표 -->
		<div id="mid" class="col-2">
			<button id="arrow" class="center btn btn-success vertical">
				<h1>→</h1>
			</button>
		</div>

		<!-- 제품 -->
		<div id="product" class="col-6">
			<div id="company_nav">
				<ul class="full">
					<li class="col-5"><span class=".bg-info">Product</span>
						<div class="company_span "></div>
					</li>
					<li class="col-3 nav_icon" data-sub="product" data-kind="Api">API
						<div class="company_span black"></div>
					</li>
					<li class="col-3 nav_icon" data-sub="product" data-kind="Db">DB
						<div class="company_span "></div>
					</li>
				</ul>
			</div>

			<!-- 제품 API -->
			<div id="productApiForm" class="productForm">

				<div id="product_api" class="full api">
					<table class="table tabTH" border="1">
						<thead>
							<tr>
								<th scope="col" class="col-1 textcenter">#</th>
								<th scope="col" class="col-3 textcenter">제품번호</th>
								<th scope="col" class="col-4 textcenter">제품명</th>
								<th scope="col" class="col-3 textcenter">인증정보</th>
								<th scope="col" class="col-1 textcenter">상태</th>
							</tr>
						</thead>
					</table>
					<div id="product_api_data" class="overflow">
						<table class="table" border="1">
							<tbody id="product_api_tbody">

							</tbody>
						</table>
					</div>
				</div>

				<form class="col-10 center">
					<label class="col-4 vertical">조회 시작일<input type="number" id="product_start_day"
							placeholder="YYYYMMDD" class="input-group-text full"></label>
					<label class="col-4 vertical">조회 종료일<input type="number" id="product_end_day" placeholder="YYYYMMDD"
							class="input-group-text full"></label>
					<button id="product_api_but" data-sub="product" type="button"
						class="btn btn-info col-2 vertical">검색</button>
				</form>
			</div>

			<!-- 제품 DB -->
			<div id="productDbForm" class="productForm hide">
				<div id="product_api" class="full api">


				</div>
				<form class="col-10 center" method="get">

				</form>
			</div>

		</div>

		<!-- 중앙 기능 버튼 -->
		<div id="function_btn" class="">
			<div class="col-6 inlineBlock">

			</div>
			<div class="black col-6 inlineBlock">

			</div>

		</div>

		<!-- 상세 페이지 -->
		<div class="full">
			<!-- 회사 상세 페이지-->
			<div id="company_ditail" class="detail col-4">
				<h2>기업 상세 정보</h2>

				<div class="col-10">
					<div class="input-group mb-4">
						<span class="input-group-text col-4">사업자 번호</span>
						<input type="text" class="form-control" id="companyId">
					</div>
					<div class="input-group mb-4">
						<span class="input-group-text col-4 textcenter">상 호</span>
						<input type="text" class="form-control" id="companyName">
					</div>
					<div class="input-group mb-4">
						<span class="input-group-text col-4 textcenter">전화번호</span>
						<input type="text" class="form-control" id="companyTel">
					</div>
					<div class="input-group mb-4">
						<span class="input-group-text col-4 textcenter overflow">주 소</span>
						<input type="text" class="form-control" id="companyAddress">
					</div>
					<div class="input-group mb-4">
						<span class="input-group-text col-4 textcenter">홈페이지</span>
						<input type="text" class="form-control" id="companyHomepage">
					</div>
				</div>
			</div>

			<!-- 제품 상세 페이지-->
			<div id="product_ditail" class="detail col-6">
				<h2>제품 상세 정보</h2>
				<div class="col-6">
					<div class="input-group mb-4">
						<span class="input-group-text col-4">사업자 번호</span>
						<input type="text" class="form-control" id="">
					</div>
					<div class="input-group mb-4">
						<span class="input-group-text col-4 textcenter">상 호</span>
						<input type="text" class="form-control" id="">
					</div>
					<div class="input-group mb-4">
						<span class="input-group-text col-4 textcenter">전화번호</span>
						<input type="text" class="form-control" id="">
					</div>
					<div class="input-group mb-4">
						<span class="input-group-text col-4 textcenter overflow">주 소</span>
						<input type="text" class="form-control" id="">
					</div>
					<div class="input-group mb-4">
						<span class="input-group-text col-4 textcenter">홈페이지</span>
						<input type="text" class="form-control" id="">
					</div>
				</div>
				<div class="col-6">
					<div class="input-group mb-4">
						<span class="input-group-text col-4">사업자 번호</span>
						<input type="text" class="form-control" id="">
					</div>
					<div class="input-group mb-4">
						<span class="input-group-text col-4 textcenter">상 호</span>
						<input type="text" class="form-control" id="">
					</div>
					<div class="input-group mb-4">
						<span class="input-group-text col-4 textcenter">전화번호</span>
						<input type="text" class="form-control" id="">
					</div>
					<div class="input-group mb-4">
						<span class="input-group-text col-4 textcenter overflow">주 소</span>
						<input type="text" class="form-control" id="">
					</div>
					<div class="input-group mb-4">
						<span class="input-group-text col-4 textcenter">홈페이지</span>
						<input type="text" class="form-control" id="">
					</div>
				</div>
			</div>



		</div>


		<footer>
			지구를 지켜 주세요.
		</footer>
	</div>
</body>

</html>