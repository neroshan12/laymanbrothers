package bank.domain;

import java.util.List;
import java.util.ArrayList;

public class Account {

	double balance;
	public List<Transaction> transactions = new ArrayList<Transaction>();
	
//	this.transactions = new ArrayList<Transaction>();
	public Account(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	
public void transferToCurrent(double transferAmount, CurrentAccount otherAccount)
	{
		this.withdraw(transferAmount);
		otherAccount.deposit(transferAmount);
	}
	public void transferToSavings(double transferAmount, SavingsAccount otherAccount)
	{
		this.withdraw(transferAmount);
		otherAccount.deposit(transferAmount);
	}
	
}
