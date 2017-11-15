package bank.services;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bank.domain.CurrentAccount;
import bank.domain.SavingsAccount;
import bank.domain.Transaction;
import bank.domain.User;
import bank.repositories.CurrentAccountRepository;
import bank.repositories.SavingsAccountRepository;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private SavingsAccountRepository savingsAccountRepository;
	
	@Autowired
	private CurrentAccountRepository currentAccountRepository;
	
	@Autowired
    private UserService userService;
	
	@Autowired
    private TransactionService transactionService;
	
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
	 
	  public void deposit(int amount, User user) {
//	        User user = userService.findByUsername(principal.getName());
	        
	        CurrentAccount currentAccount = user.getCurrentAccount();
	        currentAccount.deposit(amount);
	        currentAccountRepository.save(currentAccount);
	        
	        Transaction transaction = new Transaction(amount);
	        transactionService.saveOrUpdate(transaction);
	  }
	        
	  public void withdraw(int amount, User user) {
	  		  
		    CurrentAccount currentAccount = user.getCurrentAccount();
		    currentAccount.withdraw(amount);
		    currentAccountRepository.save(currentAccount);
		        
		    Transaction transaction = new Transaction(amount);
		    transactionService.saveOrUpdate(transaction);
	  }        
	 
}
