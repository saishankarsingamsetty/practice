package transaction_management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BankDao {

	@Autowired
	JdbcTemplate jt;
	
	public int addAmt(int acc,float amt) {
		
		int count = jt.update("update bank set balance= balance+? where id=?",amt,acc);
		return count;
	}
	
	public int subAmt(int acc,float amt) {
		int count = jt.update("update bank set balance = balance - ? where id = ?",amt,acc);
		return count;
	}
	
	public boolean transferAmt(int sacc,int dacc,float amt) {
		int a = subAmt(sacc, amt);
		int b = addAmt(dacc, amt);
		
		if(a==1&&b==1) {
			return true;
		}
		else {
			throw new RuntimeException("enter a valid account number");
		}
	}
}
