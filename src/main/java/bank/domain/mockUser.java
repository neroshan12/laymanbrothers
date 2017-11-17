package bank.domain;

//import javax.persistence.Column;

public class mockUser {
	private String firstName;
	private String lastName;
	@Column(name = "email", nullable = false, unique = true)
	private String email;
	@Column(name = "username", nullable = false, unique = true)
	private String username;
	private String address;
	private String password;
	
	public CurrentAccount currentAccount;
	public SavingsAccount savingsAccount;

	public mockUser(String firstName, String lastName, String email, String username, String address, String password) {
		 setFirstName(firstName);
	        setLastName(lastName);
	        setEmail(email);
	        setUsername(username);
	        setAddress(address);
	        setPassword(password);
		// TODO Auto-generated constructor stub
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
	
	public double getCurrentBalance() {
		return currentAccount.balance;
	}
	
	public double getSavingsBalance() {
		return savingsAccount.balance;
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
