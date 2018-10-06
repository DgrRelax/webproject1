<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>成功</title>
</head>
<body>
	<h1>success</h1>
	<br>
	
	${requestScope.user}
	<br>
	${requestScope.user.id}
	<br>
	${requestScope.user.datatime}
	
	
</body>
</html>