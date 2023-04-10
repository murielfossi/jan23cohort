package com.codingdojo.com.dojoninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.com.dojoninjas.Models.DojoModel;
import com.codingdojo.com.dojoninjas.repositories.DojoRepository;

@Service
public class DojoService {

	@Autowired
	private DojoRepository dojoRepo;
	
	public DojoModel getADojo(Long id) {
		return dojoRepo.findById(id).orElse(null);
	}
	
	public DojoModel createDojo(DojoModel d) {
		return dojoRepo.save(d);
	}
	
	public List<DojoModel> getAllDojo(){
		return dojoRepo.findAll();	}
}
