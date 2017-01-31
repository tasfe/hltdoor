<%--
  Created by IntelliJ IDEA.
  User: linwei
  Date: 2016/12/27
  Time: 18:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
    <meta charset="utf-8">
    <jsp:include page="../layouts/css.jsp"/>

</head>
<body>
<jsp:include page="../layouts/header.jsp"/>
<div class="container">
    <div class="row">
        <div class="col-md-12 text-center">
            <div style="width: 180px;display: block;margin: 100px auto;">
                <p>
                    <img src="<%=request.getContextPath()%>/qrcode/${key}" width="100">
                </p>
            </div>
            <p>打开微信客户端扫描二维码进行登录</p>

        </div>
    </div>
</div>

<jsp:include page="../layouts/footer.jsp"/>

<script>
    $(function () {
        interval = setInterval(function () {
            $.ajax({
                url: "<%=request.getContextPath()%>/auth/check/${key}",
                type: "get",
                dataType: "text",
                success: function (msg) {
                    console.log(msg);
                    if (msg == "true") {

                        alert("登录成功");
                        window.location.href = "<%=request.getContextPath()%>/manage/";
                    }
                },
                error: function (err) {

                }
            })
        }, "3000");
    })
</script>
</body>
</html>
