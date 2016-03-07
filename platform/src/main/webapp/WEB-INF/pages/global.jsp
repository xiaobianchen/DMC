<%--
  Created by IntelliJ IDEA.
  User: jchen19
  Date: 2016/3/6
  Time: 22:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title></title>
</head>
<body>
  下面展示的是后台获取的国际化信息：<br/>
  ${money}<br/>
  ${date}<br/>

  下面展示的是视图中直接绑定的国际化信息：<br/>
  <spring:message code="money"/>:<br/>
  <spring:eval expression="contentModel.money"></spring:eval><br/>
  <spring:message code="date"/>:<br/>
  <spring:eval expression="contentModel.date"></spring:eval><br/>
</body>
</html>
