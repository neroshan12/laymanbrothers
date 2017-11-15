package bank.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bank.domain.Transaction;
import bank.repositories.TransactionRepository;

@Service
public class TransactionServiceImpl implements TransactionService {
	
	private TransactionRepository transactionRepository;
	
	@Autowired
	public TransactionServiceImpl(TransactionRepository transactionRepository) {
		this.transactionRepository = transactionRepository;
	}

	@Override
	public List<Transaction> listAll() {
		List<Transaction> transactions = new ArrayList<>();
		transactionRepository.findAll().forEach(transactions::add);
		return transactions;
		
	}

	@Override
	public Transaction findById(int id) {
		return transactionRepository.findById(id);
	}

	@Override
	public Transaction findByAmount(int amount) {
		return transactionRepository.findByAmount(amount);
	
	}

	@Override
	public Transaction saveOrUpdate(Transaction transaction) {
		transactionRepository.save(transaction);
		return transaction;
	}
	

	
	}


