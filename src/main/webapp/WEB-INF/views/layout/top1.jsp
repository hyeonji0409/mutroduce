<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>MUTRODUCE</title>
    <meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no">
    <link href="<c:url value='/fullcalendar-5.10.1/lib/main.css' />" rel="stylesheet" />
    <link href="<c:url value='/css/menu.css'/>" rel="stylesheet" type="text/css">
    <link href="<c:url value='/css/common.css'/>" rel="stylesheet" type="text/css">
    <link href="<c:url value='/css/index.css'/>" rel="stylesheet" type="text/css">
	
	<script src="<c:url value='/js/menu.js' />"></script>


</head>
<body>

<!-- 전체 컨텐츠 -->
<div id="wrap">
    <!-- login/join -->
    <div id="headerMenuBox">
        <div class="headerMenu">
            <ul>

                <%--로그인 처리 전에 보여줄 부분--%>
                <c:if test="${empty sessionScope.sid}">
                    <li><a href="<c:url value='/signupForm' />">회원가입</a> </li>
                    <li><a href="<c:url value='/loginForm' />">로그인</a> </li>
                    <li><a href="<c:url value='/ticketbook' />">티켓북테스트</a> </li>
                </c:if>
                <%--로그인 처리 후에 보여줄 부분--%>
                <c:if test="${not empty sessionScope.sid}">
                    <li>${sid.memId} 님&nbsp;</li>
                    <li><a href="<c:url value='/logout' />">로그아웃</a> </li>
                    <li><a href="<c:url value='/ticketbook/${sid.memId}'/>">마이페이지</a> </li>
                </c:if>
            </ul>
        </div>
    </div>

    <!-- header -->
    <div id="logoBox">

        <a href="/"><img src="<c:url value='/images/logo.jpeg' />" id="logoImage"></a>

    </div>
    <div id="topMenuBox">
        <div class="topMenu">
            <ul id="topMenuItem">
                <li class="menu1">
                    <a href="/">ΞΞ 전체 카테고리</a>
                    <ul class="sub">

                        <li><a href="<c:url value='/detailView/1' />">뮤지컬</a></li>
                        <li><a href="<c:url value='/vote' />">투표 / 랭킹</a></li>
                        <li><a href="<c:url value='/board' />">커뮤니티</a></li>
                        <li><a href="<c:url value='/hall' />">공연장</a></li>
                        <li><a href="/">문의사항</a></li>
                    </ul>
                </li>
                <li>
                    <a href="/detailView/1">뮤지컬</a>
                    <ul class="sub">
                        <li><a href="/detailView/1">오리지널/내한공연</a></li>
                        <li><a href="/detailView/2">라이센스</a></li>
                        <li><a href="/detailView/3">창작뮤지컬</a></li>
                        <li><a href="/detailView/4">아동/가족</a></li>
                    </ul>
                </li>

                <li><a href="/vote">투표 / 랭킹</a></li>
                <li><a href="/board3">커뮤니티</a>
                    <ul class="sub">
                    	<li><a href="/board">공연 요청</a> </li>
                        <li><a href="/board3">배우별 게시판</a> </li>
                        <li><a href="/board4">뮤지컬별 게시판</a> </li>
                        <li><a href="/boardinformation">정보게시판</a> </li>
                    </ul>
                </li>
                <li><a href="<c:url value='/hall' />">공연장</a></li>
                <li><a href="/adminPage">문의사항</a></li>
            </ul>
        </div>
    </div>



</body>
</html>
