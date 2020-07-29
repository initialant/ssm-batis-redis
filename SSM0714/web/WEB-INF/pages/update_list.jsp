<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jstl/fmt_rt"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <link rel="stylesheet" type="text/css" href="../css/css.css">
    <link href="../css/table.css" rel="stylesheet" type="text/css" />
    <link href="../css/list.css" rel="stylesheet" type="text/css" />
</head>
<body>
<h2 class="mbx">
    问题管理 &gt; <a href="#">问题列表</a>
</h2>

<form action="${pageContext.request.contextPath }/items/updateItem" method="get">
    <label>修改目标id：</label><input type="text" name="id" value="${id} "><br><hr>
    <label>新页面显示第</label><input type="text" name="pageSize" value="0">页<br><hr>
    <label>新页面每页条数：</label><input type="text" name="pageNum" value="5"><br><hr>
    <label>修改name：</label><input type="text" name="name"><br><hr>
    <label>修改price：</label><input type="text" name="price"><br><hr>
</select><br><hr>
    <input type="submit" value="确认修改">
</form>
</body>
</html>