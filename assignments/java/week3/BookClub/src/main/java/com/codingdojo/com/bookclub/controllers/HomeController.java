package com.codingdojo.com.bookclub.controllers;

import java.awt.print.Book;

import javax.servlet.http.HttpSession;
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

import com.codingdojo.com.bookclub.models.BookModel;
import com.codingdojo.com.bookclub.models.LoginModel;
import com.codingdojo.com.bookclub.models.UserModel;
import com.codingdojo.com.bookclub.services.BookService;
import com.codingdojo.com.bookclub.services.UserService;

@Controller
public class HomeController {

	@Autowired
	private UserService userServ;
		
	
	@Autowired
	private BookService bookServ;
	
	
	

	// ==========================
    //      LOGREG FUNCTIONS
    // ==========================
	
	
	
	@GetMapping("/")
	public String logReg(HttpSession session, Model model) {
		if(session.getAttribute("user_id") != null) {
			return "redirect:/dashboard";
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
       return "redirect:/dashboard";
   }
   
   // Login User Process
   @PostMapping("/login")
   public String loginUser(@Valid @ModelAttribute("newLogin") LoginModel newLogin, BindingResult result, Model model, HttpSession session) {
       UserModel user = userServ.login(newLogin, result);
       if(result.hasErrors()) {
           model.addAttribute("newUser", new UserModel());
           return "logReg.jsp";
       }
        // No errors! 
       // Store their ID from the DB in session, i.e. log them in
       session.setAttribute("user_id", user.getId());
       return "redirect:/dashboard";
   }
   
   // Logout User
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	
	// display my dashboard with the userName in session, we store the name in session
	@GetMapping("/dashboard")
	
	public String dashboard(HttpSession session, Model model) {
		if(session.getAttribute("user_id") == null) {
			return "redirect:/logReg";
		} else {
			
		model.addAttribute("theUser", userServ.getUser((Long)session.getAttribute("user_id")));
		model.addAttribute("allBooks", bookServ.getAll());
		return "dashboard.jsp";
		}
	}
	
	
//	this will display the addbook.jsp with the addbook form
	
	
	@GetMapping("/addbook")
	public String addbook(HttpSession session, @ModelAttribute("addbookForm") BookModel addbookForm, Model model) {
		if(session.getAttribute("user_id") == null) {
    		return "redirect:/logReg";
    	}
		
		
		return "addbook.jsp";
	}
	
//	Creating the book, i use validation here instead of session since the user is already in the app
	
	@PostMapping("/createbook")
	public String createbook( @Valid @ModelAttribute("addbookForm") BookModel newbook, BindingResult result, Model model, HttpSession session) {
		
		if(result.hasErrors()) {
			
			return "/addbook.jsp";}
			
		 else {
			bookServ.createOne(newbook);
			return "redirect:/dashboard";
		}
	}
	
	///display each book by id to view all his information
	
	
	@GetMapping("book/{id}/viewbook")
	public String viewbook(HttpSession session, @PathVariable("id") Long id, @ModelAttribute("book") BookModel book, Model model) {
		if(session.getAttribute("user_id") == null) {
			return "redirect:/logReg";
		} else {
		model.addAttribute("theBook", bookServ.getOne(id));
		return "viewbook.jsp";
		}
	}
	
	
	//display the edit form for the book
	
	@GetMapping("book/{id}/editbook")
	public String editbook(HttpSession session, @PathVariable("id") Long id, @ModelAttribute("bookEditForm") BookModel book, Model model) {
		if(session.getAttribute("user_id") == null) {
			return "redirect:/logReg";
		} else {
		model.addAttribute("theBook", bookServ.getOne(id));
		return "editbook.jsp";
		}
	}
	
	@PutMapping("book/{id}/update")
	public String update(@PathVariable("id") Long id, @Valid @ModelAttribute("bookEditForm") BookModel editBook, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("theBook", bookServ.getOne(id));
			return "editbook.jsp";
		} else {
			bookServ.updateOne(editBook);
			return "redirect:/book/{id}/viewbook";
		}
	}
	
	@GetMapping("book/{id}/delete")
	public String delete(@PathVariable("id") Long id) {
		bookServ.deleteOne(id);
		return "redirect:/dashboard";
	}
	
	
	
}
