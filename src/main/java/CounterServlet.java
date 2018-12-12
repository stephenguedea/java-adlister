import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(urlPatterns = "/counter")
public class CounterServlet extends HttpServlet {
    protected void doPost( HttpServletRequest request, HttpServletResponse response ) throws
            ServletException, IOException {

    }

    public static int counter = 0;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.getWriter().println(counter + " views");
        counter++;
    }
}
