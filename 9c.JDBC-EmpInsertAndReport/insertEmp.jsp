<%@ page import="java.sql.*" %>
<%
    String jdbcURL = "jdbc:mysql://localhost:3306/Employee1";
    String dbUser = "root";
    String dbPassword = ""; // change if needed

    Connection conn = null;
    PreparedStatement pstmt = null;

    String empnoStr = request.getParameter("empno");
    String empname = request.getParameter("empname");
    String salaryStr = request.getParameter("basicsalary");

    try {
        int empno = Integer.parseInt(empnoStr);
        double basicsalary = Double.parseDouble(salaryStr);

        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);

        String sql = "INSERT INTO Emp (Emp_NO, Emp_Name, Basicsalary) VALUES (?, ?, ?)";
        pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, empno);
        pstmt.setString(2, empname);
        pstmt.setDouble(3, basicsalary);

        int rows = pstmt.executeUpdate();

        if (rows > 0) {
            out.println("<p>Employee added successfully!</p>");
        } else {
            out.println("<p>Error inserting employee.</p>");
        }
%>
        <a href="empReport.jsp">View Salary Report</a><br>
        <a href="addEmp.html">Add Another Employee</a>
<%
    } catch (Exception e) {
        out.println("<p>Error: " + e.getMessage() + "</p>");
    } finally {
        if (pstmt != null) try { pstmt.close(); } catch(Exception e) {}
        if (conn != null) try { conn.close(); } catch(Exception e) {}
    }
%>
