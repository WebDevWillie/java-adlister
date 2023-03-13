import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/pizza")
public class PizzaOrderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("pizza.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(request.getParameter("crust-type"));
        System.out.println(request.getParameter("sauce-type"));
        String[] toppings = request.getParameterValues("toppings");
        for (String topping : toppings) {
            System.out.print(topping);
            System.out.print(" ");
        }
        System.out.println(" ");
        System.out.println(request.getParameter("address"));

        response.sendRedirect("/hello");
    }
}
