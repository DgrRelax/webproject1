<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title>登陆</title>
	</head>

	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css"/>
	
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css"/>
	
	<body>
		
		<div id="title">
			<h1>登&emsp;&emsp;陆</h1>
		</div>
		
		<div id="outer">
			<form class="form-horizontal" role="form">
				<div class="form-group">
					<label for="firstname" class="col-sm-2 control-label">账号</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="firstname" placeholder="请输入用户名/邮箱/手机号">
					</div>
				</div>
				<div class="form-group">
					<label for="lastname" class="col-sm-2 control-label">密码</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="lastname" placeholder="请输密码">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<div class="checkbox">
							<label><input type="checkbox"> 请记住我</label>
						</div>
					</div>
				</div>
				<div class="form-group but">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-default">登录</button>
					</div>
				</div>
			</form>
		</div>
		
		<script type="application/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1/jquery-3.3.1.min.js"></script>
		<script type="application/javascript" src="${pageContext.request.contextPath}/js/bootstrap/bootstrap.min.js"></script>
	</body>

</html>