package jdbc.week5;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertingImageToDataBase {

	public static void main(String[] args) {
		try(Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orclpdb","hr","hr");
				PreparedStatement pstmt=con.prepareStatement("insert into images values(?,?)");
			){
			
			pstmt.setInt(1, 10);
			pstmt.setBinaryStream(2, new FileInputStream("C:\\Users\\Admin\\Downloads\\sample.jpg"));
			
			int res=pstmt.executeUpdate();
			if(res!=0) {
				System.out.println("inserted image succesfully");
			}
			else{
				System.out.println("error");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
