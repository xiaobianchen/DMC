<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="main.jsp"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
    <div class="login-module">
			<div class="inner">
				<div class="login-bg blur"></div>
				<div class="comment-form">
					<form method="post">
						<i class="icon icon-close"></i>
						<div class="input-box">
							<label>
								我要提意见
								<textarea rows="10" cols="28" id="comments"></textarea>
							</label>
						</div>
						<div class="input-box">
							<label>
								联系方式
								<select id="contact">
								    <option>手机号码</option>
								    <option>邮箱</option>
								    <option>qq号码</option>
								</select>
								<input type="text" id="contactInfo">
							</label>
						</div>
						<div class="btn-box">
							<input type="submit" class="btnComment" value="提交" onclick="submitComment();">
						</div>
					</form>
				</div> 
			</div>
		</div>
</body>
</html>