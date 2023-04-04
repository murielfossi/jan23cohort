package com.codingdojo.com.counter.Controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


		@Controller
		public class HomeController {
			
			
			@RequestMapping("/index")
			public String index(HttpSession session) {
				session.setAttribute("count", 0);
			
				
				return "index.jsp";
			}
			
			
			
			@RequestMapping("/welcome")
			public String Welcome(HttpSession session) {
				session.setAttribute("count", 0);
			
				
				return "index.jsp";
			}
			
			
			
		}
	    

		

