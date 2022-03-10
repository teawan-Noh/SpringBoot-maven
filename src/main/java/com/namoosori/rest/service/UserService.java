package com.namoosori.rest.service;

import java.util.List;

import com.namoosori.rest.entity.User;

public interface UserService {

	String register(User newUser);
	void modify(User newUser);
	void remove(String id);
	
	User find(String id);
	List<User> findAll();
}
