<%--
  Created by IntelliJ IDEA.
  User: linwei
  Date: 2016/12/22
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            <p>案例欣赏</p>
            <span>gallery</span>
        </div>
        <%--<div class="submenu-responsive">--%>
        <%--<ul>--%>
        <%--<li class="active"><a href="<%=request.getContextPath()%>/gallery/hugehouse" title="">精装大户型</a></li>--%>
        <%--<li><a href="<%=request.getContextPath()%>/gallery/smallhouse" title="">精装小户型</a></li>--%>
        <%--<li><a href="<%=request.getContextPath()%>/gallery/syzx" title="">商业装修设计</a></li>--%>
        <%--<li><a href="<%=request.getContextPath()%>/gallery/villa" title="">别墅装修设计</a></li>--%>
        <%--</ul>--%>
        <%--</div>--%>
    </div>
</div>
<div class="inside-content" style="min-height: 300px;">
    <div class="container">
        <div class="row">
            <div class="col-md-9 padding-large-top">
                <div class="inside-main clearfix">
                    <div class=" inside-main-title clearfix">
                        <h4>案例欣赏</h4>
                        <div class="hidden-xs">
                            <a href="<%=request.getContextPath()%>/" title="" class="fa fa-home"> 首页</a>
                            <span class="fa fa-angle-double-right"></span> 案例欣赏
                        </div>
                    </div>
                    <div class="cases-category clearfix">
                        <a href="<%=request.getContextPath()%>/gallery/" title="">
                            <span <c:if test="${currentType==null}"> class="active" </c:if> > 所有风格</span>
                        </a>
                        <c:forEach items="${typeList}" var="type">
                            <a href="<%=request.getContextPath()%>/gallery/${type.id}" title="${type.typeName}">
                                <span<c:if test="${currentType.id==type.id}"> class="active" </c:if>>${type.typeName}</span>
                            </a>
                        </c:forEach>
                        <a href="<%=request.getContextPath()%>/gallery/0" title="其他">
                            <span>其他</span>
                        </a>
                    </div>
                    <div class="clearfix" style="margin: 0 15px;">
                        <div class="row">
                            <c:forEach items="${pageInfo.list}" var="gallery">
                                <div class="col-md-4 col-xs-6">
                                    <a href="<%=request.getContextPath()%>/gallery/info/${gallery.id}.html"
                                       title="${gallery.hTitle}">
                                        <div class="inside-case">
                                            <div class="inside-case-cover" style="height: 0;padding-bottom: 61.8%;">
                                                <img src="${gallery.hCoverImg}"
                                                     class="img-responsive">
                                            </div>
                                            <p>
                                                <c:if test="${gallery.hVr!=null&&gallery.hVr!=''}">
                                                    <button class="btn btn-xs btn-success">3D</button>
                                                </c:if>
                                                    ${gallery.hTitle}&nbsp;
                                                    ${gallery.hHouseStyle}
                                            </p>
                                        </div>
                                    </a>
                                </div>
                            </c:forEach>
                        </div>
                        <div class="row">
                            <div class="col-md-12 col-xs-12 text-center">
                                <jsp:include page="../layouts/paginate.jsp"/>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-3">
                <jsp:include page="../layouts/sidebar.jsp" />
            </div>
        </div>
    </div>
</div>
<jsp:include page="../layouts/footer.jsp"/>
<jsp:include page="../layouts/modal.jsp"/>
</body>
</html>