package com.codingdojo.com.counterproject.controllers;

	
	import javax.servlet.http.HttpSession;

	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;


			@Controller
			public class HomeController {
				
				
				@RequestMapping("/index")
				public String index(HttpSession session) {
					session.setAttribute("count", 10);
				
					
					return "index.jsp";
				}
				
				
				
				@RequestMapping("/")
				public String Welcome(HttpSession session) {
					session.setAttribute("user", "Muriel");
				
					
					return "welcome.jsp";
				}
				
				
				
	}


