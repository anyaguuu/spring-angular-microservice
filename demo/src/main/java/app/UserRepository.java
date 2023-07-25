package app;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import beans.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
