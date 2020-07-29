<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../css/left.css">

</head>
<body>
<div class="leftbox">
		<div class="l_nav2">
			<div class="ta1">
				<strong>问答管理</strong>
				<div class="leftbgbt2"></div>
			</div>
			<div class="cdlist">
				<div>
					<a href="${pageContext.request.contextPath }/items/queryItems?pageNum=0&pageSize=5" target="body">问题列表</a>
				</div>
			</div>
			<div class="ta1">
				<strong>用户管理</strong>
				<div class="leftbgbt2"></div>
			</div>
			<div class="cdlist">
				<div>
					<a href="user/user_list.html" target="body">用户列表</a>
				</div>
				<div>
					<a href="user/user_add.html" target="body">新增用户</a>
				</div>
				<div>
					<a href="">角色列表</a>
				</div>
				<div>
					<a href="">新增角色</a>
				</div>
			</div>
			<div class="ta1">
				<strong>数据统计</strong>
				<div class="leftbgbt2"></div>
			</div>
			<div class="cdlist">
				<div>
					<a href="charts/column.html" target="body">问题统计</a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>