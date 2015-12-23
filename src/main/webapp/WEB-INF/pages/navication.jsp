<%--
  Created by IntelliJ IDEA.
  User: jchen19
  Date: 2015/12/23
  Time: 13:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
      <meta charset="utf-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <meta name="description" content="">
      <meta name="author" content="">
      <title>网站导航</title>
      <link href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
      <link href="navbar-static-top.css" rel="stylesheet">
      <script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
      <script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>
      <nav class="navbar navbar-inverse">
        <div class="container">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
          </div>
          <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
              <li class="active"><a href="#">首页</a></li>
              <li><a href="#about">关于我们</a></li>
              <li><a href="#contact">联系我们</a></li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">套餐服务<span class="caret"></span></a>
                <ul class="dropdown-menu">
                  <li><a href="#">海底之心</a></li>
                  <li><a href="#">户外烧烤</a></li>
                  <li><a href="#">甜心派对</a></li>
                  <li role="separator" class="divider"></li>
                  <li class="dropdown-header">玫瑰糕点</li>
                  <li><a href="#">料理</a></li>
                  <li><a href="#">海鲜</a></li>
                </ul>
              </li>
            </ul>
          </div>
        </div>
      </nav>


      <div class="container">
        <div class="jumbotron">
          <h1>网站导航</h1>
          <p></p>
          <p></p>
          <p>
            <a class="btn btn-lg btn-primary" href="#" role="button">更多内容</a>
          </p>
        </div>
      </div>
</body>
</html>
