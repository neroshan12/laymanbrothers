package bank.domain;
 
import java.util.ArrayList;
import java.util.List;

 
 
 public class Bank {
 
     private List<User> users;
     
     public Bank() {
         users = new ArrayList<User>();
     }
 	
     public void addUser(User user) {
         users.add(user);
     }
     
     public User getFirstUser() {
    	 	return users.get(0);
     }
     
     public List<User> getAllUsers() {
  		return users;
  	}
     
    public User getUsers() {
    		return users.get(0);
    }
  	
  	public User findById(int id)
  	{
  		return users.get(id);
  	}
  	
  	public User findByName(String username)
 	{
 		for(int i=0; i < users.size(); i++)
 		{
 			if(users.get(i).getUsername() == username)
 			{
 				return users.get(i);
 			}
 		}
 		return null;
 	}
  	
  	public void transfer(double amount, String fromUserName,String fromAccount,String toUserName,String toAccount)
  	{
  	  User fromUser = this.findByName(fromUserName);
  	  User toUser = this.findByName(toUserName);
  	  if(fromAccount == "current account")
  	  {
  	    CurrentAccount senderAccount = fromUser.getCurrentAccount();
  	    if(toAccount == "current account")
    	  	{
  	    	senderAccount.transferToCurrent(amount, toUser.getCurrentAccount());
    	  	}
    	  	else
    	  	{
    	  		senderAccount.transferToSavings(amount, toUser.getSavingsAccount());
    	  	}
  	  }
  	  else
  	  {
  	    SavingsAccount senderAccount = fromUser.getSavingsAccount();
  	    if(toAccount == "current account")
    	  	{
  	    		senderAccount.transferToCurrent(amount, toUser.getCurrentAccount());
    	  	}
    	  	else
    	  	{
    	  		senderAccount.transferToSavings(amount, toUser.getSavingsAccount());
    	  	}
  	  
  	  }
  	  

  	}
 }
