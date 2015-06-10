<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title></title>
		<link rel="stylesheet" href="css/style.css" />
		<link type="text/css" rel="Stylesheet" href="css/jquery-ui.css"/>
		<link rel="stylesheet" type="text/css" href="css/style.css">
		<script type="text/javascript" src="js/jquery-ui.js"></script>
		<script type="text/javascript" src="js/jquery-1.7.2.js"></script>
        <script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
        <script type="text/javascript" src="js/main.js"></script>
	</head>
	<body>
		<div class="module"> 
			<img class="module-bg" src="img/bg1.png" />
			<div class="content"> 
				<div class="logo">
					<img src="img/icon-shan.png"/>
					<span>DMC商城卫士旗舰版</span>
				</div>
				<div class="operate">
					<i class="icon icon-skin"></i> 
					<i class="icon icon-message"></i> 
					<i class="icon icon-down"></i> 
					<i class="icon icon-minus"></i> 
					<i class="icon icon-close"></i>  
					<div class="account">
						登录商家账号
						<i class="icon icon-user" onclick="location.href='login.html'"></i>
					</div>
				</div>
				<div class="focus-title clearfix">
				<div class="tijian-box">88<span class="text-dw" onclick="fs();">分</span></div>
					<h2>首次体验需确保数据完整性</h2>
					<span class="font12"><strong>首次体验,该项将检测数据项是否完整,请立即检查</strong></span>
				</div>
				<div class="btn">
					<!-- <i class="icon icon-btn"></i> --> 
					<img class="icon icon-btn" src="img/btn-ljfx.png" id="fxbtn">
				</div>
			</div>
			<div class="foot clearfix">
				<ul class="operate-left">
					<li>
						<img class="icon icon-ll" src="img/icon-ll.png" onclick="alert('流量功能目前处于内测中,敬请期待!')">
						流量
					</li>
					<li>
						<img class="icon icon-zhl" src="img/icon-zhl.png" onclick="alert('转化率功能目前处于内测中，敬请期待!')" >
						转化率
					</li>
					<li>
						<img class="icon icon-kdj" src="img/icon-kdj.png" onclick="alert('客单价功能目前处于内测中,敬请期待!')">
						客单价
					</li>
				</ul>
				<ul class="operate-right">
					<li>
						<i class="icon icon-btyh"></i>  
						标题优化
					</li>
					<li>
						<i class="icon icon-files"></i>  
						热词榜
					</li>
					<li>
						<i class="icon icon-location"></i>  
						关键词
					</li>
					<li>
						<i class="icon icon-share"></i>  
						更多
					</li>
				</ul>
			</div>
		</div>
	</body>
</html>