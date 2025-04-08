package jdbc.week5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orclpdb","hr","hr");
        
        Statement statement=con.createStatement();
        int res1=statement.executeUpdate("insert into student values(102,'abc',22)");
        
        int res=statement.executeUpdate("update student set name='shankar' where id=101");
        
        ResultSet rs=statement.executeQuery("select id,name,age from student"); 
        while(rs.next()) {
        	System.out.println(rs.getInt(1)+"	"+rs.getString(2)+"		"+rs.getInt(3));
        	
        }
        int a= statement.executeUpdate("delete from student where id=102");
        
        System.out.println(res);
        if(con!=null&&statement!=null) {
        	System.out.println("db connected");
//        	System.out.println(res);
        }
        else {
        	System.out.println("db not connected");
        }
        
        rs=statement.executeQuery("select id,name,age from student"); 
        
        while(rs.next()) {
        	System.out.println(rs.getInt(1)+"	"+rs.getString(2)+"		"+rs.getInt(3));
        	
        }
        
        con.close();
    }
}
