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
			<form class="form-horizontal" role="form"> <!-- method="post" action="user/login1" > -->
				<div class="form-group">
					<label for="firstname" class="col-sm-2 control-label">账号</label>
					<div class="col-sm-10">
						<input type="text" name="login" class="form-control" id="firstname" placeholder="请输入用户名/邮箱/手机号">
					</div>
				</div>
				<div class="form-group">
					<label for="lastname" class="col-sm-2 control-label">密码</label>
					<div class="col-sm-10">
						<input type="text" name="password" class="form-control" id="lastname" placeholder="请输密码">
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
						<!-- <button type="submit" class="btn btn-default" id="submission">登录</button> -->
						<input type="button" class="btn btn-default" id="submission" value="登录">
					</div>
				</div>
			</form>
		</div>
		
		<script type="application/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
		<script type="application/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
		<script type="application/javascript" src="${pageContext.request.contextPath}/js/login.js"></script>
	</body>

</html>