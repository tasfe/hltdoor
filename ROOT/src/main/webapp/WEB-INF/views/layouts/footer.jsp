<%--
  Created by IntelliJ IDEA.
  User: linwei
  Date: 2016/12/22
  Time: 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div id="footer" class="pad-section">
    <div class="container">
        <div class="row">
            <div class="col-md-3  hidden-sm">
                <div class="row">
                    <div class="text-center">
                        <h3>联系我们</h3>
                    </div>
                </div>
                <div class="row">
                    <p style="line-height: 2em;">
                        手&nbsp;&nbsp;机:&nbsp;&nbsp;158-7425-3038 <br>
                        传&nbsp;&nbsp;真:&nbsp;&nbsp;0731-85289135 <br>
                        地&nbsp;&nbsp;址:&nbsp;&nbsp;湖南省长沙市芙蓉区红旗路大汉建材批发城陶瓷区109号
                    </p>
                </div>
            </div>
            <div class="col-md-1 text-center hidden-xs hidden-sm">
                <img src="<%=request.getContextPath()%>/assets/images/class.png" style="margin:0 auto">
            </div>
            <div class="col-md-4">
                <div class="row">
                    <div class="text-center">
                        <h3>海力特门业</h3>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12 hidden-click">
                        <ul>
                            <li class="col-md-6 text-center"><a href="#getImg" class="getImg">门店预约</a></li>
                            <li class="col-md-6 text-center"><a href="#getImg" title="getImg">关于我们</a></li>
                            <li class="col-md-6 text-center"><a href="#getImg" title="getImg">预约服务</a></li>
                            <li class="col-md-6 text-center"><a href="#getImg" title="getImg">帮助中心</a></li>
                            <li class="col-md-6 text-center"><a href="#getImg" title="getImg">售后服务</a></li>
                            <li class="col-md-6 text-center"><a href="#getImg" title="getImg">客服服务</a></li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="col-md-1 text-center hidden-xs hidden-sm">
                <img src="<%=request.getContextPath()%>/assets/images/class.png" style="margin:0 auto">
            </div>
            <div class="col-md-3 hidden-xs">
                <div class="row">
                    <div class="text-center">
                        <h3>公众平台</h3>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-6 col-xs-12 col-sm-6">
                        <img id="getImg" src="<%=request.getContextPath()%>/assets/images/hltdoor-contact.png"
                             alt="wechat"
                             class="img-responsive" width="100% \9">
                    </div>
                    <div class="col-md-6 col-xs-12 col-sm-6">
                        <img src="<%=request.getContextPath()%>/assets/images/hltdoor-wechat.jpg" alt="weibo"
                             class="img-responsive" width="100% \9">
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<footer>
    <div class="container">
        <p class="text-center">Copyright &copy; 2015 海力特门业 Powered by 海力特门业 湘ICP备12004040号.</p>
    </div>
</footer>

<script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
<script src="https://apps.bdimg.com/libs/bootstrap/3.3.4/js/bootstrap.min.js"></script>

<%--<script src="<%=request.getContextPath()%>/assets/js/jquery.min.js"></script>--%>
<%--<script src="<%=request.getContextPath()%>/assets/js/bootstrap.min.js"></script>--%>
<script>
    $(function () {
        $(".getImg").click(function () {
            alert("请扫描右侧第一个二维码获取名片");
            return false;
        })
    })
</script>
