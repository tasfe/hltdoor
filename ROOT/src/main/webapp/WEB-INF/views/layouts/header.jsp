<%--
  Created by IntelliJ IDEA.
  User: linwei
  Date: 2016/11/23
  Time: 20:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page trimDirectiveWhitespaces="true" %>
<div class="navbar navbar-default navbar-fixed-top header" role="navigation">
    <div class="col-md-12">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                    data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="<%=request.getContextPath()%>/">海力特家居</a>
        </div>
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li><a href="<%=request.getContextPath()%>/">首页</a></li>
                <li><a href="<%=request.getContextPath()%>/gallery/">装修案例</a></li>
                <li class="dropdown">
                    <a href="<%=request.getContextPath()%>/products/" class="dropdown-toggle" data-toggle="dropdown">
                        产品展示<span class="caret"></span>
                    </a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="<%=request.getContextPath()%>/products/1">木地板</a></li>
                        <li><a href="<%=request.getContextPath()%>/products/2">门</a></li>
                        <li><a href="<%=request.getContextPath()%>/products/3">楼梯扶手</a></li>
                        <li><a href="<%=request.getContextPath()%>/gallery/">原木全房</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="<%=request.getContextPath()%>/news/" class="dropdown-toggle" data-toggle="dropdown">
                        新闻动态<span class="caret"></span>
                    </a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="<%=request.getContextPath()%>/news/1/">企业资讯</a></li>
                        <li><a href="<%=request.getContextPath()%>/news/2/">行业动态</a></li>
                        <li><a href="<%=request.getContextPath()%>/news/3/">装修课堂</a></li>
                    </ul>
                </li>

                <%--<li><a href="<%=request.getContextPath()%>/contact-us.html">联系我们</a></li>--%>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <%--<li>--%>
                    <%--<a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-bell"></i></a>--%>
                    <%--<ul class="dropdown-menu">--%>
                        <%--<li><a href="#"><span class="badge pull-right">40</span>Link</a></li>--%>
                        <%--<li><a href="#"><span class="badge pull-right">2</span>Link</a></li>--%>
                        <%--<li><a href="#"><span class="badge pull-right">0</span>Link</a></li>--%>
                        <%--<li><a href="#"><span class="label label-info pull-right">1</span>Link</a></li>--%>
                        <%--<li><a href="#"><span class="badge pull-right">13</span>Link</a></li>--%>
                    <%--</ul>--%>
                <%--</li>--%>
                <li>
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-weibo"></i></a>
                    <ul class="dropdown-menu">
                        <li><img src="<%=request.getContextPath()%>/assets/images/weibo.png" width="160" alt="官方微博" title="官方微博"></li>
                    </ul>
                </li>

                <li>
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-wechat"></i></a>
                    <ul class="dropdown-menu">
                        <li><img src="<%=request.getContextPath()%>/assets/images/qrcode.jpg" width="160" alt="微信公众号" title="微信公众号"></li>
                    </ul>
                </li>
                <li><a href="#loginModal" role="button" data-toggle="modal"><i class="fa fa-user"></i></a></li>
            </ul>
            <form class="navbar-form pull-right" action="https://www.baidu.com/baidu" target="_blank">
                <div class="input-group" style="max-width:270px;">
                    <input type="text" class="form-control" placeholder="海力特地板" name="wd">
                    <div class="input-group-btn">
                        <a href="https://www.baidu.com/baidu?wd=%E6%B5%B7%E5%8A%9B%E7%89%B9%E5%9C%B0%E6%9D%BF" class="btn btn-success" target="_blank"><i class="glyphicon glyphicon-search"></i></a>
                    </div>
                </div>
            </form>

        </div>
    </div>
</div>

<div style="height:50px;"></div>