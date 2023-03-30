package com.codingdojo.com.demo2;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("OwnerName", "Muriel");
		
		return "index.jsp";
	}
	
	@RequestMapping("list/{name}/{iceCreamFlavor}")
	public String list(@PathVariable String name,@PathVariable String iceCreamFlavor, Model model)
	{ //we have a list here call location, and we are adding some locations in our list. allcities,flavor et name se sont des variables
		//The @PathVariable annotation has only one attribute value for binding the request URI template. It is allowed to use the multiple @PathVariable annotation in the single method. But, ensure that no more than one method has the same pattern.
        //@RequestParam is more useful on a traditional web application where data is mostly passed in the query parameters while @PathVariable is more suitable for RESTful web services where URL contains values.

		ArrayList<String> locations = new ArrayList<>();
		locations.add("seattle");
		locations.add("berwick");
		locations.add("Dallas");
		                   //variable,value
		model.addAttribute("allCities", locations);
		model.addAttribute("flavor", iceCreamFlavor);
		
		model.addAttribute("name", name);
		
		return "list.jsp";
	}
	
	
}
