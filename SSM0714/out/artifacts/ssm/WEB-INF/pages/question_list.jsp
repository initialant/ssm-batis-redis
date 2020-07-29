<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jstl/fmt_rt"%>
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
		问题管理 &gt; <a href="#">问题列表</a>
	</h2>
	<div class="cztable">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tbody>
				<tr style="height: 25px" align="center">
					<th scope="col">编号</th>
					<th scope="col">标题</th>
					<th scope="col">发表人</th>
					<th scope="col">类型</th>
					<th scope="col">创建时间</th>
					<th scope="col">修改时间</th>
					<th scope="col">状态</th>
					<th scope="col">操作</th>
				</tr>
				<c:forEach var="qu" items="${pages.list }" varStatus="status">
					<tr align="center">
						<td>${status.count }</td>
						<td>${qu.title }</td>
						<td>${qu.publish }</td>
						<td>${qu.qtype }</td>
						<td>${qu.createTime }</td>
						<td>${qu.updateTime }</td>
						<td>
						  <c:choose>
						     <c:when test="${qu.qstate == 1}">
						         有效
						     </c:when>
						      <c:when test="${qu.qstate == 0}">
						         无效
						     </c:when>
						  </c:choose>
						  
						</td>
						<td><a href="javascript:;" onclick="">[删除]</a> &nbsp;<a
							href="${pageContext.request.contextPath }/question?method=update&id=${qu.id }" onclick="">[修改]</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<div class="page">
		<div>
			<a href="${pageContext.request.contextPath }/question?method=list&currentPage=1&pageSum=10" target="_self">首页</a>
		</div>
		<c:choose>
		  <c:when test="${pages.currentPage eq 1 }">
		    <span>上一页</span>
		  </c:when>
		  <c:otherwise>
		    <div>
			  <a href="${pageContext.request.contextPath }/question?method=list&currentPage=${pages.currentPage -1 }&pageSum=10" target="_self">上一页</a>
		    </div>
		  </c:otherwise>
		</c:choose>
		<c:choose>
		  <c:when test="${pages.currentPage eq pages.totalPages }">
		    <span>下一页</span>
		  </c:when>
		  <c:otherwise>
		    <div>
			<a href="${pageContext.request.contextPath }/question?method=list&currentPage=${pages.currentPage + 1}&pageSum=10" target="_self">下一页</a>
		</div>
		  </c:otherwise>
		</c:choose>
		
		<div>
			<a href="${pageContext.request.contextPath }/question?method=list&currentPage=${pages.totalPages }&pageSum=10" target="_self">尾页</a>
		</div>
		<div>
			总共<b>${pages.totalRecords }</b>条数据
		</div>
		<div>
			每页<b>${pages.pageSum }</b>条数据
		</div>
		<div>
			<0.b>${pages.currentPage }</b>/${pages.totalPages }
		</div>
		<div class="search">
			<input type="text" id="john_Page_Search"
				onkeydown="if(event.keyCode == 13){page_searchIndex();}">
		</div>
		<div>
			<input type="button" value="Go" onclick="page_searchIndex()">
		</div>
	</div>
</body>
</html>