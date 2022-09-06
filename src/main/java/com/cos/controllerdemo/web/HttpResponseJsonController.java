package com.cos.controllerdemo.web;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpResponseJsonController {
	
	@GetMapping("/resp/json")
	public String respJson() {
		return "{\"username\":\"jongmin\"}";
	}

	@GetMapping("/resp/json/object")
	public String respJsonObject() {
		User user = new User();
		user.setName("이종민");
		// Json data 구조로 만들기가 매우 귀찮다.
		String data = "{\"username\":\"" + user.getName() + "\"}";
		return data;
	}
	
	@GetMapping("/resp/json/javaobject")
	public User respJsonJavaObject() {
		User user = new User();
		user.setName("이종민");
		return user;
	}
	
	
}
