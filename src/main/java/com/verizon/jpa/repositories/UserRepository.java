package com.verizon.jpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.verizon.jpa.entities.User;

import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQuery;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	
	//Search by location
	List<User> findByLocation(String location);
	
	//Search by name
	List<User> findByName(String name);
	
	//Search by role
	List<User> findByRole(String role);

}
