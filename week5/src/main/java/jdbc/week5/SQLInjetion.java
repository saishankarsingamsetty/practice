package jdbc.week5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SQLInjetion {

	public static void main(String[] args) {
		String query="select id,pwd from login where id=";
		try(Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orclpdb","hr","hr");
				Statement stmt=con.createStatement();
				PreparedStatement pstmt=con.prepareStatement("select * from login where pwd=?");
				Scanner scn=new Scanner(System.in);){
//			System.out.println("Enter user id");
//			int id=scn.nextInt();
//			System.out.println("Enter pwd");
//			scn.nextLine();
//			String pwd=scn.nextLine();
////			System.out.println(pwd);
//			query+=id+" and pwd= '"+pwd+"'";
//			System.out.println(query);
//			ResultSet rs=stmt.executeQuery(query);
//			
//			if(rs.next()) {
//				System.out.println("login success");
//			}
//			else {
//				System.out.println("invalid credintials");
//			}
			
			
			
			System.out.println("+==========================================+");
//			scn.nextLine();
			String s=scn.nextLine();
			pstmt.setString(1, s);
			
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("valid");
			}
			else {
				System.out.println("invalid");
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
