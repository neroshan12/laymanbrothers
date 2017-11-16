package bank.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "bankuser")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userId", nullable = false, updatable = false)
	private int id;
	private String firstName;
	private String lastName;
	@Column(name = "email", nullable = false, unique = true)
	private String email;
	@Column(name = "username", nullable = false, unique = true)
	private String username;
	private String address;
	private String password;
	
	@OneToOne(cascade = CascadeType.ALL)
	public CurrentAccount currentAccount;
	
	@OneToOne(cascade = CascadeType.ALL)
	public SavingsAccount savingsAccount;
	
	public User(String firstName, String lastName, String email, String username, String address, String password) {
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setUsername(username);
		setAddress(address);
		setPassword(password);
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

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

	public void transferToSaving(double amount) {
		if ((currentAccount.getBalance() - amount) > currentAccount.getOverdraft()) {
			currentAccount.balance -= amount;
			savingsAccount.balance += amount;
		}
	}

	public void transferToCurrent(double amount) {
		if ((savingsAccount.getBalance() - amount) > savingsAccount.getOverdraft()) {
			savingsAccount.balance -= amount;
			currentAccount.balance += amount;
		} 
	}
	
	public void depositSavings(double amount) {
			savingsAccount.balance += amount;
	}
	
	public void depositCurrent(double amount) {
			currentAccount.balance += amount;
	}
	
	public void withdrawSavings(double amount) {
		savingsAccount.balance += amount;
	}

	public void withdrawCurrent(double amount) {
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
	
	public CurrentAccount getCurrentAccount()
	{
		return currentAccount;
	}
	
	public SavingsAccount getSavingsAccount()
	{
		return savingsAccount;
	}
	public void setCurrentAccount(CurrentAccount currentAccount) {
		this.currentAccount = currentAccount;
	}
	public void setSavingsAccount(SavingsAccount savingsAccount) {
		this.savingsAccount = savingsAccount;
	}
}
