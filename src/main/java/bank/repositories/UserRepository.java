package bank.repositories;

import org.springframework.data.repository.CrudRepository;

import bank.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
	
	User findByEmail(String email);
	
	User findByUsername(String username);
	
}