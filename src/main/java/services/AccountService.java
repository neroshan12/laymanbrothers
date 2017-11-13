package services;

import java.security.Principal;

import domain.Account;

public interface AccountService {

	Account createAccount();
	

    void deposit(Account account, double amount, Principal principal);    
    void withdraw(Account account, double amount, Principal principal);
}
