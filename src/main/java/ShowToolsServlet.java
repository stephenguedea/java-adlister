import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/tools")
public class ShowToolsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        // Use the factory to get the dao object
        Tools toolsDao = ToolDaoFactory.getToolsDao();

        // Use a method on the dao to get all the tools
        List<Tool> tools = toolsDao.all();

        // Pass the data to the jsp
        request.setAttribute("tools", tools);
        request.getRequestDispatcher("/tools/index.jsp").forward(request, response);
    }

}
