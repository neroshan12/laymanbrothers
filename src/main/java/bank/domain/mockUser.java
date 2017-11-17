package bank.domain;

public class mockUser extends User {
	public mockUser(String firstName, String lastName, String email, String username, String address, String password) {
		super(firstName, lastName, email, username, address, password);
		// TODO Auto-generated constructor stub
	}

	public void User(String firstName, String lastName, String email, String username, String address, String password) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setUsername(username);
        setAddress(address);
        setPassword(password);
    }
}
