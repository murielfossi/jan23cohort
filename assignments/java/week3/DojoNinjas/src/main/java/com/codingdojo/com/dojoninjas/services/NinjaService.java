package com.codingdojo.com.dojoninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.com.dojoninjas.Models.NinjaModel;
import com.codingdojo.com.dojoninjas.repositories.NinjaRepository;

@Service
public class NinjaService {

	@Autowired
private NinjaRepository ninjaRepo;
	
	public List<NinjaModel> getAllNinja(){
		return ninjaRepo.findAll();
	}
	
	public NinjaModel createNinja(NinjaModel n) {
		return ninjaRepo.save(n);
	}
}
	
	
	

