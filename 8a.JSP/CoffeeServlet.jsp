<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String jdbcURL = "jdbc:mysql://localhost:3306/test12";
    String dbUser = "root"; // your DB username
    String dbPassword = ""; // your DB password

    String coffeeName = request.getParameter("coffee_name");
    String priceStr = request.getParameter("price");

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException e) {
        out.println("MySQL JDBC Driver not found.");
        return;
    }

    try (Connection conn = DriverManager.getConnection(jdbcURL, dbUser, dbPassword)) {
        if (coffeeName != null && priceStr != null && !coffeeName.trim().isEmpty() && !priceStr.trim().isEmpty()) {
            String insertSQL = "INSERT INTO coffee (coffee_name, price) VALUES (?, ?)";
            try (PreparedStatement pst = conn.prepareStatement(insertSQL)) {
                pst.setString(1, coffeeName);
                pst.setBigDecimal(2, new java.math.BigDecimal(priceStr));
                pst.executeUpdate();
            }
        }

        // Now read all records
        String selectSQL = "SELECT * FROM coffee";
        try (PreparedStatement pst = conn.prepareStatement(selectSQL);
             ResultSet rs = pst.executeQuery()) {

%>
<!DOCTYPE html>
<html>
<head>
    <title>Coffee Products List</title>
</head>
<body>
    <h2>Coffee Products in Database</h2>
    <table border="1" cellpadding="5" cellspacing="0">
        <tr>
            <th>ID</th>
            <th>Coffee Name</th>
            <th>Price</th>
        </tr>
        <%
            while (rs.next()) {
        %>
        <tr>
            <td><%= rs.getInt("id") %></td>
            <td><%= rs.getString("coffee_name") %></td>
            <td><%= rs.getBigDecimal("price") %></td>
        </tr>
        <%
            }
        %>
    </table>
    <br>
    <a href="index.html">Add another coffee</a>
</body>
</html>
<%
        }
    } catch (SQLException e) {
        out.println("Database error: " + e.getMessage());
    }
%>
