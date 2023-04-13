package com.codingdojo.com.registrationlogin.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.com.registrationlogin.models.LoginModel;
import com.codingdojo.com.registrationlogin.models.UserModel;
import com.codingdojo.com.registrationlogin.services.UserService;

@Controller
public class RegisterLoginController {

	@Autowired
	private UserService userServ;
	
	
	// ==========================
    //      LOGREG FUNCTIONS
    // ==========================
	
	
	
	@GetMapping("/")
	public String logReg(HttpSession session, Model model) {
		if(session.getAttribute("user_id") != null) {
			return "redirect:/success";
		} else 
		{
	        // Bind empty User and LoginModel objects to the JSP
	        // to capture the form input
	        model.addAttribute("newUser", new UserModel());
	        model.addAttribute("newLogin", new LoginModel());

		return "logReg.jsp";
		}
	}
	
	
	
	
	
	
	
   // Create User Process
   @PostMapping("/register")
   public String registerUser(@Valid @ModelAttribute("newUser") UserModel newUser, BindingResult result, Model model, HttpSession session) {
   	userServ.register(newUser, result);
       if(result.hasErrors()) {
           model.addAttribute("newLogin", new LoginModel());
           return "logReg.jsp";
       }
       session.setAttribute("user_id", newUser.getId());
       return "reirect:/success";
   }
   
   // Login User Process
   @PostMapping("/login")
   public String loginUser(@Valid @ModelAttribute("newLogin") LoginModel newLogin, BindingResult result, Model model, HttpSession session) {
       UserModel user = userServ.login(newLogin, result);
       if(result.hasErrors()) {
           model.addAttribute("newUser", new UserModel());
           return "logReg.jsp";
       }
       session.setAttribute("user_id", user.getId());
       return "redirect:/success";
   }
   
   // Logout User
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	@GetMapping("/success")
	public String success(HttpSession session, Model model) {
		if(session.getAttribute("user_id") == null) {
			return "redirect:/logReg";
		} else {
		model.addAttribute("theUser", userServ.getUser((Long)session.getAttribute("user_id")));
		return "success.jsp";
		}
	}
}
