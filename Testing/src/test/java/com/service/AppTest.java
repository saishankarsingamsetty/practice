package com.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Unit test for simple App.
 */
@DisplayName("testcases for app")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AppTest {

	@BeforeEach
	public void beforeEach() {
		System.out.println("before each");
	}
	
	@AfterEach
	public void AfterEach() {
		System.out.println("After each");
	}
	
	@Test
	@Order(1)
	public void positiveValues() {
		App app = new App();
		System.out.println("AppTest.positiveValues()");
		float actual = app.add(2, 3);
		float expected = (float)5.0;
		
		assertEquals(expected, actual);
	}
	
	
	@Test
	@Order(10)
	public void testWithZeros() {
		System.out.println("AppTest.testWithZeros()");
		App app = new App();
		float actual = app.add(1, 0);
		float expected = (float)1.0;
		
		assertEquals(expected, actual);
	}
	
	
	@Test
//	@Disabled
	@Order(-10)
	@DisplayName("testcase-1")
	public void testException() {
		App app = new App();
		
		assertThrows(RuntimeException.class, ()->{
			app.add(0, 0);
		});
	}
	
	@RepeatedTest(5)
	@Order(2)
	public void testTimeOut() {
		App app = new App();
		
		assertTimeout(Duration.ofMillis(3000), ()->{
			app.sum();
		});
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("after all");
	}
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("before all");
	}
	
	@ParameterizedTest
	@ValueSource(ints = {-1,0,10,7,5})
	public void testPlusOne(int n) {
		App app = new App();
		assertEquals(n+1, app.plusOne(n));
	}
	
}
