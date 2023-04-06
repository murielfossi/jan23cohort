package com.codingdojo.com.savetravels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.com.savetravels.models.SaveTravelModel;
@Repository
public interface SaveTravelRepository extends CrudRepository<SaveTravelModel, Long>{
	
		
		List<SaveTravelModel> findAll();

}


///======Repository talk directly to the database========