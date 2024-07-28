
import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.xml.ws.http.HTTPException;

public class update extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws HTTPException, IOException
    {
        try
        {
            String url = "jdbc:mysql://localhost:3306/student_db";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, "root", "");
            if(con != null){
                System.out.println("Connected");
            }
            
            PrintWriter out = res.getWriter();

            String name = req.getParameter("name");
            String division = req.getParameter("division");
            
            String sql = "update stud_info set division = ? where name = ? ";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            pst.setString(1, division);
            pst.setString(2, name);

            pst.executeUpdate();
            out.println("Record Updated");
        }
        catch(Exception e)
        {
        }
    }

}
