<%@page import="accountManagement.Transaction"%>
<%@page import="accountManagement.Account"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<link rel="stylesheet" href="sucess_failed_page.css">
</head>
<body>
<!-- loading bean Account -->
<jsp:useBean id="acc" class="accountManagement.Account" scope="page"/>

<jsp:setProperty property="user_id" name="acc" param="user_id"/>
<jsp:setProperty property="password" name="acc" param="password"/>
<jsp:setProperty property="name" name="acc" param="name"/>
<jsp:setProperty property="address" name="acc" param="address"/>
<jsp:setProperty property="city" name="acc" param="city"/>
<jsp:setProperty property="balance" name="acc" param="balance"/>

<%
//creating transaction object for 
      Transaction tr = new Transaction();
		
//calling getRegister method
		int flag=tr.getRegister(acc); 

if(flag==1){		
		
%>
   <!-- showing success page -->
    <div class="container">
        <div class="message">
            <h1>Successfully Registered</h1>
            <a href="index.html" class="home-link">Login</a>
        </div>
        </div>
<% 
}
else
{
%>
 <!-- showing unsuccess page -->
    <div class="container">
        <div class="message">
            <h1>Registration Failed</h1>
            <a href="index.html" class="home-link">Login</a>
        </div>
        </div>

<%
}
%>
</body>
</html>