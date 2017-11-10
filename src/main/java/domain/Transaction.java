package domain;

import java.util.Date;

public class Transaction {
	
	public final int amount;
	public final Date transactionDate;
	
	public Transaction(int amount) {
		this.amount = amount;
		this.transactionDate = DateProvider.getInstance().now();
	}

	public int getAmount() {
		return amount;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}
	

	
	
}