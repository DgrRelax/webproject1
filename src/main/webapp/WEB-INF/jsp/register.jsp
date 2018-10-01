<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册</title>
</head>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css"/>
	
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/register.css"/>
	
<body>
		
	<div id="title">
		<h1>注&emsp;&emsp;册</h1>
	</div>
	
	<div id="outer">
		<form class="form-horizontal" role="form">
			<div class="form-group">
				<div class="col-sm-10">
					<input type="text" class="form-control" id="firstname" placeholder="请输入用户名">
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-10">
					<input type="text" class="form-control" id="lastname" placeholder="请输入邮箱">
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-10">
					<input type="text" class="form-control" id="lastname" placeholder="请输入电话号码">
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-10">
					<input type="text" class="form-control" id="lastname" placeholder="设置密码">
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-10">
					<input type="text" class="form-control" id="lastname" placeholder="确认密码">
				</div>
			</div>
			<div class="form-group but">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-default">注册</button>
				</div>
			</div>
		</form>
	</div>
	
	<script type="application/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1/jquery-3.3.1.min.js"></script>
	<script type="application/javascript" src="${pageContext.request.contextPath}/js/bootstrap/bootstrap.min.js"></script>
</body>
</html>