package bank.services;

import java.util.List;

import bank.domain.User;

public interface UserService {

	List<User> listAll();
	
	User findByEmail(String email);
	
	User findByUsername(String username);
	
	User saveOrUpdate(User user);
	
	void delete(Long id);
}
