package com.codingdojo.com.omikiji1.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@getMapping display the web page with the form , the @postMapping will send the form to the database, the @RequestMapping show the webpage with all the information 

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@PostMapping("/send")
	public String send(HttpSession session, @RequestParam(value = "year") int year,
			@RequestParam(value = "city") String city,
			@RequestParam(value = "person") String person,
			@RequestParam(value = "hobby") String hobby,
			@RequestParam(value = "animal") String animal,
			@RequestParam(value = "compliment") String compliment) {

		session.setAttribute("year", year);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobby);
		session.setAttribute("animal", animal);
		session.setAttribute("compliment", compliment);
		return "redirect:/show";
	}

	@RequestMapping("/show")
	public String show() {
		return "show.jsp";
	}

}
