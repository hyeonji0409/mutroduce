<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link href="<c:url value='/css/hall2.css'/>" rel="stylesheet" type="text/css">
		<title>공연장 안내</title>
	</head>
	
	<body>
	<div id = "wrap">
		<!-- 탑 -->
		 <jsp:include page="/WEB-INF/views/layout/top.jsp" flush='true'/>
		<!-- 공연장안내 -->
		<section>
		<div class = "all">
			<div class="hall2"></div>
			<div class="A1">공연장안내 > <strong>${hall.name }</strong></div> 
			  <div><h2>${hall.name } 소개</h2></div>
					<div class = "A2">
					
				${hall.details}
				 </div>
				 <div class = "list">
					<table border = 1>
							  <tr>
								  <th>위치</th>
								  <td colspan = "2">${hall.location }</td>
							  </tr>
							   <tr>
							     <th>좌석</th>
							     <td>${hall.seat }</td>
							   </tr>
							  <tr>
							     <th>편의시설</th>
							     <td>${hall.con }</td>
							  </tr>
							  <tr>
							     <th id = "고객센터번호">고객센터번호</th>
							     <td colspan = "2">${hall.cus }</td>
							  </tr>
							 
							</table>
					</div>
 			</div>
		</section>
		<!-- 바텀 -->
		<jsp:include page="/WEB-INF/views/layout/bottom.jsp" flush='true'/>
		
		</div>
	</body>
</html>