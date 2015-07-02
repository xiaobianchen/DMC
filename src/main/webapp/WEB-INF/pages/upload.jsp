<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>upload</title>
</head>
<body>
   <form method="post" enctype="multipart/form-data" action="singleSave">
		Upload File: <input type="file" name="file">
	    <input type="submit" value="Upload"> 
	</form>
</body>
</html>