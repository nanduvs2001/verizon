package com.verizon.jpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.verizon.jpa.entities.User;
import com.verizon.jpa.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository repository;
	
	public Iterable<User> getAllUsers() {
		return repository.findAll();
	}
	
	public Optional<User> getUserById(@PathVariable Integer id) {
		return repository.findById(id);
	}
	
	public void addNewUser(@RequestBody User user) {
		repository.save(user);
	}
	
	public void updateExistingUser(@RequestBody User user) {
		repository.save(user);
	}
	
	public void deleteExistingUser(@PathVariable Integer id) {
		repository.deleteById(id);
	}
	
	public List<User> getUserByLocation(String location){
		return repository.findByLocation(location);
	}
	
	public List<User> getUserByName(String name){
		return repository.findByName(name);
	}
	
	public List<User> getUserByRole(String role){
		return repository.findByRole(role);
	}


}
