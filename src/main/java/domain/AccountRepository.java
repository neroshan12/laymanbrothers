package domain;

import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<CurrentAccount, Long> {

}
