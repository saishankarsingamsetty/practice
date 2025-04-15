package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BusDAO {
Connection con=null;
	
	public BusDAO(){
		try {
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orclpdb","hr","hr");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public int getTotalSeatsById(int id) {
		int count=0;
		
		String query="select capacity  from bus where bus_id = ?";
		
		try(PreparedStatement pstmt=con.prepareStatement(query);){
			
			pstmt.setInt(1, id);
			ResultSet rs=pstmt.executeQuery();
			
			if(rs!=null) {
				if(rs.next()) {
					count = rs.getInt(1);
				}
			}
			
			rs.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return count;
	}
	
	public void close() {
		try {
			if(con!=null)
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
