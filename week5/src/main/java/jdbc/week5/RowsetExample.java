package jdbc.week5;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowsetExample {

	public static void main(String[] args) throws Exception{
		JdbcRowSet rs=RowSetProvider.newFactory().createJdbcRowSet();
		rs.setUrl("jdbc:oracle:thin:@localhost:1521/orclpdb");
		rs.setUsername("hr");
		rs.setPassword("hr");
		
		rs.setCommand("select * from employees");
		
		rs.execute();
		
		while(rs.next()) {
			System.out.println(rs.getString("first_name")+"       "+rs.getString("last_name"));
		}
		
		rs.close();
	}
}
