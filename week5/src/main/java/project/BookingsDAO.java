package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookingsDAO {

Connection con=null;
	
	public BookingsDAO(){
		try {
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orclpdb","hr","hr");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Integer> getBookedSeatNumbersByScheduleId(int Id){
		ArrayList<Integer> list =new ArrayList<>();
		String query ="select seat_num from bookings where schedule_id = ?";
		
		try(PreparedStatement pstmt=con.prepareStatement(query);){
			pstmt.setInt(1, Id);
			ResultSet rs= pstmt.executeQuery();
			
			if(rs!=null) {
				while(rs.next()) {
					list.add(rs.getInt(1));
				}
			}
			
			rs.close();
			return list;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	public Booking insertRecord(Booking booking) {
		String query = "insert into bookings (booking_id,passenger_id,schedule_id,booking_date,seat_num) values(?,?,?,?,?)";
		int count=-1;
		int id=0;
		
		String query1="select bookings_sequence.nextval from dual";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(query1);
			ResultSet rss = ps.executeQuery();
			if(rss!=null) {
				if(rss.next()) {
					id=rss.getInt(1);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try(PreparedStatement pstmt=con.prepareStatement(query)){
			pstmt.setInt(1, id);
			pstmt.setInt(2, booking.getPassengerId());
			pstmt.setInt(3, booking.getScheduleId());
			pstmt.setDate(4,new java.sql.Date( booking.getBookingDate().getTime()));
			pstmt.setInt(5, booking.getSeatNum());
			
			count =pstmt.executeUpdate();
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		if(count==1) {
			booking.setBookingId(id);
			return booking;
		}
		else return null;
	}
	
	public void viewBookingsByPassengerId(int id) {
		if(noOfBookingsByPassengerId(id)>0) {
			
			String query = "SELECT b.booking_id, p.passenger_name, p.email, p.phnumber, s.schedule_id, s.departure_time, r.route_id, r.source, r.destination, r.price, bs.bus_id, bs.reg_num, bs.capacity, bs.type, b.seat_num, b.booking_date FROM bookings b JOIN passengers p ON b.passenger_id = p.passenger_id JOIN schedule s ON b.schedule_id = s.schedule_id JOIN route r ON s.route_id = r.route_id JOIN bus bs ON s.bus_id = bs.bus_id WHERE b.passenger_id = ?";
			
			try(PreparedStatement pstmt=con.prepareStatement(query)){
				pstmt.setInt(1, id);
				ResultSet rs=pstmt.executeQuery();
				if(rs!=null) {
					System.out.println("\n--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.printf("%-10s | %-15s | %-20s | %-12s | %-11s | %-20s | %-8s | %-10s | %-12s | %-6s | %-7s | %-13s | %-8s | %-15s | %-7s | %-20s\n",
							"Booking ID", "Passenger Name", "Email", "Phone", "Schedule ID", "Departure Time", "Route ID", "Source", "Destination",
							"Price", "Bus ID", "Reg Num", "Capacity", "Type", "Seat No", "Booking Date");
					
					System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					
					while (rs.next()) {
						System.out.printf("%-10s | %-15s | %-20s | %-12s | %-11s | %-20s | %-8s | %-10s | %-12s | %-6s | %-7s | %-13s | %-8s | %-15s | %-7s | %-20s\n",
								rs.getString("booking_id"),
								rs.getString("passenger_name"),
								rs.getString("email"),
								rs.getString("phnumber"),
								rs.getString("schedule_id"),
								rs.getString("departure_time"),
								rs.getString("route_id"),
								rs.getString("source"),
								rs.getString("destination"),
								rs.getString("price"),
								rs.getString("bus_id"),
								rs.getString("reg_num"),
								rs.getString("capacity"),
								rs.getString("type"),
								rs.getString("seat_num"),
								rs.getString("booking_date"));
					}
					
					System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("no bookings from this user");
		}
	}
	
	public int noOfBookingsByPassengerId(int id) {
		int count=0;
		String query="select count(*) from bookings where passenger_id = ?";
		
		try(PreparedStatement pstmt=con.prepareStatement(query)){
			pstmt.setInt(1, id);
			
			ResultSet rs=pstmt.executeQuery();
			
			if(rs!=null) {
				if(rs.next()) {
					count=rs.getInt(1);
				}
			}
			rs.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	
	public boolean cancelBookingById(int bookingId) {
		String query="delete from bookings where booking_id = ?";
		int count=0;
		try(PreparedStatement pstmt=con.prepareStatement(query)){
			pstmt.setInt(1, bookingId);
			
			count=pstmt.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return count!=0;
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
