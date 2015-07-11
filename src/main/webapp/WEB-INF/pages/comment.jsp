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
					<form method="post" enctype="multipart/form-data" id="form1">
						<div class="input-box">
							<label>
							    <a style="float:right;" id="listComments" href="/DMC/list">查看所有评论</a>
								您有什么问题或建议想对我们说?
								<textarea rows="10" cols="34" id="comments"></textarea>
								<span id="details">您的建议是我们工作最大的动力</span>
							</label>
						</div>
						<div class="input-box">
							<label>
								联系方式
								<select id="contact">
								    <option>Phone</option>
								    <option>Email</option>
								    <option>QQ</option>
								</select>
								<input type="text" id="contactInfo"/>
								<span id="info">请填写您的联系方式,以方便我们能尽快联系您</span>
							</label>
						</div>
					<!--<div class="input-box">
							<label>
							            上传图片
								<input type="file" name="file">
							</label>
						</div> -->
						<div class="btn-box">
						    <input type="submit" value="提交问题" class="button red" onclick="return submitComment();">
							<!-- <input type="button" value="提交问题" class="button red" onclick="return submitComment();"> -->
							<!-- <img src="img/btnsubmit.png" onclick="return submitComment();"> -->
						</div>
					</form>
				
				</div> 
			</div>
		</div>
</body>
</html>