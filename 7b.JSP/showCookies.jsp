<%@ page import="jakarta.servlet.http.Cookie" %>
<%
    Cookie[] cookies = request.getCookies();
%>

<!DOCTYPE html>
<html>
<head>
    <title>Active Cookies</title>
</head>
<body>
    <h2>Active Cookie List</h2>
    <%
        if (cookies != null && cookies.length > 0) {
    %>
        <table border="1">
            <tr>
                <th>Name</th>
                <th>Value</th>
            </tr>
            <%
                for (Cookie c : cookies) {
            %>
                <tr>
                    <td><%= c.getName() %></td>
                    <td><%= c.getValue() %></td>
                </tr>
            <%
                }
            %>
        </table>
    <%
        } else {
    %>
        <p>No active cookies found.</p>
    <%
        }
    %>
    <br>
    <a href="index.jsp">Back to Add Cookie</a>
</body>
</html>
