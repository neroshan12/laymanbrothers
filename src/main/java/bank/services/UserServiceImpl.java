package bank.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bank.domain.CurrentAccount;
import bank.domain.SavingsAccount;
import bank.domain.User;
import bank.repositories.UserRepository;
import bank.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;
	
	private AccountService AccountService;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
    public List<User> listAll() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add); //fun with Java 8
        return users;
    }

	 @Override
	 public User findByUsername(String username) {
	 return userRepository.findByUsername(username);
	}
	
    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    
    @Override
    public User findById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public User saveOrUpdate(User user) {
        user.setSavingsAccount(new SavingsAccount(1000));
        user.setCurrentAccount(new CurrentAccount(1000));
        userRepository.save(user);	
        return user;
    }
}
