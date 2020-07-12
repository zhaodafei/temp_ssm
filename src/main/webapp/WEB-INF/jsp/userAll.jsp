<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户信息</title>
</head>
<body>
<div>用户信息</div>
<div><a href="/">返回首页</a></div>
<div>
    <%--<ul>--%>
    <%--<li>用户id: ${requestScope.userAll.id}</li>--%>
    <%--<li>用户名字username: ${requestScope.userAll.username}</li>--%>
    <%--<li>用户邮箱email: ${requestScope.userAll.email}</li>--%>
    <%--<li>用户手机号mobile: ${requestScope.userAll.mobile}</li>--%>
    <%--</ul>--%>

    <table border="2">
        <thead>
        <tr>
            <td>id</td>
            <td>用户名</td>
            <td>邮箱</td>
            <td>手机号</td>
            <td>密码</td>
            <td>详细</td>
            <td>删除</td>
        </tr>
        </thead>
        <c:forEach items="${userAll}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.username}</td>
                <td>${user.email}</td>
                <td>${user.mobile}</td>
                <td>${user.password}</td>
                <td><a href="/user/selectOne?id=${user.id}">详细</a></td>
                <td><a href="/user/deleteUser?id=${user.id}">删除</a></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>