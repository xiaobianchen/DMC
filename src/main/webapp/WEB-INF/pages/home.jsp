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
            <li>
               <a href="/DMC/login" class="channel-a">登陆</a>
            </li>
            <li>
               <a href="/DMC/register" class="channel-a">注册</a>
            </li>
            <li>
               <a href="/DMC/feedback" class="channel-a">意见反馈</a>
            </li>
            <li>
               <a href="#" class="channel-a">诚征英才</a>
            </li>
            <li>
               <a href="#" class="channel-a">联系我们</a>
            </li>
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
