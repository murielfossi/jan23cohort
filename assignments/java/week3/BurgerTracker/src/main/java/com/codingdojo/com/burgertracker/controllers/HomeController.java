package com.codingdojo.com.burgertracker.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.codingdojo.com.burgertracker.models.BurgerModel;
import com.codingdojo.com.burgertracker.services.BurgerService;
@Controller
public class HomeController {
	
	
	@Autowired
	private BurgerService burgerServ;
	
	
	
//	this will display the index,jsp with the add burger form
	
	
	@GetMapping("/")
	public String index(@ModelAttribute("burger") BurgerModel burger, Model model) {
		
		
		
		return "index.jsp";
	}
	
	
	
	// display the show burger
	
	@GetMapping("/showburger")
	public String showburger(@ModelAttribute("burger") BurgerModel burger, Model model) {
		
		model.addAttribute("allBurgers", burgerServ.allBurgers());
		
		return "showburger.jsp";
	}
	
	
	
	
//	Creating Burger
	
	@PostMapping("/createburger")
	public String create(@Valid @ModelAttribute("burger") BurgerModel newBurger, BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			
			model.addAttribute("allBurgers", burgerServ.allBurgers());// ====List<BurgerModel> burgers = burgerServ.allburgers();
			
			return "index.jsp";}
			
		 else {
			burgerServ.create(newBurger);
			return "redirect:/showburger";
		}
	}
	
	
//	Edit burger page =====this fonction will display the edit form for our burger
	
	@GetMapping("/edit/{id}")
	
	public String edit(@PathVariable("id") Long id, @ModelAttribute("burgerEditForm") BurgerModel burger, Model model) {
		model.addAttribute("burger", burgerServ.findBurger(id));
		return "editburger.jsp";
	}
	
	
//	Update Burgerinfos  ====this fonction will update the new value regarding our burger in the database
	
	@PutMapping("/update/{id}")
	
	public String update(@PathVariable("id") Long id, @Valid @ModelAttribute("burgerEditForm") BurgerModel burger, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("burger", burgerServ.findBurger(id));// if not give me back the same burger
			return "editburger.jsp";
		} else {
			burgerServ.update(burger);  //if yes update the burger
			return "redirect:/showburger";
		}
	}
	
	
//	Delete 1 Item
	
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		burgerServ.deleteOne(id);
		return "redirect:/showburger";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
