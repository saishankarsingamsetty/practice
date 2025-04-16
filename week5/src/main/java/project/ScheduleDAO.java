package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ScheduleDAO {
	Connection con=null;
	
	public ScheduleDAO(){
		try {
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orclpdb","hr","hr");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void displayAllSchedules(){
		
		String query = "SELECT s.schedule_id, b.bus_id, b.reg_num, b.capacity, b.type, r.route_id, r.source, r.destination, r.price, s.departure_time FROM schedule s JOIN bus b ON s.bus_id = b.bus_id JOIN route r ON s.route_id = r.route_id ORDER BY s.departure_time";

		try {
			PreparedStatement pstmt=con.prepareStatement(query);
			ResultSet rs=pstmt.executeQuery();
			
			if(rs!=null) {
				System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.printf("| %-12s | %-7s | %-15s | %-8s | %-18s | %-9s | %-12s | %-12s | %-7s | %-20s |\n", 
				    "Schedule ID", "Bus ID", "Reg Num", "Capacity", "Type", 
				    "Route ID", "Source", "Destination", "Price", "Departure Time");
				System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------");

				while (rs.next()) {
				    System.out.printf("| %-12s | %-7s | %-15s | %-8s | %-18s | %-9s | %-12s | %-12s | %-7s | %-20s |\n",
				        rs.getString(1),  
				        rs.getString(2),  
				        rs.getString(3),  
				        rs.getString(4),  
				        rs.getString(5),  
				        rs.getString(6),  
				        rs.getString(7),  
				        rs.getString(8),  
				        rs.getString(9),  
				        rs.getString(10)  
				    );
				}
				System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------");

				
				pstmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public Schedule getScheduleById(int id) {
		String query="select schedule_Id,bus_Id,route_Id,departure_time from schedule where schedule_id = ?";
		
		if(con!=null) {
			try(PreparedStatement pstmt= con.prepareStatement(query);
					){
				pstmt.setInt(1, id);
				ResultSet rs=pstmt.executeQuery();
				if(rs!=null) {
					if(rs.next()) {
						
						Schedule schedule=new Schedule();
						schedule.setScheduleId(rs.getInt("schedule_id"));
						schedule.setBusId(rs.getInt("bus_id"));
						schedule.setRouteId(rs.getInt("route_id"));
						schedule.setDepartureTime(rs.getTimestamp("departure_time").toLocalDateTime());
						
						return schedule;
					}
				}
				
				rs.close();
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		return null;
	}
	
	public int getBusIdByScheduleId(int scheduleId) {
		String query = "select bus_id from schedule where schedule_id = ?";
		
		try(PreparedStatement pstmt=con.prepareStatement(query);){
			pstmt.setInt(1, scheduleId);
			ResultSet rs=pstmt.executeQuery();
			
			if(rs!=null) {
				if(rs.next()) {
					return rs.getInt(1);
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return -1;
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
