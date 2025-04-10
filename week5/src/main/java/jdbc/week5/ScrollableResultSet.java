package jdbc.week5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ScrollableResultSet {

	public static void main(String[] args) {
		try(Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orclpdb","hr","hr");
				PreparedStatement pstmt = con.prepareStatement("select first_name,last_name from employees order by first_name", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)){
			
			ResultSet rs=pstmt.executeQuery();
//			rs.next();
			rs.first();
			System.out.println(rs.getString("first_name"));
//			rs.absolute(3);
//			System.out.println(rs.getString("first_name"));
//			rs.relative(2);
//			System.out.println(rs.getString("first_name"));
			rs.updateString("first_name", "hello");
//			rs.updateRow();
			System.out.println(rs.getString("first_name"));
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
}
