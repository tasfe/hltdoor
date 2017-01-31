<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--login modal-->
<div id="loginModal" class="modal fade" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h5 class="text-center">
                    个人中心</h5>
            </div>
            <div class="modal-body">
                <%--<form class="form col-md-12 center-block">--%>
                <%--<div class="form-group">--%>
                <%--<input type="text" class="form-control input-lg" placeholder="Email">--%>
                <%--</div>--%>
                <%--<div class="form-group">--%>
                <%--<button class="btn btn-primary btn-lg btn-block">Sign In</button>--%>
                <%--<span class="pull-right"><a href="#">Register</a></span><span><a href="#">Need help?</a></span>--%>
                <%--</div>--%>
                <%--</form>--%>
                <c:if test="${user==null}">
                    <p class="text-center">
                        <a href="<%=request.getContextPath()%>/auth/login2" class="text-center">
                            <button class="btn btn-success hidden-xs">登录</button>
                        </a>
                    </p>
                </c:if>
                <c:if test="${user!=null}">
                    <p style="line-height: 1.5em;">${user.email}</p>
                    <form action="<%=request.getContextPath()%>/auth/auth/logout" method="post">
                        <button class="btn btn-success">个人中心</button>
                        <button class="btn btn-warning" type="submit">注销</button>
                    </form>

                </c:if>

            </div>
            <%--<div class="modal-footer">--%>
            <%--<div class="col-md-12">--%>
            <%--<button class="btn" data-dismiss="modal" aria-hidden="true">关闭</button>--%>
            <%--</div>--%>
            <%--</div>--%>
        </div>
    </div>
</div>


<!--about modal-->
<div id="aboutModal" class="modal fade" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h2 class="text-center">About</h2>
            </div>
            <div class="modal-body">
                <div class="col-md-12 text-center">
                    <a href="http://bootply.com/90113">This Bootstrap Template</a><br>was made with <i
                        class="glyphicon glyphicon-heart"></i> by <a href="http://bootply.com/templates">Bootply</a>
                </div>
            </div>
            <div class="modal-footer">
                <button class="btn" data-dismiss="modal" aria-hidden="true">OK</button>
            </div>
        </div>
    </div>
</div>