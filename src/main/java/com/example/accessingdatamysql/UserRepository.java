package com.example.accessingdatamysql;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {

	@Query(value = "select * from User u where u.date = ?1 LIMIT 1", nativeQuery = true)
	Optional<User> findByDate( String date1);
}
