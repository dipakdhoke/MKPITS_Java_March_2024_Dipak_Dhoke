<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ page import="beanjava.Student" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bean JSP Communication Page</title>
        <style>
        body{
            color:blue;
            background-color:yellow;
        }
        </style>
    </head>
    <body>
        <!-- Use the bean -->
        <jsp:useBean id="student" class="beanjava.Student" scope="session"></jsp:useBean>
        
        <!-- Set properties from request parameters -->
        <jsp:setProperty name="student" property="name" param="nm"/>
        <jsp:setProperty name="student" property="marks" param="mk"/>

        <!-- Display the properties -->
        <h2>Student Details</h2>
        <p>Name: <jsp:getProperty name="student" property="name"/></p>
        <p>Marks: <jsp:getProperty name="student" property="marks"/></p>
        <p>Result: <%
            Student students = (Student) session.getAttribute("student");
            if (students != null) {
                out.print(students.result());
            }
        %></p>

        <!-- Form to submit data -->
       </body>
</html>
