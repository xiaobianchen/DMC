<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:include page="main.jsp"/>
<html>
<head>
   <title>注册用户</title>
</head>

<body>
	<div class="login-module">
			<div class="inner">
				<div class="login-bg blur"></div>
				<div class="register-form">
					<form method="post">
						<i class="icon icon-close"></i>
						<div class="input-box">
							<label>
								用户名
								<input type="text" name="username" id="username" onblur="checkUser();"/>
								<span id="checkUser">用户名不能为空</span>
								<span id="existUser">该用户名已经被注册</span>
							</label>
						</div>
						<div class="input-box">
							<label>
								密码
								<input type="password" name="password1"/>
								<span id="checkPwd">密码不能为空</span>
							</label>
						</div>
                        <div class="input-box">
                            <label>
                                                                                                 确认密码
                                <input type="password" name="repassword">
                                <span id="checkConfirmPwd">确认密码不能为空</span>
                                <span id="checkPwdAndConfirmPwd">确认密码与密码不一致,请确认</span>
                            </label>
                        </div>
						<div class="input-box">
                            <label>
                                                                                                 邮箱
                                <input type="text" name="email" id="email" onblur="checkEmail();"/>
                                <span id="checkEmail">请输入正确的邮箱格式</span>
                                <span id="existEmail">该邮箱已经被注册</span>
                            </label>
						</div>
						<div class="input-box">
                            <label>
                                                                                                 手机号码
                                <input type="text" name="phone" maxlength="11" onblur="checkPhone();"/>
                                <span id="checkPhone">请输入正确的手机号码</span>
                                <span id="existPhone">该手机号码已经被注册</span>
                            </label>
						</div>
						<div class="btn-box">
							<img src="img/register.png" style="width: 50%;" onclick="return validate_regForm();"/> 
						</div>
					</form>
				</div> 
			</div>
		</div>

</body>
</html>