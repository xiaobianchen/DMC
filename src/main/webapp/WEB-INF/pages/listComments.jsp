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
    <table id="listComments" class="display" border="1" cellspacing="0" width="100%" >
         <thead>
	           <tr>
		            <th>评论编号</th>
		            <th>评论内容</th>
		            <th>联系类型</th>
		            <th>联系方式</th>
		            <th>评论时间</th>
	           </tr>
          </thead>
          
           <c:forEach items="${commentList}" var="comment">
             <tbody>
               <tr>
                  <td align="center">${comment.id}</td>
                  <td align="center">${comment.comments }</td>
                  <td align="center">${comment.type }</td>
                  <td align="center">${comment.contact }</td>
                  <td align="center">${comment.reportTime }</td>
               </tr>
              </tbody>
           </c:forEach>
    </table>
  
</body>
</html>