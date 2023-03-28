package com.codingdojo.com.demo2;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("list/{name}/{iceCreamFlavor}")
	public String list(@PathVariable String name,@PathVariable String iceCreamFlavor, Model model)
	{
		ArrayList<String> locations = new ArrayList<>();
		locations.add("seattle");
		locations.add("berwick");
		locations.add("Dallas");
		
		model.addAttribute("allCities", locations);
		model.addAttribute("flavor", iceCreamFlavor);
		
		model.addAttribute("name", name);
		
		return "list.jsp";
	}
	
	
}
