<html>
<body>

<%--通过表单上传文件
get:上传文件大小有限制
post:上传文件大小无限制
--%>
<form action="${pageContext.request.contextPath}/upload.do" enctype="multipart/form-data" method="post">
    <p>上传用户：<input type="text" name="username"><br/></p>
    <p><input type="file" name="file1"></p>
    <p><input type="file" name="file2"></p>

    <p><input type="submit">|<input type="reset"></p>
</form>
</body>
</html>
