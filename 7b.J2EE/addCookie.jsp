<%@ page import="jakarta.servlet.http.Cookie" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String name = request.getParameter("name");
    String domain = request.getParameter("domain");
    String maxAgeStr = request.getParameter("maxAge");

    int maxAge = -1; // default session cookie
    try {
        maxAge = Integer.parseInt(maxAgeStr);
    } catch (NumberFormatException e) {
        // Ignore and keep default -1
    }

    if (name != null && !name.trim().isEmpty()) {
        Cookie cookie = new Cookie(name, "Cookie_" + name);
        cookie.setMaxAge(maxAge);
        if (domain != null && !domain.trim().isEmpty()) {
            cookie.setDomain(domain);
        }
        response.addCookie(cookie);
    } else {
        out.println("<p><b>Error:</b> Cookie name is required.</p>");
    }
%>

<!DOCTYPE html>
<html>
<head>
    <title>Cookie Added</title>
</head>
<body>
<%
    if (name != null && !name.trim().isEmpty()) {
%>
    <h2>Cookie Added Successfully!</h2>
    <p><strong>Name:</strong> <%= name %></p>
    <p><strong>Domain:</strong> <%= (domain == null || domain.isEmpty()) ? "Not set" : domain %></p>
    <p><strong>Max Age:</strong> <%= maxAge >= 0 ? maxAge + " seconds" : "Session cookie (no max age set)" %></p>

    <p><a href="showCookies.jsp">Go to the active cookie list</a></p>
    <p><a href="index.jsp">Add another cookie</a></p>
<%
    } else {
%>
    <p><a href="index.jsp">Back to Add Cookie</a></p>
<%
    }
%>
</body>
</html>
