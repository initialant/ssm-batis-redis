<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
    font-size: 10pt;
	background: #358edd;
	margin: 5px;
	color: #ffffff;
}

a {
	text-decoration: none;
	color: #ffffff;
}
</style>
<script type="text/javascript">
    function logout(){
    	location.href = "${pageContext.request.contextPath }/WEB-INF/pages/login.jsp";
    }
</script>
</head>
<body>
    <div align="right">
		欢迎：${user.userName }&nbsp;&nbsp;|&nbsp;&nbsp; 
		<a href="user/password.html" target="body">修改密码</a>&nbsp;&nbsp;|&nbsp;&nbsp;
		<a href="javascript:" onclick="logout()" target="main.jsp">退出</a>
	</div>
</body>
</html>