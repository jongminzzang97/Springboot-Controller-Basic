package com.cos.controllerdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HttpRedirectionController {

	@GetMapping("/home")
	public String home() {
		System.out.println("/home 실행");
		return "home";
	}
	
	@GetMapping("/away")
	public String away() {
		return "redirect:/home";
	}
}
