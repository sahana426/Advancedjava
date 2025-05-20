<%@ page import="java.sql.*" %>
<%
    String jdbcURL = "jdbc:mysql://localhost:3306/test12";
    String dbUser = "root";  // change if needed
    String dbPassword = "";  // change if needed

    String idStr = request.getParameter("id");
    String coffeeName = request.getParameter("coffee_name");
    String priceStr = request.getParameter("price");

    if (idStr != null && coffeeName != null && priceStr != null) {
        int id = Integer.parseInt(idStr);
        double price = Double.parseDouble(priceStr);

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);

            String sql = "UPDATE coffee SET coffee_name=?, price=? WHERE id=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, coffeeName);
            pstmt.setDouble(2, price);
            pstmt.setInt(3, id);

            int rowsUpdated = pstmt.executeUpdate();

            out.println("<h3>Update Result</h3>");
            if (rowsUpdated > 0) {
                out.println("Coffee product with ID " + id + " updated successfully.");
            } else {
                out.println("No coffee product found with ID " + id + ".");
            }

            out.println("<p><a href='showCoffee.jsp'>Show All Coffee Products</a></p>");
            out.println("<p><a href='updateCoffee.html'>Update Another Coffee</a></p>");
        } catch (Exception e) {
            out.println("Error: " + e.getMessage());
        } finally {
            if (pstmt != null) try { pstmt.close(); } catch(Exception e) {}
            if (conn != null) try { conn.close(); } catch(Exception e) {}
        }
    } else {
        out.println("Invalid input.");
    }
%>
