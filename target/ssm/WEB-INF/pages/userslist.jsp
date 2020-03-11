<%--
  Created by IntelliJ IDEA.
  User: pankx
  Date: 2020/3/11
  Time: 4:08 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>所有用户信息</title>
</head>
<body>
<h1>所有用户信息如下</h1>
<hr/>
    <c:forEach items="${userslist}" var="user">
        ${user}<br/>
    </c:forEach>
</body>
</html>
