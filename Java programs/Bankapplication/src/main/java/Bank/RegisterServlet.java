package Bank;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String city = request.getParameter("city");
        String address = request.getParameter("address");
        String balance = request.getParameter("balance");
        String password = request.getParameter("password");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "Dipak@123");

            String query = "INSERT INTO AccountHolders (name, city, address, balance, password) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, name);
            pstmt.setString(2, city);
            pstmt.setString(3, address);
            pstmt.setString(4, balance);
            pstmt.setString(5, password);

            int result = pstmt.executeUpdate();
            if (result > 0) {
                out.println("<h3>Registration successful!</h3>");
                out.println("<a href='login.html'>Login here</a>");
            } else {
                out.println("<h3>Registration failed!</h3>");
            }

            pstmt.close();
            conn.close();
        } catch (Exception e) {
            out.println("<h3>Error: " + e.getMessage() + "</h3>");
            e.printStackTrace(out);
        } finally {
            out.close();
        }
    }
}
