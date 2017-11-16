package bank.services;

import java.security.Principal;

import bank.domain.CurrentAccount;
import bank.domain.SavingsAccount;
import bank.domain.User;

public interface AccountService {
	
	CurrentAccount createCurrentAccount();
	
	SavingsAccount createSavingsAccount();
	
	void deposit(int amount, User user);
	
	void withdraw(int amount, User user);
	
	void transferToSavings(int amount, User user, SavingsAccount savingsAccount);
}
