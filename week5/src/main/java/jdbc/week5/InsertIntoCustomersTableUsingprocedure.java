package jdbc.week5;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Types;

public class InsertIntoCustomersTableUsingprocedure {

	public static void main(String[] args) {
		try(Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orclpdb","hr","hr");
				CallableStatement cs=con.prepareCall("{ call customer_insert_procedure(?,?,?) }")
			){
				cs.setInt(1, 100);
				cs.setString(2, "shankar");
				cs.setString(3,"RCPM");
				System.out.println(cs.execute()?"success":"error");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
