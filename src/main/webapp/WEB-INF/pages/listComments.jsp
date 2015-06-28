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
    <h2 align="center">用户评论</h2>
    <table id="listComments" border="1" align="center" cellspacing="0" width="80%">
           
           <tr>
	            <th>id</th>
	            <th>Comments</th>
	            <th>Type</th>
	            <th>Contact</th>
           </tr>
           
           <c:forEach items="${commentList}" var="comment">
               <tr>
                  <td>${comment.id}</td>
                  <td>${comment.comments }</td>
                  <td>${comment.type }</td>
                  <td>${comment.contact }</td>
               </tr>
           </c:forEach>
    </table>
  
</body>
</html>