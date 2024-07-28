
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.xml.ws.http.HTTPException;

public class insert extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws HTTPException, IOException{
        PrintWriter out = res.getWriter();
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String division = req.getParameter("division");
        try {
            String url = "jdbc:mysql://localhost:3306/student_db";
        
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, "root", "");

            if(con != null){
                System.out.println("Connected");
            }
            
            String sql = "insert into stud_info values(?,?,?)";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            pst.setString(1, id);
            pst.setString(2, name);
            pst.setString(3, division);
            pst.executeUpdate();
            out.println("Record Inserted");
        } 
        catch (Exception e) {
            out.println("Exception");
        }
    }
}
