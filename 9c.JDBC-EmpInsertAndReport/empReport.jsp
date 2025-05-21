<%@ page import="java.sql.*" %>
<%
    String jdbcURL = "jdbc:mysql://localhost:3306/Employee1";
    String dbUser = "root";
    String dbPassword = ""; // change if needed

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
    <title>Salary Report</title>
    <style>
        pre {
            font-family: monospace;
        }
    </style>
</head>
<body>
    <h2>Salary Report</h2>
<%
        while (rs.next()) {
            int empNo = rs.getInt("Emp_NO");
            String empName = rs.getString("Emp_Name");
            double basic = rs.getDouble("Basicsalary");
            grandSalary += basic;
%>
<pre>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Emp_No   : <%= empNo %>
Emp_Name : <%= empName %>
Basic    : <%= basic %>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
</pre>
<%
        }
%>
<pre>
Grand Salary : <%= grandSalary %>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
</pre>
    <br><a href="addEmp.html">Add More Employees</a>
</body>
</html>
<%
    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    } finally {
        if (rs != null) try { rs.close(); } catch(Exception e) {}
        if (stmt != null) try { stmt.close(); } catch(Exception e) {}
        if (conn != null) try { conn.close(); } catch(Exception e) {}
    }
%>
