import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ProductCreateServlet", urlPatterns = "/create-product")
public class ProductCreateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // save the product

        Product p = new Product(
                request.getParameter("name"),
                Integer.parseInt(request.getParameter("price")),
                request.getParameter("description")
        );

        Products pdao = DaoFactory.getProductDao();
        pdao.save(p);
        response.sendRedirect("/products");

    }

    protected void doGet(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        request.getRequestDispatcher("product-form.jsp").forward(request, response);
    }
}
