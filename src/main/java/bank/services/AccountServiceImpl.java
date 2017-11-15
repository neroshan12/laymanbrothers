package bank.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bank.domain.CurrentAccount;
import bank.domain.SavingsAccount;
import bank.repositories.CurrentAccountRepository;
import bank.repositories.SavingsAccountRepository;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private SavingsAccountRepository savingsAccountRepository;
	
	@Autowired
	private CurrentAccountRepository currentAccountRepository;
	
	
	 public SavingsAccount createSavingsAccount() {
	     	SavingsAccount savingsAccount = new SavingsAccount(100);

	        savingsAccountRepository.save(savingsAccount);

	        return savingsAccountRepository.findById(savingsAccount.getId());
	    }
	 
	 
	 public CurrentAccount createCurrentAccount() {
	     	CurrentAccount currentAccount = new CurrentAccount(100);

	        currentAccountRepository.save(currentAccount);

	        return currentAccountRepository.findById(currentAccount.getId());
	    }
	 
}
