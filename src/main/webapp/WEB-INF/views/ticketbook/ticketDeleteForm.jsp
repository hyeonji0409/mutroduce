<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link href="<c:url value='/css/ticketcontrol.css'/>" rel="stylesheet" type="text/css">
		<title>Delete</title>
		<script src="js/jquery-3.6.0.min.js"></script>
		
	</head>
	
	<body>
		<div id = "wrap">
		<jsp:include page="/WEB-INF/views/layout/top.jsp" flush='true'/>
	
		<form method = "post" action="/ticketbook/updateticket" class="form">
		<table border= "0" class = "table">
			<tr>
		 		<td>번호 : </td> <td><input type="text" id="no" name="no" value="${ticketbook.no}"><br></td>
		 	</tr>
			<tr>
		 		<td>아이디 : </td> <td><input type="text" id="memID" name="memID" value="${sessionScope.sid}" readonly><br></td>
		 	</tr>
		 	<tr>
				<td>공연 제목 : </td><td><input type="text" id="subject" name="subject" value="${ticketbook.subject}" ><br></td>
			</tr>
			<tr>	
				<td>공연 날짜 : </td><td><input type="text" id="date" name="date" value="${ticketbook.date}"><br></td>
			</tr>
			<tr>
				<td>공연 시간 : </td><td><input type="text" id="time" name="time" value="${ticketbook.time}"><br></td>
			</tr>
			<tr>
				<td>장소 : </td><td><input type="text" id="thater" name="theater" value="${ticketbook.theater}"><br></td>
			</tr>
			<tr>
				<td>좌석 : </td><td><input type="text" id="seat" name="seat" value="${ticketbook.seat}"><br></td>
			</tr>	
			<tr>
				<td>캐스팅 : </td><td><input type="text" id="casting" name="casting" value="${ticketbook.casting}"><br></td>
			</tr>
			<tr>	
				<td>가격 : </td><td><input type="text" id="price" name="price" value="${ticketbook.price}"><br></td>
			</tr>	
			<tr>
				<td>후기 : </td><td><textarea id="review" name="review"> ${ticketbook.review}  </textarea></td> 
			</tr>
		</table>
			<div id = "button"><input type="submit" value="삭제"><input type="reset" value="취소"></div>
		</form>
		<!-- 바텀 -->
		<jsp:include page="/WEB-INF/views/layout/bottom.jsp" flush='true'/>
	</div>
		
	</body>
</html>