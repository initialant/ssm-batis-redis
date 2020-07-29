<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/css.css">
<link href="css/table.css" rel="stylesheet" type="text/css" />
<link href="css/list.css" rel="stylesheet" type="text/css" />
</head>
<body>
<h2 class="mbx">
		用户管理 &gt;新增用户
	</h2>
	<div class="cztable">
		<table width="100%" cellpadding="0" cellspacing="0">
			<tbody>
				<tr>
					<td align="right" width="80">标题：</td>
					<td><input type="text" name="title" value="${qu.title }"></td>
					<td align="right" width="90">身份证号码：</td>
					<td>430181198612113330&nbsp;</td>
				</tr>
				<tr>
					<td align="right">性别：</td>
					<td>男&nbsp;</td>
					<td align="right">状态：</td>
					<td>有效</td>
				</tr>
				<tr>
					<td align="right">手机号码：</td>
					<td>15111141999</td>
					<td align="right">电子邮箱：</td>
					<td></td>
				</tr>
				<tr>
					<td align="right">角色：</td>
					<td colspan="4"></td>
				</tr>
				<tr>
					<td align="right">联系地址：</td>
					<td colspan="4"></td>
				</tr>
				<tr align="center">
					<td colspan="5" height="40">
						<div align="center">

							<input type="button" id="button2" value="保存用信息"
								onclick="submitMail()" class="input2">
						</div>
					</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>