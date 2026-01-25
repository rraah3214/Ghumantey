<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login - Ghumantey</title>
</head>
<body>
    <h2>Login</h2>

    <% 
        String success = request.getParameter("signupSuccess");
        if (success != null) { 
    %>
        <p style="color: green;">Signup successful! Please login below.</p>
    <% } %>

    <form action="${pageContext.request.contextPath}/perform_login" method="post">
        <label>Username:</label>
        <input type="text" name="username" required><br>

        <label>Password:</label>
        <input type="password" name="password" required><br>

        <button type="submit">Login</button>
    </form>

    <p>Don’t have an account? 
        <a href="${pageContext.request.contextPath}/signup">Signup here</a>
    </p>
</body>
</html>
