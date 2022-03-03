<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link href="<c:url value='/css/ticketBook.css'/>" rel="stylesheet" type="text/css">
	<title>My page</title>
</head>
	
	<body>
	<div id = "wrap">
		<!-- 탑 -->
		 <jsp:include page="/WEB-INF/views/layout/top.jsp" flush='true'/>
		
		<!-- 티켓북 -->
		<div class="ticketBookMain">
			<div class="MyPage">
				<div class="MyPageContent">
					<div class="userInfo">
						<div>프로필 사진(생기면 넣을 것)</div>
						<div>user 아이디: ${sid.memId}</div>
						<div><button>회원정보 수정</button></div>
					</div>
					<div class="user_ticket_Info">
						<div>티켓북 N장</div>
						<div>티켓 N장</div>
						<div>찜 N개</div>
					</div>
				</div>
				<div class="ticketBook">
					<c:forEach begin="0" end="2">
						<div class="ticketBookContent" >
							<img src="<c:url value="/images/ticketBook.png" />">
							<h3><a href="<c:url value="/ticketDetailView"/>">티켓북 이름</a></h3>
						</div>
					</c:forEach>
					<%--상세 티켓 들어올 자리
                    <c:forEach begin="0" end="4">
                        <div class="ticket">
                            <img src="<c:url value='/images/ticket.png' /> ">
                        </div>
                    </c:forEach>--%>
				</div>
			</div>
			<div class="RecogMusical" style="text-align: left;">
				<!-- 공연 추천 (지원님 완성하신 부분 들어올 자리)<br> -->
				<div id="reframe" style="width: 100%">
				<a href=""></a><iframe src="<c:url value='/favorRecommand/${sid.memId}'/>" style="position: absolute; width: 30%; height: 70%; border: hidden;"></iframe>
				</div>
			</div>
		</div>
		
		<!-- 바텀 -->
		<jsp:include page="/WEB-INF/views/layout/bottom.jsp" flush='true'/>
		
		</div>
	</body>
</html>
