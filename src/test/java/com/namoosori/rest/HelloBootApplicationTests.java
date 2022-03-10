package com.namoosori.rest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.namoosori.rest.entity.User;
import com.namoosori.rest.service.UserService;

@SpringBootTest
class HelloBootApplicationTests {

	@Autowired
	private UserService userService;
	
	@Test
	public void registerTest() {
		
		User sample = User.sample();
		
		//junit5 기반 테스트
		assertThat(this.userService.register(sample)).isEqualTo(sample.getId());
		assertThat(this.userService.findAll().size()).isEqualTo(1);
	}

}
