<%@ page import="java.sql.*" %>
<%
    String jdbcURL = "jdbc:mysql://localhost:3306/Employee";
    String dbUser = "root";  // Change if needed
    String dbPassword = "";  // Change if needed

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
        stmt = conn.createStatement();
        rs = stmt.executeQuery("SELECT * FROM Emp");

        double grandSalary = 0;

        out.println("<h2>Salary Report</h2>");
        out.println("<pre>");
        while (rs.next()) {
            int empNo = rs.getInt("Emp_NO");
            String empName = rs.getString("Emp_Name");
            double basicSalary = rs.getDouble("Basicsalary");

            grandSalary += basicSalary;

            out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            out.println("Emp_No : " + empNo);
            out.println("Emp_Name: " + empName);
            out.println("Basic : " + basicSalary);
        }
        out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        out.println("Grand Salary : " + grandSalary);
        out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        out.println("</pre>");
        out.println("<p><a href='addEmp.html'>Add Employee</a></p>");

    } catch (Exception e) {
        out.println("<p>Error: " + e.getMessage() + "</p>");
    } finally {
        if (rs != null) try { rs.close(); } catch(Exception e) {}
        if (stmt != null) try { stmt.close(); } catch(Exception e) {}
        if (conn != null) try { conn.close(); } catch(Exception e) {}
    }
%>
