package com.namoosori.rest.service.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.namoosori.rest.entity.User;
import com.namoosori.rest.service.UserService;
import com.namoosori.rest.store.UserStore;

@Service
public class UserServiceLogic implements UserService {

	@Autowired
	private UserStore userStore;
	
	@Override
	public String register(User newUser) {
		return this.userStore.create(newUser);
	}

	@Override
	public void modify(User newUser) {
		this.userStore.update(newUser);
	}

	@Override
	public void remove(String id) {
		this.userStore.delete(id);
	}

	@Override
	public User find(String id) {
		return this.userStore.retrieve(id);
	}

	@Override
	public List<User> findAll() {
		return this.userStore.retrueveAll();
	}

}