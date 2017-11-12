package domain;

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
