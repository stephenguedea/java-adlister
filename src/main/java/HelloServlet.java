import javax.servlet.http.HttpServlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "HelloServlet", urlPatterns = "/name")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("form.jsp").forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String first_name = request.getParameter("first_name");

        if (first_name == null) {
            first_name = "World";
        }  else if (first_name.equals("bgates")) {
            response.sendRedirect("https://microsoft.com");
            return;
        }
        request.setAttribute("first_name", first_name);
        request.setAttribute("theNumber", 42);
        request.getRequestDispatcher("hello.jsp").forward(request, response);
    }
}
