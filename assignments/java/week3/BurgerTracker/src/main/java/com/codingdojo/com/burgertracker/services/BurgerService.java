package com.codingdojo.com.burgertracker.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.com.burgertracker.models.BurgerModel;
import com.codingdojo.com.burgertracker.repositories.BurgerRepository;

@Service
public class BurgerService {
	
	
	@Autowired
	private BurgerRepository burgerRepo;
	
	
    // ===================================================================
    //         METHODS .Service help our controller to talk to the database
    // ==================================================================
	
	
	
	//Read has 2 main function , read all and read one,
	
		public List<BurgerModel> allBurgers() {
			return burgerRepo.findAll();
		}
		
		public BurgerModel findBurger(Long id) {
			Optional<BurgerModel> optionalBurger = burgerRepo.findById(id);
			if(optionalBurger.isPresent()) {
				return optionalBurger.get();
			}else {
				return null;
			}
		}
		
		public BurgerModel getBurger(Long id) {
			return burgerRepo.findById(id).orElse(null);
		}
		
		//Create and save the item to the database
		public BurgerModel create(BurgerModel b) {
			return burgerRepo.save(b);
		}
		
		//Update and save the item to the database
		public BurgerModel update(BurgerModel b) {
			return burgerRepo.save(b);
		}
		
		//Delete the item in the database
		public void deleteOne(Long id) {
			burgerRepo.deleteById(id);
		}
	
	
	
	
	
	
	
	
	
	
	

}
