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
     
    public String getUsers() {
    		return users.get(0).getFirstName();
    }
  	
  	public User findById(int id)
  	{
  		return users.get(id);
  	}
  	
  	public User findByName(String username)
 	{
 		for(int i=0; i < users.size(); i++)
 		{
 			System.out.println(users.get(i).getUsername());
 			if(users.get(i).getUsername() == username)
 			{
 				return users.get(i);
 			}
 		}
 		return null;
 	}
  	
  	public void transfer(double amount, String fromUserName,String toUserName)
  	{
  	  System.out.println(this.findByName(fromUserName));
  	  User fromUser = this.findByName(fromUserName);
  	  User toUser = this.findByName(toUserName);
  	  System.out.println(toUser.currentAccount.getBalance());
  	  System.out.println(fromUser.currentAccount.getBalance());
  	  fromUser.getCurrentAccount().transfer(amount, toUser.currentAccount);
  	  System.out.println(toUser.currentAccount.getBalance());
  	  System.out.println(fromUser.currentAccount.getBalance());
  	}
 }
