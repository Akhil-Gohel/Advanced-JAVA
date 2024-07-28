
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.xml.ws.http.HTTPException;


public class show extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws HTTPException, IOException
    {
        PrintWriter out = res.getWriter();
        try
        {
            String url = "jdbc:mysql://localhost:3306/student_db";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,"root","");
            if(con !=null)
            {
                System.out.println("connected");
            }
            
            String sql = "Select * from stud_info";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next())
            {
                out.println("Id:"+rs.getString(1)+" "+"Name:"+rs.getString(2)+" "+"Division:"+rs.getString(3));
            }
        }
        catch(Exception e)
        {
        }
    }
    
}
