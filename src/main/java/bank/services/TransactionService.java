package bank.services;

import java.util.List;

import bank.domain.Transaction;

interface TransactionService {
	
	List<Transaction> listAll();
	
	Transaction findById(int id);
	
	Transaction findByAmount(int amount);
	
	Transaction saveOrUpdate(Transaction transaction);

}
