<%@ page language="java" import="java.sql.*" %>
<%
    // Assuming you have a session attribute "userid" set after login
    String userid = (String) session.getAttribute("userid");
    double amount = Double.parseDouble(request.getParameter("amount"));

    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "rooy", "Dipak@123");

        // First, check if the balance is sufficient
        String checkBalanceSql = "SELECT balance FROM accountholder WHERE userid = ?";
        stmt = conn.prepareStatement(checkBalanceSql);
        stmt.setString(1, userid);

        rs = stmt.executeQuery();
        if (rs.next()) {
            double balance = rs.getDouble("balance");
            if (balance >= amount) {
                // Proceed with withdrawal
                String sql = "UPDATE accountholder SET balance = balance - ? WHERE userid = ?";
                stmt = conn.prepareStatement(sql);
                stmt.setDouble(1, amount);
                stmt.setString(2, userid);

                int rows = stmt.executeUpdate();
                if (rows > 0) {
                    out.println("Withdrawal successful!");
                } else {
                    out.println("Withdrawal failed.");
                }
            } else {
                out.println("Insufficient balance.");
            }
        } else {
            out.println("User not found.");
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        if (rs != null) try { rs.close(); } catch (SQLException ignore) {}
        if (stmt != null) try { stmt.close(); } catch (SQLException ignore) {}
        if (conn != null) try { conn.close(); } catch (SQLException ignore) {}
    }
%>
