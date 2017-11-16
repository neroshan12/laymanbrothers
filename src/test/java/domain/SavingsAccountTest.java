package domain;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import bank.domain.SavingsAccount;

public class SavingsAccountTest {
	
	private SavingsAccount classUnderTest;
	
	@Before
	public void setUp() throws Exception {
		classUnderTest = new SavingsAccount(0);
	}
	
	@Test
    public void account() {
        assertTrue(classUnderTest instanceof SavingsAccount);
    }

	@Test
	public void testGetBalance() {
		int result = 0;
		assertEquals(result, classUnderTest.getBalance());
	}
	
	@Test
	public void testSetBalance() {
		double result = 10.00;
		classUnderTest.setBalance(10.00);
		assertEquals(result, classUnderTest.getBalance());
	}
	
	@Test
	public void testGetID() {
		int result = 0;
		assertEquals(result, classUnderTest.getId());
	}
	
	
	@Test
	public void testAddInterest() {
		double result = 105.11401320407893;
		for(int i=0; i<10; i++){
	        classUnderTest.addInterest();
	     }
		assertEquals(result, classUnderTest.getBalance());
	}
}

