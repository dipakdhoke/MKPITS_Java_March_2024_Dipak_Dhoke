<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="beanlogin.AccountHolder" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Deposit</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <%
        AccountHolder user = (AccountHolder) session.getAttribute("user");
        if (user == null) {
            response.sendRedirect("login.jsp");
        }
    %>

    <h1>Deposit Money</h1>
    <form action="deposite.jsp" method="post">
        <label for="amount">Amount:</label>
        <input type="number" id="amount" name="amount" required><br>
        <input type="submit" value="Deposit">
    </form>

    <%
        if (request.getMethod().equalsIgnoreCase("POST")) {
            double amount = Double.parseDouble(request.getParameter("amount"));
            if (user.deposit(amount)) {
                out.println("<p>Deposit successful. New balance: " + user.getBalance() + "</p>");
            } else {
                out.println("<p>Deposit failed. Please try again.</p>");
            }
        }
    %>
    <a href="index.jsp">Back to Home</a>
</body>
</html>
