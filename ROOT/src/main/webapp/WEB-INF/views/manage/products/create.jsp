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
                        新增产品
                    </div>
                    <div class="main-box-content">
                        <form action="<%=request.getContextPath()%>/manage/products/" method="post">
                            <div class="row">
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>名称</label>
                                        <input type="text" class="form-control" name="hTitle">
                                        <p class="help-block">产品名称</p>
                                    </div>

                                    <div class="form-group">
                                        <label>类别</label>
                                        <select name="hStyle" class="form-control">
                                            <c:forEach var="style" items="${styles}">
                                                <option value="${style.id}">${style.style}</option>
                                            </c:forEach>
                                        </select>
                                        <p class="help-block">
                                            <a href="<%=request.getContextPath()%>/manage/gallery/type/create">
                                                类别
                                            </a>
                                        </p>
                                    </div>
                                    <div class="form-group">
                                        <label>封面图</label>
                                        <input type="text" name="hCoverImg" id="hCoverImg"  onclick="BrowseServer( 'Images:/', 'hCoverImg' );" class="form-control">
                                        <p class="help-block">封面图片</p>
                                    </div>


                                </div>
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>规格</label>
                                        <input type="text" name="hGuige" class="form-control">
                                        <p class="help-block">规格</p>
                                    </div>
                                    <div class="form-group">
                                        <label>价格</label>
                                        <input type="text" name="hPrice" class="form-control">
                                        <p class="help-block">价格</p>
                                    </div>

                                </div>
                                <div class="col-md-12">
                                    <button class="btn btn-success">添加</button>
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
