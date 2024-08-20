<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="beanlogin.AccountHolder" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <h1>Login</h1>
    <form action="login.jsp" method="post">
        <label for="name">Username:</label>
        <input type="text" id="name" name="name" required><br>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required><br>
        <input type="submit" value="Login">
    </form>

    <%
        if (request.getMethod().equalsIgnoreCase("POST")) {
            String name = request.getParameter("name");
            String password = request.getParameter("password");

            AccountHolder user = new AccountHolder(name, password);
            if (user.validateUser()) {
                session.setAttribute("user", user);
                response.sendRedirect("index.jsp");
            } else {
                out.println("<p>Invalid username or password</p>");
            }
        }
    %>
</body>
</html>
