<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic:wght@400;700;800&family=Noto+Sans+KR:wght@400;700;900&display=swap" rel="stylesheet">

    <!-- <link rel="stylesheet" href="/resources/css/product-detail.css"> -->
    
    <style>
    	*{
    padding: 0;
    margin: 0;
    list-style: none;
    box-sizing: border-box;
    font-family: 'Noto Sans KR', sans-serif;
}
a{
    text-decoration: none;
    color: black;
}

/* 헤더 */
#header{
    width: 100%;
    height: 45px;
    border-bottom: 5px solid #f5f5f5;
    position: relative;
}
#header p{
    width: 200px;
    text-align: center;
    font-family: NotoSansKR;
    font-size: 15px;
    font-weight: bold;
    color: #2c2c2c;
    margin: 0px auto;
    padding: 10px;
}
#header svg{
    position: absolute;
    top: 9px;
    left: 9px;
}
body{
    height: 100%;
}

/* 정렬 */
#align{
    width: 328px;
    height: 100%;
    /* height: calc(100vh - 45px - 56px); height: 120vh; */
    /* 100 - 헤더 - 공통메뉴 */
    margin: 0 auto;
    position: relative;
}

#product-title{
    /* /border: 1px solid red; */
    width: 100%;
    height: 227px;
    margin-bottom: 24px;
    margin-top: 30px;
}
#product-title #product-img{
   width: 182px;
   height: 182px;
   
   border-radius: 8px; 
   margin: 0 auto;
   position : relative;
}
#product-title #product-name{
    width: 100;
    height: 26px;
    font-family: NotoSansKR;
    font-size: 16px;
    font-weight: normal;
    font-stretch: normal;
    font-style: normal;
    margin-top: 19px;
    text-align: center;

}

 #product-chart{
    width: 100%;
    height: 260.8px;
}
#product-chart-title{
    width: 88px;
    height: 19px;
    font-family: Roboto;
    font-size: 14px;
    font-weight: 500;
    font-stretch: normal;
    font-style: normal;
    margin-bottom: 7.8px;
}
#product-chart li{
    width: 100%;
    height: 28px;
    border-bottom: 0.5px solid #e6e6e6;
}
#product-chart .blank{
    width: 100%;
    height: 4.3px;
}
.product-chart-name{
    display: inline-block;
    width: 104px;
    height: 28px;
    background-color: #f5f5f5;
    font-family: NotoSansKR;
    font-size: 10px;
    font-weight: normal;
    font-stretch: normal;
    font-style: normal;
    padding: 6px 0 9px 10px;
    color: #979797;
    padding: 6px auto 9px 10px;
}
.product-chart-content{
    display: inline-block;
    width: 224px;
    height: 28px;
    font-family: NotoSansKR;
    font-size: 10px;
    font-weight: normal;
    font-stretch: normal;
    font-style: normal;
    color: #646464;
    padding: 6px 0 8px 10px;
}

#same-brand{
    height: 250px;
}
#same-brand li{
    display: inline-block;
    width: 105px;
    margin-right: 10px;
}
#same-brand-title{
    display: inline-block;
    width: 130px;
    height: 19px;
    margin: 25.8px 5px 10px 0;
    font-family: Roboto;
    font-size: 14px;
    font-weight: 500;
    font-stretch: normal;
    font-style: normal;
}
#same-brand-more{
    width: 50px;
    font-family: NotoSansKR;
    font-size: 9px;
    font-weight: normal;
    font-stretch: normal;
    font-style: normal;
    color: #646464;
    float: right;
    margin-top: 28.8px;
    margin-bottom: 13px;
}
.same-brand-img{
    display: inline-block;
    width: 105px;
    height: 105px;
    margin: 0 20px 0 0;
    opacity: 0.5;
    border-radius: 8px;
<<<<<<< HEAD
    background-color: #e6e6e6;
    position : relative;
=======
}
.same-brand-img:hover{
    opacity: 1;
>>>>>>> 8b8168411a159fa8fd6789938535d9793d006dbe
}
.same-brand-name{
    padding-top: 3px;
    width:100%;
    text-align:center;
    font-family: NotoSansKR;
    font-size: 9px;
    font-weight: normal;
    font-stretch: normal;
    font-style: normal;
    color: #646464;
    line-height: 1.11;
    word-wrap: break-word;
    overflow: hidden;
}
.same-brand-li:hover .same-brand-name,.same-brand-name:hover{
	overflow: visible;
}
#same-brand-list{
    width: 100%; overflow-x: scroll; white-space:nowrap;
}



/* 공통메뉴바 */
.sticky{
    position: fixed;
    bottom: 0;
    width: 100%;
    height: 56px;
    background-color: #66bb6a;
}
.sticky div{
    display: inline-block;
    color: white;
    text-align: center;
    width: 20%;
    height: 100%;
    margin: 0;
    position: relative;
    font-size: 11px;
}
.sticky svg{
    /* position: absolute; */
    /* top: 6.3px; */
    /* left: 25px; */
    margin: auto 0;
    margin-top: 6.3px;
}
.sticky p{
    margin: auto 0;
    /* margin-top: 28.3px; */
    margin-top: 0px;
}
<<<<<<< HEAD





.img{
	height : 100%;
	position : absolute;
	left : 50%;
	transform : translate(-50%);
}
=======
img{
	max-width:100%;
	max-height: 100%;
	display: block;
	border-radius: 10px;
	margin: 0 auto;
	
}


>>>>>>> 8b8168411a159fa8fd6789938535d9793d006dbe
    </style>
    
</head>
<body>
<script type="text/javascript">
	function goBack(){
		history.back();
	}
	
	$("#header").on("click","#back",goBack()));
</script>
    <div id="header">
    	<!-- 진짜 직전 상태로 보내기 -->
        <div id="back"><svg xmlns="http://www.w3.org/2000/svg" height="24px" viewBox="0 0 24 24" width="24px" fill="#000000"><path d="M0 0h24v24H0V0z" fill="none"/><path d="M15.41 7.41L14 6l-6 6 6 6 1.41-1.41L10.83 12l4.58-4.59z"/></svg></div>
        <p>제품상세</p>
    </div>

    <div id="align">

        <div id="product-title">
            <div id="product-img"><img alt="" src="${item.productImage}" class="img"> </div>
            <p id="product-name">${item.productName}</p>
        </div>




        <div id="product-chart">
            <p id="product-chart-title">제품 상세정보</p>

            <ul>
                <li>
                    <div class="product-chart-name">제품명
                    </div><div class="product-chart-content">${item.productName}</div>
                </li>
                <li>
                    <div class="product-chart-name">규격
                    </div><div class="product-chart-content">${item.productSize}</div>
                </li>
                <li class="blank"></li>
                <li>
                    <div class="product-chart-name">인증구분
                    </div><div class="product-chart-content">${item.certId}</div>
                </li>
                <li>
                    <div class="product-chart-name">인증사유
                    </div><div class="product-chart-content"></div>
                </li>
                <li>
                    <div class="product-chart-name">환경표지 인증번호
                    </div><div class="product-chart-content">${item.productCertId}</div>
                </li>
                <li>
                    <div class="product-chart-name">환경표지 인증기간
                    </div><div class="product-chart-content">${item.productStartDate}~${item.productEndDate}</div>
                </li>
                <li class="blank"></li>
                <li>
                    <div class="product-chart-name">기업명
                    </div><div class="product-chart-content">${company.companyName}</div>
                </li>
                <li>
                    <div class="product-chart-name">전화번호
                    </div><div class="product-chart-content">${company.companyTel}</div>
                </li>
            </ul>
            
        </div>

            <div id="same-brand">
                <p id="same-brand-title">동일한 브랜드 제품</p>
                <a href="brand-list"><p id="same-brand-more">+더보기</p></a>
                <ul id="same-brand-list">
                
                	<c:if test="${sameBrandProductList.size()<1}">
                		<li>
                       		<div class="same-brand-img">같은 브랜드의 제품이 없습니다.</div>
                    	</li>
                	</c:if>
                	
                	<c:forEach var="list" items="${company.list}">
<<<<<<< HEAD
                		<li>
                       		<div class="same-brand-img"><img alt="" src="${list.productImage}" class="img"> </div>
                       		<a href="product/${list.productId}"><p class="same-brand-name">${list.productName}</p></a>
=======
                		<li id="same-brand-li">
                       		<div class="same-brand-img"><a href="${list.productId}"><img alt="" src="${list.productImage}"></a></div>
                       		<a href="${list.productId}"><p class="same-brand-name">${list.productName}</p></a>
>>>>>>> 8b8168411a159fa8fd6789938535d9793d006dbe
                    	</li>
                	</c:forEach>
                	
                </ul>
            </div>


        
    </div>

    <nav class="sticky">
        <a href="/login/"><div><svg xmlns="http://www.w3.org/2000/svg" height="24px" viewBox="0 0 24 24" width="24px" fill="#FFFFFF"><path d="M0 0h24v24H0V0z" fill="none"/><path d="M12 5.69l5 4.5V18h-2v-6H9v6H7v-7.81l5-4.5M12 3L2 12h3v8h6v-6h2v6h6v-8h3L12 3z"/></svg><p id="home">홈</p>
        </div></a><a href="/login/category/"><div><svg xmlns="http://www.w3.org/2000/svg" height="24px" viewBox="0 0 24 24" width="24px" fill="#FFFFFF"><path d="M0 0h24v24H0V0z" fill="none"/><path d="M4 10.5c-.83 0-1.5.67-1.5 1.5s.67 1.5 1.5 1.5 1.5-.67 1.5-1.5-.67-1.5-1.5-1.5zm0-6c-.83 0-1.5.67-1.5 1.5S3.17 7.5 4 7.5 5.5 6.83 5.5 6 4.83 4.5 4 4.5zm0 12c-.83 0-1.5.68-1.5 1.5s.68 1.5 1.5 1.5 1.5-.68 1.5-1.5-.67-1.5-1.5-1.5zM7 19h14v-2H7v2zm0-6h14v-2H7v2zm0-8v2h14V5H7z"/></svg><p>카테고리</p>
        </div></a><a href="/login/search/"><div><svg xmlns="http://www.w3.org/2000/svg" height="24px" viewBox="0 0 24 24" width="24px" fill="#FFFFFF"><path d="M0 0h24v24H0V0z" fill="none"/><path d="M15.5 14h-.79l-.28-.27C15.41 12.59 16 11.11 16 9.5 16 5.91 13.09 3 9.5 3S3 5.91 3 9.5 5.91 16 9.5 16c1.61 0 3.09-.59 4.23-1.57l.27.28v.79l5 4.99L20.49 19l-4.99-5zm-6 0C7.01 14 5 11.99 5 9.5S7.01 5 9.5 5 14 7.01 14 9.5 11.99 14 9.5 14z"/></svg><p>검색</p>
        </div></a><a href="/login/favorite/"><div><svg xmlns="http://www.w3.org/2000/svg" height="24px" viewBox="0 0 24 24" width="24px" fill="#FFFFFF"><path d="M0 0h24v24H0V0z" fill="none"/><path d="M12 21.35l-1.45-1.32C5.4 15.36 2 12.28 2 8.5 2 5.42 4.42 3 7.5 3c1.74 0 3.41.81 4.5 2.09C13.09 3.81 14.76 3 16.5 3 19.58 3 22 5.42 22 8.5c0 3.78-3.4 6.86-8.55 11.54L12 21.35z"/></svg><p>즐겨찾기</p>
        </div></a><a href="/login/setting/"><div><svg xmlns="http://www.w3.org/2000/svg" enable-background="new 0 0 24 24" height="24px" viewBox="0 0 24 24" width="24px" fill="#FFFFFF"><g><path d="M0,0h24v24H0V0z" fill="none"/><path d="M19.14,12.94c0.04-0.3,0.06-0.61,0.06-0.94c0-0.32-0.02-0.64-0.07-0.94l2.03-1.58c0.18-0.14,0.23-0.41,0.12-0.61 l-1.92-3.32c-0.12-0.22-0.37-0.29-0.59-0.22l-2.39,0.96c-0.5-0.38-1.03-0.7-1.62-0.94L14.4,2.81c-0.04-0.24-0.24-0.41-0.48-0.41 h-3.84c-0.24,0-0.43,0.17-0.47,0.41L9.25,5.35C8.66,5.59,8.12,5.92,7.63,6.29L5.24,5.33c-0.22-0.08-0.47,0-0.59,0.22L2.74,8.87 C2.62,9.08,2.66,9.34,2.86,9.48l2.03,1.58C4.84,11.36,4.8,11.69,4.8,12s0.02,0.64,0.07,0.94l-2.03,1.58 c-0.18,0.14-0.23,0.41-0.12,0.61l1.92,3.32c0.12,0.22,0.37,0.29,0.59,0.22l2.39-0.96c0.5,0.38,1.03,0.7,1.62,0.94l0.36,2.54 c0.05,0.24,0.24,0.41,0.48,0.41h3.84c0.24,0,0.44-0.17,0.47-0.41l0.36-2.54c0.59-0.24,1.13-0.56,1.62-0.94l2.39,0.96 c0.22,0.08,0.47,0,0.59-0.22l1.92-3.32c0.12-0.22,0.07-0.47-0.12-0.61L19.14,12.94z M12,15.6c-1.98,0-3.6-1.62-3.6-3.6 s1.62-3.6,3.6-3.6s3.6,1.62,3.6,3.6S13.98,15.6,12,15.6z"/></g></svg><p>설정</p></div></a>
    </nav>
</body>
</html>
