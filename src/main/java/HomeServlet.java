import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by Yuliya on 15.07.2015.
 */
public class HomeServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Writer wr = resp.getWriter();
        wr.write("<html>");
        wr.write("<h2>Hello World!</h2>");
        wr.write("<h2>Welcome in my site!</h2>");
        wr.write("<FORM action=\"/home\" method=\"POST\">");
        wr.write("<INPUT type=\"text\" name=\"welcome\">");
        wr.write("<INPUT type=\"submit\"></FORM>");
        wr.write("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Writer wr = resp.getWriter();
        wr.write("<html>");
        String text = req.getParameter("welcome");
        wr.write("Hello, "+text);
        wr.write("</html>");
    }
}
