<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html xmlns='http://www.w3.org/1999/xhtml'>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	<link href="<c:url value='/css/rank.css'/>" rel="stylesheet"
	type="text/css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.6.4/jquery.min.js" type="text/javascript"></script>
	<script src="<c:url value='/js/rank.js'/>"></script>
	</head>
	<body>
	<jsp:include page="/WEB-INF/views/layout/top.jsp" flush='true' />
<h1 style="margin:30px;">뮤지컬 랭킹</h1>
<div id="content">
	<c:forEach items="${rankList}" var="rank">
            <dl id="rank-list">
                <dd>
                    <ol>
                        <li><a href="#">1. ${rank.muscName}</a></li>
                        <li><a href="#">2. ${rank.muscName}</a></li>
                        <li><a href="#">3. ${rank.muscName}</a></li>
                        <li><a href="#">4. ${rank.muscName}</a></li>

                    </ol>
                </dd>
            </dl>
        </div>
      <div>
	<table class="ranktable"  style="margin-bottom:130px;">
	<thead>
	<tr>
	<th>랭킹</th>
	<th colspan=2>공연명</th>
	<th>공연 일시</th>
	<th>공연장소</th>
	</tr>
	</thead>

			<tr>
				<td>1위</td>
				<td style="text-align:right;"><img src="/images/${rank.muscNo}.jpg"></td>
				<td style="text-align:left;">${rank.muscName}</td>
				<td>${rank.muscStartDate} ~ ${rank.muscEndDate}</td>
				<td><a href="${rank.muscPlaceLink}">${rank.muscPlace}</a></td>
			</tr>
		
	</table>
      </div>
      </c:forEach>
     <jsp:include page="/WEB-INF/views/layout/bottom.jsp" flush='true' /> 
      
	</body>
</html>