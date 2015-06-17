<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:include page="main.jsp"/>
<html>
	<head>
		<title></title>
	</head>
	<body>
		<div id="dialog" title="我要吐槽" style="display:none;">
					<form method="post">
						<i class="icon icon-close"></i>
						<textarea rows="15" cols="20"></textarea>
						<input type="submit" value="提交">
					</form>
		</div>
		<div class="min-window">
			<i class="icon icon-skin" style="background-image: url(img/icon-skin.png);"></i>
			<i onclick="popCover()" class="icon icon-message" style="background-image: url(img/icon-message.png);"></i>
			<i class="icon icon-down" style="background-image: url(img/icon-down.png);"></i>
			<i onclick="maxwin()" class="icon icon-minus" style="background-image: url(img/icon-minus.png);"></i>
			<i onclick="closewin()" class="icon icon-close" style="background-image: url(img/icon-close.png);"></i>
		</div>
		<div class="module"> 
			<img class="module-bg" src="img/bg1.png" />
			<div class="content"> 
				<div class="operate">
				    <i class="icon icon-skin" style="background-image: url(img/icon-skin.png);"></i> 
					<i id="opener" class="icon icon-message" style="background-image: url(img/icon-message.png);"></i> 
					<i class="icon icon-down" style="background-image: url(img/icon-down.png);"></i> 
					<i onclick="minwin()" class="icon icon-minus" style="background-image: url(img/icon-minus.png);"></i> 
					<i onclick="closewin()" class="icon icon-close" style="background-image: url(img/icon-close.png);"></i> 

					<div class="account">
						登录商家账号
						<img src="img/icon-user.png" onclick="location.href='/DMC/login'">
					</div>
				</div>
				<div class="focus-title clearfix">
				<div class="tijian-box" style="background-image: url(img/icon-tijian.png);">88<span class="text-dw" onclick="fs();">分</span></div>
					<h2>商家存在潜力,建议立即查看</h2>
				</div>
				<div class="btn">
					<img class="icon icon-btn" src="img/btn-ljfx.png" id="fxbtn" onclick="alert('立即分析!');">
				</div>
			</div>
		</div>
	</body>
</html>

