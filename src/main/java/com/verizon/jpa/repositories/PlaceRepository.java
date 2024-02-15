package com.verizon.jpa.repositories;

import org.springframework.data.repository.CrudRepository;
import com.verizon.jpa.entities.Place;
import java.util.List;

public interface PlaceRepository extends CrudRepository<Place, Integer>  {
	
	List<Place> findByUserId(Integer userId);

}
