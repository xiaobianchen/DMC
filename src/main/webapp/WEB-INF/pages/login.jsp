<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:include page="main.jsp"/>
<html>
	<head>
		<title>登录</title>
	</head>
	<body>
		<!-- 登陆窗口 begin -->
		<div class="login-module">
			<div class="inner">
				<div class="login-bg blur"></div>
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
								<input type="password" name="password" id="password"/>
								<span id="checkPwd">密码不能为空 </span>
								<span id="existPwd">密码不正确, 请确认</span>
							</label>
						</div>
						<div class="check-box clearfix">
							<label>
								<input type="checkbox" id="ck_rmbUser"/>记住密码
							</label>
							<label class="floatL">
								<a onclick="location.href='/DMC/forgetPwd'">忘记密码</a>
							</label>
							<label class="floatR">
								<a onclick="location.href='/DMC/register'">注册用户</a>
							</label>
						</div>
						<div class="btn-box">
							<img src="img/btn-login.png" style="width: 100%;" onclick="return validate_loginForm();"/>
						</div>
					</form>
				</div> 
			</div>
		</div>
	</body>
</html>


