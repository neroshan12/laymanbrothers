package services;

import java.security.Principal;

import domain.CurrentAccount;

public interface AccountService {

	CurrentAccount createAccount();
	
    void deposit(CurrentAccount account, double amount, Principal principal);    
    void withdraw(CurrentAccount account, double amount, Principal principal);
}
