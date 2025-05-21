<%@ page import="java.sql.*" %>
<%
    String jdbcURL = "jdbc:mysql://localhost:3306/test12";
    String dbUser = "root";  // Update if different
    String dbPassword = "";  // Update if different

    Connection conn = null;
    PreparedStatement deleteStmt = null;
    Statement selectStmt = null;
    ResultSet rs = null;

    String idToDelete = request.getParameter("id");

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);

        // Delete coffee record
        if (idToDelete != null && !idToDelete.trim().isEmpty()) {
            deleteStmt = conn.prepareStatement("DELETE FROM coffee WHERE id = ?");
            deleteStmt.setInt(1, Integer.parseInt(idToDelete));
            int rowsDeleted = deleteStmt.executeUpdate();
        }

        // Display remaining records
        selectStmt = conn.createStatement();
        rs = selectStmt.executeQuery("SELECT * FROM coffee");
%>
<!DOCTYPE html>
<html>
<head>
    <title>Remaining Coffee Records</title>
    <style>
        table, th, td {
            border: 1px solid black; border-collapse: collapse;
            padding: 8px;
        }
    </style>
</head>
<body>
    <h2>Remaining Coffee Records</h2>
    <table>
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
            <td><%= rs.getDouble("price") %></td>
        </tr>
<%
        }
%>
    </table>
    <br>
    <a href="deleteCoffee.html">Back to Delete Form</a>
</body>
</html>
<%
    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    } finally {
        if (rs != null) try { rs.close(); } catch(Exception e) {}
        if (selectStmt != null) try { selectStmt.close(); } catch(Exception e) {}
        if (deleteStmt != null) try { deleteStmt.close(); } catch(Exception e) {}
        if (conn != null) try { conn.close(); } catch(Exception e) {}
    }
%>
