package com.codingdojo.com.dojoninjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.com.dojoninjas.Models.DojoModel;
import com.codingdojo.com.dojoninjas.Models.NinjaModel;
import com.codingdojo.com.dojoninjas.services.DojoService;
import com.codingdojo.com.dojoninjas.services.NinjaService;

@Controller
public class DojoNinjaController {

	 @Autowired
	 private DojoService dojoServ;
	 
	 @Autowired
	 private NinjaService ninjaServ;
	 
	 
	 
	 
	 
	 @GetMapping("/")
	 
	 public String DisplayDojo(@ModelAttribute("dojoForm") DojoModel dojo) {
			return "displaydojo.jsp";
		}
		
	 
	 
	 @PostMapping("/createdojo")
		public String CreateDojo(@Valid @ModelAttribute("dojoForm") DojoModel dojo, BindingResult result, Model model) {
			if(result.hasErrors()) {
				return "displaydojo.jsp";
			}else { 
				dojoServ.createDojo(dojo);
				return "redirect:/";
			}
		}
	
	////////======================ninjas=============////////////
	
	 @GetMapping("/displayninja")
		public String DisplayNinja(@ModelAttribute("ninjaForm") NinjaModel n, Model model) {
			model.addAttribute("allDojos", dojoServ.getAllDojo());//ici, on ajoute tous les dojos qui sont stockes dans notre liste allDojos car on en a besoin lors de la creation du ninja selon le ux design
			return "displayninja.jsp";
		}
		
	
	 @PostMapping("/createninja")
		public String CreateNinja(@Valid @ModelAttribute("ninjaForm") NinjaModel n, BindingResult result, Model model) {
			if(result.hasErrors()) {
				model.addAttribute("allDojos", dojoServ.getAllDojo());
				return  "displayninja.jsp";
			}else {
				ninjaServ.createNinja(n);
				return "redirect:/";
			}
		}
	
	
	 @GetMapping("/dojos/{id}")
		public String showDojoNinja(@PathVariable(value="id") Long id, Model model) {
			model.addAttribute("viewDojo", dojoServ.getADojo(id));
			return "showdojoninja.jsp";
		}
	
	
	
}
