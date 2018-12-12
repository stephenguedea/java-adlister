import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


    @WebServlet(name = "PickColorServlet", urlPatterns = "/pickcolor")
    public class PickColorServlet extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.getRequestDispatcher("colorForm.jsp").forward(request, response);
        }
        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String fav_color = request.getParameter("fav_color");

            if (fav_color == null) {
                fav_color = "white";
            }

            request.setAttribute("fav_color", fav_color);
            request.getRequestDispatcher("bgColor.jsp").forward(request, response);
        }
    }

