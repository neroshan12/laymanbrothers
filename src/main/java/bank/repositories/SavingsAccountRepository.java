package bank.repositories;

import org.springframework.data.repository.CrudRepository;

import bank.domain.SavingsAccount;

public interface SavingsAccountRepository extends CrudRepository<SavingsAccount, Long>{
	SavingsAccount findById (int id);

}
