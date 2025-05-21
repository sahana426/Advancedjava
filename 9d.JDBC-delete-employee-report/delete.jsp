<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%
    String nameStart = request.getParameter("nameStart");
    if (nameStart == null || nameStart.trim().isEmpty()) {
        out.println("Name input is required.");
        return;
    }

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "");

        // Fetch records to display before deletion
        ps = con.prepareStatement("SELECT * FROM Emp WHERE Emp_Name LIKE ?");
        ps.setString(1, nameStart + "%");
        rs = ps.executeQuery();

        boolean hasRecords = false;
        out.println("<h2>Salary Report</h2>");
        out.println("<pre>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</pre>");
        while (rs.next()) {
            hasRecords = true;
            out.println("<pre>");
            out.println("Emp_No   : " + rs.getInt("Emp_No"));
            out.println("Emp_Name : " + rs.getString("Emp_Name"));
            out.println("Basicsalary    : " + rs.getDouble("Basicsalary"));
            out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            out.println("</pre>");
        }

        if (!hasRecords) {
            out.println("<p>No employees found with names starting with '" + nameStart + "'</p>");
        } else {
            // Delete records
            ps = con.prepareStatement("DELETE FROM Emp WHERE Emp_Name LIKE ?");
            ps.setString(1, nameStart + "%");
            ps.executeUpdate();
        }

    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    } finally {
        try { if (rs != null) rs.close(); } catch (Exception e) {}
        try { if (ps != null) ps.close(); } catch (Exception e) {}
        try { if (con != null) con.close(); } catch (Exception e) {}
    }
%>
