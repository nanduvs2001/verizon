package com.verizon.jpa.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.jpa.entities.User;
import com.verizon.jpa.services.UserService;

@RestController
@RequestMapping ("api/v1")
public class UserController {
	
	@Autowired
	UserService service;
	
	@GetMapping("/users")
	Iterable<User> getAllUsers() {
		return service.getAllUsers();
	}
	
	@GetMapping("/user/{id}")
	Optional<User> getUserById(@PathVariable Integer id) {
		return service.getUserById(id);
	}
	
	@PostMapping("/user")
	void addNewUser(@RequestBody User user) {
		service.addNewUser(user);
	}
	
	@PutMapping("/user/{id}")
	void updateExistingUser(@PathVariable Integer id, @RequestBody User user) {
		service.updateExistingUser(user);
	}
	
	@DeleteMapping("/user/{id}")
	void deleteExistingUser (@PathVariable Integer id) {
		service.deleteExistingUser(id);
	}
	
	@GetMapping("/users/location/{location}")
	public List<User> getUserByLocation(@PathVariable String location){
		return service.getUserByLocation(location);
	}
	
	@GetMapping("/users/name/{name}")
	public List<User> getUserByName(@PathVariable String name){
		return service.getUserByName(name);
	}
	
	@GetMapping("/users/role/{role}")
	public List<User> getUserByRole(@PathVariable String role){
		return service.getUserByRole(role);
	}
}
