package com.verizon.jpa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private String role;
	
	private String location;

	public User(String name, String role, String location) {
		super();
		this.name = name;
		this.role = role;
		this.location = location;
	}
	
	public User(Integer id, String name, String role, String location) {
		super();
		this.name = name;
		this.role = role;
		this.location = location;
		this.id = id;
	}
	
	User(){
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", role=" + role + ", location=" + location + "]";
	}
	
	

}
