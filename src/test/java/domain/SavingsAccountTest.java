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
	public void testGetOverdraft() {
		double result = 0;
		assertEquals(result, classUnderTest.getOverdraft());
	}
	
	@Test
	public void testGetDailyInterest() {
		double result = 1.005;
		assertEquals(result, SavingsAccount.getDailyInterest());
	}
	
	@Test
	public void testDeposit() {
		int result = 100;
		classUnderTest.deposit(100);
		assertEquals(result, classUnderTest.getBalance());
	}
	
	@Test
	public void testWithdraw() {
		int result = 50;
		classUnderTest.deposit(100.00);
		classUnderTest.withdraw(50.00);
		assertEquals(result, classUnderTest.getBalance());
	}
	
	@Test
	public void testGetID() {
		int result = 0;
		assertEquals(result, classUnderTest.getId());
	}
	
	@Test
	public void testAddInterest() {
		classUnderTest = new SavingsAccount(100.00);
		double result = 105.11401320407893;
		for(int i=0; i<10; i++){
	        classUnderTest.addInterest();
	     }
		assertEquals(result, classUnderTest.getBalance());
	}
}

