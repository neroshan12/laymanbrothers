package bank.services;

import java.util.List;

import bank.domain.User;

public interface UserService {

	List<User> listAll();
	
	User findByEmail(String email);
	
	User findById(int id);
	
	User findByUsername(String username);
	
	User saveOrUpdate(User user);
	
}
