<%--
  Created by IntelliJ IDEA.
  User: pankx
  Date: 2020/3/11
  Time: 4:02 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>ssm整合开发小实例</title>
</head>
<body>
<h1>新增一条用户信息</h1>
<hr/>
<form action="user/testsave" method="post">
    用户名：<input type="text" name="userName"/><br/>
    密码：<input type="text" name="password"/><br/>
    <input type="submit" value="新增"/>
</form>
<hr/>
<a href="user/testfindAll">查询所有用户</a>
</html>