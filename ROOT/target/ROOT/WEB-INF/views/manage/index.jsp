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
    <jsp:include page="../layouts/css.jsp"/>
    <link href="<%=request.getContextPath()%>/assets/css/manage-main.css" rel="stylesheet">

</head>
<body>
<jsp:include page="../layouts/header-manage.jsp"/>
<div id="main-back">
    <div class="container">
        <div class="row">
            <div class="col-md-3">
                <jsp:include page="../layouts/manage-menu.jsp"/>
            </div>
            <div class="col-md-9">
                <div class="main-box">
                    <div class="main-box-title">
                        后台管理
                    </div>
                    <div class="main-box-content">
                        管理员:${user.email}
                    </div>

                </div>
            </div>
        </div>
    </div>
    <div class="clearfix"></div>
</div>


<jsp:include page="../layouts/footer.jsp"/>
<jsp:include page="../layouts/modal.jsp"/>
</body>
</html>
