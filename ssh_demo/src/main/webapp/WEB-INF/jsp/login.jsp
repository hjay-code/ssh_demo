<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!doctype html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <title>SSH 管理系统登录</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/app.css">
</head>
<body class="login-page">
<main class="login-panel">
    <h1>SSH 管理系统</h1>
    <s:if test="hasActionErrors()">
        <div class="error"><s:actionerror/></div>
    </s:if>
    <form action="${pageContext.request.contextPath}/login" method="post">
        <label>
            用户名
            <input type="text" name="username" value="admin" autocomplete="username" required>
        </label>
        <label>
            密码
            <input type="password" name="password" value="123456" autocomplete="current-password" required>
        </label>
        <button type="submit">登录</button>
    </form>
</main>
</body>
</html>
