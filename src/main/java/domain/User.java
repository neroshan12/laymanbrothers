package domain;

import javax.persistence.Entity;

@Entity
public class User {
	private String firstName;
	private String lastName;
	private String email;
	private String username;
	CurrentAccount currentAccount;
	SavingsAccount savingsAccount;
	
	public User(String firstName, String lastName, String email, String username) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.username = username;
	}
	public User() {}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void openCurrentAccount() {
		currentAccount = new CurrentAccount(0);
    }
	
	public void openSavingsAccount() {
		savingsAccount = new SavingsAccount(0, null);
    }
	
	public void transferToSaving(int amount) {
		currentAccount.balance -= amount;
		savingsAccount.balance += amount;
	}
	
	public void transferToCurrent(int amount) {
		savingsAccount.balance -= amount;
		currentAccount.balance += amount;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}


