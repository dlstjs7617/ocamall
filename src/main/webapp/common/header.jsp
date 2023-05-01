<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<header>
    <div class="top_menu">
      <div class="top_menu_inner clearfix">
        <ul>
          <li>
            <a href="${pageContext.request.contextPath}/notice/qna.jsp">고객센터</a>
          </li>
          <li>
            <a href="${pageContext.request.contextPath}/baskert/baskert.jsp">장바구니</a>
          </li>
          <li>
            <a href="${pageContext.request.contextPath}/login/login.jsp">로그인</a>
          </li>
        </ul>
      </div>
    </div>
    <div class="middle_menu">
      <div class="middle_menu_inner">
        <h1>
          <a href="${pageContext.request.contextPath}/index/index.jsp">CAMPMALL</a>
        </h1>
        <ul>
          <li>
            <a href="${pageContext.request.contextPath}/notice/notice.jsp"><strong>NOTICE</strong></a>
          </li>
          <li>
            <a href="${pageContext.request.contextPath}/event/event.jsp">EVENT</a>
          </li>
          <li>
            <a href="${pageContext.request.contextPath}/notice/review.jsp">REVIEW</a>
          </li>
          <li>
            <a href="${pageContext.request.contextPath}/index/search.jsp">SEARCH</a>
          </li>
        </ul>
      </div>
    </div>
    <div class="bottom_menu">
      <div class="bottom_menu_inner">
        <ul class="clearfix">
          <li>
            <a href="${pageContext.request.contextPath}/product/best.jsp">
              <strong>베스트</strong>
            </a>
          </li>
          <li>
            <a href="${pageContext.request.contextPath}/product/new.jsp">신상품</a>
          </li>
          <li>
            <a href="${pageContext.request.contextPath}/product/special.jsp">특가상품</a>
          </li>
          <li>
            <a href="${pageContext.request.contextPath}/product/pick.jsp">추천상품</a>
          </li>
        </ul>
      </div>
    </div>
    <div class="notice">
      <div class="notice_inner">
        <a href="${pageContext.request.contextPath}/notice/notice.jsp">공지사항입니다.</a>
      </div>
    </div>
  </header>
</body>
</html>