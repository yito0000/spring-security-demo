package com.example.springsecuritydemo;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

class SpringSecurityDemoApplicationTests {

	@Test
	void contextLoads() {
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		System.out.println(encoder.encode("passwd"));
	}

}
