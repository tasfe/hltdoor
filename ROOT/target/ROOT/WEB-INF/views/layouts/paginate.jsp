<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: linwei
  Date: 2016/12/25
  Time: 23:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:if test="${pageInfo.pages>0}">
    <div>
        <ul class="pagination">
            <c:if test="${pageInfo.prePage!=0}">
                <li><a href="?page=${pageInfo.prePage}">&laquo;</a></li>

            </c:if>
            <c:if test="${pageInfo.prePage==0}">
                <li class="disabled"><a href="">&laquo;</a></li>
            </c:if>

            <c:forEach items="${pageInfo.navigatepageNums}" var="item">
                <li <c:if test="${pageInfo.pageNum==item}"> class="active"</c:if>><a
                        href="?page=${item}">${item}</a></li>
            </c:forEach>

            <c:if test="${pageInfo.nextPage!=0}">
                <li><a href="?page=${pageInfo.nextPage}">&raquo;</a></li>
            </c:if>
            <c:if test="${pageInfo.nextPage==0}">
                <li class="disabled"><a href="?page=${pageInfo.pages}">&raquo;</a></li>
            </c:if>
        </ul>
    </div>
</c:if>