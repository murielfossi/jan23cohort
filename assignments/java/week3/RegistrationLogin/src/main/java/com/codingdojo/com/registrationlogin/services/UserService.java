package com.codingdojo.com.registrationlogin.services;

import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.codingdojo.com.registrationlogin.models.LoginModel;
import com.codingdojo.com.registrationlogin.models.UserModel;
import com.codingdojo.com.registrationlogin.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
    // ==========================
    //        REGISTRATION
    // ==========================
	
	
	public UserModel register(UserModel newUser, BindingResult result) {
        if(userRepo.findByEmail(newUser.getEmail()).isPresent()) {
            result.rejectValue("email", "Unique", "This email is already in use!");
        }
        if(!newUser.getPassword().equals(newUser.getConfirmPassword())) {
            result.rejectValue("confirmPassword", "Matches", "The Confirm Password must match Password!");
        }
        if(result.hasErrors()) {
            return null;
        } else {
            String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
            newUser.setPassword(hashed);
            return userRepo.save(newUser);
        }
    }
	
    // ==========================
    //        LOGIN
    // ==========================
	
    public UserModel login(LoginModel newLogin, BindingResult result) {
        Optional<UserModel> potentialUser = userRepo.findByEmail(newLogin.getEmail());
        if(!potentialUser.isPresent()) {
            result.rejectValue("email", "Unique", "Unknown email!");
            return null;
        }
        UserModel user = potentialUser.get();
        if(!BCrypt.checkpw(newLogin.getPassword(), user.getPassword())) {
            result.rejectValue("password", "Matches", "Invalid Password!");
        }
        if(result.hasErrors()) {
            return null;
        } else {
            return user;
        }
    }
    
	// Get All
	public List<UserModel> getAllUsers() {
		return userRepo.findAll();

	}
	
	// Get One
	public UserModel getUser(Long id) {
		UserModel user = userRepo.findById(id).orElse(null);
		return user;
	}
	
	// Update
	public UserModel updateOne(UserModel user) {
		return userRepo.save(user);
	}
	
	// Delete
	public void deleteOne(Long id) {
		userRepo.deleteById(id);
	}
	
}
