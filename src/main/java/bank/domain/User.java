package bank.domain;

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
	
	@OneToOne
	public CurrentAccount currentAccount;
	
	@OneToOne
	public SavingsAccount savingsAccount;
	
	public User(String firstName, String lastName, String email, String username) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.username = username;
		this.currentAccount = new CurrentAccount(0);
		this.savingsAccount = new SavingsAccount(0);

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
	
	public SavingsAccount getSavingsAccount()
	{
		return this.savingsAccount;
	}
}


