package com.cos.controllerdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // 파일을 return 할 것이기 때문
public class HttpRespController {

	@GetMapping("/txt")
	public String txt() {
		return "a.txt"; // Spring 프레임워크는 틀이 이미 다 정해져있다. 일반 정적인 파일들은 resources/static 폴더가 내부 디폴트 경로이다.
	}
	
	/*
	 	pom.xml에 mustache 라이브러리를 다운 받을 수 있도록 해야 mustache 관련 코드가 제대로 작동함
	 		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-mustache</artifactId>
			</dependency>
	 */
	
	// 이렇게 하면 그냥 파일을 다운로드 받아버림
	// 브라우저가 mustache 파일을 읽지 못함 그냥 사용자에게 제공
	@GetMapping("/mus")
	public String mus() {
		return "b.mustache";
	}
	
	@GetMapping("templates/mus")
	public String templatesMus() {
		return "c"; // 머스태치 템플릿 엔진 라이브러리 등록 완료 - template 폴더안에 .mustache를 놔두고
						  // 확장자 없이 파일명만 적으면 자동으로 찾아감.
						  // 확장자가 있으면 static폴더로 확장자가 없으면 template 폴더로
	}

	
	/*
	 pom.xml에 jasper 라이브러리를 다운 받을 수 있도록 해야 jsp 관련 코드가 제대로 작동함
	 <dependency>
    	<groupId>org.apache.tomcat</groupId>
    	<artifactId>tomcat-jasper</artifactId>
    	<version>9.0.41</version>
	</dependency>
	
	또한 jsp는 Spring에서 공식적인 지원을 하지 않음으로 resources/templates가 기본 경로가 아님
	src/main/webapp/WEB-INF/views를 기본경로로 설정해주고 그 위치에 jsp파일을 넣어준다.
	
	application.yml에서 view resolver 설정
	spring.mvc.views.prefix: /WEB-INF/views/
	spring.mvc.views.suffix: .jsp
	
	 */
	
	@GetMapping("/jsp")
	public String jsp() {
		return "d"; // jsp 엔진 사용: src/main/webapp 폴더가 디폴트 경로
						  // prefix, suffix를 설정해줘야함
	}

	
}
