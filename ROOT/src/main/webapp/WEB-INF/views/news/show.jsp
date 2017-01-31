<%--
  Created by IntelliJ IDEA.
  User: linwei
  Date: 2016/12/24
  Time: 13:42
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
    <title>${news.hTitle} - ${currentType.typeName} - 新闻中心 - 海力特家居</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <jsp:include page="../layouts/css.jsp"/>
</head>
<body>
<%--导航条--%>
<jsp:include page="../layouts/header.jsp"/>
<div class="inside-content inside-main" style="min-height: 300px;">
    <div class="container">
        <div class="row">
            <div class="col-md-9 padding-large-top">
                <div class="inside-main">
                    <div class="inside-main-title clearfix">
                        <h4>详细信息</h4>
                        <div class="hidden-xs">
                            <a href="<%=request.getContextPath()%>/" title="" class="fa fa-home"> 首页</a>
                            <span class="fa fa-angle-double-right"></span> <a
                                href="<%=request.getContextPath()%>/news/">新闻动态</a>
                            <span class="fa fa-angle-double-right"></span> <a
                                href="<%=request.getContextPath()%>/news/${currentType.id}">${currentType.typeName}</a>
                        </div>
                    </div>
                    <div class="article-view-content">
                        <div class="article-view-title">
                            <h1>${news.hTitle}</h1>
                        </div>
                        <div class="article-view-info clearfix">
                            <div class="article-left-div"><span>撰文</span>
                                <strong>
                                    <c:if test="${news.hAuthor==null}">海力特家居</c:if>${news.hAuthor}
                                </strong>
                                <fmt:formatDate value="${news.hTime}" pattern=  "yyyy-MM-dd HH:mm:ss"/></div>
                        </div>
                        <p>&nbsp;</p>
                        <div class="article-view-desc">
                            ${news.hContent}
                        </div>
                        <p>&nbsp;</p>
                        <div class="article-view-copyright">
                            版权声明：本文系海力特家居原创内容，如需转载请注明出处，并保留完整链接，谢谢！${news.hTime}
                        </div>
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