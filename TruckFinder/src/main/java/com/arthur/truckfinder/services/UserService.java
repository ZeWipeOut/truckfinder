package com.arthur.truckfinder.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.arthur.truckfinder.models.LoginUser;
import com.arthur.truckfinder.models.User;
import com.arthur.truckfinder.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
    
    public User register(User newUser, BindingResult result) {
    
    	Optional<User> potentialUser = userRepo.findByEmail(newUser.getEmail());
    	
    	// TO-DO - Reject values or register if no errors:
        if(potentialUser.isPresent()) {
        	result.rejectValue("email", "unique", "This email is already in use!");
        }
        
        if(!newUser.getPassword().equals(newUser.getConfirm())) {
        	result.rejectValue("confirm", "match", "The confirmed password does not match.");
        }
        
        if(result.hasErrors()) {
        	return null;
        	
        }
        
        // Hash and set password, save user to database
        String hashed =BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
        newUser.setPassword(hashed);
        return userRepo.save(newUser);
    }
	
    public User login(LoginUser newLogin, BindingResult result) {
    
    	Optional<User> potentialUser = userRepo.findByEmail(newLogin.getEmail());
    	if(!potentialUser.isPresent()) {
    		result.rejectValue("email", "Unique", "Unknown email!");
    		return null;
    	}
    	User user = potentialUser.get();
    	if(!BCrypt.checkpw(newLogin.getPassword(), user.getPassword())) {
    	    result.rejectValue("password", "Matches", "Invalid Password!");
    	}
    	if(result.hasErrors()) {
    		return null;
    	} else {
    		return user;
    	}
    }
    
    
}
