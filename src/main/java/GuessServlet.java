import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet("/guess")
public class GuessServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/guess.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Random random = new Random();
        int rand =  random.nextInt(3 - 1) + 1;
        System.out.println("random is " + rand);
        String guess = request.getParameter("guess");
        System.out.println(guess);
        if (Integer.parseInt(guess) == rand) {
            response.sendRedirect("/correct");
        } else {
            response.sendRedirect("/incorrect");
        }
    }
}