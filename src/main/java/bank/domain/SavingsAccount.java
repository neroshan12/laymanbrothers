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
public class SavingsAccount {
	
	public static final double DAILY_INTEREST = 1.005;
	public static final double OVERDRAFT = 0.00;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	public int balance;
	
	@OneToMany(mappedBy = "savingsAccount", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
	public List<Transaction> transactions;
	
	public SavingsAccount() {
	}

	public SavingsAccount(int balance) {
		super();
		this.balance = balance;
	}

	public int getId() {
		return id;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
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

	public double getOverdraft() {
		return OVERDRAFT;
	}
}

