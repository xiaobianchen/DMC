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
			<form action="">
			    <textarea rows="10" cols="10"></textarea>
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
				<div class="logo">
					<img src="img/icon-shan.png"/>
					<span>DMC商城卫士旗舰版</span>
				</div>
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
					<h2>首次体验需确保数据完整性</h2>
					<span class="font12"><strong>首次体验,该项将检测数据项是否完整,请立即检查</strong></span>
				</div>
				<div class="btn">
					<img class="icon icon-btn" src="img/btn-ljfx.png" id="fxbtn" onclick="alert('立即分析!');">
				</div>
			</div>
			<div class="foot clearfix">
				<ul class="operate-left">
					<li>
						<img class="icon icon-ll" src="img/icon-ll.png" onclick="location.href='/DMC/flow'">
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
						<img alt="标题优化" src="img/icon-btyh.png" onclick="alert('标题优化功能程序员哥哥正在倾力研发中,亲不要着急哦')">
						标题优化
					</li>
					<li>
						<img alt="热词榜" src="img/icon-files.png" onclick="alert('热词榜功能程序员哥哥正在倾力研发中,亲不要着急哦')">
						热词榜
					</li>
					<li>
						<img alt="关键词" src="img/icon-location.png" onclick="alert('关键词功能目前处于内测中,敬请期待!')">
						关键词
					</li>
					<li>
						<img alt="更多" src="img/icon-share.png" onclick="alert('该功能目前尚未开发,感谢您的关注')">
						更多
					</li>
				</ul>
			</div>
		</div>
	</body>
</html>

