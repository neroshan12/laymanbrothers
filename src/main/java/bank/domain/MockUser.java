package bank.domain;

public class MockUser extends User {
	
	public void User(String firstName, String lastName, String email, String username, String address, String password) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setUsername(username);
        setAddress(address);
        setPassword(password);
    }
}
