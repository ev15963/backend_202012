package com.proj.backend.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

//import ospringframework.web.bind.annotation.RestController;

@Slf4j
@RestController
//@RequestMapping("/api")
public class TestController {
	
//	@PostMapping(value = "/ip")
//	public ResponseEntity<String> ip (HttpServletRequest request) {
//		//요청을 보낸 클라이언트 IP 주소 반환
//		return ResponseEntity.ok(request.getRemoteAddr());
//	}
	
	@RequestMapping("/")
	public String rootMethod() {
		log.info("looooog");
		
		return "home.html";
	}
	
	@GetMapping(value="/hello")
	public String hello(Model model) {
		log.info("helloooo");
//		UserVO user = new UserVO();
//		user.setUserID("아이디");
//		user.setName("이름");
		model.addAttribute("name", "userdddd");
		
		return "hello";
	}
}
