package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PassengerDAO {
	
	Connection con=null;
	
	public PassengerDAO(){
		try {
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orclpdb","hr","hr");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//searching passenger by id in the database
	public Passenger getUserById(int id) {
		String query="select passenger_id,passenger_name,email,phnumber,pwd from passengers where passenger_id=?";
		try (PreparedStatement pstmt=con.prepareStatement(query);){
			pstmt.setInt(1, id);
			
			ResultSet rs=pstmt.executeQuery();
			
			if(rs!=null) {
				if(rs.next()) {
					Passenger passenger =new Passenger(rs.getInt("passenger_id"),rs.getString("passenger_name"),rs.getString("email")
							,Long.parseLong(rs.getString("phnumber")),rs.getString("pwd"));
					System.out.println(passenger);
					return passenger;
				}
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return null;
	}
	
	//inserting a new record into the passenger table
	public Passenger insertPassenger(String name,String email,long number,String pwd) {
		String sequenceQuery="select passenger_sequence.nextval from dual";
		String insertQuery="insert into passengers (passenger_id,passenger_name,email,phnumber,pwd) values(?,?,?,?,?)";
		int sequenceNumber=-1;
		
		try {
			PreparedStatement pstmt=con.prepareStatement(sequenceQuery);
			ResultSet rs=pstmt.executeQuery();
			if(rs!=null) {
				if(rs.next()) {
					sequenceNumber=rs.getInt(1);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			PreparedStatement pstmt=con.prepareStatement(insertQuery);
			pstmt.setInt(1, sequenceNumber);
			pstmt.setString(2, name);
			pstmt.setString(3, email);
			pstmt.setLong(4, number);
			pstmt.setString(5, pwd);
			
			int count = pstmt.executeUpdate();
			
			if(count==1) {
				return getUserById(sequenceNumber);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
		
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
