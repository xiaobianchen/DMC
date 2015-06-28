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
    <table id="listComments" class="display" cellspacing="0" width="100%" >
         <thead>
	           <tr>
		            <th>id</th>
		            <th>Comments</th>
		            <th>Type</th>
		            <th>Contact</th>
	           </tr>
          </thead>
          
          <tfoot>
               <tr>
		            <th>id</th>
		            <th>Comments</th>
		            <th>Type</th>
		            <th>Contact</th>
	           </tr>
          </tfoot>
           
           <c:forEach items="${commentList}" var="comment">
             <tbody>
               <tr>
                  <td>${comment.id}</td>
                  <td>${comment.comments }</td>
                  <td>${comment.type }</td>
                  <td>${comment.contact }</td>
               </tr>
              </tbody>
           </c:forEach>
    </table>
  
</body>
</html>