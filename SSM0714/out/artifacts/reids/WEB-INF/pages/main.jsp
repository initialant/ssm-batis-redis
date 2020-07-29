<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>xxx系统</title>
<link rel="stylesheet" type="text/css" href="../css/main.css">
	<link href="css/table.css" rel="stylesheet" type="text/css" />
	<link href="css/list.css" rel="stylesheet" type="text/css" />
<script type="text/javascript">
   function login(){
/*	  var u = '${user}';
	  console.log(u);
      if(u == null || u == ''){
          location.href = "/webtest/login.jsp";
      }*/
   }
</script>
</head>
<body onload="login()">
	<table class="table">
		<tr class="trTop">
			<td colspan="2" class="tdTop"><iframe frameborder="0"
					src="${pageContext.request.contextPath }/showTop"></iframe></td>
		</tr>
		<tr>
			<td class="tdLeft"><iframe frameborder="0" src="${pageContext.request.contextPath }/showLeft"></iframe></td>
			<td><iframe frameborder="0" src="${pageContext.request.contextPath }/items/queryItems?pageNum=0&pageSize=5" name="body"></iframe></td>
		</tr>
	</table>
</body>
</html>