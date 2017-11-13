package domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SavingsAccountTest {
	
	private SavingsAccount classUnderTest;
	
	@Before
	public void setUp() throws Exception {
		classUnderTest = new SavingsAccount(0, null);
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
}

