<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>test1 page</title>
  </head>
  
  <body>
    This is first test page. <br>
    <a href="${pageContext.request.contextPath}/primer/userAction.action">userAction</a><br/>
    <a href="${pageContext.request.contextPath}/helloworld/helloworldAction.action">helloworldAction</a>
  </body>
</html>
