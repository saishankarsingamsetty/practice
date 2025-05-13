package transaction_management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BankService {

	@Autowired
	BankDao dao;
	
	
	public String  deposit(int accNum,float amt) {
		return dao.addAmt(accNum, amt)==1? "amount credit success":"amount credit fail";
	}
	
	public String   withdraw(int accNum,float amt) {
		return dao.subAmt(accNum, amt)==1?"amount debit success":"amount debit fail";
	}
	
	@Transactional
	public String transfer(int sacc,int dacc,float amt) {
		return dao.transferAmt(sacc, dacc, amt)?"transfer success":"transfer failure";
	}
	
	public void something() {
		System.out.println(dao);
	}
}
