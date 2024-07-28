
package jdbcpro;

import java.sql.*;

// CRUD operations
public class CRUD {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/student_db";
        
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection con = DriverManager.getConnection(url, "root", "");
        
        if(con != null){
            System.out.println("Connected");
        }
        
        Statement stmt = con.createStatement();
        
//        insert rows
//        String sql = "insert into stud_info values(101,'abc','B'),(102,'cde','B')";
//        int rows = stmt.executeUpdate(sql);

//        Update rows
//        String upd = "update stud_info set division='A' where id=101";
//        int rows = stmt.executeUpdate(upd);

//        Delete rowa
//        String del = "delete from stud_info where name='abc'";
//        int rows = stmt.executeUpdate(del);

//        Drop table
        String drop = "drop table students";
        int rows = stmt.executeUpdate(drop);
        
        System.out.println("Rows Affected : "+rows);
    }
}
