package com.codingdojo.com.contact.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.com.contact.models.ContactModel;
import com.codingdojo.com.contact.services.ContactService;

@Controller
public class HomeController {

	//=========FIELD=============
	
	private final ContactService contactService;
	
	
	
	//============
	//Constructor 
	//=========
	
	/**
	 * @param contactService
	 */
	public HomeController(ContactService contactService) {
		
		this.contactService = contactService;
	}
	
	
	
	@RequestMapping("/")
	public String index(Model model) {
		//list of contacts
		
		List<ContactModel> contacts = contactService.allContact();
		//send the info to my index.jsp
		
		model.addAttribute("ViewContacts", contacts);
		return "index.jsp";
		
	}

}
