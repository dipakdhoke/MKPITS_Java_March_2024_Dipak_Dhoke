<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="accountManagement.Transaction"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="accountManagement.TransactionEntity"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

 <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        table, th, td {
            border: 1px solid black;
        }
        th, td {
            padding: 15px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
        tr:nth-child(even) {
            background-color: #f9f9f9;
        }
        tr:hover {
            background-color: #f1f1f1;
        }
    </style>
    
</head>
<body>
<%
// accesing session
session=request.getSession(false);  //creating session 

String uid=(String)session.getAttribute("uid"); //accesing session value


List<TransactionEntity> tr_list=new ArrayList();

Transaction tr= new Transaction();

//getting list of transaction entity object
tr_list=tr.getHistory(uid);

%>


 <table>
<tr>
<th>User Id</th>
    <th>Date</th>
    <th>Amount</th>
    <th>Transaction Type</th>
</tr>

<% 
for(TransactionEntity tran:tr_list){
	
	
%>

<tr>
<td><%=tran.getUser_id()%></td>
<td><%=tran.getDate()%></td>
<td><%=tran.getAmount() %></td>
<td><%=tran.getType() %></td>
</tr>

<%
}
%>
</table>



</body>
</html>