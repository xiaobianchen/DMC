<%@ page language="java" contentType="text/html; charset=utf-8"
		 pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:include page="main.jsp"/>
<jsp:include page="footer.jsp"/>
<html>
<head>
	<title>登录</title>
</head>
<body class="clsbody">
<div class="header">
	<img src="img/dmc.ico" alt="DMC" class="clslogo">
	<div class="logo">
		<h1><font color="black">DMC 欢迎登录</font></h1>
	</div>
</div>

<!-- 登陆窗口 begin -->
<div class="login-module">
	<div class="login-banner">
	   <div class="inner">
			<div class="login-form">
				<form method="post" id="form">
					<i class="icon icon-close"></i>
					<div class="input-box">
						<label>
							登录名
							<input type="text" name="username" id="username" onblur="checkUserIsExist();"/>
							<span id="checkUser">用户名不能为空 </span>
						</label>
					</div>
					<div class="input-box">
						<label>
							登陆密码
							<a id="resetPwd" href="/DMC/resetPwd" class="floatR">修改登录密码</a>
							<input type="password" name="password" id="password"/>
							<span id="checkPwd">密码不能为空 </span>
							<span id="existPwd">密码不正确, 请确认</span>
						</label>
					</div>
					<div class="check-box clearfix">
						<label>
							<input type="checkbox" id="ck_rmbUser"/>记住密码
						</label>
					</div>
					<div class="btn-box">
						<img src="img/btn-login.png" style="width: 100%;" onclick="return validate_loginForm();"/>
						<label>
							<a id="register" href="/DMC/register" style="float:right;margin-top:5px;">免费注册</a>
						</label>
					</div>
				</form>
			</div>
		</div>
	</div>
</div>
</body>
</html>


