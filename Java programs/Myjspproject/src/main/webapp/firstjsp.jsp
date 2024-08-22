<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>my first jsp</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f2f2f2;
        color: #333;
        text-align: center;
    }
    h1 {
        color: #0980ff;
    }
    table {
        border-collapse: collapse;
        width: 80%;
        margin: 20px auto;
        background-color: #fff;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }
    th, td {
        padding: 12px;
        text-align: left;
        border-bottom: 1px solid #ddd;
    }
    th {
        background-color: #00d9ff;
        color: white;
    }
    tr:hover {
        background-color: #f5f5f5;
    }
</style>
</head>
<body>
<h1>My First JSP</h1>
<%
try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ourdb","root","Dipak@123");
	
	Statement statement = con.createStatement();
    ResultSet resultSet = statement.executeQuery("select * from sd");

    out.println("<table border='2' align='center'>");
    out.println("<tr><th>RollNo</th><th>Name</th><th>Address</th><th>City</th></tr>");
    while (resultSet.next()) {
        out.println("<tr>");
        out.println("<td>" + resultSet.getString(1) + "</td>");
        out.println("<td>" + resultSet.getString(2) + "</td>");
        out.println("<td>" + resultSet.getString(3) + "</td>");
        out.println("<td>" + resultSet.getString(4) + "</td>");
        out.println("</tr>");
    }
    out.println("</table>");

    con.close();
}
	catch(Exception e)
	{
		out.println("Error: " + e.getMessage());
	}
%>
</body>
</html>