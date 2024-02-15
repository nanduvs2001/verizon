package com.verizon.jpa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Place {
	
	@Id
	private Integer placeId;
	
	private String placeName;
	
	private String placeState;
	
	// To establish a primary-foreign key relationship
	@ManyToOne
	private User user;

	public Place(Integer placeId, String placeName, String placeState, Integer userId) {
		this.placeId = placeId;
		this.placeName = placeName;
		this.placeState = placeState;
		this.user = new User(userId,"","","");
	}
	
	Place(){
		
	}
	

	@Override
	public String toString() {
		return "Place [placeId=" + placeId + ", placeName=" + placeName + ", placeState=" + placeState + ", user="
				+ user + "]";
	}

	public Integer getPlaceId() {
		return placeId;
	}

	public void setPlaceId(Integer placeId) {
		this.placeId = placeId;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public String getPlaceState() {
		return placeState;
	}

	public void setPlaceState(String placeState) {
		this.placeState = placeState;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

}
