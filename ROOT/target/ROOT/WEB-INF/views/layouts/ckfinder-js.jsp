<%--
  Created by IntelliJ IDEA.
  User: linwei
  Date: 2016/12/28
  Time: 19:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="/ckfinder/ckfinder/ckfinder.js"></script>
<script type="text/javascript">
    <%-- onclick="BrowseServer( 'Images:/', 'img{{$value->id}}' );"--%>
    function BrowseServer(startupPath, functionData) {
        var finder = new CKFinder();
        finder.basePath = '/ckfinder';
        finder.startupPath = startupPath;
        finder.selectActionFunction = SetFileField;
        finder.selectActionData = functionData;
        finder.selectThumbnailActionFunction = ShowThumbnails;
        finder.popup();
    }

    function SetFileField(fileUrl, data) {
        document.getElementById(data["selectActionData"]).value = fileUrl;
        document.getElementById(data["selectActionData"]).focus();
        document.getElementById(data["selectActionData"]).blur();
        var postfix = data["fileUrl"].match(/^(.*)(\.)(.{1,8})$/)[3].toLowerCase();
    }

    /**
     * @return {boolean}
     */
    function ShowThumbnails(fileUrl, data) {
        var sFileName = this.getSelectedFile().name;
        document.getElementById('thumbnails').innerHTML +=
                '<div class="thumb">' +
                '<img src="' + fileUrl + '" />' +
                '<div class="caption">' +
                '<a href="' + data["fileUrl"] + '" target="_blank">' + sFileName + '</a> (' + data["fileSize"] + 'KB)' +
                '</div>' +
                '</div>';

        document.getElementById('preview').style.display = "";
        return false;
    }

</script>