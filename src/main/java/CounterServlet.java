import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "CounterServlet", urlPatterns = {"/counter"})
public class CounterServlet extends HttpServlet {
    public static int count = 0;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String reset = request.getParameter("reset");
        System.out.println("reset = " + reset);
        if (reset != null && !reset.isEmpty()) {
            count = 0;
        }

        response.getWriter().println("<h1>Count: " + count + "</h1>");
        count++;
    }


}
