<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link href="<c:url value='/css/hall2.css'/>" rel="stylesheet" type="text/css">
		<title>Delete</title>
		<script src="js/jquery-3.6.0.min.js"></script>
		
	</head>
	
	<body>
		<form method = "post" action="/hall/deletehall">
			공연장번호<input type="text" id="no" name="no" value = "${hall.no}"><br>
			공연장이름<input type="text" id="name" name="name" value = "${hall.name}" ><br>
			공연장지역<input type="text" id="area" name="area" value = "${hall.area}"><br>
			공연장위치<input type="text" id="location" name="location" value = "${hall.location}" ><br>
			공연장좌석<input type="text" id="seat" name="seat" value = "${hall.seat}"><br>
			공연장지도<input type="text" id="details" name="details" value = "${hall.details}"><br>
			공연장편의시설<input type="text" id="con" name="con" value = "${hall.con}"><br>
			공연장고객센터번호<input type="text" id="cus" name="cus" value = "${hall.cus}"><br>
			
			<div id = "button"><input type="submit" value="삭제"><input type="reset" value="취소"></div>
		</form>
		<!-- 바텀 -->
	</body>
</html>