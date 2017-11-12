package domain;
<<<<<<< HEAD
 
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
     
 	public String getUsers() {
 		return users.get(0).getFirstName();
 	}
 	
 }
=======

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
    
	public String getUsers() {
		return users.get(0).getFirstName();
	}
	
}
>>>>>>> d5cf1682e1f417561d4068eeac2e988673eff773
