package com.cos.controllerdemo.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cos.controllerdemo.domain.User;

@RestController
public class HttpBodyController {

	
	private static final Logger log = LoggerFactory.getLogger(HttpBodyController.class);

	
	// x-www-form-url-encode 는 기본적으로 파싱해준다.
	// 변수명만 맞다면 값을 바로 받아줌
	// query string과 동일하게 받을 수 있음.
	@PostMapping("/body1")
	public String xwwwformurlencode(String username) {
		log.info(username);
		return "key=value 전송옴";
	}
	
	
	// text/plain 은 key값이 없기 때문에 변수의 명은 아무거나 적어도 되지만
	// @RequestBody 를 이용해야만 값을 받아올 수 있다.
	@PostMapping("/body2")
	public String textplain(@RequestBody String data) {
		log.info(data);
		return "text/plain 전송옴";
	}
	
	// @RequestBody를 이용하면 JSON type의 값을 그냥 String으로 받아올 수 있다.
	// data = {"username" = "jongmin"}
	@PostMapping("/body3")
	public String applicationjson(@RequestBody String data) {
		log.info(data);
		return "json 전송옴";
	}
	
	// @RequestBody를 이용하면 JSON type의 값을 Java Object로 바로 가져오는 것도 가능하다.
	// user 객체를 생성하고 값을 넣어준다.
	@PostMapping("/body4")
	public String applicationjsonToObject(@RequestBody User user) {
		log.info(user.getUsername());
		return "json 전송옴";
	}
}
