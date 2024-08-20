<%@ page language="java" import="java.sql.*" %>
<%
    String userid = request.getParameter("userid");
    String password = request.getParameter("password");

    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "rooy", "Dipak@123");

        String sql = "SELECT * FROM accountholder WHERE userid = ? AND password = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, userid);
        stmt.setString(2, password);

        rs = stmt.executeQuery();

        if (rs.next()) {
            out.println("Login successful!");
            // Redirect to account page or dashboard
        } else {
            out.println("Invalid userid or password");
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        if (rs != null) try { rs.close(); } catch (SQLException ignore) {}
        if (stmt != null) try { stmt.close(); } catch (SQLException ignore) {}
        if (conn != null) try { conn.close(); } catch (SQLException ignore) {}
    }
%>
