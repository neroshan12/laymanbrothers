package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;
import java.util.ArrayList;

@Entity
public class CurrentAccount {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private int balance;
	public List<Transaction> transactions;

	public CurrentAccount(int balance) {
		this.balance = balance;
		this.transactions = new ArrayList<Transaction>();
	}

	public long getId() {
		return id;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	public void deposit(int amount) {
		balance += amount;
	}
	
	public void withdraw(int amount) {
		balance -= amount;
	}
	
}
