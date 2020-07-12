<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
<div>添加用户</div>
<div><a href="/">返回首页</a></div>
<div>
<form action="/user/addUser" method="post">
    <%--id <input type="text" name="id">--%>
    用户名 <input type="text" name="username"> <br/>
    密码 <input type="text" name="password"><br/>
    邮箱  <input type="text" name="email"><br/>
    手机号  <input type="text" name="mobile"><br/>
        <input type="reset">
        <input type="submit">
</form>
</div>
</body>
</html>

