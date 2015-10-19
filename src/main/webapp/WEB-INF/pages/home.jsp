<%@ page language="java" contentType="text/html; charset=utf8"
    pageEncoding="utf8"%>
<!doctype html>
<html>
<head>
    <title>登录-DMC,就购了</title>
    <meta charset="utf-8" />
    <link rel="shortcut icon" href="img/favicon.ico">
    <link rel="stylesheet" href="assets/css/style.css" />
    <link rel="stylesheet" href="assets/css/jquery.sectionmenu.css" />
    <script src="js/jquery-1.10.2.js"></script>
    <script type="text/javascript" src="assets/js/jquery.easing.min.js"></script>
    <script type="text/javascript" src="assets/js/jquery.fragmentscroll.min.js"></script>
    <script type="text/javascript" src="assets/js/jquery.sectionmenu.min.js"></script>
    <script type="text/javascript">
        $(window).load(function() {
            $('body').sectionMenu().fragmentScroll();
        });
    </script>
</head>
<body>
<div id="nav">
    <div class="container">
        <ul>
            <li><h3><a href="/DMC/login">登陆</a></h3></li>
            <li><h3><a href="/DMC/register">注册</a></h3></li>
            <li><h3> <a href="#">联系客服</a></h3></li>
            <li><h3><a href="#">诚征英才</a></h3></li>
            <li><h3><a href="/DMC/feedback">意见反馈</a></h3></li>
            <li><h3><a href="#">联系我们</a></h3></li>
        </ul>
    </div>
</div>
<div id="page">
    <section id="home" class="container" data-section-menu="">
    </section>

    <section id="section1" class="container" data-section-menu="">
    </section>

    <section id="section2" class="container" data-section-menu="">
    </section>

    <section id="section3" class="container" data-section-menu="">
    </section>
</div>
</body>
</html>
