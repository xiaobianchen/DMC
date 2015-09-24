<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<jsp:include page="main.jsp"/>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title></title>
</head>
<body>
    <h1 align="center">用户评论</h1>
    <table width="100%" style="border: 3px;background: rgb(243, 244, 248);">
    <tr>
      <td>
		    <table id="listComments" class="display" cellspacing="0" width="100%" >
		         <thead>
			           <tr>
				            <th>评论编号</th>
				            <th>评论内容</th>
				            <th>联系类型</th>
				            <th>联系方式</th>
				            <th>评论时间</th>
			           </tr>
		          </thead>
		    </table>
	  </td>
    </tr>
    </table>
  
</body>
</html>