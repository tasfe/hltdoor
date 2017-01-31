<%--
  Created by IntelliJ IDEA.
  User: linwei
  Date: 2016/12/24
  Time: 13:42
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
    <title><c:if test="${currentStyle!=null}">${currentStyle.style}</c:if>
        <c:if test="${currentStyle==null}">${currentType.tpyeName}</c:if> - 产品中心 - 海力特家居</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <jsp:include page="../layouts/css.jsp"/>
</head>
<body>
<%--导航条--%>
<jsp:include page="../layouts/header.jsp"/>
<div class="inside-content">
    <div class="inside-header-submenu">
        <div class="inside-header-submenu-header">
            <p>产品中心</p>
            <span>products</span>
        </div>
        <div class="submenu-responsive">
            <ul>
                <c:forEach items="${types}" var="type">
                    <li <c:if test="${type.id==currentType.id}"> class="active" </c:if> ><a
                            href="<%=request.getContextPath()%>/products/${type.id}/" title="">${type.tpyeName}</a></li>
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
                        <h4>
                            <c:if test="${currentStyle!=null}">${currentStyle.style}</c:if>
                            <c:if test="${currentStyle==null}">${currentType.tpyeName}</c:if>
                        </h4>
                        <div class="hidden-xs">
                            <a href="<%=request.getContextPath()%>/" title="" class="fa fa-home"> 首页</a>
                            <span class="fa fa-angle-double-right"></span> <a href="<%=request.getContextPath()%>/products/">产品中心</a>
                            <span class="fa fa-angle-double-right"></span> ${currentType.tpyeName}
                        </div>
                    </div>
                    <div class="cases-category">
                        <c:if test="${currentType.id!=0}">
                        <a href="<%=request.getContextPath()%>/products/${currentType.id}/" title="">
                            <span <c:if test="${currentStyle==null}"> class="active" </c:if>> 所有类型</span>
                        </a>
                        </c:if>
                        <c:forEach items="${styles}" var="style">
                            <c:if test="${style.typeId==currentType.id}">
                                <a href="<%=request.getContextPath()%>/products/${currentType.id}/${style.id}" title="${style.style}">
                                    <span <c:if test="${currentStyle.id==style.id}"> class="active" </c:if>> ${style.style}</span>
                                </a>
                            </c:if>
                        </c:forEach>
                    </div>
                    <div class="clearfix grid">
                        <c:forEach items="${pageInfo.list}" var="products">
                            <div class="col-md-4 col-xs-6 grid-item">
                                <a href="<%=request.getContextPath()%>/products/info/${products.id}.html"
                                   title="${products.hTitle}">
                                    <div class="inside-case">
                                        <div class="inside-case-cover">
                                            <img src="${products.hCoverImg}"
                                                 class="img-responsive">
                                        </div>
                                        <p>
                                                ${products.hTitle}
                                        </p>
                                    </div>
                                </a>
                            </div>
                        </c:forEach>
                    </div>
                    <div class="row">
                        <div class="col-md-12 text-center">
                            <jsp:include page="../layouts/paginate.jsp"/>
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
<script src="<%=request.getContextPath()%>/assets/js/masonry.js"></script>
<script src="https://npmcdn.com/imagesloaded@4.1/imagesloaded.pkgd.min.js"></script>
<script>
    $('#container').imagesLoaded( {
                // options...
            },
            function() {
                $('.grid').masonry({
                    // options
                    itemSelector: '.grid-item'
                });
                console.log('image loaded')
            }
    );


</script>
</body>
</html>