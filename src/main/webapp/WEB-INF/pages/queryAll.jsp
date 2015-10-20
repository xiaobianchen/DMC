<%--
  Created by IntelliJ IDEA.
  User: xiaobianchen
  Date: 15/9/21
  Time: 下午8:48
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="main.jsp"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title></title>
<link rel="stylesheet" href="css/bootstrap.css">
<script type="text/javascript" src="js/bootstrap.js"></script>
</head>
<body>
	<h1 align="center">DMC数据查询工具</h1>
	<div>
	    查询条件：
		<input type="radio" name="condition" value="flow" checked> flow
		<input type="radio" name="condition" value="app">  app
		<input type="radio" name="condition" value="pc">   pc
        &nbsp;&nbsp;

		来源明细：
        <select name="sourceDetails" id="sourceDetails">
			<c:forEach items="${sourceList}" var="data">
				<option value="${data}">${data}</option>
			</c:forEach>
        </select>

		日期：<input type="text" id="datepicker">
		<!-- <input type="button" value="search" class="blue" onclick="searchCondition();"> -->
		<button type="button" class="btn btn-primary" onclick="searchCondition();">Search</button>
	</div><br/><br/>
	
	<table width="100%" style="border: 3px;background: rgb(243, 244, 248);">
	   <tr>
		    <td>
				<table id="queryAll" class="display"  cellspacing="0" width="100%" >
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
				  </table>
			</td>
	  </tr>
     </table>
</body>
</html>
