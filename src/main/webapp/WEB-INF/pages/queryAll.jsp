<%--
  Created by IntelliJ IDEA.
  User: xiaobianchen
  Date: 15/9/21
  Time: 下午8:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="main.jsp"/>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>DMC Data Query Tools</title>
</head>
<body>

<h1 align="center">DMC数据查询工具</h1>
<table id="queryAll" class="display" border="1" cellspacing="0" width="100%">
    <thead>
    <tr>
        <th>商家名称</th>
        <th>日期</th>
        <th>来源</th>
        <th>来源明细</th>
        <th>访客数</th>
        <th>访客数变化</th>
        <th>下单买家数</th>
        <th>下单买家数变化</th>
        <th>下单金额</th>
        <th>下单金额变化</th>
        <th>下单转化率</th>
        <th>下单转化率变化</th>
        <th>支付买家数</th>
        <th>支付买家数变化</th>
        <th>支付金额</th>
        <th>支付金额变化</th>
        <th>支付转化率</th>
        <th>支付转化率变化</th>
    </tr>
    </thead>


    <c:forEach items="${flowList}" var="flow">
        <tbody>
             <tr>
                <td align="center">${flow.商家名称}</td>
                <td align="center">${flow.日期}</td>
                <td align="center">${flow.来源}</td>
                <td align="center">${flow.来源明细}</td>
                <td align="center">${flow.访客数}</td>
             </tr>
        </tbody>
     </c:forEach>
</table>


</body>
</html>
