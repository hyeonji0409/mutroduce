<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>관리자 전용 - 배우 정보 삽입 페이지</title>
		<link href="<c:url value='/css/signUp.css'/>" rel="stylesheet">
	</head>
	<body>
	<div id = "wrap">
		<!-- TOP -->
		<jsp:include page="/WEB-INF/views/layout/top.jsp" flush='true'/>
		
		<!-- 삽입란 -->
		<div id="main" class="insertFrame">
			<div id="content">
				<form id="form" name="muscInsertForm" method="post" onsubmit="#" action="#">
				<h3 style="margin: 30px;text-align: center;">[뮤지컬] 등록할 정보 목록</h3><hr><br>
				<!-- <b>뮤지컬번호, 뮤지컬 이름,해시태그, 뮤지컬 장소이름,장소링크, 뮤지컬 시작일, 종료일, 명대사, 상영시간, 시놉시스, 장르번호, 포스터 파일주소, 공지사항 사진1.2.3, 유튜브 링크</b> -->
				<table class="insertmuscTable" style="margin: 0 auto;">
					<tr>
						<th>배우 번호</th>
						<td>
							<input type="text" name="" id="" maxlength="5" placeholder="지정할 배우번호를 입력하세요.">
							<button type="button" class="muscNoCheck" onclick="overlapCheck()">중복확인</button>
						</td>
					</tr>
					<tr>
						<th>배우 이름</th>
						<td>
							<input type="text" name="" id="" maxlength="100" placeholder="등록한 뮤지컬 이름을 모두 입력하세요.">
						</td>
					</tr>
					<tr>
						<th>배우 프로필 링크</th>
						<td>
							<input type="text" name="" id="" maxlength="30" placeholder="ex:https://search.naver.com">
						</td>
					</tr>
					
				</table>
				
				<br><br>
				<div class="submitBox">
				<input type="submit" id="submitBox" value="INSERT" />
				</div>
				</form>
			</div>
		</div>
		
		
		<!-- BOTTOM -->
		<jsp:include page="/WEB-INF/views/layout/bottom.jsp" flush='true'/>
	
	</div>
	</body>
</html>