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
<div class="cztable">
    <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tbody>
        <tr style="height: 25px" align="center">
            <th scope="col">编号</th>
            <th scope="col">商品名称</th>
            <th scope="col">商品价格</th>
            <th scope="col">上架时间</th>
            <th scope="col">操作</th>
        </tr>
        <c:forEach var="qu" items="${pageInfo.list }" varStatus="status">
            <tr align="center">
                <td>${status.count }</td>
                <td>${qu.name }</td>
                <td>${qu.price }</td>
                <td>${qu.createDate }</td>
                <td>
                    <a href="${pageContext.request.contextPath }/items/deleteItems?pageNum=${pageInfo.pageNum }&pageSize=5&id=${qu.id }" target="_self">删除</a>
                    <a href="${pageContext.request.contextPath }/items/trans?id=${qu.id }" target="_self">修改</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<div class="page">
    <div>
        <a href="${pageContext.request.contextPath }/items/queryItems?pageNum=1&pageSize=10" target="_self">首页</a>
    </div>
    <c:choose>
        <c:when test="${pageInfo.isFirstPage}">
            <span>上一页</span>
        </c:when>
        <c:otherwise>
            <div>
                <a href="${pageContext.request.contextPath }/items/queryItems?pageNum=${pageInfo.pageNum -1 }&pageSize=10" target="_self">上一页</a>
            </div>
        </c:otherwise>
    </c:choose>
    <c:choose>
        <c:when test="${pageInfo.isLastPage }">
            <span>下一页</span>
        </c:when>
        <c:otherwise>
            <div>
                <a href="${pageContext.request.contextPath }/items/queryItems?pageNum=${pageInfo.pageNum + 1}&pageSize=10" target="_self">下一页</a>
            </div>
        </c:otherwise>
    </c:choose>

    <div>
        <a href="${pageContext.request.contextPath }/items/queryItems?pageNum=${pageInfo.pages }&pageSize=10" target="_self">尾页</a>
    </div>
    <div>
        总共<b>${pageInfo.total }</b>条数据
    </div>
    <div>
        每页<b>${pageInfo.pageSize }</b>条数据
    </div>
    <div>
        <b>${pageInfo.pageNum }</b>/${pageInfo.total }
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