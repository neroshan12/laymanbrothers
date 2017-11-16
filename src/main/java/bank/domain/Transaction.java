package bank.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Transaction {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;	
	public int amount;
	public Date transactionDate;
	public String description;
	
	@ManyToOne
	@JoinColumn(name = "current_account_id")
	private CurrentAccount currentAccount;
	
	@ManyToOne
	@JoinColumn(name = "savings_account_id")
	private SavingsAccount savingsAccount;
	
	public Transaction(int amount, CurrentAccount currentAccount, String description) {
		this.amount = amount;
		this.transactionDate = DateProvider.getInstance().now();
		this.currentAccount = currentAccount;
		this.description = description;
	}

	public Transaction() {}
	
	public int getAmount() {
		return amount;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}
}