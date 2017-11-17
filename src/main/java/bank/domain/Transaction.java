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
	public double amount;
	public Date transactionDate;
	public String description;
	public String counterparty;
	
	@ManyToOne
	@JoinColumn(name = "current_account_id")
	private CurrentAccount currentAccount;
	
	@ManyToOne
	@JoinColumn(name = "savings_account_id")
	private SavingsAccount savingsAccount;
	
	public Transaction(double amount, CurrentAccount currentAccount, String description, String counterparty) {
		this.amount = amount;
		this.transactionDate = DateProvider.getInstance().now();
		this.currentAccount = currentAccount;
		this.description = description;
		this.counterparty = counterparty;
	}

	public Transaction() {}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCounterparty() {
		return counterparty;
	}

	public void setCounterparty(String counterparty) {
		this.counterparty = counterparty;
	}

	public double getAmount() {
		return amount;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
}