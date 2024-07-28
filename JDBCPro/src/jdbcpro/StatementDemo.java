
package jdbcpro;

import java.sql.*;

// Create Statement of SQL query
// Create new Table

public class StatementDemo {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/student_db";
        
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection con = DriverManager.getConnection(url, "root", "");
        
        if(con!=null){
            System.out.println("Connected");
        }
        
        String sql = "create table stud_info(id int(5), name varchar(10), division varchar(10))";
        
        Statement stmt = con.createStatement();
        
        int rows = stmt.executeUpdate(sql);
        
        System.out.println("Table Created"+rows);
    }
}
