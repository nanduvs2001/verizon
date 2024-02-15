package com.verizon.jpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.jpa.entities.Place;
import com.verizon.jpa.repositories.PlaceRepository;

@Service
public class PlaceService {

	@Autowired
	PlaceRepository repository;

	public List<Place> getAllPlacesByUserId(Integer id) {
		return repository.findByUserId(id);
	}

	public Optional<Place> getPlaceById(Integer id) {
		return repository.findById(id);
	}

	public void addNewPlace(Place place) {
		repository.save(place);
	}

	public void updateExistingPlace(Integer userId, Place place) {
		repository.save(place);
	}

	public void deleteExistingPlace(Integer placeId) {
		repository.deleteById(placeId);
	}

}
