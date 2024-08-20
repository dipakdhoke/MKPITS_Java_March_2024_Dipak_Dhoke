<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="accountManagement.Transaction" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="sucess_failed_page.css">
</head>
<body>
<%
//accesing session
session=request.getSession(false);  //creating session 

String uid=(String)session.getAttribute("uid"); //accesing session value

Transaction tr= new Transaction();

int bal=tr.getBal(uid);

%>

 <div class="container">
  <div class="message">
     <h1>BALANCE : <%=bal%></h1>
     <a href="home.html" class="home-link">Home</a>
       </div>
        </div>
</body>
</html>