package domain;

import javax.persistence.Entity;

@Entity
public class User {
	private String firstName;
	private String lastName;
	private String email;
	private String username;
	public CurrentAccount currentAccount;
	public SavingsAccount savingsAccount;
	
	public User(String firstName, String lastName, String email, String username) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.username = username;
		this.currentAccount = new CurrentAccount(0);
		this.savingsAccount = new SavingsAccount(0);

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
		savingsAccount = new SavingsAccount(0);
    }
	
	public void transferToSaving(int amount) {
		this.currentAccount.balance -= amount;
		this.savingsAccount.balance += amount;
	}
	
	public void transferToCurrent(int amount) {
		this.savingsAccount.balance -= amount;
		this.currentAccount.balance += amount;
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
	
	public CurrentAccount getCurrentAccount()
	{
		return this.currentAccount;
	}
}


