<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="main.jsp"/>
<jsp:include page="footer.jsp"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>重置密码</title>
<style type="text/css">
	.header{
		width: 990px;
		margin: 0 auto;
	}
</style>
</head>
<body style="position: fixed;width: 100%; height: 100%">

	<div class="header">
		<div id="logo">
			<h1><font color="black">DMC 欢迎您</font></h1>
		</div>
	</div>
    <div class="login-module">
		<div class="login-banner" style="background-color: #ff283c">
			<div class="inner">
				<div class="reset-form">
					<form method="post">
					    <div class="input-box">
							<label>
								用户名
								<input type="text" id="username"/>
								<span id="checkUserName">用户名不能为空</span>
							</label>
						</div>
						<div class="input-box">
							<label>
								原始密码
								<input type="password" id="oldpwd"/>
								<span id="checkoldPwd">原始密码不能为空</span>
								<span id="checkoldPassword">原始密码不正确,请确认</span>
							</label>
						</div>
						<div class="input-box">
							<label>
								新密码
								<input type="password" id="newpwd"/>
								<span id="checknewPwd">新密码不能为空</span>
							</label>
						</div>
						<div class="input-box">
							<label>
								确认新密码
								<input type="password" id="confirmNewPwd"/>
								<span id="checkconfirmNewPwd">确认新密码不能为空</span>
								<span id="checkNewConfirmPwd">新密码与确认密码不一致</span>
							</label>
						</div>
						<div class="btn-box">
						    <img src="img/reset.png" style="width: 75%;" onclick="return resetPwd();"/>
						    <!--  <input type="button" value="更改密码" class="button red" onclick="return resetPwd();">  -->
						</div>
					</form>
				</div> 
			</div>
		</div>
</body>
</html>