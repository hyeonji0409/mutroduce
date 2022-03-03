<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>MUTRODUCE :: About </title>
    <script src="<c:url value='/js/jquery-3.6.0.min.js'/>"></script>
    <link href="<c:url value="/css/about.css" />" rel="stylesheet" type="text/css">
</head>
<body>
<!-- TOP -->
<jsp:include page="/WEB-INF/views/layout/top.jsp" flush='true'/>

<div>
    <div class="bannerTitle" style="margin-top: 60px; margin-bottom: 100px;">
        <div class="bannerTitle_1">
            <span>Our</span>
        </div>
        <div class="bannerTitle_2">
            <span>Story</span>
        </div>
    </div>

    <div class="background"></div>

    <div class="aboutImage">
        <img src="<c:url value="/images/about1.jpeg" />"/>
    </div>

    <div class="aboutInfo">
        <p>
            I'm a paragraph. Click here to add your own text and edit me. It’s easy. Just click “Edit Text” or double
            click me to add your own content and make changes to the font. Feel free to drag and drop me anywhere you
            like on your page.
        </p>
        <p>
            This is a great space to write long text about your company and your services. You can use this space to go
            into a little more detail about your company. Talk about your team and what services you provide. Tell your
            visitors the story of how you came up with the idea for your business and what makes you different from your
            competitors.
        </p>
    </div>
</div>

<!-- BOTTOM -->
<jsp:include page="/WEB-INF/views/layout/bottom.jsp" flush='true'/>
</body>
</html>