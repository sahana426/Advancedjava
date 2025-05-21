package program6;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/FactorialServlet")
public class FactorialServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            int number = Integer.parseInt(request.getParameter("number"));

            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            out.println("<html><body>");
            out.println("<h2>Factorial Calculator</h2>");
            out.println("<p>Factorial of " + number + " is: " + factorial + "</p>");
            out.println("<a href='factorial.html'>Calculate Again</a>");
            out.println("</body></html>");

        } catch (NumberFormatException e) {
            out.println("<html><body>");
            out.println("<h2>Error: Invalid Input</h2>");
            out.println("<a href='factorial.html'>Try Again</a>");
            out.println("</body></html>");
        } finally {
            out.close();
        }
    }
}
