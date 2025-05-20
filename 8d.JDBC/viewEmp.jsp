<%@ page import="java.sql.*" %>
<%
    String jdbcURL = "jdbc:mysql://localhost:3306/Employee";
    String dbUser = "root";  // Change if needed
    String dbPassword = "";  // Change if needed

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    double grandSalary = 0;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
        stmt = conn.createStatement();
        rs = stmt.executeQuery("SELECT * FROM Emp");

%>
<!DOCTYPE html>
<html>
<head>
    <title>Employee Salary Report</title>
    <style>
        table {
            width: 60%;
            border-collapse: collapse;
            margin: 20px 0;
        }
        table, th, td {
            border: 1px solid #000;
            padding: 8px;
            text-align: left;
        }
        h2, h3 {
            font-family: Arial, sans-serif;
        }
    </style>
</head>
<body>
    <h2>Salary Report</h2>
    <table>
        <tr>
            <th>Emp_No</th>
            <th>Emp_Name</th>
            <th>Basic Salary</th>
        </tr>
<%
        while (rs.next()) {
            int empNo = rs.getInt("Emp_NO");
            String empName = rs.getString("Emp_Name");
            double salary = rs.getDouble("Basicsalary");

            grandSalary += salary;
%>
        <tr>
            <td><%= empNo %></td>
            <td><%= empName %></td>
            <td><%= salary %></td>
        </tr>
<%
        }
%>
    </table>
    <h3>Grand Salary: <%= grandSalary %></h3>
    <p><a href="updateEmp.html">Update Employee</a> | <a href="addEmp.html">Add New Employee</a></p>
</body>
</html>
<%
    } catch (Exception e) {
        out.println("<p>Error: " + e.getMessage() + "</p>");
    } finally {
        if (rs != null) try { rs.close(); } catch (Exception e) {}
        if (stmt != null) try { stmt.close(); } catch (Exception e) {}
        if (conn != null) try { conn.close(); } catch (Exception e) {}
    }
%>
