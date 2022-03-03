<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>관리자 전용 - 정보 등록, 삭제 페이지</title>
		<link href="<c:url value='/css/signUp.css'/>" rel="stylesheet">
	</head>
	<body>
	<div id = "wrap">
		<!-- TOP -->
		<jsp:include page="/WEB-INF/views/layout/top.jsp" flush='true'/>
		
		<!-- [뮤지컬][배우]등록,삭제 페이지로 이동 -->
		<div id="main" class="">
			<div id="content">
				
				<form id="form" name="muscInsertForm" method="post" onsubmit="#" action="#">
				<h3 style="margin: 30px;text-align: center;">[뮤지컬][배우]등록,삭제 페이지로 이동</h3><hr><br>
				<table class="insertmuscTable" style="margin: 0 auto;">
					<tr>
						<th><td><button type="button" class="muscNoCheck" onclick="location.href ='/insertMusc'">[뮤지컬] 등록</button></td></th>
					</tr>
					<tr>
						<th><td><button type="button" class="muscNoCheck" onclick="location.href ='#'">[뮤지컬] 삭제</button></td></th>
					</tr>
					<tr>
						<th><td><button type="button" class="muscNoCheck" onclick="location.href ='#'">[배우] 등록</button></td></th>
					</tr>
					<tr>
						<th><td><button type="button" class="muscNoCheck" onclick="location.href ='#'">[배우] 삭제</button></td></th>
					</tr>
				</table>
				</form>
			</div>
		</div><br><br>
		
		<!-- BOTTOM -->
		<jsp:include page="/WEB-INF/views/layout/bottom.jsp" flush='true'/>
	
	</div>
	</body>
</html>