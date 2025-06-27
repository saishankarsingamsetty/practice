package com.service;

public class LoginService {

	LoginDAO loginDAO = null;
	
	public LoginService(LoginDAO loginDAO) {
		this.loginDAO = loginDAO;
	}
	
	public boolean login(String username , String password) {
		
		if(username.equals("")  || password.equals("") ) {
			throw new IllegalArgumentException(" values cannot be empty ");
		}
		
		int count = loginDAO.authenticate(username, password);
//		if(0 == count) {
//			return false;
//		}
//		else {
//			return true;
//		}
		return 0 != count;
	}
}
