package com.namoosori.rest.entity;

import java.util.UUID;

import com.google.gson.Gson;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class User {

	private String id;
	private String name;
	private String email;
	
	//유저가 생성될 때 마다 랜덤한 아이디 부여
	public User() {
		this.id = UUID.randomUUID().toString();
	}

	public User(String name, String email) {
		this();
		this.name = name;
		this.email = email;
	}
	
	public static User sample() {
		return new User("Park", "park@namoo.io");
	}
	
	public static void main(String[] args) {
		User user = new User("Kim", "kim@namoo.io");
		System.out.println(new Gson().toJson(user));
	}
	
}
