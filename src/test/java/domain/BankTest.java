

 package domain;
 
 import static org.junit.Assert.*;
 
 import org.junit.Before;
 import org.junit.Test;

import bank.domain.Bank;
import bank.domain.User;
 
 public class BankTest {
 	
 private Bank classUnderTest;
 	
	@Before
 	public void setUp() throws Exception {
 		classUnderTest = new Bank();
 	}
 
 	@Test
     public void bank() {
         assertTrue(classUnderTest instanceof Bank);
     }
 	
    @Test
    public void testGetAllUsers() {
         User nero = new User("Nero", "Siva", "nero@nero.com", "nsiva");
         classUnderTest.addUser(nero);
         assertEquals("Nero", classUnderTest.getUsers());
     }
 
 }
