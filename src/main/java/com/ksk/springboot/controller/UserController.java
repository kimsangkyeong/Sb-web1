package com.ksk.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ksk.springboot.model.User;
import com.ksk.springboot.repository.UserReository;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")

public class UserController {
	
	@Autowired
	private UserReository userReopitory;
	
	@GetMapping("users")
	public List<User> getUsers(){
		return this.userReopitory.findAll();
	}
}
