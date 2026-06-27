<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <title>SSH 管理系统</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/app.css">
</head>
<body>
<header class="topbar">
    <div>SSH 管理系统</div>
    <nav>
        <span>${sessionScope.loginUser.realName}</span>
        <a href="${pageContext.request.contextPath}/logout">退出</a>
    </nav>
</header>
<div class="layout">
    <aside class="sidebar">
        <a class="active" href="${pageContext.request.contextPath}/index">首页</a>
        <a href="${pageContext.request.contextPath}/user-list">用户管理</a>
    </aside>
    <main class="content">
        <h1>系统首页</h1>
        <section class="metrics">
            <div>
                <strong>SSH</strong>
                <span>Struts2 + Spring + Hibernate</span>
            </div>
            <div>
                <strong>数据库</strong>
                <span>ssh_admin_system</span>
            </div>
            <div>
                <strong>默认账号</strong>
                <span>admin / 123456</span>
            </div>
        </section>
    </main>
</div>
</body>
</html>
