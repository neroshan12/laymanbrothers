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
public class CurrentAccount extends Account {
	
	public static final double DAILY_INTEREST = 1.002;
	private static final double OVERDRAFT = -100.00;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
    @OneToMany(mappedBy = "currentAccount", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
	public List<Transaction> transactions;

	public CurrentAccount(double balance) {
		super(balance);
	}

	public long getId() {
		return id;
	}
	
	public void addInterest() {
		balance *= DAILY_INTEREST;		
	}

	public double getOverdraft() {
		return OVERDRAFT;
	}
	
}
