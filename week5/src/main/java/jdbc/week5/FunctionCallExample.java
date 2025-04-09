package jdbc.week5;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class FunctionCallExample {

	public static void main(String[] args) {
		try(Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orclpdb","hr","hr");
				CallableStatement cs=con.prepareCall("{ ? = call addsal(?) }")
			){
			cs.setInt(2, 100);
			cs.registerOutParameter(1, Types.INTEGER);
			cs.execute();
			int res=cs.getInt(1);
			System.out.println(res);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
