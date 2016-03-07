<%--
  Created by IntelliJ IDEA.
  User: jchen19
  Date: 2016/3/6
  Time: 22:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>file upload</title>
</head>
<body>
  <form action="/platform/upload.action" enctype="multipart/form-data" method="post">
     upload file: <input type="file"  name="file"/>
      <input type="submit" value="上传">
  </form>

  <form action="/platform/uploadMultipartFile.action" enctype="multipart/form-data" method="post">
      upload multipart file:
      <p>
          <input type="file"  name="files"/>
      </p>
      <p>
          <input type="file"  name="files"/>
      </p>
      <p>
          <input type="file"  name="files"/>
      </p>
      <p>
          <input type="file"  name="files"/>
      </p>
      <input type="submit" value="上传多个文件">
  </form>

</body>
</html>
