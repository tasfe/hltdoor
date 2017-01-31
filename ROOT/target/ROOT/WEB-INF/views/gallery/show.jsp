<%--
  Created by IntelliJ IDEA.
  User: linwei
  Date: 2016/12/23
  Time: 14:09
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
    <title>${gallery.hTitle} - 案例欣赏 - 海力特家居</title>
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
                                href="<%=request.getContextPath()%>/gallery/">案例欣赏</a>
                        </div>
                    </div>
                    <div class="case-view clearfix">
                        <div class="case-view-cover">
                            <img src="${gallery.hCoverImg}"
                                 alt="${gallery.hTitle}">
                            <c:if test="${gallery.hVr!=null&&gallery.hVr!=''}">
                            <a href="${gallery.hVr}" class="btn btn-success" target="_blank">360VR 全景显示</a>
                            </c:if>
                        </div>
                        <div class="case-view-info">
                            <h4>${gallery.hTitle}</h4>
                            <p><strong>楼盘：</strong>${gallery.hBuilding}</p>
                            <p><strong>户型：</strong>${gallery.hHouseType}</p>
                            <p><strong>面积：</strong>${gallery.hHouseSize}㎡</p>
                            <p><strong>风格：</strong>${gallery.hHouseStyle}</p>
                        </div>
                    </div>
                    <div class="case-view-details">
                        ${gallery.hContent}
                        <div class="article-view-copyright">
                            版权声明：本案例系海力特家居原创内容，如需转载请注明出处，并保留完整链接，谢谢！
                        </div>
                    </div>
                    <div class="case-view-details">
                        <div class="feedback row">
                            <div class="col-md-3 col-lg-offset-2">
                                <img src="<%=request.getContextPath()%>/feedback/gallery/${gallery.id}" width="160"
                                     alt="微信扫描二维码参与评论">
                            </div>
                            <div class="col-md-7">
                                <p style="line-height: 154px;">打开微信客户端扫描左侧二维码,可以快速参与评论哟～</p>
                            </div>
                        </div>
                        <div class="feedback row">
                            <div class="col-md-12">
                                <h4><i class="fa fa-angle-double-right"></i>&nbsp;热门评论</h4>
                            </div>
                        </div>
                        <c:forEach items="${pageInfo.list}" var="feedback">
                            <div class="feedback row">
                                <div class="photo col-md-3 text-center">
                                    <c:if test="${feedback.hLogo!=null}">
                                        <img src="${feedback.hLogo}" width="80" alt="头像">
                                    </c:if>
                                    <c:if test="${feedback.hLogo==null}">
                                        <span><i class="fa fa-user text-success"></i></span>
                                    </c:if>
                                </div>
                                <div class="testimonial col-md-9">
                                    <p><c:out value="${feedback.hContent}" escapeXml="true"/></p>
                                    <cite>${feedback.hAuthor} <span
                                            class="text-muted">-  From ${feedback.hBy}&nbsp;${feedback.hFrom}</span></cite>
                                </div>
                            </div>
                        </c:forEach>
                        <div class="feedback row">
                            <div class="col-md-12 text-center">
                                <jsp:include page="../layouts/paginate.jsp"/>
                            </div>
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