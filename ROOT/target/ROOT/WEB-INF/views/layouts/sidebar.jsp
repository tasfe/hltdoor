<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: linwei
  Date: 2016/12/25
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="inside-aside padding-large-top">


    <div class="inside-aside-submenu">
        <div class="inside-aside-submenu-header">
            近期动态
        </div>
        <ul>
            <c:forEach items="${latestNews}" var="news">
                <li><a href="<%=request.getContextPath()%>/news/info/${news.id}.html" title="${news.hTitle}"><i
                        class="icon-angle-double-right"> </i>${news.hTitle}
                </a></li>
            </c:forEach>
        </ul>
    </div>


    <div class="inside-aside-submenu">
        <div class="inside-aside-submenu-header">
            经典案例
        </div>
        <c:forEach items="${latestGallery}" var="gallery">
            <div class="inside-aside-cases clearfix">
                <a href="<%=request.getContextPath()%>/gallery/info/${gallery.id}.html" title="${gallery.hTitle}">
                    <div class="inside-aside-cases-left"
                         style="background-image:url('${gallery.hCoverImg}');"></div>
                    <div class="inside-aside-cases-right">
                        <p>楼盘：${gallery.hBuilding}</p>
                        <p>面积：${gallery.hHouseSize}㎡</p>
                        <p>风格：${gallery.hHouseStyle}</p>
                    </div>
                </a>
            </div>
        </c:forEach>

    </div>


</div>
