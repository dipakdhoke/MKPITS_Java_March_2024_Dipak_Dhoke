<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ page import="beanlogin.beanclass" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Data Management</title>
    </head>
    <body>
        <h1>Insert Student Data</h1>
        <form action="index.jsp" method="post">
            <label for="rollno">Roll No:</label>
            <input type="number" id="rollno" name="rollno" required><br>
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" required><br>
            <label for="city">City:</label>
            <input type="text" id="city" name="city" required><br>
            <label for="address">Address:</label>
            <input type="text" id="address" name="address" required><br>
            <input type="submit" value="Submit">
        </form>

        <%
            if (request.getParameter("rollno") != null) {
                int rollno = Integer.parseInt(request.getParameter("rollno"));
                String name = request.getParameter("name");
                String city = request.getParameter("city");
                String address = request.getParameter("address");

                beanclass student = new beanclass(rollno, name, city, address);
                student.insertdata();
            }
        %>

        <h1>Student Data</h1>
        <%
            beanclass student = new beanclass();
            List<beanclass> students = student.showData();

            if (!students.isEmpty()) {
                for (beanclass stu : students) {
                    out.println("<ul>");
                    out.println("<li>Roll No: " + stu.getRollno() + "</li>");
                    out.println("<li>Name: " + stu.getName() + "</li>");
                    out.println("<li>City: " + stu.getCity() + "</li>");
                    out.println("<li>Address: " + stu.getAddress() + "</li>");
                    out.println("</ul>");
                }
            } else {
                out.println("<p>No data found.</p>");
            }
        %>
       <h1><a href="login.html"> login page</a></h1>
    </body>
</html>