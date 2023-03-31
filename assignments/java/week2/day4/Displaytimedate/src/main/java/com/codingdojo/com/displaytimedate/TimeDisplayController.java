package com.codingdojo.com.displaytimedate;

import java.text.SimpleDateFormat;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller

public class TimeDisplayController {
	
	
	@RequestMapping("/")
    public String Dashboard(){
      return "dashboard.jsp";
    }
 
 
 
	@RequestMapping("/time")
    // 3. Method that maps to the request route above
    public String Time(Model model)
	{  
		//did not work need improvement
		//son java util cest: import java.time.format.DateTimeFormatter;
//		String time = "HH:mm:ss";
//		DateTimeFormatter timeformatter = DateTimeFormatter.ofPattern("HH:mm:ss");  
//        String strTime = timeformatter.time;
//        model.addAttribute("striTime",strTime );
//         return "date.jsp";  
		
		   Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss aa"); // ceci m'a display l'heure un peu coe au pays("HH 'hrs' mm 'mins' ss 'ss'")
		    String strDate = formatter.format(date);
		     model.addAttribute("striDate",strDate );
		    
			  return "date.jsp";
	}
	
	
	
	@RequestMapping("/date")
    // 3. Method that maps to the request route above
	// the model help you pass information in your jsp  file to display in your web page.
	//model.addAttribute("striDate",strDate ); in this exemple i have a key called striDate and a variable called strDate=formatter.format(date);
	//je doit uniquement passer le key called strDiate dans mon jsp file.
	
    public String Date(Model model) {
		
   
    Date date = new Date();
	SimpleDateFormat formatter = new SimpleDateFormat("EEEE MMM dd, yyyy");  
    String strDate = formatter.format(date);
     model.addAttribute("striDate",strDate );
    
	  return "date.jsp";
	  
	}
	
}
           
	


