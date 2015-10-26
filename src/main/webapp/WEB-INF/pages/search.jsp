 <%--
  Created by IntelliJ IDEA.
  User: jchen19
  Date: 2015/10/22
  Time: 13:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
  <title>登录-DMC,就购了</title>
  <link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">
  <link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
  <link rel="stylesheet" type="text/css" href="easyui/demo.css">
  <link rel="shortcut icon" href="img/favicon.ico">
  <script type="text/javascript" src="easyui/jquery.min.js"></script>
  <script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>

  <script type="text/javascript">
      /*search data*/
      function doSearch() {
        $('#tt').datagrid('load', {
          type: $('input:radio[name=condition]:checked').val(),
          date: $('#datePicker').datebox('getValue'),
          sourceDetails: $('#sourceDetails option:selected').text(),
        });
      }
  </script>

</head>
<body>
  <h1 align="center"><span style="color:dodgerblue">DMC数据查询工具</span></h1>
  <table id="tt" class="easyui-datagrid" style="width:100%;height:800px"
         url="cstools/list" toolbar="#tb"
         title="DMC数据查询" iconCls="icon-save"
         rownumbers="true" pagination="true">
    <thead>
    <tr>
      <th field="merchantName" width="180">商家名称</th>
      <th field="date" width="100">日期</th>
      <th field="source" width="180">来源</th>
      <th field="sourceDetails" width="100">来源明细</th>
      <th field="accessNum" width="60">访客数</th>
      <th field="accessChange" width="80">访客数变化</th>
      <th field="buyerNum" width="60">买家数</th>
      <th field="buyerChange" width="100">买家数变化</th>
      <th field="orderTransferRate" width="100">下单转化率</th>
      <th field="orderTransferChange" width="120">下单转化率变化</th>
      <th field="payNum" width="100">支付买家数</th>
      <th field="payBuyerNumChange" width="120">支付买家数变化</th>
      <th field="payAmount" width="60">支付金额</th>
      <th field="payAmountChange" width="120">支付金额变化</th>
      <th field="payTransferRate" width="100">支付转化率</th>
      <th field="payTransferRateChange" width="100">支付转化率变化</th>
    </tr>
    </thead>
  </table>

  <div id="tb" style="padding:3px">
    <span>查询条件:</span>
    <span>Flow</span>
    <input id="flow" type="radio" name="condition" value="flow" checked>&nbsp;
    <span>PC</span>
    <input id="pc" type="radio" name="condition" value="pc">&nbsp;
    <span>APP</span>
    <input id="app" type="radio" name="condition" value="app">&nbsp;

    <span>起始日期:</span>
    <input class="easyui-datebox" id="datePicker"/>

    <span>截止日期:</span>
    <input class="easyui-datebox" id="enddatePicker"/>

    <span>来源:</span>
    <select name="sourceDetails" id="sourceDetails">
      <c:forEach items="${sourceList}" var="data">
        <option value="${data}" style="color: darkorange">${data}</option>
      </c:forEach>
    </select>

    <span>来源明细:</span>
    <select name="sourceDetails" id="sourceDetails">
      <c:forEach items="${sourceList}" var="data">
        <option value="${data}" style="color: darkorange">${data}</option>
      </c:forEach>
    </select>
    <a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-search'" style="width:80px" onclick="doSearch()">Search</a>
  </div>


</body>
</html>
