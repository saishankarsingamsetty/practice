package jdbc.week5;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class RetrevingNamesusingProcedureFromemployees {
	public static void main(String[] args) {
		try(Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orclpdb","hr","hr");
				CallableStatement cs=con.prepareCall("{ call get_first_and_last_name_from_customer(?,?,?) }")
			){
				cs.setInt(1, 101);
				cs.registerOutParameter(2, Types.VARCHAR);
				cs.registerOutParameter(3, Types.VARCHAR);
				
				cs.execute();
				
				System.out.println(cs.getString(2));
				System.out.println(cs.getString(3));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
