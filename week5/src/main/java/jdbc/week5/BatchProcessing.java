package jdbc.week5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchProcessing {

	public static void main(String[] args) {
		try(Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orclpdb","hr","hr");
				PreparedStatement pstmt=con.prepareStatement("insert into student(id,name,age) values(?,?,?)")){
			
			
			con.setAutoCommit(false);
			
			pstmt.setInt(1, 101);
			pstmt.setString(2, "abc");
			pstmt.setInt(3, 23);
			
			pstmt.addBatch();
			
			pstmt.setInt(1, 102);
			pstmt.setString(2, "bcd");
			pstmt.setInt(3, 24);
			
			pstmt.addBatch();
			
			pstmt.setInt(1, 103);
			pstmt.setString(2, "cde");
			pstmt.setInt(3, 24);
			
			pstmt.addBatch();
			
			pstmt.setInt(1, 104);
			pstmt.setString(2, "def");
			pstmt.setInt(3, 25);
			
			pstmt.addBatch();
			
			int res[]=pstmt.executeBatch();
			
			boolean validcommit=true;
			
			for(int i:res) {
				if(i==0) {
					validcommit=false;
					break;
				}
			}
			
			if(validcommit) {
				con.commit();
				System.out.println("commit");
			}
			else {
				con.rollback();
				System.out.println("rollback");
			}
			
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
