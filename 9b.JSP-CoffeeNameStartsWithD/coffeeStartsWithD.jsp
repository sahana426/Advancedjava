<%@ page import="java.sql.*" %>
<%
    String jdbcURL = "jdbc:mysql://localhost:3306/test12";
    String dbUser = "root";  // Change as needed
    String dbPassword = "";  // Change as needed

    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);

        String sql = "SELECT * FROM coffee WHERE coffee_name LIKE 'D%'";
        stmt = conn.prepareStatement(sql);
        rs = stmt.executeQuery();
%>
<!DOCTYPE html>
<html>
<head>
    <title>Coffee Names Starting with 'D'</title>
    <style>
        table, th, td {
            border: 1px solid black; border-collapse: collapse;
            padding: 8px;
        }
        th {
            background-color: #f2f2f2;
        }
        body {
            font-family: Arial, sans-serif;
        }
    </style>
</head>
<body>
    <h2>Coffee Names Starting with 'D'</h2>
    <table>
        <tr>
            <th>ID</th>
            <th>Coffee Name</th>
            <th>Price</th>
        </tr>
<%
        boolean found = false;
        while (rs.next()) {
            found = true;
%>
        <tr>
            <td><%= rs.getInt("id") %></td>
            <td><%= rs.getString("coffee_name") %></td>
            <td><%= rs.getDouble("price") %></td>
        </tr>
<%
        }
        if (!found) {
%>
        <tr>
            <td colspan="3">No coffee names starting with 'D' found.</td>
        </tr>
<%
        }
%>
    </table>
</body>
</html>
<%
    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    } finally {
        if (rs != null) try { rs.close(); } catch (Exception e) {}
        if (stmt != null) try { stmt.close(); } catch (Exception e) {}
        if (conn != null) try { conn.close(); } catch (Exception e) {}
    }
%>
