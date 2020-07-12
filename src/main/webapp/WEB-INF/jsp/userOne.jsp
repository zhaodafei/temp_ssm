<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户信息</title>
</head>
<body>
<div>用户个人信息</div>
<div><a href="/">返回首页</a></div>
<div>
    <ul>
        <li>用户id: ${user.id}</li>
        <li>用户名字: ${user.username}</li>
        <li>用户邮箱:  ${user.email}</li>
        <li>用户手机号:${user.mobile}</li>
    </ul>
</div>
</body>
</html>

