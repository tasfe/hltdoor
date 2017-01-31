<%--
  Created by IntelliJ IDEA.
  User: linwei
  Date: 2016/12/24
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <title>案例欣赏 - 海力特家居</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <jsp:include page="../layouts/css.jsp"/>
</head>
<body>
<%--导航条--%>
<jsp:include page="../layouts/header.jsp"/>
<div class="inside-content">
    <div class="inside-header-submenu">
        <div class="inside-header-submenu-header">
            <p>新闻动态</p>
            <span>news</span>
        </div>
        <div class="submenu-responsive">
            <ul>
                <c:forEach items="${newsTypes}" var="newsType">
                    <li <c:if test="${newsType.id==currentType.id}"> class="active"</c:if> ><a
                            href="<%=request.getContextPath()%>/news/${newsType.id}/"
                            title="${newsType.typeName}">${newsType.typeName}</a></li>
                </c:forEach>
            </ul>
        </div>
    </div>
</div>
<div class="inside-content" style="min-height: 300px;">
    <div class="container">
        <div class="row">
            <div class="col-md-9 padding-large-top">
                <div class="inside-main clearfix">
                    <div class=" inside-main-title clearfix">
                        <c:if test="${currentType!=null}">
                            <h4>${currentType.typeName}</h4>
                        </c:if>
                        <c:if test="${currentType==null}">
                            <h4>新闻动态</h4>
                        </c:if>
                        <div class="hidden-xs">
                            <a href="<%=request.getContextPath()%>/" title="" class="fa fa-home"> 首页</a>
                            <span class="fa fa-angle-double-right"></span> <a
                                href="<%=request.getContextPath()%>/news/">新闻动态</a>
                            <c:if test="${currentType!=null}">
                                <span class="fa fa-angle-double-right"></span> <a
                                    href="<%=request.getContextPath()%>/news/${currentType.id}">${currentType.typeName}</a>
                            </c:if>
                        </div>
                    </div>
                    <div class="article-desc-list">
                        <ul>
                            <c:forEach items="${pageInfo.list}" var="news">
                                <li class="clearfix"><a href="<%=request.getContextPath()%>/news/info/${news.id}.html"
                                                        title="${news.hTitle}">
                                        <div class="article-desc-list-cover">
                                        <img class="img-responsive"
                                        src="${news.hImg}"
                                        alt="${news.hTitle}">
                                        </div>
                                    <div class="article-desc-list-content">
                                        <div class="article-desc-list-title"><strong>${news.hTitle}</strong></div>
                                        <div class="article-desc-list-info">
                                        </div>
                                        <div class="article-desc-list-desc">
                                                ${news.hAbstract}
                                        </div>
                                        <div class="article-desc-list-ft">
                                            详情 <span class="fa fa-angle-double-right"></span>
                                        </div>
                                    </div>
                                </a></li>
                            </c:forEach>
                            <li class="clearfix">
                                <jsp:include page="../layouts/paginate.jsp"/>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="col-md-3">
                <jsp:include page="../layouts/sidebar.jsp"/>
            </div>
        </div>
    </div>
</div>
<jsp:include page="../layouts/footer.jsp"/>
<jsp:include page="../layouts/modal.jsp"/>
</body>
</html>