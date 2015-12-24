<%@ page import="com.dmc.domain.entity.Login" %>
<%@ page language="java" contentType="text/html; charset=utf8"
    pageEncoding="utf8"%>
<!DOCTYPE html>
<jsp:include page="main.jsp"/>
<jsp:include page="footer.jsp"/>
<%@ page import="com.dmc.domain.entity.Login" %>
<%
   Login user = (Login)request.getSession().getAttribute("login");
%>

<html lang="zh-cn" data-lang="zh-cn" data-template="simple" class="lang-zh-cn">
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="keywords" content="DMC">
    <meta name="description" content="登录DMC,就够了">
    <title>登录DMC,就够了</title>
    <link rel="shortcut icon" href="img/favicon.ico">
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/base.css">
    <link rel="stylesheet" type="text/css" href="css/index_base.css">
    <link rel="stylesheet" type="text/css" href="css/index.css">
    <link rel="stylesheet" type="text/css" href="css/page_contact.css">
    <script type="text/javascript" src="js/jquery-1.10.2.js"></script>
    <script type="text/javascript" src="js/bootstrap.js"></script>
    <script type="text/javascript">
        $(document).ready(function() {
            $('.carousel').carousel({
                interval: 5000
            })
        });
    </script>
</head>

<body>
<div class="page">
    <div class="page-head navbar-default">
        <div class="head">
            <div class="navbar">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="/DMC">首页</a></li>
                    <li class="nav-dropdown ">
                        <a href="javascript:void(0);">产品</a>
                        <ul class="nav-dropdown-list">
                            <li><a target="_blank" href="/DMC/cstools">数据中心</a></li>
                            <li><a target="_blank" href="/DMC/report">报表服务</a></li>
                            <li><a target="_blank" href="/DMC/admin">用户管家</a></li>
                            <li><a target="_blank" href="/DMC/flow">流量通道</a></li>
                        </ul>
                    </li>
                    <li class=""><a href="#">支持中心</a>
                        <ul class="nav-dropdown-list">
                            <li><a target="_blank" href="/DMC/support">后台管理</a></li>
                            <li><a target="_blank" href="/DMC/support/log">日志管理</a></li>
                        </ul>
                    </li>
                    <li class=""><a href="#">成功案例</a></li>
                    <li class=""><a href="#">关于我们</a></li>
                    <li><a href="#" target="_blank">社区</a></li>
                </ul>
            </div>

            <%
              if(user !=null){
                  %>
                  <div class="account-dropbox">
                      欢迎您,
                  <a class="login-a ml10" href="/DMC/login"><%= user.getUsername()%></a>
                          &nbsp;<span class="divider">|</span>&nbsp;
                  <a href="/DMC/login">退出</a>
                  </div>
            <% }
             else{
                  %>
                  <div class="account-dropbox">
                  <a class="login-a ml10" href="/DMC/login">登录</a>
                          &nbsp;<span class="divider">|</span>&nbsp;
                  <a href="/DMC/register">注册</a>
                  </div>
            <% }
           %>


        </div>
    </div>

    <div id="page-contact-btn">
        <ul class="contact-ul">
            <li class="contact-li ent">
                <a class="contact-item ent-item" id="consult" href="javascript:void(0);"></a>
                <div class="consult-box">
                    <div class="consult-intro">
                        <ul>
                            <li>客户经理：何文斌</li>
                            <li>联系电话：027-62675942</li>
                        </ul>
                        <div class="consult-mask">
                        </div>
                        <div class="consult-modal">
                            <p class="modal-ptop"><a target="_blank" href="#">升级企业版</a>，将获得一对一专属技术支持</p>
                            <p class="modal-pbottom">亲，还可以<a target="_blank" href="#">预约人工咨询</a>哦~</p>
                        </div>
                    </div>
                    <p class="consult-way">社区：<a target="_blank" href="/DMC/feedback">去反馈</a>&nbsp;&nbsp;
                        查看反馈信息：<a target="_blank" href="/DMC/list">查询反馈信息</a></p>
                </div>
            </li>

            <li class="contact-li qrcode">
                <a class="contact-item qrcode-item" href="javascript:void(0);"></a>
                <div class="qrcode-box">
                    <img src="img/weixin.png" alt="DMCAppEngine">
                    <p>DMC微信公众号</p>
                </div>
            </li>
        </ul>
    </div>

    <div id="myCarousel" class="carousel slide">
        <ol class="carousel-indicators">
            <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
            <li data-target="#myCarousel" data-slide-to="1"></li>
            <li data-target="#myCarousel" data-slide-to="2"></li>
            <li data-target="#myCarousel" data-slide-to="3"></li>
        </ol>
        <div class="carousel-inner"> 
            <div class="item active">
                <img src="img/5.jpg">
            </div>
            <div class="item">
                <img src="img/4.jpg">
            </div>
            <div class="item">
                <img src="img/2.jpg">
            </div>
            <div class="item">
                <img src="img/3.jpg">
            </div>
        </div>
    </div>

    <div class="page-footer">
        <div class="footer">
            <div class="footer-item">
                <div class="footer-title">
                    <h4>产品</h4>
                </div>
                <ul class="footer-link">
                    <li><a target="_blank" href="#">数据神经元</a></li><li><a target="_blank" href="#">用户神经元</a></li><li><a target="_blank" href="#">DMC 存储</a></li><li><a target="_blank" href="#">DMC 商店</a></li></ul>
            </div>
            <div class="footer-item">
                <div class="footer-title">
                    <h4>支持中心</h4>
                </div>
                <ul class="footer-link">
                    <li><a href="#">产品文档</a></li>
                    <li><a href="#">常见问题</a></li>
                    <li><a href="#">DMC论坛</a></li>
                    <li><a href="#">联系我们</a></li>
                </ul>
            </div>
            <div class="footer-item">
                <div class="footer-title">
                    <h4>成功案例</h4>
                </div>
                <ul class="footer-link">
                    <li><a href="#">天猫</a></li>
                    <li><a href="#">淘宝</a></li>
                    <li><a href="#">京东</a></li>
                    <li><a href="#">社交</a></li>
                </ul>
            </div>
            <div class="footer-item">
                <div class="footer-title">
                    <h4>关于我们</h4>
                </div>
                <ul class="footer-link">
                    <li><a href="#">招聘信息</a></li>
                    <li><a href="#">平台架构</a></li>
                    <li><a href="#">用户协议</a></li>
                    <li><a href="#">信息举报</a></li>
                </ul>
            </div>
            <div class="footer-item follow-item">
                <div class="footer-title">
                    <h4>关注我们</h4>
                </div>
                <p class="mb10 fs12">微信关注</p>
                <div class="app-download">
                    <a href="#"><img src="img/weixin.png"></a>
                </div>
                <div class="follow-us mt10">
                    <span class="weibo"><a href="http://weibo.com/" title="微博"></a></span>
                    <span class="weixin"></span>
                </div>

            </div>
            <div class="footer-item">
                <div class="footer-title">
                    <h4>可信性认证</h4>
                </div>
                <div class="true-cloud">
                    <ul>
                        <li>存储服务&nbsp;NO：02008</li>
                        <li>数据服务&nbsp;NO：03009</li>
                        <li>引擎服务&nbsp;NO：04012</li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
