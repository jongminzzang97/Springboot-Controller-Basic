package com.cos.controllerdemo.web;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;


// @Controller // File을 응답하는 컨트롤
@RestController
public class HttpController {
	
	// http://localhost:8080/get
	@GetMapping("/get")
	public String get() {
		return "get 요청";
	}
	
	@PostMapping("/post")
	public String post() {
		return "post 요청";
	}

	@PutMapping("/put")
	public String put() {
		return "put 요청";
	}

	@DeleteMapping("/delete")
	public String delete() {
		return "delete 요청";
	}

}
