<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>convert</title>
  </head>
  
  <body>
    文件上传测试：<br/>
    <form action="${pageContext.request.contextPath}/uploadAction_saveFile.action" method="post" enctype="multipart/form-data">
 	 	文件：<input type="file" name="uploadFile" ></input> <br/>
 	 	<input type="submit" value="提交"></input>
    </form>
  </body>
</html>
