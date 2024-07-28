
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.http.HTTPException;

public class AddServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws HTTPException, IOException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        int a = Integer.parseInt(req.getParameter("n1"));
        int b = Integer.parseInt(req.getParameter("n2"));
        int c = a+b;
        out.println("<h1>"+c+"<h1>");
    }
}
