<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <title>海力特地板_整体家装_实木地板_原实木门_原木全房_楼梯扶手</title>
    <meta name="generator" content="hltdoor"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <jsp:include page="layouts/css.jsp"/>
</head>

<body>
<%--导航条--%>
<jsp:include page="layouts/header.jsp"/>

<%--大图--%>
<div id="home" class="home"
     style="background-image: url('<%=request.getContextPath()%>/assets/images/hero_2.jpg');height: 565px;">

</div>


<div id="about" class="pad-section" style="margin: 50px 0;">
    <div class="container">
        <div class="row">
            <div class="col-md-4">
                <div class="row">
                    <div class="col-md-2 text-center">
                        <i class="fa fa-home" style="font-size: 50px;color: #81c141;margin-top: 80px;"></i>
                    </div>
                    <div class="col-md-8 col-md-offset-1">
                        <h3>整体家装</h3>
                        <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;以家为单位，以风格、色彩、产品材质、家居布局为主线，以室内整体设计方案贯穿，包含整体厨房、整体卫浴、室内门、地板主材等产品，加以装修基础施工（含装修辅材）在内的系统性个性化定制的整体家居解决方案.</p>
                    </div>
                </div>
            </div>

            <div class="col-md-4">
                <div class="row">
                    <div class="col-md-2 text-center">
                        <i class="fa fa-tree" style="font-size: 50px;color: #81c141;margin-top: 80px;"></i>
                    </div>
                    <div class="col-md-8 col-md-offset-1">
                        <h3>原木家具</h3>
                        <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;原木家具即全实木家具，指采用自然的树木做原料，制作和设计构造讲究古朴，结实耐用。保持原始木料固有的纹理或体现木料被纵横剖切后所显露出的真实纹路，体现木质的原始风貌，表达返璞归真回归自然的意味.</p>
                    </div>
                </div>
            </div>

            <div class="col-md-4">
                <div class="row">
                    <div class="col-md-2 text-center">
                        <i class="fa fa-mobile" style="font-size: 50px;color: #81c141;margin-top: 80px;"></i>
                    </div>
                    <div class="col-md-8 col-md-offset-1">
                        <h3>智能生活</h3>
                        <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;以住宅为平台，利用综合布线技术、网络通信技术、安全防范技术、自动控制技术、音视频技术将家居生活有关的设施集成，构建高效的住宅设施与家庭日程事务的管理系统，提升家居安全性、便利性、舒适性、艺术性。</p>
                    </div>
                </div>
            </div>

        </div>
    </div>
</div>


<div id="design" class="pad-section">
    <div class="container ">
        <div class="row">

            <div class="col-md-4 ">
                <a href="<%=request.getContextPath()%>/gallery/">
                    <img class="img-responsive" src="<%=request.getContextPath()%>/assets/images/1131073379575956_S.jpg"
                         title="name" alt=""
                         style="height: 270px;">
                </a>
                <p class="big-height">避开正午的阳光,
                    避开繁杂的工作,
                    选一个云淡风轻的假日,
                    用清爽的色彩装扮一个属于你我的空间,
                    为这个美丽的诺言,
                    留下最清凉的记忆。 </p>
            </div>
            <div class="col-md-4 ">
                <a href="<%=request.getContextPath()%>/gallery/">
                    <img class="img-responsive" src="<%=request.getContextPath()%>/assets/images/6131074203734550_S.jpg"
                         title="name" alt=""
                         style="height: 270px;">
                </a>
                <p class="big-height">中国传统文化中的很多精髓都可以被融入进现代设计中，使现代建筑更具文化底蕴，让传统文化绽放出时尚光彩。</p>
            </div>
            <div class="col-md-4 ">
                <div class="panel panel-default">
                    <div class="panel-body">
                        <div class="form-group">
                            <label for="name">称呼</label>
                            <input type="text" name="name" id="name" class="form-control" placeholder="如何称呼您">
                        </div>
                        <div class="form-group">
                            <label for="phone">电话</label>
                            <input type="text" name="phone" id="phone" class="form-control" placeholder="联系方式">
                        </div>
                        <div class="form-group">
                            <label for="houses">小区</label>
                            <input type="text" name="houses" id="houses" class="form-control" placeholder="小区名称">
                        </div>
                        <div class="form-group">
                            <label for="size">面积</label>
                            <input type="text" name="size" id="size" class="form-control" placeholder="面积">
                        </div>
                        <button class="btn btn-block btn-success">免费申请服务</button>
                    </div>
                </div>
            </div>

        </div>
    </div>
</div>

<!-- third section - Services -->
<div id="services" class="pad-section">
    <div class="container">
        <h2 class="text-center">我们的服务</h2>
        <hr/>
        <div class="row text-center">
            <div class="col-sm-3 col-xs-6">
                <i class="glyphicon glyphicon-phone-alt"> </i>
                <h4>在线预约</h4>
                <%--<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec in sem cras amet. Donec in sem cras--%>
                <%--amet.</p>--%>
            </div>
            <div class="col-sm-3 col-xs-6">
                <i class="glyphicon glyphicon-leaf"> </i>
                <h4>免费设计</h4>
                <%--<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec in sem cras amet. Donec in sem cras--%>
                <%--amet.</p>--%>
            </div>
            <div class="col-sm-3 col-xs-6">
                <i class="glyphicon glyphicon-cloud"> </i>
                <h4>精湛工艺</h4>
                <%--<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec in sem cras amet. Donec in sem cras--%>
                <%--amet.</p>--%>
            </div>
            <div class="col-sm-3 col-xs-6">
                <i class="glyphicon glyphicon-bullhorn"> </i>
                <h4>严苛验收</h4>
                <%--<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec in sem cras amet. Donec in sem cras--%>
                <%--amet.</p>--%>
            </div>
        </div>
    </div>
</div>
<!-- /third section -->
<div class="index-case">
    <div class="container">
        <div class="row">
            <c:forEach items="${latestGallery}" var="gallery">
                <div class="col-md-4 col-xs-12 margin-big-bottom">
                    <div class="index-case-list clearfix">
                        <div class="index-case-list-cover">
                            <img src="${gallery.hCoverImg}"
                                 alt="${gallery.hTitle}">
                            <div><p><a href="<%=request.getContextPath()%>/gallery/info/${gallery.id}.html"
                                       title="${gallery.hTitle}"><span class="animated zoomIn afaster">查看案例</span></a>
                            </p></div>
                        </div>
                        <div class="index-case-list-info">
                            <div></div>
                                ${gallery.hTitle} <span>${gallery.hHouseStyle}</span>
                        </div>
                        <div class="index-case-list-title">
                                ${gallery.hTitle}&nbsp;${gallery.hHouseSize}&nbsp;㎡&nbsp;${gallery.hHouseStyle}
                        </div>
                    </div>
                </div>
            </c:forEach>

            <div class="clearfix">

            </div>


        </div>
    </div>


</div>

<div class="container">

    <div class="line-big decoration-school-content ">
        <div class="col-md-3">
            <div class="company-news">
                <div>
                    <a href="<%=request.getContextPath()%>/news/1/" title="海力特家居 企业新闻">
                        <h4>企业新闻</h4>
                        <p>查看更多 <span class="icon-chevron-right"></span></p>
                    </a>
                </div>
            </div>
        </div>
        <c:forEach items="${latestNews}" var="news" varStatus="key">
            <c:if test="${key.index<3}">
                <div class="col-md-3">
                    <div class="decoration-school-cover-box">
                        <a href="<%=request.getContextPath()%>/news/info/${news.id}.html" title="${news.hTitle}">
                            <img src="${news.hImg}" alt="${news.hTitle}">
                            <p class="clearfix"><span class="leftspan">${news.hTitle} </span><span
                                    class="rightspan">最新资讯</span></p>
                        </a>
                    </div>
                </div>
            </c:if>
        </c:forEach>

        <div class="clearfix"></div>

        <div class="col-md-3">
            <div class="decoration-news">
                <div>
                    <a href="<%=request.getContextPath()%>/news/3/" title="海力特家居 装修知识">
                        <h4>装修知识</h4>
                        <p>查看更多 <span class="icon-chevron-right"></span></p>
                    </a>
                </div>
            </div>
        </div>

        <div class="col-md-4" style="margin-bottom:0;">
            <div class="decoration-news-list">
                <c:forEach var="news" items="${latestNews}" varStatus="key">
                <a href="<%=request.getContextPath()%>/news/info/${news.id}.html" title="${news.hTitle}">
                    <p><span class="left-span"><i class="fa fa-angle-right"></i> ${news.hTitle}</span> <span
                            class="decoration-news-list-time">[<fmt:formatDate value="${news.hTime}"
                                                                               pattern="yy-MM-dd"/> ]</span></p>
                </a>

                <c:if test="${key.index==5}">
            </div>
        </div>
        <div class="col-md-1 text-center hidden-xs hidden-sm">
            <img src="<%=request.getContextPath()%>/assets/images/class.png" style="margin:0 auto">
        </div>

        <div class="col-md-4">
            <div class="decoration-news-list">
                <div>
                    </c:if>
                    </c:forEach>


                </div>
            </div>
        </div>

    </div>

</div>

<jsp:include page="layouts/footer.jsp"/>


<jsp:include page="layouts/modal.jsp"/>

<!-- JavaScript jQuery code from Bootply.com editor -->


</body>
</html>
