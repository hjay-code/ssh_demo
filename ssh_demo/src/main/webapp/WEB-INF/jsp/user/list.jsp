<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!doctype html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <title>用户管理</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/app.css">
</head>
<body>
<header class="topbar">
    <div>SSH 管理系统</div>
    <nav>
        <a href="${pageContext.request.contextPath}/index">首页</a>
        <a href="${pageContext.request.contextPath}/logout">退出</a>
    </nav>
</header>
<div class="layout">
    <aside class="sidebar">
        <a href="${pageContext.request.contextPath}/index">首页</a>
        <a class="active" href="${pageContext.request.contextPath}/user-list">用户管理</a>
    </aside>
    <main class="content">
        <h1>用户管理</h1>
        <table>
            <thead>
            <tr>
                <th>ID</th>
                <th>用户名</th>
                <th>姓名</th>
                <th>邮箱</th>
                <th>状态</th>
                <th>创建时间</th>
            </tr>
            </thead>
            <tbody>
            <s:iterator value="users">
                <tr>
                    <td><s:property value="id"/></td>
                    <td><s:property value="username"/></td>
                    <td><s:property value="realName"/></td>
                    <td><s:property value="email"/></td>
                    <td><s:if test="status == 1">启用</s:if><s:else>停用</s:else></td>
                    <td><s:property value="createTime"/></td>
                </tr>
            </s:iterator>
            </tbody>
        </table>
    </main>
</div>
</body>
</html>
