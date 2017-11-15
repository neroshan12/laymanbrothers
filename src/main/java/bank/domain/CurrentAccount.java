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

@Entity
public class CurrentAccount {
	
	public static final double DAILY_INTEREST = 1.002;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	public int balance;
	
	@OneToMany(mappedBy = "currentAccount", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
	public List<Transaction> transactions;
	
	public CurrentAccount() {
	}

	public CurrentAccount(int balance) {
		super();
		this.balance = balance;
	}

	public int getId() {
		return id;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	public static double getDailyInterest() {
		return DAILY_INTEREST;
	}

	public void addInterest() {
		balance *= DAILY_INTEREST;		
	}
	
	public void deposit(int amount) {
		balance += amount;
	}
	
	public void withdraw(int amount) {
		balance -= amount;
	}
}

