<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>뮤지컬 목록 페이지</title>
		
		<script src="<c:url value='/js/jquery-3.6.0.min.js'/>"></script>
		
		<style type="text/css">
		
		</style>
	</head>
	<body>
		<!-- Top -->
		<jsp:include page="/WEB-INF/views/layout/top.jsp" flush='true'/>
		
		<!-- 뮤지컬 목록 페이지 -->
		<section>
		<div class="content_wrap">
			<div class="content_list_title" style="text-align:left;">
			<br>				
				<h2 style="margin-left: 50px">${musicalData[0].genreName}</h2><br><hr>
			</div>
			<div class="content_list_main">
				<ul style="text-align:center">
					<c:forEach var="musc" items="${musicalData}">
						<li style="width:280px;overflow:hidden; text-overflow:ellipsis; white-space:nowrap;display: inline-block;margin-top: 50px;margin-bottom: 50px;margin-right: 25px;margin-left: 25px;">
						<a href="/testDetail/${musc.muscNo}"><img src="<c:url value='${musc.muscImg}'/>" alt="뮤지컬 포스터" style="width: 280px;"></a><br>
						<a href="/testDetail/${musc.muscNo}"><b>${musc.muscName}</b></a><br>
						<p>${musc.muscStartDate} ~ ${musc.muscEndDate}</p>
					</li>
					</c:forEach>
				</ul>
				<br><br>
			</div>
		</div>
		
		
		</section>
		
		
		<!-- Bottom -->
		<jsp:include page="/WEB-INF/views/layout/bottom.jsp" flush='true'/>
		
	</body>
</html>