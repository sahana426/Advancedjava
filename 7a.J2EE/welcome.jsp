<%@ page import="java.util.*" %>
<%
    String username = request.getParameter("username");
    if (username != null && !username.isEmpty()) {
        session.setAttribute("username", username);
        session.setMaxInactiveInterval(60); // session expires in 60 seconds (1 minute)
    } else {
        response.sendRedirect("index.jsp");
        return;
    }
%>

<!DOCTYPE html>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
    <h2>Hello, <%= session.getAttribute("username") %>!</h2>
    <p>(Your session will expire in 1 minute.)</p>
    <p><a href="checkSession.jsp">Check session status</a></p>
</body>
</html>
