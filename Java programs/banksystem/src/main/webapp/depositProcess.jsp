<%@ page language="java" import="java.sql.*" %>
<%
    // Assuming you have a session attribute "userid" set after login
    String userid = (String) session.getAttribute("userid");
    double amount = Double.parseDouble(request.getParameter("amount"));

    Connection conn = null;
    PreparedStatement stmt = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "rooy", "Dipak@123");

        String sql = "UPDATE accountholder SET balance = balance + ? WHERE userid = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setDouble(1, amount);
        stmt.setString(2, userid);

        int rows = stmt.executeUpdate();
        if (rows > 0) {
            out.println("Deposit successful!");
        } else {
            out.println("Deposit failed.");
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        if (stmt != null) try { stmt.close(); } catch (SQLException ignore) {}
        if (conn != null) try { conn.close(); } catch (SQLException ignore) {}
    }
%>
