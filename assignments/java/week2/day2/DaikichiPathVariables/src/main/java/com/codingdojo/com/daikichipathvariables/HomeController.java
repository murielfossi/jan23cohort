package com.codingdojo.com.daikichipathvariables;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



	@RestController
	public class HomeController {
		
		
		@RequestMapping("/")
		public String index() {
			return "Hello, welcome to Daikichi website";
		}
		
		
		@RequestMapping("/daikichi/travel/{city}")
		
		public String index(@PathVariable("city") String cityInput) {
			return "Congratulations! You will soon tavel to " + cityInput + "!";
		}
		
		
		
		@RequestMapping("/daikichi/lotto/{num}")
		public String lotto(@PathVariable("num") int searchQuery) {
			if(searchQuery % 2 == 0) {
				return "You will take a grand journey in the near future, but be wary of tempting offers";
			} else {
				return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends";
			}
		}
}
