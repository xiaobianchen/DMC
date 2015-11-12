<%@ page import="com.dmc.domain.entity.Login" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: jchen19
  Date: 2015/11/12
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.dmc.domain.entity.Login" %>
<%
  Login user = (Login)request.getSession().getAttribute("login");
  if(user == null){
%>
<script>
  alert('尊敬的游客，由于您未登录，所以无法使用该平台，谢谢合作!');
  location.href = '/DMC';
</script>
<%
  }
%>
<html>
<head>
    <title>登录DMC,就够了</title>
</head>
<body>

</body>
</html>
