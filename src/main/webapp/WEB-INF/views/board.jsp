<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>과제</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link href="<c:url value='/css/board.css'/>" rel="stylesheet"
	type="text/css">
<script src="<c:url value='/js/jquery-3.6.0.min.js'/>"></script>
<script src="<c:url value='/js/board.js'/>"></script>
<script src="<c:url value='/js/boardmenu.js'/>"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/1.10.22/css/jquery.dataTables.css">
<script type="text/javascript" charset="utf8"
	src="https://cdn.datatables.net/1.10.22/js/jquery.dataTables.js"></script>
<style>
.fakeimg {
	height: 200px;
	background: #aaa;
}
</style>

<script type="text/javascript">
	$(document).ready(
			function() {
				$("#writeBtn").click(function() {
					location.href = "write";
				})
				$.ajax({
					url : "boardList",
					success : function(result) {
						var html = "";
						result.forEach(function(item) {
							html += "<tr> <td><a href = 'view?idx=" + item.idx
									+ "'>" + item.title + "</a>"
						})
						$("#listArea").append(html)
						$('#example').DataTable();
					}
				});
				$("#deleteBtn").click(function() {
					location.href = "write";
				})
			});
</script>
</head>
<body>

	<div class="jumbotron text-center" style="margin-bottom: 0">
		<h1>top 올 자리</h1>
	</div>


	<nav>
		<span style="font-size: 30px; cursor: pointer" onclick="openNav()">&#9776;
			메뉴</span>
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
					<li class="menu link"><a href="/hall">공연장</a></li>
					<li class="menu link"><a href="#">장르별 추천</a>
					<ul class="hide">
							<li class="subMenu"><a href="<c:url value='/'/>">배우 별</a></li>
							<li class="subMenu"><a href="<c:url value='/'/>">장르 별</a></li>
							<li class="subMenu"><a href="<c:url value='/'/>">넘버 별</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
	</nav>


	<div class="container" style="margin-top: 30px">
		<div class="row">
			<div class="col-sm-12">
				<h2>공연 요청</h2>
				<hr>
				<br>
				<table id="example" class="display" style="width: 100%">
					<thead>
						<tr>
							<th>제목</th>
						</tr>
					</thead>
					<tbody id="listArea">
					</tbody>
				</table>
				<button type="button" class="btn btn-primary" id="writeBtn">글쓰기</button>
			</div>
		</div>
	</div>
</body>
</html>