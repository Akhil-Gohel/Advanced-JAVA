
package jdbcpro;

import java.sql.*;

// Connecting to MYSQL database
public class JDBCPro {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/student_db";
        
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection con = DriverManager.getConnection(url,"root","");
        
        if(con!=null){
            System.out.println("Connected");
        }
    }
    
}
