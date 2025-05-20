<%
    String username = (String) session.getAttribute("username");
    if (username == null) {
        response.sendRedirect("sessionExpired.jsp");
        return;
    }
%>

<!DOCTYPE html>
<html>
<head>
    <title>Session Check</title>
</head>
<body>
    <h2>Welcome back, <%= username %>!</h2>
    <p>Your session is still active.</p>
</body>
</html>
