package bank.services;

import bank.domain.CurrentAccount;
import bank.domain.SavingsAccount;

public interface AccountService {
	
	CurrentAccount createCurrentAccount();
	
	SavingsAccount createSavingsAccount();
	
}
