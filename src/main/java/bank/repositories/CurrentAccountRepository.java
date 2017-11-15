package bank.repositories;

import org.springframework.data.repository.CrudRepository;

import bank.domain.CurrentAccount;

public interface CurrentAccountRepository extends CrudRepository<CurrentAccount, Long>{
	CurrentAccount findById (int id);

}
