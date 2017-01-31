<%--
  Created by IntelliJ IDEA.
  User: linwei
  Date: 2016/12/24
  Time: 13:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <title>title - 海力特家居</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <jsp:include page="layouts/css.jsp"/>
</head>

<body>
<%--导航条--%>
<jsp:include page="layouts/header.jsp"/>


<div class="inside-content inside-main" style="min-height: 300px;">
    <div class="container">
        <div class="row">
            <div class="col-md-9 padding-large-top">
                <div class="inside-main">
                    <div class="inside-main-title clearfix">
                        <h4>Title</h4>
                        <div class="hidden-xs">
                            <a href="<%=request.getContextPath()%>/" title="" class="fa fa-home"> 首页</a>
                            <span class="fa fa-angle-double-right"></span> <a href="#">产品中心</a>
                            <span class="fa fa-angle-double-right"></span> 木地板
                        </div>
                    </div>


                    <div class="article-view-content">
                        <div class="article-view-title">
                            <%--<h1>新房交房验收应该注意的事项，脑补一下。</h1>--%>
                        </div>
                        <div class="article-view-info clearfix">
                            <div class="article-left-div"><span>撰文</span> <strong>海力特家居</strong> 2016-09-30 21:19:00</div>
                        </div>
                        <p>&nbsp;</p>
                        <div class="article-view-desc">
                            <p>插座、灯、线路的检验，这是属于隐蔽工程之一，经常出问题，而且非常的难修，在交房时一定要全部通电，看下有没有哪个灯是坏的，并且还要带好试电笔，每一个插座都要试一下是否有用。</p>

                            <p style="text-align: center;"><img alt="36X58PIC2ms_副本_副本.jpg" src="http://www.ziyehk.com/UploadFiles/FCK/2016-09/6360970367419415766478326.jpg" title="36X58PIC2ms_副本_副本.jpg"></p>

                            <p>水管、水龙头，主要是看一下水管哪里有没有漏水，以及水龙头有没有安装到位或者损坏，这个也必须通水检验，特别要注意角落。</p>

                            <p style="text-align: center;"><img alt="yatin-power-faucet-1_副本_副本.jpg" src="http://www.ziyehk.com/UploadFiles/FCK/2016-09/6360970369789682756053326.jpg" title="yatin-power-faucet-1_副本_副本.jpg"></p>

                            <p>门、窗户，这也是收房需要检验的重点，主要是看玻璃有没有疤痕，纱窗有没有损坏，门是否鲜亮，还有一个重点是开窗和开门时会不会对墙壁造成损坏，这是非常常见的问题。</p>

                            <p style="text-align: center;"><img alt="00-175323390_副本_副本.jpg" src="http://www.ziyehk.com/UploadFiles/FCK/2016-09/6360970372341196264214474.jpg" title="00-175323390_副本_副本.jpg"></p>

                            <p>交房注意地面、墙的检验。首先要看地面和墙面会不会空鼓，这个很重要，检验的根据有小榔头，业主可用小榔头直接轻击地面，如有空鼓，则响声不一样，同时检验瓷砖或涂料的色泽，会不会有差异。</p>

                            <p style="text-align: center;"><img alt="619211_0411-2_副本_副本.jpg" src="http://www.ziyehk.com/UploadFiles/FCK/2016-09/6360970375130205219236360.jpg" title="619211_0411-2_副本_副本.jpg"></p>

                            <p>地漏与泛水坡度合不合要求，如地漏是不是最低点，地面对地漏有没有一个降坡幅度，会不会积水，关于这点业主可以亲自倒水实验，这里需要重点检查的是卫生间和厨房。</p>

                            <p style="text-align: center;"><img alt="1304102W8-1_副本_副本.jpg" src="http://www.ziyehk.com/UploadFiles/FCK/2016-09/6360970377573908298967906.jpg" title="1304102W8-1_副本_副本.jpg"></p>

                            <p>阳台，首先要看阳台的布置，比如有没有地漏，地漏放置的位置是不是理想，有没有晾衣架等。</p>

                            <p style="text-align: center;"><img alt="11595366545_w_副本_副本_副本.jpg" src="http://www.ziyehk.com/UploadFiles/FCK/2016-09/6360970379620743994254101.jpg" title="11595366545_w_副本_副本_副本.jpg"></p>

                            <p>核对合同，合同上注明的设施、设备等是否有遗漏、品牌、数量是否相符；通常在这方面，应该没什么大问题，但是确实要仔细核实。</p>

                            <p style="text-align: center;"><img alt="13292950064f3b6e9e53281_副本_副本.jpg" src="http://www.ziyehk.com/UploadFiles/FCK/2016-09/6360970382395690711531882.jpg" title="13292950064f3b6e9e53281_副本_副本.jpg"></p>


                        </div>


                        <p>&nbsp;</p>
                        <div class="article-view-copyright">
                            版权声明：本文系海力特家居原创内容，如需转载请注明出处，并保留完整链接，谢谢！
                        </div>


                    </div>
                </div>
            </div>
            <div class="col-md-3">
                <jsp:include page="layouts/sidebar.jsp" />
            </div>
        </div>
    </div>
</div>
<jsp:include page="layouts/footer.jsp"/>
<jsp:include page="layouts/modal.jsp"/>
</body>
</html>