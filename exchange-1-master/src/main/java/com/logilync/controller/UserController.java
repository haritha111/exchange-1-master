package com.logilync.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.logilync.domain.User;
import com.logilync.repository.UserRepo;
@Controller
public class UserController {
	@Autowired
	UserController usercontroller;
	
	
	@RequestMapping(value="/createUser", method=RequestMethod.GET)
	public String showCreateUser(){
		return "createUser";
	}
	
	@RequestMapping(value="/saveUser", method=RequestMethod.POST)
	public String saveCreateUser(User user, Model model){
		user=userRepo.save(user);
		model.addAttribute("user",user);
		return "user";
	}

}


