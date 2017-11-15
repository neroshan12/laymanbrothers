package domain;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import bank.domain.CurrentAccount;

public class CurrentAccountTest {
	
	private CurrentAccount classUnderTest;
	
	@Before
	public void setUp() throws Exception {
		classUnderTest = new CurrentAccount(0);
	}
	
	@Test
    public void account() {
        assertTrue(classUnderTest instanceof CurrentAccount);
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
	
	@Test
	public void testWithdraw() {
		int result = 50;
		classUnderTest.deposit(100);
		classUnderTest.withdraw(50);
		assertEquals(result, classUnderTest.getBalance());
	}
	
	@Test
	public void testAddInterest() {
		double result = 102.01809633680774;
		classUnderTest.deposit(100.00);
		for(int i=0; i<10; i++){
	        classUnderTest.addInterest();
	     }
		assertEquals(result, classUnderTest.getBalance());
	}
}
