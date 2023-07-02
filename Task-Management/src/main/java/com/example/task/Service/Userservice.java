package com.example.task.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.task.entity.User;
import com.example.task.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class Userservice {
	
	@Autowired
	UserRepository userrepo;
	
	public User createUser(User user) {
		User createdUser=userrepo.save(user);
		return createdUser;
	}
	
	public User findEmail(String Email) {
		User retrievedUser=userrepo.findByEmail(Email);
		return retrievedUser;
	}
}
