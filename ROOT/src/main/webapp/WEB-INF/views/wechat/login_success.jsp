<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: linwei
  Date: 2016/12/27
  Time: 19:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录成功</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <jsp:include page="../layouts/css.jsp"/>
</head>
<body>

<jsp:include page="../layouts/header.jsp"/>
<div class="container">
    <div class="col-md-12 col-xs-12">
        <p style="line-height: 2.8em;font-size: 32px;">
            <c:if test="${err!=null}">
                ${err}
            </c:if>
            <c:if test="${err==null}">
                ${user.nickname}&nbsp;感谢您登录海力特门业官方网站
            </c:if>
        </p>

    </div>
</div>

<jsp:include page="../layouts/footer.jsp"/>
</body>
</html>
