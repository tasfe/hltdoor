<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: linwei
  Date: 2016/12/28
  Time: 14:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div id="menuBar" class="menuBox">
    <dl class="menu">
        <dt class="menu_title">
            <i class="fa fa-delicious"></i>案例管理
        </dt>
        <dd class="menu_item <c:if test="${menu=='gallery'}">selected</c:if>">
            <a href="<%=request.getContextPath()%>/manage/gallery/">
                所有案例
            </a>
        </dd>
        <dd class="menu_item <c:if test="${menu=='gallery-add'}">selected</c:if>">
            <a href="<%=request.getContextPath()%>/manage/gallery/create">
                添加案例
            </a>
        </dd>
    </dl>
    <dl class="menu">
        <dt class="menu_title">
            <i class="fa fa-modx"></i>产品管理
        </dt>
        <dd class="menu_item <c:if test="${menu=='products'}">selected</c:if>">
            <a href="<%=request.getContextPath()%>/manage/products/">
                所有产品
            </a>
        </dd>
        <dd class="menu_item <c:if test="${menu=='products-add'}">selected</c:if>">
            <a href="<%=request.getContextPath()%>/manage/products/create">
                添加产品
            </a>
        </dd>
    </dl>
    <dl class="menu">
        <dt class="menu_title">
            <i class="fa fa-newspaper-o"></i>文章管理
        </dt>
        <dd class="menu_item">
            <a href="<%=request.getContextPath()%>/manage/news/">
                所有文章
            </a>
        </dd>
        <dd class="menu_item">
            <a href="<%=request.getContextPath()%>/manage/news/create">
                添加文章
            </a>
        </dd>
    </dl>

</div>