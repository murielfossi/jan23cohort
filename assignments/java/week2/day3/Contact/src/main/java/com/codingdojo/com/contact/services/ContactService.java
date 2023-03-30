package com.codingdojo.com.contact.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.com.contact.models.ContactModel;
import com.codingdojo.com.contact.repositories.ContactRepository;

@Service

public class ContactService {
	
	//=======
	//Fi=IELDS
	//adding the repo dependency
	private final ContactRepository contactRepo;
	
	//=======
	//Constructor
	//======
	//enables us to use CrrudRepository library of pre-written code
	
	public ContactService(ContactRepository contactRepo) {
		this.contactRepo=contactRepo;}
	
	
	//==========
	//Methods
	//==========
	
	
	//CREATE
	
	//FIND ALL
	
     public List<ContactModel> allContact(){
    	 return contactRepo.findAll();
     }
}
