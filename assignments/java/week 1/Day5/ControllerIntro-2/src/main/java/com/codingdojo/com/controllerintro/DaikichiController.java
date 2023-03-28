package com.codingdojo.com.controllerintro;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class DaikichiController {
	 @RequestMapping("daikichi")
	    public String daikichi(){
	      return "Welcome!";
	    }
	 
	 
	 
		@RequestMapping("/daikichi/today")
	    // 3. Method that maps to the request route above
	    public String today()
		{  return "Today you will find luck in all your endeavors!";
	           
		}
		
		@RequestMapping("/daikichi/tomorrow")
	    // 3. Method that maps to the request route above
	    public String tomorrow()
		{  return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	           
		}
}
