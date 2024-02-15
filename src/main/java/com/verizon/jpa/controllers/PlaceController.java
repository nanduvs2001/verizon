package com.verizon.jpa.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.jpa.entities.Place;
import com.verizon.jpa.entities.User;
import com.verizon.jpa.services.PlaceService;

@RestController
@RequestMapping("/api/v1")
public class PlaceController {
    
    @Autowired
    PlaceService service;
    
    // Get all places for a user
    @GetMapping("/places/{userId}")
    List<Place> getAllPlacesByUserId(@PathVariable Integer userId) {
        return service.getAllPlacesByUserId(userId);
    }
    
    // Add a new place
    @PostMapping("places/{userId}")
    void addNewPlace(@RequestBody Place place, @PathVariable Integer userId) {
        place.setUser(new User(userId, "", "", ""));
        service.addNewPlace(place);
    }
    
    // Update existing place
    @PutMapping("places/{userId}")
    void updateExistingPlace(@RequestBody Place place, @PathVariable Integer userId) {
        service.updateExistingPlace(userId, place);
    }
    
    // Delete existing place
    @DeleteMapping("places/{placeId}") // Corrected path variable to placeId
    void deleteExistingPlace(@PathVariable Integer placeId) {
        service.deleteExistingPlace(placeId);
    }
}
