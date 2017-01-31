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
                        案例列表
                    </div>
                    <div class="main-box-content">
                        <dl class="float-dl">
                            <dd class="<c:if test="${currentTypeId==null}">selected</c:if>"><a
                                    href="<%=request.getContextPath()%>/manage/products/">所有产品</a></dd>
                            <c:forEach items="${styles}" var="style">
                                <dd class="<c:if test="${currentTypeId==style.id}">selected</c:if>"><a
                                        href="<%=request.getContextPath()%>/manage/products/?type=${style.id}">${style.style}</a>
                                </dd>
                            </c:forEach>
                            <dd class="clearfix"></dd>

                        </dl>
                    </div>
                    <div class="main-box-content">
                        <table class="table table-bordered table-data table-responsive">
                            <tr>
                                <td>名称</td>
                                <td>封面图</td>
                                <td class="text-center" colspan="2">操作</td>
                            </tr>
                            <c:forEach items="${pageInfo.list}" var="products">
                                <tr id="data-${products.id}">
                                    <td>${products.hTitle}</td>
                                    <td><a class="pre-view" href="${products.hCoverImg}" target="_blank">预览</a></td>
                                    <td class="text-center"><a
                                            href="<%=request.getContextPath()%>/manage/products/${products.id}/edit">
                                        <i class="fa fa-edit"></i>&nbsp;编辑
                                    </a>
                                    </td>
                                    <td class="text-center">
                                        <a href="#" class="delete" data-id="${products.id}">
                                            <i class="fa fa-trash"></i>&nbsp;删除
                                        </a>
                                    </td>
                                </tr>
                            </c:forEach>
                            <tr>

                            </tr>
                        </table>
                        <jsp:include page="../../layouts/paginate.jsp"/>
                    </div>

                </div>
            </div>
        </div>
    </div>
    <div class="clearfix"></div>
</div>

<!-- Small modal -->

<div id="pre-view-modal" class="modal fade bs-example-modal-sm" tabindex="-1" role="dialog"
     aria-labelledby="mySmallModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-sm">
        <div class="modal-content">
            <img src="" alt="预览图" class="img-responsive img-thumbnail" width="100% /9">
        </div>
    </div>
</div>

<jsp:include page="../../layouts/footer.jsp"/>
<jsp:include page="../../layouts/modal.jsp"/>
<script>
    $(function () {
        $(".delete").click(function () {
            var id = $(this).attr("data-id");
            if (confirm("删除后不可恢复,确定删除此案例吗?")) {
                $.ajax({
                    url: "<%=request.getContextPath()%>/manage/products/" + id,
                    type: "delete",
                    dataType: "text",
                    success: function (msg) {
                        if (msg == 'ok') {
                            alert("操作成功");
                            $("#data-" + id).remove();
                        }
                    }
                })
            }

            return false;
        })

        $(".pre-view").click(function () {
            //预览
            var img = $(this).attr("href");
            $(".img-thumbnail").attr("src",img);
            $("#pre-view-modal").modal("toggle");
            return false;
        })
    })
</script>
</body>
</html>
