

package domain;
 

 import static org.junit.jupiter.api.Assertions.assertEquals;


 
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
    
    @Test
    public void testTransferACurrentBSavings()
     {
 	   classUnderTest = new Bank();
 	   	User user1 = new User("Nero", "Siva", "nero@nero.com", "nsiva");
    		User user2 = new User("Jack", "jack", "nero@nerod.com", "jack");
    		classUnderTest.addUser(user1);
    		classUnderTest.addUser(user2);
       
        classUnderTest.findById(0).openCurrentAccount();
        classUnderTest.findById(0).currentAccount.deposit(90);
        classUnderTest.findById(0).savingsAccount.deposit(78);
       
        classUnderTest.findById(1).openSavingsAccount();
        classUnderTest.findById(1).currentAccount.deposit(10);
        classUnderTest.findById(1).savingsAccount.deposit(62);
        
        classUnderTest.transfer(20,"nsiva","current account","jack","savings account");
        assertEquals(70.0, classUnderTest.findById(0).getCurrentAccount().getBalance());
        assertEquals(82.0, classUnderTest.findById(1).getSavingsAccount().getBalance());
     }
    
    @Test
    public void testTransferACurrentBCurrent()
    {
   		User user1 = new User("Nero", "Siva", "nero@nero.com", "nsiva");
   		User user2 = new User("Jack", "jack", "nero@nerod.com", "jack");
 		classUnderTest.addUser(user1);
 		classUnderTest.addUser(user2);
 		  
 		classUnderTest.findById(0).openCurrentAccount();
 		classUnderTest.findById(0).currentAccount.deposit(90);
 		classUnderTest.findById(0).savingsAccount.deposit(78);
 		  
 		classUnderTest.findById(1).openCurrentAccount();
 		classUnderTest.findById(1).currentAccount.deposit(10);
 		classUnderTest.findById(1).savingsAccount.deposit(62);
 		   
 		classUnderTest.transfer(20,"nsiva","current account","jack","current account");
 		assertEquals(70.0, classUnderTest.findById(0).getCurrentAccount().getBalance());
 		assertEquals(30.0, classUnderTest.findById(1).getCurrentAccount().getBalance());
    }
    
    @Test
    public void testTransferASavingsBCurrent()
    {
   		User user1 = new User("Nero", "Siva", "nero@nero.com", "nsiva");
   		User user2 = new User("Jack", "jack", "nero@nerod.com", "jack");
 		classUnderTest.addUser(user1);
 		classUnderTest.addUser(user2);

 		classUnderTest.findById(0).openSavingsAccount();
 		classUnderTest.findById(0).currentAccount.deposit(90);
 		classUnderTest.findById(0).savingsAccount.deposit(78);
 		 
 		classUnderTest.findById(1).openCurrentAccount();
 		classUnderTest.findById(1).currentAccount.deposit(10);
 		classUnderTest.findById(1).savingsAccount.deposit(62);
 		   
 		classUnderTest.transfer(20,"nsiva","savings account","jack","current account");
 		assertEquals(58.0, classUnderTest.findById(0).getSavingsAccount().getBalance());
 		assertEquals(30.0, classUnderTest.findById(1).getCurrentAccount().getBalance());
    }
 
 }
