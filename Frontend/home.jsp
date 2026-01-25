<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home - Ghumantey</title>
    <link rel="stylesheet" href="<c:url value='/css/styles.css' />">
</head>
<body>
    <header>
        <h1>Welcome to Ghumantey</h1>
        <hr>
    </header>

    <section>
        <h2>Hello, <c:out value="${username}" />!</h2>
        <p>Your role: <c:out value="${role}" /></p>
        <p>You are successfully logged in.</p>
    </section>

    <nav>
        <ul>
            <li><a href="<c:url value='/profile' />">Profile</a></li>
            <li><a href="<c:url value='/logout' />">Logout</a></li>
        </ul>
    </nav>

    <footer>
        <hr>
        <p>&copy; 2026 Ghumantey. All rights reserved.</p>
    </footer>
</body>
</html>
