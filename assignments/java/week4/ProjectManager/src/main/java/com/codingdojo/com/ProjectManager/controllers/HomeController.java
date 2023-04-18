package com.codingdojo.com.ProjectManager.controllers;

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

import com.codingdojo.com.ProjectManager.models.CourseModel;
import com.codingdojo.com.ProjectManager.models.LoginModel;
import com.codingdojo.com.ProjectManager.models.UserModel;
import com.codingdojo.com.ProjectManager.services.CourseService;
import com.codingdojo.com.ProjectManager.services.UserService;

@Controller
public class HomeController {

	

	@Autowired
	private UserService userServ;
		
	
	@Autowired
	private CourseService courseServ;
	
	
	
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
		model.addAttribute("allCourses", courseServ.getAll());
		return "dashboard.jsp";
		}
	}
	
	
//	this will display the addbook.jsp with the addbook form
	
	
	@GetMapping("/addcourse")
	public String addcourse(HttpSession session, @ModelAttribute("addcourseForm") CourseModel addcourseForm, Model model) {
		if(session.getAttribute("user_id") == null) {
    		return "redirect:/logReg";
    	}
		
		
		return "addcourse.jsp";
	}
	
//	Creating the book, i use validation here instead of session since the user is already in the app
	
	@PostMapping("/createcourse")
	public String createcourse( @Valid @ModelAttribute("addcourseForm") CourseModel newcourse, BindingResult result, Model model, HttpSession session) {
		
		if(result.hasErrors()) {
			
			return "/addcourse.jsp";}
			
		 else {
			courseServ.createOne(newcourse);
			return "redirect:/dashboard";
		}
	}
	
	///display each book by id to view all his information
	
	
	@GetMapping("/course/{id}/viewcourse")
	public String viewcourse(HttpSession session, @PathVariable("id") Long id, @ModelAttribute("course") CourseModel course, Model model) {
		if(session.getAttribute("user_id") == null) {
			return "redirect:/logReg";
		} else {
		model.addAttribute("theCourse", courseServ.getOne(id));
		return "viewcourse.jsp";
		}
	}
	
	
	//display the edit form for the book
	
	@GetMapping("/course/{id}/editcourse")
	public String editcourse(HttpSession session, @PathVariable("id") Long id, @ModelAttribute("courseEditForm") CourseModel course, Model model) {
		if(session.getAttribute("user_id") == null) {
			return "redirect:/logReg";
		} else {
		model.addAttribute("theCourse", courseServ.getOne(id));
		return "editcourse.jsp";
		}
	}
	
	@PutMapping("/course/{id}/update")
	public String update(@PathVariable("id") Long id, @Valid @ModelAttribute("courseEditForm") CourseModel editCourse, BindingResult result, Model model) {
		System.out.println("i am working");
		if(result.hasErrors()) {
			model.addAttribute("theCourse", courseServ.getOne(id));
			return "editcourse.jsp";
		} else {
			courseServ.updateOne(editCourse);
			return "redirect:/course/{id}/viewcourse";
		}
	}
	
	@GetMapping("/course/{id}/delete")
	public String delete(@PathVariable("id") Long id) {
		courseServ.deleteOne(id);
		return "redirect:/dashboard";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
