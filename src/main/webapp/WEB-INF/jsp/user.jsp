<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户信息</title>
</head>
<body>
<div>用户信息</div>
<div><a href="/">返回首页</a></div>
<div>
    <ul>
        <li>用户id: ${requestScope.user.id}</li>
        <li>用户名字username: ${requestScope.user.username}</li>
        <li>用户邮箱email: ${requestScope.user.email}</li>
        <li>用户手机号mobile: ${requestScope.user.mobile}</li>
    </ul>

    <ul>
        <li>用户id: ${user.id}</li>
        <li>用户名字username: ${user.username}</li>
        <li>用户邮箱email:  ${user.email}</li>
        <li>用户手机号mobile:${user.mobile}</li>
    </ul>
</div>
</body>
</html>

