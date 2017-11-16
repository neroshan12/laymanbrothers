package domain;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import bank.domain.User;

public class UserTest {

	private User classUnderTest;
	
	@Before
	public void setUp() throws Exception {
		classUnderTest = new User("Joe", "Ingram", "joe@joe.com", "gijoe", "Croydon", "Cronx");
	}

	
	@Test
	public void testGetFirstName() {
		String result = "Joe";
		assertEquals(result, classUnderTest.getFirstName());
	}
	
	@Test
	public void testSetFirstName() {
		String result = "Nero";
		classUnderTest.setFirstName("Nero");
		assertEquals(result, classUnderTest.getFirstName());
	}
	
	
	@Test
	public void testGetLastName() {
		String result = "Ingram";
		assertEquals(result, classUnderTest.getLastName());
	}
	
	@Test
	public void testSetLastName() {
		String result = "Siva";
		classUnderTest.setLastName("Siva");
		assertEquals(result, classUnderTest.getLastName());
	}
	
	@Test
	public void testGetEmail() {
		String result = "joe@joe.com";
		assertEquals(result, classUnderTest.getEmail());
	}
	
	@Test
	public void testSetEmail() {
		String result = "nero@nero.com";
		classUnderTest.setEmail("nero@nero.com");
		assertEquals(result, classUnderTest.getEmail());
	}
	
	@Test
	public void testGetUsername() {
		String result = "gijoe";
		assertEquals(result, classUnderTest.getUsername());
	}
	
	@Test
	public void testSetUsername() {
		String result = "nsiva";
		classUnderTest.setUsername("nsiva");
		assertEquals(result, classUnderTest.getUsername());
	}
	
	@Test
	public void testSetAddress() {
		String result = "Croydon";
		classUnderTest.setAddress("Croydon");
		assertEquals(result, classUnderTest.getAddress());
	}
	
	@Test
	public void testSetPassword() {
		String result = "neropassword";
		classUnderTest.setPassword("neropassword");
		assertEquals(result, classUnderTest.getPassword());
	}
		
	@Test //test 
	public void testTransferToSavings() {
		double result = 50.00;
		classUnderTest.depositCurrent(150.00);
		classUnderTest.transferToSaving(100.00);
		assertEquals(result, classUnderTest.currentAccount.getBalance());
	}
	
	@Test //test 
	public void testFailTransferToSavings() {
		double result = 10;
		classUnderTest.depositCurrent(10.00);
		classUnderTest.transferToSaving(130.00);
		assertEquals(result, classUnderTest.currentAccount.getBalance());
	}
	
	@Test
	public void testTransferToCurrent() {
		double result = 50.00;
		classUnderTest.depositSavings(150.00);
		classUnderTest.transferToCurrent(100.00);
		assertEquals(result, classUnderTest.savingsAccount.getBalance());
	}
	
	@Test //test 
	public void testFailTransferToCurrent() {
		int result = 10;
		classUnderTest.depositSavings(10.00);
		classUnderTest.transferToCurrent(100.00);
		assertEquals(result, classUnderTest.savingsAccount.getBalance());
	}

}

