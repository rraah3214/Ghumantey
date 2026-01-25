<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Signup - Ghumantey</title>
</head>
<body>
    <h2>Signup Form</h2>

    <form action="${pageContext.request.contextPath}/register" method="post">
        <label>Email:</label>
        <input type="email" name="email" required><br>

        <label>Username:</label>
        <input type="text" name="username" required><br>

        <label>Password:</label>
        <input type="password" name="password" required><br>

        <label>Confirm Password:</label>
        <input type="password" name="cpassword" required><br>

        <label>Role:</label>
        <select name="authority" required>
            <option value="ROLE_USER">User</option>
            <option value="ROLE_ADMIN">Admin</option>
        </select><br><br>

        <button type="submit">Signup</button>
    </form>

    <p>Already have an account? 
        <a href="${pageContext.request.contextPath}/login">Login here</a>
    </p>

    <!-- ✅ Optional JavaScript alert before redirect -->
    <script>
        <% if (request.getParameter("signupSuccess") != null) { %>
            alert("Signup successful! Please login now.");
            window.location.href = "<%=request.getContextPath()%>/login";
        <% } %>
    </script>
</body>
</html>
