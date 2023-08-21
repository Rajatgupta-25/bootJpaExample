package com.jps.test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jps.test.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	public List<User> findByName(String name);
	
	public List<User> findByNameStartingWith(String prefix);
	
	
	//JPAQL
	@Query("select u FROM User u")
	public List<User> getAllUser();
	
	@Query("select u FROM User u WHERE u.name =:n and u.city =:c")
	public List<User> getUserByNameAndCity(@Param("n") String name, @Param("c") String city);
	
	
	//Native Query
	@Query(value = "select * from user", nativeQuery = true)
	public List<User> getUsers();
	
	
}
