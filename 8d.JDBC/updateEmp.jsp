<%@ page import="java.sql.*" %>
<%
    String empNoStr = request.getParameter("empno");
    String empName = request.getParameter("empname");
    String basicSalaryStr = request.getParameter("basicsalary");

    int empNo = Integer.parseInt(empNoStr);
    double basicSalary = Double.parseDouble(basicSalaryStr);

    String jdbcURL = "jdbc:mysql://localhost:3306/Employee";
    String dbUser = "root";
    String dbPassword = ""; // Change if necessary

    Connection conn = null;
    PreparedStatement pstmt = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);

        String sql = "UPDATE Emp SET Emp_Name = ?, Basicsalary = ? WHERE Emp_NO = ?";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, empName);
        pstmt.setDouble(2, basicSalary);
        pstmt.setInt(3, empNo);

        int rowsUpdated = pstmt.executeUpdate();

        if (rowsUpdated > 0) {
            out.println("<h3>Employee record updated successfully!</h3>");
        } else {
            out.println("<h3>No employee found with Emp_No: " + empNo + "</h3>");
        }

    } catch (Exception e) {
        out.println("Database error: " + e.getMessage());
    } finally {
        if (pstmt != null) try { pstmt.close(); } catch (Exception e) {}
        if (conn != null) try { conn.close(); } catch (Exception e) {}
    }
%>
<p><a href="updateEmp.html">Update Another Employee</a></p>
<p><a href="viewEmp.jsp">View All Employees</a></p>
