

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
    public void testGetFirstUser() {
         User nero = new User("Nero", "Siva", "nero@nero.com", "nsiva");
         classUnderTest.addUser(nero);
         assertEquals(nero, classUnderTest.getFirstUser());
     }
 	
    
    @Test
    public void testFindById() {
         User nero = new User("Nero", "Siva", "nero@nero.com", "nsiva");
         classUnderTest.addUser(nero);
         assertEquals(nero, classUnderTest.findById(0));
     }
    
    @Test
    public void testFindByName() {
         User nero = new User("Nero", "Siva", "nero@nero.com", "nsiva");
         classUnderTest.addUser(nero);
         assertEquals(nero, classUnderTest.findByName("nsiva"));
     }
 
 }
