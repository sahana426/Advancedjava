<!DOCTYPE html>
<html>
<head>
    <title>Create a Cookie</title>
</head>
<body>
    <h2>Cookie Manager</h2>
    <form action="addCookie.jsp" method="post">
        <label>Cookie Name:</label><br>
        <input type="text" name="name" required><br><br>

        <label>Cookie Domain (optional):</label><br>
        <input type="text" name="domain"><br><br>

        <label>Max Expiry Age (in seconds):</label><br>
        <input type="number" name="maxAge" required><br><br>

        <input type="submit" value="Add Cookie">
    </form>
</body>
</html>
