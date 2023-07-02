package com.example.task.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.task.Service.Userservice;
import com.example.task.entity.User;

@Controller
public class UserController {
	
	@Autowired
	Userservice userservo;
	
	@PostMapping("/user/new")
	public ResponseEntity<User> newUser(@RequestBody User user) {
		User creatuser=userservo.createUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(creatuser);
	}
	
	@GetMapping("/user/{email}")
	public User retreiveUser(@PathVariable String email) {
		User retrieveUser=userservo.findEmail(email);
		return retrieveUser; 
	}
}
