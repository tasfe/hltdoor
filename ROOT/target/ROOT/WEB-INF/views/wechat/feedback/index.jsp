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
    <title>${product.hTitle}${gallery.hTitle} - 海力特家居</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <jsp:include page="../../layouts/css.jsp"/>
</head>
<body>
<%--导航条--%>
<jsp:include page="../../layouts/header.jsp"/>
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
                                href="<%=request.getContextPath()%>/product/">产品中心</a>
                            <span class="fa fa-angle-double-right"></span> <a
                                href="<%=request.getContextPath()%>/product/${currentType.id}">${currentType.tpyeName}</a>
                            <span class="fa fa-angle-double-right"></span> <a
                                href="<%=request.getContextPath()%>/product/${currentType.id}/${currentStyle.id}">${currentStyle.style}</a>
                        </div>
                    </div>
                    <div class="clearfix">
                        <c:if test="${product!=null}">
                            <div class="case-view clearfix">
                                <div class="case-view-cover">
                                    <img src="${product.hCoverImg}"
                                         alt="${product.hTitle}">
                                </div>
                                <div class="case-view-info">
                                    <h4>${product.hTitle}</h4>
                                </div>
                            </div>
                        </c:if>
                        <c:if test="${gallery!=null}">
                            <div class="case-view clearfix">
                                <div class="case-view-cover">
                                    <img src="${gallery.hCoverImg}"
                                         alt="${gallery.hTitle}">
                                </div>
                                <div class="case-view-info">
                                    <h4>${gallery.hTitle}</h4>
                                </div>
                            </div>
                        </c:if>
                        <div class="case-view-details" style="margin-right: 10px;">
                            <div class="row">
                                <div class="col-md-12">
                                    <form action="" method="post">
                                        <div class="form-group">
                                            <label>评论</label>
                                            <textarea name="h_content" id="content" cols="30" rows="6" class="form-control"></textarea>
                                        </div>
                                        <div class="form-group">
                                            <label>匿名</label>
                                            <input type="checkbox" name="check">
                                            &nbsp;${user.nickname}
                                        </div>
                                        <button class="btn btn-block btn-success" type="submit">提交</button>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="../../layouts/footer.jsp"/>
</body>
</html>