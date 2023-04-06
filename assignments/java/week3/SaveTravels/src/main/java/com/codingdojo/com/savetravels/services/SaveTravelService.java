package com.codingdojo.com.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.com.savetravels.models.SaveTravelModel;
import com.codingdojo.com.savetravels.repositories.SaveTravelRepository;
@Service
public class SaveTravelService {
	
	
	@Autowired
	private SaveTravelRepository savetravelRepo;
	
	
    // ===================================================================
    //         METHODS .Service help our controller to talk to the database
    // ==================================================================
	
	
	
	public List<SaveTravelModel> allExpenses() {
		return savetravelRepo.findAll();
	}
	
	public SaveTravelModel findExpense(Long id) {
		Optional<SaveTravelModel> optionalExpense = savetravelRepo.findById(id);
		if(optionalExpense.isPresent()) {
			return optionalExpense.get();
		}else {
			return null;
		}
	}
	
	public SaveTravelModel getoneExpense(Long id) {
		return savetravelRepo.findById(id).orElse(null);
	}
	
	//Create and save the item to the database
	public SaveTravelModel create(SaveTravelModel e) {
		return savetravelRepo.save(e);
	}
	
	//Update and save the item to the database
	public SaveTravelModel update(SaveTravelModel e) {
		return savetravelRepo.save(e);
	}
	
	//Delete the item in the database
	public void deleteOne(Long id) {
		savetravelRepo.deleteById(id);
	}

	
	
	
	
	
	
	
	
	
	
	

}
