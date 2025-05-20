package program6b;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        int visitCount = 1;  // default for first visit

        Cookie[] cookies = request.getCookies();
        Cookie visitCookie = null;
        Cookie nameCookie = null;

        // Check existing cookies
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("visitCount")) {
                    visitCount = Integer.parseInt(cookie.getValue()) + 1;
                    visitCookie = cookie;
                }
                if (cookie.getName().equals("username")) {
                    nameCookie = cookie;
                }
            }
        }

        // If name cookie is not present or changed, create/update it
        if (nameCookie == null || !nameCookie.getValue().equals(username)) {
            nameCookie = new Cookie("username", username);
            nameCookie.setMaxAge(24 * 60 * 60); // expires in 1 day
            response.addCookie(nameCookie);
            visitCount = 1;  // reset visit count for new user
        }

        // Create or update visit count cookie
        if (visitCookie == null) {
            visitCookie = new Cookie("visitCount", "1");
        } else {
            visitCookie.setValue(String.valueOf(visitCount));
        }
        visitCookie.setMaxAge(24 * 60 * 60);  // 1 day expiry
        response.addCookie(visitCookie);

        // Display greeting message
        out.println("<html><body>");
        out.println("<h2>Welcome back " + username + "!</h2>");
        out.println("<p>You have visited this page " + visitCount + " times.</p>");
        out.println("<a href='nameform.html'>Go Back</a>");
        out.println("</body></html>");
    }
}
