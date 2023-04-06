package com.codingdojo.com.savetravels.controllers;

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

import com.codingdojo.com.savetravels.models.SaveTravelModel;
import com.codingdojo.com.savetravels.services.SaveTravelService;

@Controller
public class SaveTravelController {


	@Autowired
	private SaveTravelService savetravelServ;
	
	
	
//	this will display the index,jsp with the add burger form
	
	
	@GetMapping("/")
	public String index(@ModelAttribute("expense") SaveTravelModel expense, Model model) {
		
		
		
		return "index.jsp";
	}
	
	
	
	// display the show burger
	
	@GetMapping("/showexpense")
	public String showexpense(@ModelAttribute("expense") SaveTravelModel expense, Model model) {
		
		model.addAttribute("allExpenses", savetravelServ.allExpenses());
		
		return "showexpense.jsp";
	}
	
	
	
	
//	Creating Burger
	
	@PostMapping("/createexpense")
	public String create(@Valid @ModelAttribute("expense") SaveTravelModel newExpense, BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			
			model.addAttribute("allExpenses", savetravelServ.allExpenses());
			
			return "index.jsp";}
			
		 else {
			 savetravelServ.create(newExpense);
			return "redirect:/showexpense";
		}
	}
	
	
//	Edit burger page =====this fonction will display the edit form for our burger
	
	@GetMapping("/edit/{id}")
	
	public String edit(@PathVariable("id") Long id, @ModelAttribute("expenseEditForm") SaveTravelModel expense, Model model) {
		model.addAttribute("expense", savetravelServ.findExpense(id));
		return "editexpense.jsp";
	}
	
	
//	Update Expensserinfos  ====this fonction will update the new value regarding our expense in the database
	
	@PutMapping("/update/{id}")
	
	public String update(@PathVariable("id") Long id, @Valid @ModelAttribute("expenseEditForm") SaveTravelModel expense, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("expense", savetravelServ.findExpense(id));// if not give me back the same burger
			return "editexpense.jsp";
		} else {
			savetravelServ.update(expense);  //if yes update the burger
			return "redirect:/showexpense";
		}
	}
	
	
//	Delete 1 Item
	
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		savetravelServ.deleteOne(id);
		return "redirect:/showexpense";
	}
	
	//get the expense detail by id
	
	@GetMapping("/expensedetail/{id}")
	public String expensedetail(@PathVariable("id") Long id,@ModelAttribute("expense") SaveTravelModel expense, Model model) {
		
		model.addAttribute("expense", savetravelServ.getoneExpense(id));
		
		return "expensedetail.jsp";
	}
	
	
	
	
	
}
