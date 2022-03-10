package com.namoosori.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.namoosori.rest.entity.User;
import com.namoosori.rest.service.UserService;

@RestController
public class HelloController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/hello")
	public String hello() {
		
		return "Hello Spring Boot";
	}
	
	@PostMapping("/users")
	public String register(@RequestBody User newUser) {
		return userService.register(newUser);
	}
	
	@GetMapping("/users/{id}")
	public User find(@PathVariable String id) {
		return userService.find(id);
	}
	
	@GetMapping("/users")
	public List<User> findAll(){
		System.out.println("커밋테스트");
		return userService.findAll();
	}
}
