package bank.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;
import java.util.ArrayList;

@Entity
public class CurrentAccount {
	
	public static final double DAILY_INTEREST = 1.002;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	double balance;
	
    @OneToMany(mappedBy = "currentAccount", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
	public List<Transaction> transactions;

	public CurrentAccount(double balance) {
		this.balance = balance;
		this.transactions = new ArrayList<Transaction>();
	}

	public long getId() {
		return id;
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
	
	public void addInterest() {
		balance *= DAILY_INTEREST;		
	}
	
	public void transfer(double transferAmount, CurrentAccount otherAccount)
	{
		this.withdraw(transferAmount);
		otherAccount.deposit(transferAmount);
			
	}
	
}
