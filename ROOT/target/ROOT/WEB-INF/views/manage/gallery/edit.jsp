<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: linwei
  Date: 2016/12/28
  Time: 12:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>后台管理</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <jsp:include page="../../layouts/css.jsp"/>
    <link href="<%=request.getContextPath()%>/assets/css/manage-main.css" rel="stylesheet">

</head>
<body>
<jsp:include page="../../layouts/header-manage.jsp"/>
<div id="main-back">
    <div class="container">
        <div class="row">
            <div class="col-md-3">
                <jsp:include page="../../layouts/manage-menu.jsp"/>
            </div>
            <div class="col-md-9">
                <div class="main-box">
                    <div class="main-box-title">
                        编辑案例
                    </div>
                    <div class="main-box-content">
                        <form action="<%=request.getContextPath()%>/manage/gallery/${gallery.id}" method="post">
                            <div class="row">
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>名称</label>
                                        <input type="text" class="form-control" name="hTitle" value="${gallery.hTitle}">
                                        <p class="help-block">案例名称</p>
                                    </div>
                                    <div class="form-group">
                                        <label>风格</label>
                                        <select name="hTypeId" class="form-control">
                                            <c:forEach var="type" items="${galleryTypes}">
                                                <option value="${type.id}" <c:if test="${gallery.hTypeId==type.id}"> selected="selected"</c:if>>${type.typeName}</option>
                                            </c:forEach>
                                        </select>
                                        <p class="help-block">
                                            <a href="<%=request.getContextPath()%>/manage/gallery/type/create">
                                                编辑风格
                                            </a>
                                        </p>
                                    </div>
                                    <div class="form-group">
                                        <label>封面图</label>
                                        <input type="text" value="${gallery.hCoverImg}" name="hCoverImg" id="hCoverImg"  onclick="BrowseServer( 'Images:/', 'hCoverImg' );" class="form-control">
                                        <p class="help-block">封面图片</p>
                                    </div>
                                    <div class="form-group">
                                        <label>3D全景地址</label>
                                        <input type="text" value="${gallery.hVr}" name="hVr" class="form-control">
                                        <p class="help-block">VR全景播放地址</p>
                                    </div>

                                </div>
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>楼盘</label>
                                        <input type="text" name="hBuilding" value="${gallery.hBuilding}" class="form-control">
                                        <p class="help-block">楼盘名称</p>
                                    </div>
                                    <div class="form-group">
                                        <label>户型</label>
                                        <input type="text"name="hHouseType" value="${gallery.hHouseType}" class="form-control">
                                        <p class="help-block">户型 例如:三房两厅</p>
                                    </div>
                                    <div class="form-group">
                                        <label>面积</label>
                                        <input type="text" name="hHouseSize" value="${gallery.hHouseSize}" class="form-control">
                                        <p class="help-block">住房面积 例如: 128</p>
                                    </div>
                                    <div class="form-group">
                                        <label>风格</label>
                                        <input type="text" name="hHouseStyle" value="${gallery.hHouseStyle}" class="form-control">
                                        <p class="help-block">风格: 现代简约</p>
                                    </div>
                                </div>
                                <div class="col-md-12">
                                    <button class="btn btn-success">保存修改</button>
                                </div>
                            </div>

                        </form>






                    </div>

                </div>
            </div>
        </div>
    </div>
    <div class="clearfix"></div>
</div>


<jsp:include page="../../layouts/footer.jsp"/>
<jsp:include page="../../layouts/modal.jsp"/>
<jsp:include page="../../layouts/ckfinder-js.jsp"/>
</body>
</html>
