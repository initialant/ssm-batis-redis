<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="../css/css.css">
<link rel="stylesheet" type="text/css" href="../css/login.css">

<title>XXX系统</title>
<script type="text/javascript">
	//退出
	function login() {
		window.location = "main.html";
	}
</script>
</head>
<body>
     <form class="form-signin" method="get" action="${pageContext.request.contextPath }/user/checkUser">
		<h1 class="mb-3">问答管理系统</h1>
		<h2>${message }</h2>
		<input type="text" id="inputEmail" name="name" class="form-control" placeholder="请输入用户名">
		<input type="password" id="inputPassword" name="password" class="form-control" placeholder="请输入密码">
		<div class="checkbox mb-1">
			<label> <input type="checkbox" name="remember" value="remember-me">
				记住密码
			</label>
		</div>
		
		<button class="btn btn-lg btn-primary btn-block" type="submit">
			登录
		</button>
	</form>
</body>
</html>