<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="beanlogin.AccountHolder" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Home</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <%
        AccountHolder user = (AccountHolder) session.getAttribute("user");
        if (user == null) {
            response.sendRedirect("login.jsp");
        } else {
    %>
    <h1>Welcome, <%= user.getName() %>!</h1>
    <p>Your current balance: <%= user.getBalance() %></p>
    
    <a href="deposite.jsp">Deposit Money</a><br>
    <a href="withdraw.jsp">Withdraw Money</a><br>
    <a href="logout.jsp">Logout</a>
    
    <%
        }
    %>
</body>
</html>
