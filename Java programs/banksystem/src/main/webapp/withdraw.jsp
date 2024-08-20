<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Withdraw</title>
</head>
<body>
    <h2>Withdraw</h2>
    <form action="withdrawProcess.jsp" method="post">
        Amount: <input type="number" name="amount" required><br>
        <input type="submit" value="Withdraw">
    </form>
</body>
</html>
