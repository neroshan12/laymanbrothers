package domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AccountTest {
	
	private Account classUnderTest;
	
	@Before
	public void setUp() throws Exception {
		
		classUnderTest = new Account("Will", 0);
	}


	@Test
	public void testGetName() {
		String result = "Will";
		assertEquals(result, classUnderTest.getName());
	}


	@Test
	public void testGetBalance() {
		int result = 0;
		assertEquals(result, classUnderTest.getBalance());
	}
	
	@Test
	public void testDeposit() {
		int result = 100;
		classUnderTest.deposit(100);
		assertEquals(result, classUnderTest.getBalance());
	}
}
