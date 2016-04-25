<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>convert</title>
  </head>
  
  <body>
    类型转换测试：<br/>
    <form action="${pageContext.request.contextPath}/convertAction_convert.action">
 	 	<input type="text" name="username" ></input> <br/>
 	 	<input type="text" name="age"></input> <br/>
 	 	<input type="text" name="birthday"></input> <br/>
 	 	<input type="submit" value="提交"></input>
    </form>
  </body>
</html>
