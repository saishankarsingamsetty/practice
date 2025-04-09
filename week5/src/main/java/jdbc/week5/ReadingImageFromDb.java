package jdbc.week5;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ReadingImageFromDb {

	public static void main(String[] args) {
		String query="select * from images";
		
		try(Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orclpdb","hr","hr");
				PreparedStatement pstmt=con.prepareStatement(query);
				FileOutputStream out=new FileOutputStream("src/main/java/output.jpg");
			){
			
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				int id=rs.getInt(1);
				InputStream in=rs.getBinaryStream(2);
				int bytes;
				int count=0;
				while((bytes=in.read())!=-1) {
					out.write(bytes);
					if(count++==100) {
						con.close();
					}
				}
				System.out.println("success");
			}
			else {
				System.out.println("no data found");
			}
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
