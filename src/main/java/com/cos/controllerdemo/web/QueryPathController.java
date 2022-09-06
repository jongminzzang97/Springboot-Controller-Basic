package com.cos.controllerdemo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryPathController {
	
	@GetMapping("/blog")  // http://localhost:8080/blog/?page=5    무조건 변수 이름이 같아야함
	public String pageQuery(String page) {
		return page + "번째 페이지 입니다. (QueryString)";
	}
	
	@GetMapping("/blog/{page}") // http://localhost:8080/blog/5
	public String pagePath(@PathVariable String page) {
		return page + "번재 페이지 입니다. (PathVariable)";
	}
	
}
