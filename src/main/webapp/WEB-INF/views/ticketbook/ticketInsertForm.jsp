<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link href="<c:url value='/css/ticketcontrol.css'/>" rel="stylesheet" type="text/css">
		<title>티켓 등록</title>
		
		<!-- include libraries(jQuery, bootstrap) -->   <!--  ********* -->
		<link href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet">
		<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
		
		<!-- include summernote css/js -->
		<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css" rel="stylesheet">
		<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js"></script>
		
	</head>
	
	<body>
		<div id = "wrap">
		<jsp:include page="/WEB-INF/views/layout/top.jsp" flush='true'/>
	
		<form method = "post" action="/ticketbook/insertticket" class="form">
		
		
		<!-- sessionScope._____ 로그인 처리한 팀원에게 세션에 멤버 아이디 저장해주세요. 어떤 이름으로 저장했는지 알려주세요.-->
		<table border= "0" class = "table">
			<tr>
		 		<td>아이디 : </td> <td><input type="text" id="memID" name="memID" value="${sessionScope.sid}" readonly><br></td>
		 	</tr>
		 	<tr>
				<td>공연 제목 : </td><td><input type="text" id="subject" name="subject" ><br></td>
			</tr>
			<tr>	
				<td>공연 날짜 : </td><td><input type="text" id="date" name="date" ><br></td>
			</tr>
			<tr>
				<td>공연 시간 : </td><td><input type="text" id="time" name="time" ><br></td>
			</tr>
			<tr>
				<td>장소 : </td><td><input type="text" id="thater" name="theater" ><br></td>
			</tr>
			<tr>
				<td>좌석 : </td><td><input type="text" id="seat" name="seat" ><br></td>
			</tr>	
			<tr>
				<td>캐스팅 : </td><td><input type="text" id="casting" name="casting" ><br></td>
			</tr>
			<tr>	
				<td>가격 : </td><td><input type="text" id="price" name="price" ><br></td>
			</tr>	
			<tr>
				<td>후기 : </td><td><textarea id="review" name="review">   </textarea></td>
			</tr>
		</table>
			<div id = "button"><input type="submit" value="등록"><input type="reset" value="취소"></div>
		</form>
		
			<!-- 바텀 -->
		<jsp:include page="/WEB-INF/views/layout/bottom.jsp" flush='true'/>
		</div>
		<script>
		    $(document).ready(function() {
		        $('#review').summernote();
		    });
		  </script>
	</body>
</html>