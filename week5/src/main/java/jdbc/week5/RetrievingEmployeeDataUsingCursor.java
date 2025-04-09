package jdbc.week5;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Types;

public class RetrievingEmployeeDataUsingCursor {

	public static void main(String[] args) {
		try(Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orclpdb","hr","hr");
				CallableStatement cs=con.prepareCall("{ ? = call get_employees_data() }")
			){
			
			cs.registerOutParameter(1, Types.REF_CURSOR);
			
			cs.executeQuery();
			
			
			ResultSet rs=(ResultSet)cs.getObject(1);
			
			while(rs.next()) {
				System.out.println(rs.getString(1)+"	"+rs.getString(2)+"		"+rs.getString(3)+"		"+rs.getString(4)+"	"+rs.getString(5)+"		"+rs.getString(6));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
