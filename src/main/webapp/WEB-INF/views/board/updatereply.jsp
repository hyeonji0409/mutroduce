<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head> 
<title>과제</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="<c:url value='/css/board.css'/>" rel="stylesheet" type="text/css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script src="<c:url value='/js/board.js'/>"></script>
<script src="<c:url value='/js/boardform.js'/>"></script>
<script src="<c:url value='/js/jquery-3.6.0.min.js'/>"></script>
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.22/css/jquery.dataTables.css">
<script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.22/js/jquery.dataTables.js"></script>
  <style>
  .fakeimg {
    height: 200px;
    background: #aaa;
  }
  
  </style>
</head>
<jsp:include page="/WEB-INF/views/layout/top.jsp" flush='true' />
<nav id="boardmenu">
		<span style="font-size: 30px; cursor: pointer" onclick="openNav()">&#9776;
			</span>
		<div class="menu-btn">
			<div class="line line--1"></div>
			<div class="line line--2"></div>
			<div class="line line--3"></div>
		</div>
		<div class="nav-links">
			<div id="mySidenav" class="sidenav">
				<a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
				<ul id="menuGroup">
					<li class="menu link"><a href="/board">공연 요청</a></li>
					<li class="menu link"><a href="#">장르별 추천</a>
						<ul class="hide">
							<li class="subMenu"><a href="<c:url value='/board3'/>">배우 별</a></li>
							<li class="subMenu"><a href="<c:url value='/board4'/>">뮤지컬 별</a></li>
						</ul></li>
					<li class="menu link"><a href="/boardinformation">정보 게시판</a></li>
				</ul>
			</div>
		</div>
	</nav>
<body>

<div class="writecontainer">
	<div class="row">
		<div class="board">
	      <h2>수정</h2>
	      <hr><hr><br>
	        <form id="boardform" name="boardform" class="boardform" action="<c:url value='/board/updateBoard'/>" method = "POST" enctype="multipart/form-data" onSubmit="return Checkform()">
				<div class="form-group">
				  <label for="usr">제목:</label>
				  <input type="text" class="writeinput form-control" id="title" name ="title" value="${board.title}">
				</div>
				<br>
			    <div class="form-group">
				  <label for="comment">내용:</label>
				  <input class="writeinputbody form-control"  id="contents" name = "contents" value="${board.contents}">
				</div>
				<input type="hidden" name="idx" id="idx" value="${board.idx}" />
			    <br>
			    <div class="form-group" style="margin-left: -216px;">
			      <input type="file" class="form-control-file border" name="file">
			    </div>
			    
			    <button type="submit" class="writeBtn">수정</button>
			  </form>
		</div>
	</div>
</div>
</body>
</html>