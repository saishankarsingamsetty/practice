package com.service;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class LoginServiceTest {

	static LoginService ls;
	
	static LoginDAO mockDAO;

	@BeforeAll
	static void beforeAll() {
		mockDAO = Mockito.mock(LoginDAO.class);
		ls = new LoginService(mockDAO);
	}

	@Test
	void testingWithValidCredintials() {
		Mockito.when(mockDAO.authenticate("hello", "123")).thenReturn(1);
		assertTrue(ls.login("hello", "123"));
	}
	
		
	@Test
	void testingWithInValidCredintials() {
		Mockito.when(mockDAO.authenticate("hello", "123")).thenReturn(1);
		assertFalse(ls.login("hello1", "123"));
	}
	
	@Test
	void testingWithEmptyCredintials() {
		
		assertThrows(IllegalArgumentException.class ,()->{
			ls.login("", "");
		});
	}
	
	
	@AfterAll
	static void afterAll() {
		ls = null;
		mockDAO = null;
	}

}
