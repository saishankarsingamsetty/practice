package jdbc.week5;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertingCSVtoDb {
	public static void main(String[] args) {
		try(FileReader fis=new FileReader("src/main/java/input.csv");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orclpdb","hr","hr");
					PreparedStatement pst=con.prepareStatement("insert into csvtable values(?,?)")){
			pst.setInt(1, 101);
			pst.setCharacterStream(2, fis);
			int updatedcount=pst.executeUpdate();
			
			System.out.println(updatedcount>0?"success":"error");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
