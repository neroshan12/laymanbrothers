package domain;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import bank.domain.CurrentAccount;
import bank.domain.SavingsAccount;
import bank.domain.User;


public class UserTest {


	private User classUnderTest;
	
	@Before
	public void setUp() throws Exception {
		classUnderTest = new User("Joe", "Ingram", "joe@joe.com", "gijoe");
	}

	@Test
    public void user() {
        assertTrue(classUnderTest instanceof User);
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
	public void testOpenCurrentAccount() {
		classUnderTest.openCurrentAccount();
		assertTrue(classUnderTest.currentAccount instanceof CurrentAccount);
	}
	
	@Test
	public void testOpenSavingsAccount() {
		classUnderTest.openSavingsAccount();
		assertTrue(classUnderTest.savingsAccount instanceof SavingsAccount);
	}
	
	@Test //test 
	public void testTransferToSavings() {
		int result = 50;
		classUnderTest.openSavingsAccount();
		classUnderTest.openCurrentAccount();
		classUnderTest.currentAccount.deposit(150);
		classUnderTest.transferToSaving(100);
		assertEquals(result, classUnderTest.currentAccount.getBalance());
	}
	
	
	@Test
	public void testTransferToCurrent() {
		int result = 50;
		classUnderTest.savingsAccount.deposit(150);
		classUnderTest.transferToCurrent(100);
		assertEquals(result, classUnderTest.savingsAccount.getBalance());
	}

}

