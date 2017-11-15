package bank.repositories;

import org.springframework.data.repository.CrudRepository;

import bank.domain.Transaction;

public interface TransactionRepository extends CrudRepository<Transaction, Long> {

		Transaction findById(int id);
		
		Transaction findByAmount(int amount);
}
