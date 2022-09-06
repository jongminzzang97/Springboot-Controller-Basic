package com.cos.controllerdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cos.controllerdemo.domain.User;

@Controller
public class JavaToJspController {
	
	@GetMapping("/jsp/java")
	public String jspTojava() {
		return "e";
	}
	
	@GetMapping("/jsp/java/model")
	public String jspTojavaToModel(Model model) {
		User user = new User();
		user.setUsername("jongmin");
		
		// model hashmap 구조
		// model에 있는 데이터를 페이지까지 들고감
		
		model.addAttribute("username", user.getUsername());
		
		return "f";
	}
}
